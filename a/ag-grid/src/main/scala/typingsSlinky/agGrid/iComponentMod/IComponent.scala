package typingsSlinky.agGrid.iComponentMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponent[T] extends js.Object {
  /** A hook to perform any necessary operation just after the gui for this component has been renderer
    in the screen.
    If the filter popup is closed and reopened, this method is called each time the filter is shown.
    This is useful for any
    logic that requires attachment before executing, such as putting focus on a particular DOM
    element. The params has one callback method 'hidePopup', which you can call at any later
    point to hide the popup - good if you have an 'Apply' button and you want to hide the popup
    after it is pressed. */
  var afterGuiAttached: js.UndefOr[js.Function1[/* params */ js.UndefOr[IAfterGuiAttachedParams], Unit]] = js.native
  /** Gets called once by grid after editing is finished - if your editor needs to do any cleanup, do it here */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** The init(params) method is called on the filter once. See below for details on the parameters. */
  var init: js.UndefOr[js.Function1[/* params */ T, Promise[Unit] | Unit]] = js.native
  /** Return the DOM element of your editor, this is what the grid puts into the DOM */
  def getGui(): HTMLElement = js.native
}

object IComponent {
  @scala.inline
  def apply[T](getGui: () => HTMLElement): IComponent[T] = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui))
    __obj.asInstanceOf[IComponent[T]]
  }
  @scala.inline
  implicit class IComponentOps[Self[t] <: IComponent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetGui(value: () => HTMLElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGui")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAfterGuiAttached(value: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGuiAttached")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterGuiAttached: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGuiAttached")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* params */ T => Promise[Unit] | Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
  }
  
}


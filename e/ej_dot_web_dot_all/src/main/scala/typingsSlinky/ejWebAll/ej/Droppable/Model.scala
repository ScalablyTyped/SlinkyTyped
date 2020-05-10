package typingsSlinky.ejWebAll.ej.Droppable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Used to accept the specified draggable items.
    * @Default {null}
    */
  var accept: js.UndefOr[js.Any] = js.native
  /** This event is triggered when the mouse up is moved during the dragging.
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.native
  /** This event is triggered when the mouse is moved out.
    */
  var out: js.UndefOr[js.Function1[/* e */ OutEventArgs, Unit]] = js.native
  /** This event is triggered when the mouse is moved over.
    */
  var over: js.UndefOr[js.Function1[/* e */ OverEventArgs, Unit]] = js.native
  /** Used to group sets of droppable items, in addition to droppable's accept option. A draggable with the same scope value as a droppable will be accepted by the droppable.
    * @Default {'default'}
    */
  var scope: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: /* e */ DropEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withOut(value: /* e */ OutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.undefined)
        ret
    }
    @scala.inline
    def withOver(value: /* e */ OverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}


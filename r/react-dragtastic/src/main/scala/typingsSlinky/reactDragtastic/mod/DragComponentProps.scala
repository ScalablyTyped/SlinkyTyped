package typingsSlinky.reactDragtastic.mod

import slinky.core.TagMod
import typingsSlinky.reactDragtastic.StateisOverAcceptedboolea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragComponentProps extends js.Object {
  /** A boolean determining whether or not the DragComponent should always render. Defaults to false. */
  var alwaysRender: js.UndefOr[Boolean] = js.native
  /* A string corresponding to the id property of the <Draggable/> zone that should trigger this component to start rendering. */
  var `for`: js.UndefOr[Id] = js.native
  /** A function which will be called every time a user drags. */
  var onDrag: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.native
  def children(arg: StateisOverAcceptedboolea): TagMod[Any] = js.native
}

object DragComponentProps {
  @scala.inline
  def apply(children: StateisOverAcceptedboolea => TagMod[Any]): DragComponentProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DragComponentProps]
  }
  @scala.inline
  implicit class DragComponentPropsOps[Self <: DragComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: StateisOverAcceptedboolea => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAlwaysRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRender")(js.undefined)
        ret
    }
    @scala.inline
    def withFor(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribeTo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscribeTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribeToNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeTo")(null)
        ret
    }
  }
  
}


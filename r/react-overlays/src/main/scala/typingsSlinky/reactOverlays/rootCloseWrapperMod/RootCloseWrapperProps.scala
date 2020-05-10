package typingsSlinky.reactOverlays.rootCloseWrapperMod

import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactOverlays.reactOverlaysStrings.click
import typingsSlinky.reactOverlays.reactOverlaysStrings.mousedown
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootCloseWrapperProps extends js.Object {
  /**
    * Children to render.
    */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Disable the the RootCloseWrapper, preventing it from triggering
    * `onRootClose`.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Choose which document mouse event to bind to
    */
  var event: js.UndefOr[click | mousedown] = js.native
  /**
    * Callback fired after click or mousedown. Also triggers when user hits `esc`.
    */
  var onRootClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event_, _], Unit]] = js.native
}

object RootCloseWrapperProps {
  @scala.inline
  def apply(): RootCloseWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootCloseWrapperProps]
  }
  @scala.inline
  implicit class RootCloseWrapperPropsOps[Self <: RootCloseWrapperProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: click | mousedown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRootClose(value: /* e */ SyntheticEvent[Event_, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRootClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRootClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRootClose")(js.undefined)
        ret
    }
  }
  
}


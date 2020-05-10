package typingsSlinky.antDesignReactNative.swipeActionMod

import typingsSlinky.reactNativeSwipeout.mod.SwipeoutProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeActionProps extends SwipeoutProperties {
  @JSName("left")
  var left_SwipeActionProps: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.native
  @JSName("right")
  var right_SwipeActionProps: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.native
}

object SwipeActionProps {
  @scala.inline
  def apply(): SwipeActionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeActionProps]
  }
  @scala.inline
  implicit class SwipeActionPropsOps[Self <: SwipeActionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: js.Array[SwipeoutButtonProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: js.Array[SwipeoutButtonProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
  }
  
}


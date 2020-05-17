package typingsSlinky.antDesignReactNative.swipeActionMod

import typingsSlinky.antDesignReactNative.anon.BackgroundColor
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeSwipeout.mod.SwipeoutButtonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeoutButtonProps extends SwipeoutButtonProperties {
  var style: js.UndefOr[StyleProp[TextStyle] with BackgroundColor] = js.native
}

object SwipeoutButtonProps {
  @scala.inline
  def apply(): SwipeoutButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeoutButtonProps]
  }
  @scala.inline
  implicit class SwipeoutButtonPropsOps[Self <: SwipeoutButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: StyleProp[TextStyle] with BackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}


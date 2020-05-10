package typingsSlinky.reactNativeGestureHandler.mod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseButtonProperties extends RawButtonProperties {
  var onActiveStateChange: js.UndefOr[js.Function1[/* active */ Boolean, Unit]] = js.native
  var onPress: js.UndefOr[js.Function1[/* pointerInside */ Boolean, Unit]] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object BaseButtonProperties {
  @scala.inline
  def apply(): BaseButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseButtonProperties]
  }
  @scala.inline
  implicit class BaseButtonPropertiesOps[Self <: BaseButtonProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnActiveStateChange(value: /* active */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActiveStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: /* pointerInside */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
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
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
  }
  
}


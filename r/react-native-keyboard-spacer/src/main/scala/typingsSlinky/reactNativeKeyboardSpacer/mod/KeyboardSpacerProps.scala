package typingsSlinky.reactNativeKeyboardSpacer.mod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardSpacerProps extends js.Object {
  var onToggle: js.UndefOr[js.Function2[/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double, Unit]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var topSpacing: js.UndefOr[Double] = js.native
}

object KeyboardSpacerProps {
  @scala.inline
  def apply(): KeyboardSpacerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardSpacerProps]
  }
  @scala.inline
  implicit class KeyboardSpacerPropsOps[Self <: KeyboardSpacerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnToggle(value: (/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.undefined)
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
    @scala.inline
    def withTopSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topSpacing")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.antDesignReactNative.inputItemStyleMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputItemStyle extends js.Object {
  var clear: ViewStyle = js.native
  var container: ViewStyle = js.native
  var errorIcon: ViewStyle = js.native
  var extra: TextStyle = js.native
  var input: TextStyle = js.native
  var inputDisabled: TextStyle = js.native
  var inputErrorColor: TextStyle = js.native
  var text: TextStyle = js.native
}

object InputItemStyle {
  @scala.inline
  def apply(
    clear: ViewStyle,
    container: ViewStyle,
    errorIcon: ViewStyle,
    extra: TextStyle,
    input: TextStyle,
    inputDisabled: TextStyle,
    inputErrorColor: TextStyle,
    text: TextStyle
  ): InputItemStyle = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputDisabled = inputDisabled.asInstanceOf[js.Any], inputErrorColor = inputErrorColor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputItemStyle]
  }
  @scala.inline
  implicit class InputItemStyleOps[Self <: InputItemStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorIcon(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputDisabled(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputErrorColor(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputErrorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


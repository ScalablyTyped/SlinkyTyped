package typingsSlinky.antDesignReactNative.stylePromptMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptStyle extends js.Object {
  var input: TextStyle = js.native
  var inputFirst: ViewStyle = js.native
  var inputGroup: ViewStyle = js.native
  var inputLast: ViewStyle = js.native
  var inputWrapper: ViewStyle = js.native
  var message: TextStyle = js.native
}

object PromptStyle {
  @scala.inline
  def apply(
    input: TextStyle,
    inputFirst: ViewStyle,
    inputGroup: ViewStyle,
    inputLast: ViewStyle,
    inputWrapper: ViewStyle,
    message: TextStyle
  ): PromptStyle = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputFirst = inputFirst.asInstanceOf[js.Any], inputGroup = inputGroup.asInstanceOf[js.Any], inputLast = inputLast.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptStyle]
  }
  @scala.inline
  implicit class PromptStyleOps[Self <: PromptStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputFirst(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputGroup(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputLast(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputWrapper(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


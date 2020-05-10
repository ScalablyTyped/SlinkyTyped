package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInput extends js.Object {
  var input: RegisteredStyle[TextStyle] = js.native
  var inputFirst: RegisteredStyle[ViewStyle] = js.native
  var inputGroup: RegisteredStyle[ViewStyle] = js.native
  var inputLast: RegisteredStyle[ViewStyle] = js.native
  var inputWrapper: RegisteredStyle[ViewStyle] = js.native
  var message: RegisteredStyle[TextStyle] = js.native
}

object AnonInput {
  @scala.inline
  def apply(
    input: RegisteredStyle[TextStyle],
    inputFirst: RegisteredStyle[ViewStyle],
    inputGroup: RegisteredStyle[ViewStyle],
    inputLast: RegisteredStyle[ViewStyle],
    inputWrapper: RegisteredStyle[ViewStyle],
    message: RegisteredStyle[TextStyle]
  ): AnonInput = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputFirst = inputFirst.asInstanceOf[js.Any], inputGroup = inputGroup.asInstanceOf[js.Any], inputLast = inputLast.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInput]
  }
  @scala.inline
  implicit class AnonInputOps[Self <: AnonInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputFirst(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputGroup(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputLast(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputWrapper(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


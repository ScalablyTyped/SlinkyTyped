package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorIcon extends js.Object {
  var clear: RegisteredStyle[ViewStyle] = js.native
  var container: RegisteredStyle[ViewStyle] = js.native
  var errorIcon: RegisteredStyle[ViewStyle] = js.native
  var extra: RegisteredStyle[TextStyle] = js.native
  var input: RegisteredStyle[TextStyle] = js.native
  var inputDisabled: RegisteredStyle[TextStyle] = js.native
  var inputErrorColor: RegisteredStyle[TextStyle] = js.native
  var text: RegisteredStyle[TextStyle] = js.native
}

object ErrorIcon {
  @scala.inline
  def apply(
    clear: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    errorIcon: RegisteredStyle[ViewStyle],
    extra: RegisteredStyle[TextStyle],
    input: RegisteredStyle[TextStyle],
    inputDisabled: RegisteredStyle[TextStyle],
    inputErrorColor: RegisteredStyle[TextStyle],
    text: RegisteredStyle[TextStyle]
  ): ErrorIcon = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputDisabled = inputDisabled.asInstanceOf[js.Any], inputErrorColor = inputErrorColor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorIcon]
  }
  @scala.inline
  implicit class ErrorIconOps[Self <: ErrorIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorIcon(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputDisabled(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputErrorColor(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputErrorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


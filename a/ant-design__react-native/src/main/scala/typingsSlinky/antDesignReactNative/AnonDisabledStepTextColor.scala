package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisabledStepTextColor extends js.Object {
  var container: RegisteredStyle[ViewStyle] = js.native
  var disabledStepTextColor: RegisteredStyle[TextStyle] = js.native
  var highlightStepBorderColor: RegisteredStyle[ViewStyle] = js.native
  var highlightStepTextColor: RegisteredStyle[TextStyle] = js.native
  var input: RegisteredStyle[TextStyle] = js.native
  var stepDisabled: RegisteredStyle[ViewStyle] = js.native
  var stepText: RegisteredStyle[TextStyle] = js.native
  var stepWrap: RegisteredStyle[ViewStyle] = js.native
}

object AnonDisabledStepTextColor {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    disabledStepTextColor: RegisteredStyle[TextStyle],
    highlightStepBorderColor: RegisteredStyle[ViewStyle],
    highlightStepTextColor: RegisteredStyle[TextStyle],
    input: RegisteredStyle[TextStyle],
    stepDisabled: RegisteredStyle[ViewStyle],
    stepText: RegisteredStyle[TextStyle],
    stepWrap: RegisteredStyle[ViewStyle]
  ): AnonDisabledStepTextColor = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], disabledStepTextColor = disabledStepTextColor.asInstanceOf[js.Any], highlightStepBorderColor = highlightStepBorderColor.asInstanceOf[js.Any], highlightStepTextColor = highlightStepTextColor.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], stepDisabled = stepDisabled.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any], stepWrap = stepWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabledStepTextColor]
  }
  @scala.inline
  implicit class AnonDisabledStepTextColorOps[Self <: AnonDisabledStepTextColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledStepTextColor(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStepTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightStepBorderColor(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStepBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightStepTextColor(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStepTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepDisabled(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


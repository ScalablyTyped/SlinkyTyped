package typingsSlinky.antDesignReactNative.stepperStyleMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepperStyle extends js.Object {
  var container: ViewStyle = js.native
  var disabledStepTextColor: TextStyle = js.native
  var highlightStepBorderColor: ViewStyle = js.native
  var highlightStepTextColor: TextStyle = js.native
  var input: TextStyle = js.native
  var stepDisabled: ViewStyle = js.native
  var stepText: TextStyle = js.native
  var stepWrap: ViewStyle = js.native
}

object StepperStyle {
  @scala.inline
  def apply(
    container: ViewStyle,
    disabledStepTextColor: TextStyle,
    highlightStepBorderColor: ViewStyle,
    highlightStepTextColor: TextStyle,
    input: TextStyle,
    stepDisabled: ViewStyle,
    stepText: TextStyle,
    stepWrap: ViewStyle
  ): StepperStyle = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], disabledStepTextColor = disabledStepTextColor.asInstanceOf[js.Any], highlightStepBorderColor = highlightStepBorderColor.asInstanceOf[js.Any], highlightStepTextColor = highlightStepTextColor.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], stepDisabled = stepDisabled.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any], stepWrap = stepWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperStyle]
  }
  @scala.inline
  implicit class StepperStyleOps[Self <: StepperStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledStepTextColor(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStepTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightStepBorderColor(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStepBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightStepTextColor(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStepTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepDisabled(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


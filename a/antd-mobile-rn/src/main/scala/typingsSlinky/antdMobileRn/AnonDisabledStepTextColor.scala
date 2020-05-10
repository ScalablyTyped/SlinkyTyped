package typingsSlinky.antdMobileRn

import typingsSlinky.rmcInputNumber.AnonRegisteredStyleBrand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisabledStepTextColor extends js.Object {
  var container: Double with AnonRegisteredStyleBrand = js.native
  var disabledStepTextColor: Double with AnonRegisteredStyleBrand = js.native
  var highlightStepBorderColor: Double with AnonRegisteredStyleBrand = js.native
  var highlightStepTextColor: Double with AnonRegisteredStyleBrand = js.native
  var input: Double with AnonRegisteredStyleBrand = js.native
  var stepDisabled: Double with AnonRegisteredStyleBrand = js.native
  var stepText: Double with AnonRegisteredStyleBrand = js.native
  var stepWrap: Double with AnonRegisteredStyleBrand = js.native
}

object AnonDisabledStepTextColor {
  @scala.inline
  def apply(
    container: Double with AnonRegisteredStyleBrand,
    disabledStepTextColor: Double with AnonRegisteredStyleBrand,
    highlightStepBorderColor: Double with AnonRegisteredStyleBrand,
    highlightStepTextColor: Double with AnonRegisteredStyleBrand,
    input: Double with AnonRegisteredStyleBrand,
    stepDisabled: Double with AnonRegisteredStyleBrand,
    stepText: Double with AnonRegisteredStyleBrand,
    stepWrap: Double with AnonRegisteredStyleBrand
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
    def withContainer(value: Double with AnonRegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledStepTextColor(value: Double with AnonRegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStepTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightStepBorderColor(value: Double with AnonRegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStepBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightStepTextColor(value: Double with AnonRegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStepTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: Double with AnonRegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepDisabled(value: Double with AnonRegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepText(value: Double with AnonRegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepWrap(value: Double with AnonRegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


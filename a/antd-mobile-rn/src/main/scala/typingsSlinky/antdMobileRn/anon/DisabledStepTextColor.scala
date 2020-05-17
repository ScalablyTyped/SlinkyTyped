package typingsSlinky.antdMobileRn.anon

import typingsSlinky.rmcInputNumber.anon.RegisteredStyleBrand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisabledStepTextColor extends js.Object {
  var container: Double with RegisteredStyleBrand = js.native
  var disabledStepTextColor: Double with RegisteredStyleBrand = js.native
  var highlightStepBorderColor: Double with RegisteredStyleBrand = js.native
  var highlightStepTextColor: Double with RegisteredStyleBrand = js.native
  var input: Double with RegisteredStyleBrand = js.native
  var stepDisabled: Double with RegisteredStyleBrand = js.native
  var stepText: Double with RegisteredStyleBrand = js.native
  var stepWrap: Double with RegisteredStyleBrand = js.native
}

object DisabledStepTextColor {
  @scala.inline
  def apply(
    container: Double with RegisteredStyleBrand,
    disabledStepTextColor: Double with RegisteredStyleBrand,
    highlightStepBorderColor: Double with RegisteredStyleBrand,
    highlightStepTextColor: Double with RegisteredStyleBrand,
    input: Double with RegisteredStyleBrand,
    stepDisabled: Double with RegisteredStyleBrand,
    stepText: Double with RegisteredStyleBrand,
    stepWrap: Double with RegisteredStyleBrand
  ): DisabledStepTextColor = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], disabledStepTextColor = disabledStepTextColor.asInstanceOf[js.Any], highlightStepBorderColor = highlightStepBorderColor.asInstanceOf[js.Any], highlightStepTextColor = highlightStepTextColor.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], stepDisabled = stepDisabled.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any], stepWrap = stepWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledStepTextColor]
  }
  @scala.inline
  implicit class DisabledStepTextColorOps[Self <: DisabledStepTextColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: Double with RegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledStepTextColor(value: Double with RegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStepTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightStepBorderColor(value: Double with RegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStepBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightStepTextColor(value: Double with RegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStepTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: Double with RegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepDisabled(value: Double with RegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepText(value: Double with RegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepWrap(value: Double with RegisteredStyleBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


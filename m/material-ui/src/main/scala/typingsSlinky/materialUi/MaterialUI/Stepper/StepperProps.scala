package typingsSlinky.materialUi.MaterialUI.Stepper

import typingsSlinky.materialUi.materialUiStrings.horizontal
import typingsSlinky.materialUi.materialUiStrings.vertical
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepperProps extends js.Object {
  var activeStep: js.UndefOr[Double] = js.native
  var linear: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object StepperProps {
  @scala.inline
  def apply(): StepperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepperProps]
  }
  @scala.inline
  implicit class StepperPropsOps[Self <: StepperProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStep")(js.undefined)
        ret
    }
    @scala.inline
    def withLinear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linear")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
  }
  
}


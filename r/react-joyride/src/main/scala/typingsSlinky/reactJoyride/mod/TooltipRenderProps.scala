package typingsSlinky.reactJoyride.mod

import typingsSlinky.reactJoyride.AnonArialabel
import typingsSlinky.reactJoyride.AnonAriamodal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipRenderProps extends BeaconRenderProps {
  var backProps: AnonArialabel = js.native
  var closeProps: AnonArialabel = js.native
  var primaryProps: AnonArialabel = js.native
  var skipProps: AnonArialabel = js.native
  var tooltipProps: AnonAriamodal = js.native
}

object TooltipRenderProps {
  @scala.inline
  def apply(
    backProps: AnonArialabel,
    closeProps: AnonArialabel,
    continuous: Boolean,
    index: Double,
    isLastStep: Boolean,
    primaryProps: AnonArialabel,
    setTooltipRef: () => Unit,
    size: Double,
    skipProps: AnonArialabel,
    step: Step,
    tooltipProps: AnonAriamodal
  ): TooltipRenderProps = {
    val __obj = js.Dynamic.literal(backProps = backProps.asInstanceOf[js.Any], closeProps = closeProps.asInstanceOf[js.Any], continuous = continuous.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isLastStep = isLastStep.asInstanceOf[js.Any], primaryProps = primaryProps.asInstanceOf[js.Any], setTooltipRef = js.Any.fromFunction0(setTooltipRef), size = size.asInstanceOf[js.Any], skipProps = skipProps.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tooltipProps = tooltipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipRenderProps]
  }
  @scala.inline
  implicit class TooltipRenderPropsOps[Self <: TooltipRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackProps(value: AnonArialabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseProps(value: AnonArialabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryProps(value: AnonArialabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipProps(value: AnonArialabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipProps(value: AnonAriamodal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


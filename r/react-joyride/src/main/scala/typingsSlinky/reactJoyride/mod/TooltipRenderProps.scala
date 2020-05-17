package typingsSlinky.reactJoyride.mod

import typingsSlinky.reactJoyride.anon.Arialabel
import typingsSlinky.reactJoyride.anon.Ariamodal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipRenderProps extends BeaconRenderProps {
  var backProps: Arialabel = js.native
  var closeProps: Arialabel = js.native
  var primaryProps: Arialabel = js.native
  var skipProps: Arialabel = js.native
  var tooltipProps: Ariamodal = js.native
}

object TooltipRenderProps {
  @scala.inline
  def apply(
    backProps: Arialabel,
    closeProps: Arialabel,
    continuous: Boolean,
    index: Double,
    isLastStep: Boolean,
    primaryProps: Arialabel,
    setTooltipRef: () => Unit,
    size: Double,
    skipProps: Arialabel,
    step: Step,
    tooltipProps: Ariamodal
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
    def withBackProps(value: Arialabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseProps(value: Arialabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryProps(value: Arialabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipProps(value: Arialabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipProps(value: Ariamodal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


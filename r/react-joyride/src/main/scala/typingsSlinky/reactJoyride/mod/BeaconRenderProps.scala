package typingsSlinky.reactJoyride.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeaconRenderProps extends js.Object {
  var continuous: Boolean = js.native
  var index: Double = js.native
  var isLastStep: Boolean = js.native
  var size: Double = js.native
  var step: Step = js.native
  def setTooltipRef(): Unit = js.native
}

object BeaconRenderProps {
  @scala.inline
  def apply(
    continuous: Boolean,
    index: Double,
    isLastStep: Boolean,
    setTooltipRef: () => Unit,
    size: Double,
    step: Step
  ): BeaconRenderProps = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isLastStep = isLastStep.asInstanceOf[js.Any], setTooltipRef = js.Any.fromFunction0(setTooltipRef), size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeaconRenderProps]
  }
  @scala.inline
  implicit class BeaconRenderPropsOps[Self <: BeaconRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLastStep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLastStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetTooltipRef(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTooltipRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Step): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


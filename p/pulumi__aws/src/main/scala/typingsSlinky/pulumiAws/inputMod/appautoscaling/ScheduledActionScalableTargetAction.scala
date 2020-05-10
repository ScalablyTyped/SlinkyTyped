package typingsSlinky.pulumiAws.inputMod.appautoscaling

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledActionScalableTargetAction extends js.Object {
  /**
    * The maximum capacity.
    */
  var maxCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The minimum capacity.
    */
  var minCapacity: js.UndefOr[Input[Double]] = js.native
}

object ScheduledActionScalableTargetAction {
  @scala.inline
  def apply(): ScheduledActionScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledActionScalableTargetAction]
  }
  @scala.inline
  implicit class ScheduledActionScalableTargetActionOps[Self <: ScheduledActionScalableTargetAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCapacity")(js.undefined)
        ret
    }
  }
  
}


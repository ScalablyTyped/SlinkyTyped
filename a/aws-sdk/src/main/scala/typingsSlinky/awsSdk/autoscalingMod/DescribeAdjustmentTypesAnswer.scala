package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAdjustmentTypesAnswer extends js.Object {
  /**
    * The policy adjustment types.
    */
  var AdjustmentTypes: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.AdjustmentTypes] = js.native
}

object DescribeAdjustmentTypesAnswer {
  @scala.inline
  def apply(): DescribeAdjustmentTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAdjustmentTypesAnswer]
  }
  @scala.inline
  implicit class DescribeAdjustmentTypesAnswerOps[Self <: DescribeAdjustmentTypesAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustmentTypes(value: AdjustmentTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdjustmentTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustmentTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdjustmentTypes")(js.undefined)
        ret
    }
  }
  
}


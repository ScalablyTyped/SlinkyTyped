package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdjustmentType extends js.Object {
  /**
    * The policy adjustment type. The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.native
}

object AdjustmentType {
  @scala.inline
  def apply(): AdjustmentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustmentType]
  }
  @scala.inline
  implicit class AdjustmentTypeOps[Self <: AdjustmentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustmentType(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdjustmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustmentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdjustmentType")(js.undefined)
        ret
    }
  }
  
}


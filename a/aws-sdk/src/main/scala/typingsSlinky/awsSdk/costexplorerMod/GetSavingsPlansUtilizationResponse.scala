package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansUtilizationResponse extends js.Object {
  /**
    * The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
    */
  var SavingsPlansUtilizationsByTime: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.SavingsPlansUtilizationsByTime] = js.native
  /**
    * The total amount of cost/commitment that you used your Savings Plans, regardless of date ranges.
    */
  var Total: SavingsPlansUtilizationAggregates = js.native
}

object GetSavingsPlansUtilizationResponse {
  @scala.inline
  def apply(Total: SavingsPlansUtilizationAggregates): GetSavingsPlansUtilizationResponse = {
    val __obj = js.Dynamic.literal(Total = Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationResponse]
  }
  @scala.inline
  implicit class GetSavingsPlansUtilizationResponseOps[Self <: GetSavingsPlansUtilizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotal(value: SavingsPlansUtilizationAggregates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavingsPlansUtilizationsByTime(value: SavingsPlansUtilizationsByTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansUtilizationsByTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlansUtilizationsByTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansUtilizationsByTime")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchMeterUsageResult extends js.Object {
  /**
    * Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS Marketplace Metering Service or were invalid.
    */
  var Results: js.UndefOr[UsageRecordResultList] = js.native
  /**
    * Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You can retry the failed request by making another BatchMeterUsage call with this list as input in the BatchMeterUsageRequest.
    */
  var UnprocessedRecords: js.UndefOr[UsageRecordList] = js.native
}

object BatchMeterUsageResult {
  @scala.inline
  def apply(): BatchMeterUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchMeterUsageResult]
  }
  @scala.inline
  implicit class BatchMeterUsageResultOps[Self <: BatchMeterUsageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResults(value: UsageRecordResultList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Results")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprocessedRecords(value: UsageRecordList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedRecords")(js.undefined)
        ret
    }
  }
  
}


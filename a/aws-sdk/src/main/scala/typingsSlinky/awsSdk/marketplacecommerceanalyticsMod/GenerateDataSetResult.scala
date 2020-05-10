package typingsSlinky.awsSdk.marketplacecommerceanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateDataSetResult extends js.Object {
  /**
    * A unique identifier representing a specific request to the GenerateDataSet operation. This identifier can be used to correlate a request with notifications from the SNS topic.
    */
  var dataSetRequestId: js.UndefOr[DataSetRequestId] = js.native
}

object GenerateDataSetResult {
  @scala.inline
  def apply(): GenerateDataSetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataSetResult]
  }
  @scala.inline
  implicit class GenerateDataSetResultOps[Self <: GenerateDataSetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSetRequestId(value: DataSetRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSetRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSetRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSetRequestId")(js.undefined)
        ret
    }
  }
  
}


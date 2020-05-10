package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeliverabilityTestReportRequest extends js.Object {
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: typingsSlinky.awsSdk.sesv2Mod.ReportId = js.native
}

object GetDeliverabilityTestReportRequest {
  @scala.inline
  def apply(ReportId: ReportId): GetDeliverabilityTestReportRequest = {
    val __obj = js.Dynamic.literal(ReportId = ReportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityTestReportRequest]
  }
  @scala.inline
  implicit class GetDeliverabilityTestReportRequestOps[Self <: GetDeliverabilityTestReportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportId(value: ReportId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationDateRangeKpiResponse extends js.Object {
  var ApplicationDateRangeKpiResponse: typingsSlinky.awsSdk.pinpointMod.ApplicationDateRangeKpiResponse = js.native
}

object GetApplicationDateRangeKpiResponse {
  @scala.inline
  def apply(ApplicationDateRangeKpiResponse: ApplicationDateRangeKpiResponse): GetApplicationDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(ApplicationDateRangeKpiResponse = ApplicationDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationDateRangeKpiResponse]
  }
  @scala.inline
  implicit class GetApplicationDateRangeKpiResponseOps[Self <: GetApplicationDateRangeKpiResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationDateRangeKpiResponse(value: ApplicationDateRangeKpiResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationDateRangeKpiResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


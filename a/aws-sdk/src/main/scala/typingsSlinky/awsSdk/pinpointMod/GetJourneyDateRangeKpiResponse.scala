package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJourneyDateRangeKpiResponse extends js.Object {
  var JourneyDateRangeKpiResponse: typingsSlinky.awsSdk.pinpointMod.JourneyDateRangeKpiResponse = js.native
}

object GetJourneyDateRangeKpiResponse {
  @scala.inline
  def apply(JourneyDateRangeKpiResponse: JourneyDateRangeKpiResponse): GetJourneyDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(JourneyDateRangeKpiResponse = JourneyDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyDateRangeKpiResponse]
  }
  @scala.inline
  implicit class GetJourneyDateRangeKpiResponseOps[Self <: GetJourneyDateRangeKpiResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJourneyDateRangeKpiResponse(value: JourneyDateRangeKpiResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JourneyDateRangeKpiResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


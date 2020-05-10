package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJourneyExecutionActivityMetricsResponse extends js.Object {
  var JourneyExecutionActivityMetricsResponse: typingsSlinky.awsSdk.pinpointMod.JourneyExecutionActivityMetricsResponse = js.native
}

object GetJourneyExecutionActivityMetricsResponse {
  @scala.inline
  def apply(JourneyExecutionActivityMetricsResponse: JourneyExecutionActivityMetricsResponse): GetJourneyExecutionActivityMetricsResponse = {
    val __obj = js.Dynamic.literal(JourneyExecutionActivityMetricsResponse = JourneyExecutionActivityMetricsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyExecutionActivityMetricsResponse]
  }
  @scala.inline
  implicit class GetJourneyExecutionActivityMetricsResponseOps[Self <: GetJourneyExecutionActivityMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJourneyExecutionActivityMetricsResponse(value: JourneyExecutionActivityMetricsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JourneyExecutionActivityMetricsResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


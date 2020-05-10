package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJourneyExecutionMetricsResponse extends js.Object {
  var JourneyExecutionMetricsResponse: typingsSlinky.awsSdk.pinpointMod.JourneyExecutionMetricsResponse = js.native
}

object GetJourneyExecutionMetricsResponse {
  @scala.inline
  def apply(JourneyExecutionMetricsResponse: JourneyExecutionMetricsResponse): GetJourneyExecutionMetricsResponse = {
    val __obj = js.Dynamic.literal(JourneyExecutionMetricsResponse = JourneyExecutionMetricsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyExecutionMetricsResponse]
  }
  @scala.inline
  implicit class GetJourneyExecutionMetricsResponseOps[Self <: GetJourneyExecutionMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJourneyExecutionMetricsResponse(value: JourneyExecutionMetricsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JourneyExecutionMetricsResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


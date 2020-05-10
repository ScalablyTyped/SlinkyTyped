package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJourneyResponse extends js.Object {
  var JourneyResponse: typingsSlinky.awsSdk.pinpointMod.JourneyResponse = js.native
}

object DeleteJourneyResponse {
  @scala.inline
  def apply(JourneyResponse: JourneyResponse): DeleteJourneyResponse = {
    val __obj = js.Dynamic.literal(JourneyResponse = JourneyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJourneyResponse]
  }
  @scala.inline
  implicit class DeleteJourneyResponseOps[Self <: DeleteJourneyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJourneyResponse(value: JourneyResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JourneyResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


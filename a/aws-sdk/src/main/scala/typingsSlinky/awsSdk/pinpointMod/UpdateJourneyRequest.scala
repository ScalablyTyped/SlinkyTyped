package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJourneyRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the journey.
    */
  var JourneyId: string = js.native
  var WriteJourneyRequest: typingsSlinky.awsSdk.pinpointMod.WriteJourneyRequest = js.native
}

object UpdateJourneyRequest {
  @scala.inline
  def apply(ApplicationId: string, JourneyId: string, WriteJourneyRequest: WriteJourneyRequest): UpdateJourneyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], WriteJourneyRequest = WriteJourneyRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJourneyRequest]
  }
  @scala.inline
  implicit class UpdateJourneyRequestOps[Self <: UpdateJourneyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJourneyId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JourneyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteJourneyRequest(value: WriteJourneyRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteJourneyRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


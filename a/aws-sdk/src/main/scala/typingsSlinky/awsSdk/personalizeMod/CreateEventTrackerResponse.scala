package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventTrackerResponse extends js.Object {
  /**
    * The ARN of the event tracker.
    */
  var eventTrackerArn: js.UndefOr[Arn] = js.native
  /**
    * The ID of the event tracker. Include this ID in requests to the PutEvents API.
    */
  var trackingId: js.UndefOr[TrackingId] = js.native
}

object CreateEventTrackerResponse {
  @scala.inline
  def apply(): CreateEventTrackerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventTrackerResponse]
  }
  @scala.inline
  implicit class CreateEventTrackerResponseOps[Self <: CreateEventTrackerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventTrackerArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTrackerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTrackerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTrackerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingId(value: TrackingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingId")(js.undefined)
        ret
    }
  }
  
}


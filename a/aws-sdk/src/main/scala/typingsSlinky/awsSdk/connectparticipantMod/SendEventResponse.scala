package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendEventResponse extends js.Object {
  /**
    * The time when the event was sent. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.native
  /**
    * The ID of the response.
    */
  var Id: js.UndefOr[ChatItemId] = js.native
}

object SendEventResponse {
  @scala.inline
  def apply(): SendEventResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendEventResponse]
  }
  @scala.inline
  implicit class SendEventResponseOps[Self <: SendEventResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteTime(value: Instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbsoluteTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsoluteTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbsoluteTime")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ChatItemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
  }
  
}


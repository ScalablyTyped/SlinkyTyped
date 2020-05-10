package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendEventRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.ClientToken] = js.native
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken = js.native
  /**
    * The content of the event to be sent (for example, message text). This is not yet supported.
    */
  var Content: js.UndefOr[ChatContent] = js.native
  /**
    * The content type of the request. Supported types are:   application/vnd.amazonaws.connect.event.typing   application/vnd.amazonaws.connect.event.connection.acknowledged  
    */
  var ContentType: ChatContentType = js.native
}

object SendEventRequest {
  @scala.inline
  def apply(ConnectionToken: ParticipantToken, ContentType: ChatContentType): SendEventRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEventRequest]
  }
  @scala.inline
  implicit class SendEventRequestOps[Self <: SendEventRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionToken(value: ParticipantToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: ChatContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: ChatContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(js.undefined)
        ret
    }
  }
  
}


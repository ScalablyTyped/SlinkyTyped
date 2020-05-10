package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.ClientToken] = js.native
  /**
    * The authentication token associated with the connection.
    */
  var ConnectionToken: ParticipantToken = js.native
  /**
    * The content of the message.
    */
  var Content: ChatContent = js.native
  /**
    * The type of the content. Supported types are text/plain.
    */
  var ContentType: ChatContentType = js.native
}

object SendMessageRequest {
  @scala.inline
  def apply(ConnectionToken: ParticipantToken, Content: ChatContent, ContentType: ChatContentType): SendMessageRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageRequest]
  }
  @scala.inline
  implicit class SendMessageRequestOps[Self <: SendMessageRequest] (val x: Self) extends AnyVal {
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
    def withContent(value: ChatContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
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
  }
  
}


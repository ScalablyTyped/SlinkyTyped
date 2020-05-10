package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChatContactResponse extends js.Object {
  /**
    * The identifier of this contact within the Amazon Connect instance. 
    */
  var ContactId: js.UndefOr[typingsSlinky.awsSdk.connectMod.ContactId] = js.native
  /**
    * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat lifecycle.
    */
  var ParticipantId: js.UndefOr[typingsSlinky.awsSdk.connectMod.ParticipantId] = js.native
  /**
    * The token used by the chat participant to call CreateParticipantConnection. The participant token is valid for the lifetime of a chat participant.
    */
  var ParticipantToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.ParticipantToken] = js.native
}

object StartChatContactResponse {
  @scala.inline
  def apply(): StartChatContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartChatContactResponse]
  }
  @scala.inline
  implicit class StartChatContactResponseOps[Self <: StartChatContactResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactId(value: ContactId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactId")(js.undefined)
        ret
    }
    @scala.inline
    def withParticipantId(value: ParticipantId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParticipantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParticipantId")(js.undefined)
        ret
    }
    @scala.inline
    def withParticipantToken(value: ParticipantToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParticipantToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipantToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParticipantToken")(js.undefined)
        ret
    }
  }
  
}


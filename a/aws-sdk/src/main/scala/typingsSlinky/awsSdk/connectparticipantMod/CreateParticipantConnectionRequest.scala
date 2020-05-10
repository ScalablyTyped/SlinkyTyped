package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateParticipantConnectionRequest extends js.Object {
  /**
    * Participant Token as obtained from StartChatContact API response.
    */
  var ParticipantToken: typingsSlinky.awsSdk.connectparticipantMod.ParticipantToken = js.native
  /**
    * Type of connection information required.
    */
  var Type: ConnectionTypeList = js.native
}

object CreateParticipantConnectionRequest {
  @scala.inline
  def apply(ParticipantToken: ParticipantToken, Type: ConnectionTypeList): CreateParticipantConnectionRequest = {
    val __obj = js.Dynamic.literal(ParticipantToken = ParticipantToken.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParticipantConnectionRequest]
  }
  @scala.inline
  implicit class CreateParticipantConnectionRequestOps[Self <: CreateParticipantConnectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParticipantToken(value: ParticipantToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParticipantToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ConnectionTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateParticipantConnectionResponse extends js.Object {
  /**
    * Creates the participant's connection credentials. The authentication token associated with the participant's connection.
    */
  var ConnectionCredentials: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.ConnectionCredentials] = js.native
  /**
    * Creates the participant's websocket connection.
    */
  var Websocket: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.Websocket] = js.native
}

object CreateParticipantConnectionResponse {
  @scala.inline
  def apply(): CreateParticipantConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParticipantConnectionResponse]
  }
  @scala.inline
  implicit class CreateParticipantConnectionResponseOps[Self <: CreateParticipantConnectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionCredentials(value: ConnectionCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsocket(value: Websocket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Websocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Websocket")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticipantIdentity extends js.Object {
  var participantId: Double = js.native
  var player: Player = js.native
}

object ParticipantIdentity {
  @scala.inline
  def apply(participantId: Double, player: Player): ParticipantIdentity = {
    val __obj = js.Dynamic.literal(participantId = participantId.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantIdentity]
  }
  @scala.inline
  implicit class ParticipantIdentityOps[Self <: ParticipantIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParticipantId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayer(value: Player): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


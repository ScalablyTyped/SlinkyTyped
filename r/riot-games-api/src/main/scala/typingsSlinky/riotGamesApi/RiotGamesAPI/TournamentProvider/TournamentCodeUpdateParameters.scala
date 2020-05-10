package typingsSlinky.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TournamentCodeUpdateParameters extends js.Object {
  var allowedParticipants: String = js.native
  var mapType: String = js.native
  var pickType: String = js.native
  var spectatorType: String = js.native
}

object TournamentCodeUpdateParameters {
  @scala.inline
  def apply(allowedParticipants: String, mapType: String, pickType: String, spectatorType: String): TournamentCodeUpdateParameters = {
    val __obj = js.Dynamic.literal(allowedParticipants = allowedParticipants.asInstanceOf[js.Any], mapType = mapType.asInstanceOf[js.Any], pickType = pickType.asInstanceOf[js.Any], spectatorType = spectatorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TournamentCodeUpdateParameters]
  }
  @scala.inline
  implicit class TournamentCodeUpdateParametersOps[Self <: TournamentCodeUpdateParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedParticipants(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedParticipants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpectatorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectatorType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TournamentCodeDto extends js.Object {
  var code: String = js.native
  var id: Double = js.native
  var lobbyName: String = js.native
  var map: String = js.native
  var metaData: String = js.native
  var participants: js.Array[Double] = js.native
  var password: String = js.native
  var pickType: String = js.native
  var providerId: Double = js.native
  var region: String = js.native
  var spectators: String = js.native
  var teamSize: Double = js.native
  var tournamentId: Double = js.native
}

object TournamentCodeDto {
  @scala.inline
  def apply(
    code: String,
    id: Double,
    lobbyName: String,
    map: String,
    metaData: String,
    participants: js.Array[Double],
    password: String,
    pickType: String,
    providerId: Double,
    region: String,
    spectators: String,
    teamSize: Double,
    tournamentId: Double
  ): TournamentCodeDto = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lobbyName = lobbyName.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pickType = pickType.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], spectators = spectators.asInstanceOf[js.Any], teamSize = teamSize.asInstanceOf[js.Any], tournamentId = tournamentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TournamentCodeDto]
  }
  @scala.inline
  implicit class TournamentCodeDtoOps[Self <: TournamentCodeDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLobbyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lobbyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipants(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpectators(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTournamentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tournamentId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


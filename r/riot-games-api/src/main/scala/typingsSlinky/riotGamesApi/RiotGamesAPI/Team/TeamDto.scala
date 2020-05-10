package typingsSlinky.riotGamesApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamDto extends js.Object {
  var createDate: Double = js.native
  var fullId: String = js.native
  var lastGameDate: Double = js.native
  var lastJoinDate: Double = js.native
  var lastJoinedRankedTeamQueueDate: Double = js.native
  var matchHistory: js.Array[MatchHistorySummaryDto] = js.native
  var modifyDate: Double = js.native
  var name: String = js.native
  var roster: RosterDto = js.native
  var secondLastJoinDate: Double = js.native
  var status: String = js.native
  var tag: String = js.native
  var teamStatDetails: js.Array[TeamStatDetailDto] = js.native
  var thirdLastJoinDate: Double = js.native
}

object TeamDto {
  @scala.inline
  def apply(
    createDate: Double,
    fullId: String,
    lastGameDate: Double,
    lastJoinDate: Double,
    lastJoinedRankedTeamQueueDate: Double,
    matchHistory: js.Array[MatchHistorySummaryDto],
    modifyDate: Double,
    name: String,
    roster: RosterDto,
    secondLastJoinDate: Double,
    status: String,
    tag: String,
    teamStatDetails: js.Array[TeamStatDetailDto],
    thirdLastJoinDate: Double
  ): TeamDto = {
    val __obj = js.Dynamic.literal(createDate = createDate.asInstanceOf[js.Any], fullId = fullId.asInstanceOf[js.Any], lastGameDate = lastGameDate.asInstanceOf[js.Any], lastJoinDate = lastJoinDate.asInstanceOf[js.Any], lastJoinedRankedTeamQueueDate = lastJoinedRankedTeamQueueDate.asInstanceOf[js.Any], matchHistory = matchHistory.asInstanceOf[js.Any], modifyDate = modifyDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any], secondLastJoinDate = secondLastJoinDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], teamStatDetails = teamStatDetails.asInstanceOf[js.Any], thirdLastJoinDate = thirdLastJoinDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamDto]
  }
  @scala.inline
  implicit class TeamDtoOps[Self <: TeamDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastGameDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastGameDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastJoinDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastJoinDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastJoinedRankedTeamQueueDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastJoinedRankedTeamQueueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchHistory(value: js.Array[MatchHistorySummaryDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoster(value: RosterDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondLastJoinDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondLastJoinDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamStatDetails(value: js.Array[TeamStatDetailDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamStatDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThirdLastJoinDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdLastJoinDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


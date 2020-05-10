package typingsSlinky.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchDetail extends js.Object {
  var mapId: Double = js.native
  var matchCreation: Double = js.native
  var matchId: Double = js.native
  var matchMode: String = js.native
  var matchType: String = js.native
  var matchVersion: String = js.native
  var participantIdentities: js.Array[ParticipantIdentity] = js.native
  var participants: js.Array[Participant] = js.native
  var plateformId: String = js.native
  var queueType: String = js.native
  var region: String = js.native
  var season: String = js.native
  var teams: js.Array[Team] = js.native
  var timeline: Timeline = js.native
}

object MatchDetail {
  @scala.inline
  def apply(
    mapId: Double,
    matchCreation: Double,
    matchId: Double,
    matchMode: String,
    matchType: String,
    matchVersion: String,
    participantIdentities: js.Array[ParticipantIdentity],
    participants: js.Array[Participant],
    plateformId: String,
    queueType: String,
    region: String,
    season: String,
    teams: js.Array[Team],
    timeline: Timeline
  ): MatchDetail = {
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any], matchCreation = matchCreation.asInstanceOf[js.Any], matchId = matchId.asInstanceOf[js.Any], matchMode = matchMode.asInstanceOf[js.Any], matchType = matchType.asInstanceOf[js.Any], matchVersion = matchVersion.asInstanceOf[js.Any], participantIdentities = participantIdentities.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], plateformId = plateformId.asInstanceOf[js.Any], queueType = queueType.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchDetail]
  }
  @scala.inline
  implicit class MatchDetailOps[Self <: MatchDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchCreation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCreation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipantIdentities(value: js.Array[ParticipantIdentity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantIdentities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipants(value: js.Array[Participant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlateformId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plateformId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeams(value: js.Array[Team]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeline(value: Timeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


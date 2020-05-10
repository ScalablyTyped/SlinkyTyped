package typingsSlinky.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Participant extends js.Object {
  var championId: Double = js.native
  var highestAchievedSeasonTier: String = js.native
  var masteries: js.Array[Mastery] = js.native
  var participantId: Double = js.native
  var runes: js.Array[Rune] = js.native
  var spell1Id: Double = js.native
  var spell2Id: Double = js.native
  var stats: ParticipantStats = js.native
  var teamId: Double = js.native
  var timeline: ParticipantTimeline = js.native
}

object Participant {
  @scala.inline
  def apply(
    championId: Double,
    highestAchievedSeasonTier: String,
    masteries: js.Array[Mastery],
    participantId: Double,
    runes: js.Array[Rune],
    spell1Id: Double,
    spell2Id: Double,
    stats: ParticipantStats,
    teamId: Double,
    timeline: ParticipantTimeline
  ): Participant = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], highestAchievedSeasonTier = highestAchievedSeasonTier.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], runes = runes.asInstanceOf[js.Any], spell1Id = spell1Id.asInstanceOf[js.Any], spell2Id = spell2Id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
  @scala.inline
  implicit class ParticipantOps[Self <: Participant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChampionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("championId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighestAchievedSeasonTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highestAchievedSeasonTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasteries(value: js.Array[Mastery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masteries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipantId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunes(value: js.Array[Rune]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpell1Id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spell1Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpell2Id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spell2Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: ParticipantStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeline(value: ParticipantTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


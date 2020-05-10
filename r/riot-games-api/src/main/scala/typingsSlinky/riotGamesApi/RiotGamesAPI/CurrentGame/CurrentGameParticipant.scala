package typingsSlinky.riotGamesApi.RiotGamesAPI.CurrentGame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentGameParticipant extends js.Object {
  var bot: Boolean = js.native
  var championId: Double = js.native
  var masteries: js.Array[Mastery] = js.native
  var profileIconId: Double = js.native
  var runes: js.Array[Rune] = js.native
  var spell1Id: Double = js.native
  var spell2Id: Double = js.native
  var summonerId: Double = js.native
  var summonerName: String = js.native
  var teamId: Double = js.native
}

object CurrentGameParticipant {
  @scala.inline
  def apply(
    bot: Boolean,
    championId: Double,
    masteries: js.Array[Mastery],
    profileIconId: Double,
    runes: js.Array[Rune],
    spell1Id: Double,
    spell2Id: Double,
    summonerId: Double,
    summonerName: String,
    teamId: Double
  ): CurrentGameParticipant = {
    val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], championId = championId.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], profileIconId = profileIconId.asInstanceOf[js.Any], runes = runes.asInstanceOf[js.Any], spell1Id = spell1Id.asInstanceOf[js.Any], spell2Id = spell2Id.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], summonerName = summonerName.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentGameParticipant]
  }
  @scala.inline
  implicit class CurrentGameParticipantOps[Self <: CurrentGameParticipant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChampionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("championId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasteries(value: js.Array[Mastery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masteries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileIconId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileIconId")(value.asInstanceOf[js.Any])
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
    def withSummonerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summonerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummonerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summonerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


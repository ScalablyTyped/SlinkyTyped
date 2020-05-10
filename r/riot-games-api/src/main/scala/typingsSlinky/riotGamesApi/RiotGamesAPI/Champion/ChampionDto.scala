package typingsSlinky.riotGamesApi.RiotGamesAPI.Champion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChampionDto extends js.Object {
  var active: Boolean = js.native
  var botEnabled: Boolean = js.native
  var botMmEnabled: Boolean = js.native
  var freeToPlay: Boolean = js.native
  var id: Double = js.native
  var rankedPlayEnabled: Boolean = js.native
}

object ChampionDto {
  @scala.inline
  def apply(
    active: Boolean,
    botEnabled: Boolean,
    botMmEnabled: Boolean,
    freeToPlay: Boolean,
    id: Double,
    rankedPlayEnabled: Boolean
  ): ChampionDto = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], botEnabled = botEnabled.asInstanceOf[js.Any], botMmEnabled = botMmEnabled.asInstanceOf[js.Any], freeToPlay = freeToPlay.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rankedPlayEnabled = rankedPlayEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionDto]
  }
  @scala.inline
  implicit class ChampionDtoOps[Self <: ChampionDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBotEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBotMmEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botMmEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreeToPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeToPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRankedPlayEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankedPlayEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


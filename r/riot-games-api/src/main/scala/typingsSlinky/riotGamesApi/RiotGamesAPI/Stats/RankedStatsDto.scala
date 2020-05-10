package typingsSlinky.riotGamesApi.RiotGamesAPI.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RankedStatsDto extends js.Object {
  var champions: js.Array[ChampionStatsDto] = js.native
  var modifyDate: Double = js.native
  var summonerId: Double = js.native
}

object RankedStatsDto {
  @scala.inline
  def apply(champions: js.Array[ChampionStatsDto], modifyDate: Double, summonerId: Double): RankedStatsDto = {
    val __obj = js.Dynamic.literal(champions = champions.asInstanceOf[js.Any], modifyDate = modifyDate.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankedStatsDto]
  }
  @scala.inline
  implicit class RankedStatsDtoOps[Self <: RankedStatsDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChampions(value: js.Array[ChampionStatsDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("champions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummonerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summonerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


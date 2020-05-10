package typingsSlinky.riotGamesApi.RiotGamesAPI.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerStatsSummaryListDto extends js.Object {
  var playerStatSummaries: js.Array[PlayerStatsSummaryDto] = js.native
  var summonerId: Double = js.native
}

object PlayerStatsSummaryListDto {
  @scala.inline
  def apply(playerStatSummaries: js.Array[PlayerStatsSummaryDto], summonerId: Double): PlayerStatsSummaryListDto = {
    val __obj = js.Dynamic.literal(playerStatSummaries = playerStatSummaries.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerStatsSummaryListDto]
  }
  @scala.inline
  implicit class PlayerStatsSummaryListDtoOps[Self <: PlayerStatsSummaryListDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlayerStatSummaries(value: js.Array[PlayerStatsSummaryDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerStatSummaries")(value.asInstanceOf[js.Any])
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


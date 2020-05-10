package typingsSlinky.riotGamesApi.RiotGamesAPI.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerStatsSummaryDto extends js.Object {
  var aggregatedStats: AggregatedStatsDto = js.native
  var losses: Double = js.native
  var modifyDate: Double = js.native
  var playerStatSummaryType: String = js.native
  var wins: Double = js.native
}

object PlayerStatsSummaryDto {
  @scala.inline
  def apply(
    aggregatedStats: AggregatedStatsDto,
    losses: Double,
    modifyDate: Double,
    playerStatSummaryType: String,
    wins: Double
  ): PlayerStatsSummaryDto = {
    val __obj = js.Dynamic.literal(aggregatedStats = aggregatedStats.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], modifyDate = modifyDate.asInstanceOf[js.Any], playerStatSummaryType = playerStatSummaryType.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerStatsSummaryDto]
  }
  @scala.inline
  implicit class PlayerStatsSummaryDtoOps[Self <: PlayerStatsSummaryDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedStats(value: AggregatedStatsDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLosses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("losses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerStatSummaryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerStatSummaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWins(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wins")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


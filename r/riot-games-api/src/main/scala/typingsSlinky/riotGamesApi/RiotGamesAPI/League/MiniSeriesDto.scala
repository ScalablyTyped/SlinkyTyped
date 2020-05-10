package typingsSlinky.riotGamesApi.RiotGamesAPI.League

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiniSeriesDto extends js.Object {
  var losses: Double = js.native
  var progress: String = js.native
  var target: Double = js.native
  var wins: Double = js.native
}

object MiniSeriesDto {
  @scala.inline
  def apply(losses: Double, progress: String, target: Double, wins: Double): MiniSeriesDto = {
    val __obj = js.Dynamic.literal(losses = losses.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiniSeriesDto]
  }
  @scala.inline
  implicit class MiniSeriesDtoOps[Self <: MiniSeriesDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLosses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("losses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
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


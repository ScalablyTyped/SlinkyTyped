package typingsSlinky.overwatchApi.anon

import typingsSlinky.overwatchApi.mod.QuickplayCompetitiveStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assists extends js.Object {
  var assists: QuickplayCompetitiveStats = js.native
  var average: QuickplayCompetitiveStats = js.native
  var best: QuickplayCompetitiveStats = js.native
  var combat: QuickplayCompetitiveStats = js.native
  var game: QuickplayCompetitiveStats = js.native
  var match_awards: QuickplayCompetitiveStats = js.native
  var miscellaneous: QuickplayCompetitiveStats = js.native
  var top_heroes: CompetitiveQuickplay = js.native
}

object Assists {
  @scala.inline
  def apply(
    assists: QuickplayCompetitiveStats,
    average: QuickplayCompetitiveStats,
    best: QuickplayCompetitiveStats,
    combat: QuickplayCompetitiveStats,
    game: QuickplayCompetitiveStats,
    match_awards: QuickplayCompetitiveStats,
    miscellaneous: QuickplayCompetitiveStats,
    top_heroes: CompetitiveQuickplay
  ): Assists = {
    val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], average = average.asInstanceOf[js.Any], best = best.asInstanceOf[js.Any], combat = combat.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], match_awards = match_awards.asInstanceOf[js.Any], miscellaneous = miscellaneous.asInstanceOf[js.Any], top_heroes = top_heroes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assists]
  }
  @scala.inline
  implicit class AssistsOps[Self <: Assists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssists(value: QuickplayCompetitiveStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAverage(value: QuickplayCompetitiveStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBest(value: QuickplayCompetitiveStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("best")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCombat(value: QuickplayCompetitiveStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGame(value: QuickplayCompetitiveStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch_awards(value: QuickplayCompetitiveStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match_awards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiscellaneous(value: QuickplayCompetitiveStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miscellaneous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop_heroes(value: CompetitiveQuickplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_heroes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.overwatchApi.anon

import typingsSlinky.overwatchApi.mod.HeroAccuracy
import typingsSlinky.overwatchApi.mod.HeroElimsPerLife
import typingsSlinky.overwatchApi.mod.HeroMultiKillBest
import typingsSlinky.overwatchApi.mod.HeroObjectiveKillsAverage
import typingsSlinky.overwatchApi.mod.HeroPlaytime
import typingsSlinky.overwatchApi.mod.HeroWins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eliminationsperlife extends js.Object {
  var eliminations_per_life: js.Array[HeroElimsPerLife] = js.native
  var games_won: js.Array[HeroWins] = js.native
  var multikill_best: js.Array[HeroMultiKillBest] = js.native
  var objective_kills_average: js.Array[HeroObjectiveKillsAverage] = js.native
  var played: js.Array[HeroPlaytime] = js.native
  var weapon_accuracy: js.Array[HeroAccuracy] = js.native
}

object Eliminationsperlife {
  @scala.inline
  def apply(
    eliminations_per_life: js.Array[HeroElimsPerLife],
    games_won: js.Array[HeroWins],
    multikill_best: js.Array[HeroMultiKillBest],
    objective_kills_average: js.Array[HeroObjectiveKillsAverage],
    played: js.Array[HeroPlaytime],
    weapon_accuracy: js.Array[HeroAccuracy]
  ): Eliminationsperlife = {
    val __obj = js.Dynamic.literal(eliminations_per_life = eliminations_per_life.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], multikill_best = multikill_best.asInstanceOf[js.Any], objective_kills_average = objective_kills_average.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], weapon_accuracy = weapon_accuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eliminationsperlife]
  }
  @scala.inline
  implicit class EliminationsperlifeOps[Self <: Eliminationsperlife] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEliminations_per_life(value: js.Array[HeroElimsPerLife]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eliminations_per_life")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGames_won(value: js.Array[HeroWins]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("games_won")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultikill_best(value: js.Array[HeroMultiKillBest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multikill_best")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjective_kills_average(value: js.Array[HeroObjectiveKillsAverage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objective_kills_average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayed(value: js.Array[HeroPlaytime]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("played")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeapon_accuracy(value: js.Array[HeroAccuracy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weapon_accuracy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


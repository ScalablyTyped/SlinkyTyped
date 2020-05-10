package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PokemonEvolution extends js.Object {
  var conditions: js.UndefOr[js.Array[String]] = js.native
  var happiness: js.UndefOr[Boolean] = js.native
  var hold_item: js.UndefOr[String] = js.native
  var item: js.UndefOr[String] = js.native
  var level: js.UndefOr[Double] = js.native
  var level_up: js.UndefOr[Boolean] = js.native
  var move_learned: js.UndefOr[String] = js.native
  var to: String = js.native
  var trade: js.UndefOr[Boolean] = js.native
}

object PokemonEvolution {
  @scala.inline
  def apply(to: String): PokemonEvolution = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonEvolution]
  }
  @scala.inline
  implicit class PokemonEvolutionOps[Self <: PokemonEvolution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withHappiness(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("happiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHappiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("happiness")(js.undefined)
        ret
    }
    @scala.inline
    def withHold_item(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHold_item: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold_item")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel_up(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level_up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel_up: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level_up")(js.undefined)
        ret
    }
    @scala.inline
    def withMove_learned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move_learned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove_learned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move_learned")(js.undefined)
        ret
    }
    @scala.inline
    def withTrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trade")(js.undefined)
        ret
    }
  }
  
}


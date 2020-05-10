package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemEffect extends js.Object {
  var condition: String = js.native
  var move_changes: js.UndefOr[js.Array[ItemMoveChange]] = js.native
  var pokemon_changes: js.UndefOr[js.Array[ItemPokemonChange]] = js.native
  var target: String = js.native
  var triggers_evolution: js.UndefOr[Boolean] = js.native
}

object ItemEffect {
  @scala.inline
  def apply(condition: String, target: String): ItemEffect = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemEffect]
  }
  @scala.inline
  implicit class ItemEffectOps[Self <: ItemEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMove_changes(value: js.Array[ItemMoveChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move_changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove_changes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move_changes")(js.undefined)
        ret
    }
    @scala.inline
    def withPokemon_changes(value: js.Array[ItemPokemonChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pokemon_changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPokemon_changes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pokemon_changes")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggers_evolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers_evolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggers_evolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers_evolution")(js.undefined)
        ret
    }
  }
  
}


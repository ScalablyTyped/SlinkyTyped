package typingsSlinky.minecraftScriptingTypesServer.anon

import typingsSlinky.minecraftScriptingTypesShared.MinecraftFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Effects extends js.Object {
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var effects: js.Array[Amplifier] = js.native
  /**
    * The filter group that defines the conditions for using this item to heal the entity
    */
  var filters: js.UndefOr[MinecraftFilter] = js.native
  /**
    * The amount of health this entity gains when fed this item
    * @default 1
    */
  var heal_amount: Double = js.native
  /**
    * Item identifier that can be used to heal this entity
    */
  var item: String = js.native
}

object Effects {
  @scala.inline
  def apply(effects: js.Array[Amplifier], heal_amount: Double, item: String): Effects = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], heal_amount = heal_amount.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effects]
  }
  @scala.inline
  implicit class EffectsOps[Self <: Effects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffects(value: js.Array[Amplifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeal_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heal_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: MinecraftFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
  }
  
}


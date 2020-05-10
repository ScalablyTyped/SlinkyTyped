package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.MinecraftFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines how the entity can be healed by the player. This doesn't control how much health the entity can have; you must use the Health component for that instead.
  */
@js.native
trait IHealableComponent extends js.Object {
  /**
    * The filter group that defines the conditions for this trigger
    */
  var filters: js.UndefOr[MinecraftFilter] = js.native
  /**
    * Determines if item can be used regardless of entity being at full health
    * @default false
    */
  var force_use: Boolean = js.native
  /**
    * The array of items that can be used to heal this entity
    */
  var items: js.Array[AnonEffects] = js.native
}

object IHealableComponent {
  @scala.inline
  def apply(force_use: Boolean, items: js.Array[AnonEffects]): IHealableComponent = {
    val __obj = js.Dynamic.literal(force_use = force_use.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHealableComponent]
  }
  @scala.inline
  implicit class IHealableComponentOps[Self <: IHealableComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForce_use(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[AnonEffects]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
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


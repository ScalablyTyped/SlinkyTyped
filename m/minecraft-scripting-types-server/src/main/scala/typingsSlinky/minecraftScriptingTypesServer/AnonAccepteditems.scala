package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccepteditems extends js.Object {
  /**
    * The list of items that can go in this slot
    */
  var accepted_items: js.Array[String] = js.native
  /**
    * Text to be displayed when the entity can be equipped with this item when playing with Touch-screen controls
    */
  var interact_text: String = js.native
  /**
    * Event to trigger when this entity is equipped with this item
    */
  var on_equip: MinecraftTrigger | String = js.native
  /**
    * Event to trigger when this item is removed from this entity
    */
  var on_unequip: MinecraftTrigger | String = js.native
  /**
    * The slot number of this slot
    */
  var slot: Double = js.native
}

object AnonAccepteditems {
  @scala.inline
  def apply(
    accepted_items: js.Array[String],
    interact_text: String,
    on_equip: MinecraftTrigger | String,
    on_unequip: MinecraftTrigger | String,
    slot: Double
  ): AnonAccepteditems = {
    val __obj = js.Dynamic.literal(accepted_items = accepted_items.asInstanceOf[js.Any], interact_text = interact_text.asInstanceOf[js.Any], on_equip = on_equip.asInstanceOf[js.Any], on_unequip = on_unequip.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccepteditems]
  }
  @scala.inline
  implicit class AnonAccepteditemsOps[Self <: AnonAccepteditems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepted_items(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepted_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteract_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interact_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn_equip(value: MinecraftTrigger | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_equip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn_unequip(value: MinecraftTrigger | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_unequip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlot(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


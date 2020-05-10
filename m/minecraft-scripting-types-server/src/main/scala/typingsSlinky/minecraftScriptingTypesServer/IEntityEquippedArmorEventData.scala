package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import typingsSlinky.minecraftScriptingTypesShared.IItemStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity equips an item in their armor slots.
  */
@js.native
trait IEntityEquippedArmorEventData extends js.Object {
  /**
    * The entity who is equipping the armor
    */
  var entity: IEntity = js.native
  /**
    * The armor that is being equipped
    */
  var item_stack: IItemStack = js.native
}

object IEntityEquippedArmorEventData {
  @scala.inline
  def apply(entity: IEntity, item_stack: IItemStack): IEntityEquippedArmorEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], item_stack = item_stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityEquippedArmorEventData]
  }
  @scala.inline
  implicit class IEntityEquippedArmorEventDataOps[Self <: IEntityEquippedArmorEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: IEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem_stack(value: IItemStack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_stack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


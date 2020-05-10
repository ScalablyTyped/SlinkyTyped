package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import typingsSlinky.minecraftScriptingTypesShared.IItemStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity changes the item carried in their hand.
  */
@js.native
trait IEntityCarriedItemChangedEventData extends js.Object {
  /**
    * The item that is now in the entities hands
    */
  var carried_item: IItemStack = js.native
  /**
    * The entity that changed what they were carrying
    */
  var entity: IEntity = js.native
  /**
    * The item that was previously in the entities hands
    */
  var previous_carried_item: IItemStack = js.native
}

object IEntityCarriedItemChangedEventData {
  @scala.inline
  def apply(carried_item: IItemStack, entity: IEntity, previous_carried_item: IItemStack): IEntityCarriedItemChangedEventData = {
    val __obj = js.Dynamic.literal(carried_item = carried_item.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], previous_carried_item = previous_carried_item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityCarriedItemChangedEventData]
  }
  @scala.inline
  implicit class IEntityCarriedItemChangedEventDataOps[Self <: IEntityCarriedItemChangedEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarried_item(value: IItemStack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carried_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntity(value: IEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious_carried_item(value: IItemStack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous_carried_item")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


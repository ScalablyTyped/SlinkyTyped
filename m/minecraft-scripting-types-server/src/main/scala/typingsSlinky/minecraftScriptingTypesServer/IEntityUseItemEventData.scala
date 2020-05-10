package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import typingsSlinky.minecraftScriptingTypesShared.IItemStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity uses an item.
  */
@js.native
trait IEntityUseItemEventData extends js.Object {
  /**
    * The entity who is using the item
    */
  var entity: IEntity = js.native
  /**
    * The item that is being used
    */
  var item_stack: IItemStack = js.native
  /**
    * The way the entity used the item
    */
  var use_method: String = js.native
}

object IEntityUseItemEventData {
  @scala.inline
  def apply(entity: IEntity, item_stack: IItemStack, use_method: String): IEntityUseItemEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], item_stack = item_stack.asInstanceOf[js.Any], use_method = use_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityUseItemEventData]
  }
  @scala.inline
  implicit class IEntityUseItemEventDataOps[Self <: IEntityUseItemEventData] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withUse_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_method")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


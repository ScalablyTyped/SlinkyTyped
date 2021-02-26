package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import typingsSlinky.minecraftScriptingTypesShared.IItemStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity uses an item.
  */
@js.native
trait IEntityUseItemEventData extends StObject {
  
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
  implicit class IEntityUseItemEventDataMutableBuilder[Self <: IEntityUseItemEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_stack(value: IItemStack): Self = StObject.set(x, "item_stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_method(value: String): Self = StObject.set(x, "use_method", value.asInstanceOf[js.Any])
  }
}

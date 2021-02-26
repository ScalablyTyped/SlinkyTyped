package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesServer.anon.Effects
import typingsSlinky.minecraftScriptingTypesShared.MinecraftFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines how the entity can be healed by the player. This doesn't control how much health the entity can have; you must use the Health component for that instead.
  */
@js.native
trait IHealableComponent extends StObject {
  
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
  var items: js.Array[Effects] = js.native
}
object IHealableComponent {
  
  @scala.inline
  def apply(force_use: Boolean, items: js.Array[Effects]): IHealableComponent = {
    val __obj = js.Dynamic.literal(force_use = force_use.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHealableComponent]
  }
  
  @scala.inline
  implicit class IHealableComponentMutableBuilder[Self <: IHealableComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: MinecraftFilter): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setForce_use(value: Boolean): Self = StObject.set(x, "force_use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[Effects]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Effects*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

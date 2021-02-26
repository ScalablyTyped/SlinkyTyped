package typingsSlinky.openui5.sap.ui.model.analytics.odata4analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitySet extends StObject {
  
  /**
    * Get entity type used for this entity set
    * @returns The DataJS object representing the entity type
    */
  def getEntityType(): js.Any = js.native
  
  /**
    * Get the fully qualified name for this entity type
    * @returns The fully qualified name
    */
  def getQName(): String = js.native
  
  /**
    * Get full description for this entity set
    * @returns The DataJS object representing the entity set
    */
  def getSetDescription(): js.Any = js.native
  
  /**
    * Get names of properties in this entity set that can be updated
    * @returns An object with individual JS properties for each         updatable property. For testing
    * whether propertyName is the name         of an updatable property, use        
    * <code>getUpdatablePropertyNameSet()[propertyName]</code>. The         included JS object properties
    * are all set to true.
    */
  def getUpdatablePropertyNameSet(): js.Any = js.native
}
object EntitySet {
  
  @scala.inline
  def apply(
    getEntityType: () => js.Any,
    getQName: () => String,
    getSetDescription: () => js.Any,
    getUpdatablePropertyNameSet: () => js.Any
  ): EntitySet = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getQName = js.Any.fromFunction0(getQName), getSetDescription = js.Any.fromFunction0(getSetDescription), getUpdatablePropertyNameSet = js.Any.fromFunction0(getUpdatablePropertyNameSet))
    __obj.asInstanceOf[EntitySet]
  }
  
  @scala.inline
  implicit class EntitySetMutableBuilder[Self <: EntitySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEntityType(value: () => js.Any): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQName(value: () => String): Self = StObject.set(x, "getQName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSetDescription(value: () => js.Any): Self = StObject.set(x, "getSetDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpdatablePropertyNameSet(value: () => js.Any): Self = StObject.set(x, "getUpdatablePropertyNameSet", js.Any.fromFunction0(value))
  }
}

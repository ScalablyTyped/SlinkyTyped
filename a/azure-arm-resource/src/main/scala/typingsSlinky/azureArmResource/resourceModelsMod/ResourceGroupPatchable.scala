package typingsSlinky.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceGroupPatchable extends StObject {
  
  /**
    * The ID of the resource that manages this resource group.
    */
  var managedBy: js.UndefOr[String] = js.native
  
  /**
    * The name of the resource group.
    */
  var name: js.UndefOr[String] = js.native
  
  var properties: js.UndefOr[ResourceGroupProperties] = js.native
  
  /**
    * The tags attached to the resource group.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
}
object ResourceGroupPatchable {
  
  @scala.inline
  def apply(): ResourceGroupPatchable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupPatchable]
  }
  
  @scala.inline
  implicit class ResourceGroupPatchableMutableBuilder[Self <: ResourceGroupPatchable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedBy(value: String): Self = StObject.set(x, "managedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedByUndefined: Self = StObject.set(x, "managedBy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProperties(value: ResourceGroupProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}

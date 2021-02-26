package typingsSlinky.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderResourceType extends StObject {
  
  /**
    * The aliases that are supported by this resource type.
    */
  var aliases: js.UndefOr[js.Array[AliasType]] = js.native
  
  /**
    * The API version.
    */
  var apiVersions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The collection of locations where this resource type can be created.
    */
  var locations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The properties.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[String] = js.native
}
object ProviderResourceType {
  
  @scala.inline
  def apply(): ProviderResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderResourceType]
  }
  
  @scala.inline
  implicit class ProviderResourceTypeMutableBuilder[Self <: ProviderResourceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[AliasType]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: AliasType*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setApiVersions(value: js.Array[String]): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    
    @scala.inline
    def setApiVersionsVarargs(value: String*): Self = StObject.set(x, "apiVersions", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}

package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceProviderMetadata extends StObject {
  
  /**
    * Display name of the provider
    */
  var displayName: String = js.native
  
  /**
    * The identifier of the provider
    */
  var id: String = js.native
  
  /**
    * Optional settings that identify an instantiation of a provider
    */
  var settings: js.UndefOr[js.Object] = js.native
}
object ResourceProviderMetadata {
  
  @scala.inline
  def apply(displayName: String, id: String): ResourceProviderMetadata = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceProviderMetadata]
  }
  
  @scala.inline
  implicit class ResourceProviderMetadataMutableBuilder[Self <: ResourceProviderMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: js.Object): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}

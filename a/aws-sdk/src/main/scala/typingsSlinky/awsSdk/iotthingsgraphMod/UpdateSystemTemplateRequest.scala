package typingsSlinky.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSystemTemplateRequest extends StObject {
  
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace. If no value is specified, the latest version is used by default.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.native
  
  /**
    * The DefinitionDocument that contains the updated system definition.
    */
  var definition: DefinitionDocument = js.native
  
  /**
    * The ID of the system to be updated. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME 
    */
  var id: Urn = js.native
}
object UpdateSystemTemplateRequest {
  
  @scala.inline
  def apply(definition: DefinitionDocument, id: Urn): UpdateSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSystemTemplateRequest]
  }
  
  @scala.inline
  implicit class UpdateSystemTemplateRequestMutableBuilder[Self <: UpdateSystemTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleNamespaceVersion(value: Version): Self = StObject.set(x, "compatibleNamespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleNamespaceVersionUndefined: Self = StObject.set(x, "compatibleNamespaceVersion", js.undefined)
    
    @scala.inline
    def setDefinition(value: DefinitionDocument): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeChoice extends StObject {
  
  var cred_def_id: CredentialDefinitionID = js.native
  
  var name: String = js.native
  
  var schema_id: CredentialSchemaID = js.native
  
  var value: String = js.native
}
object AttributeChoice {
  
  @scala.inline
  def apply(cred_def_id: CredentialDefinitionID, name: String, schema_id: CredentialSchemaID, value: String): AttributeChoice = {
    val __obj = js.Dynamic.literal(cred_def_id = cred_def_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeChoice]
  }
  
  @scala.inline
  implicit class AttributeChoiceMutableBuilder[Self <: AttributeChoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCred_def_id(value: CredentialDefinitionID): Self = StObject.set(x, "cred_def_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_id(value: CredentialSchemaID): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

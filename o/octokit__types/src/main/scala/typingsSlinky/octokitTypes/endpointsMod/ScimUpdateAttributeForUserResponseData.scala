package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Created
import typingsSlinky.octokitTypes.anon.FamilyName
import typingsSlinky.octokitTypes.anon.Primary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScimUpdateAttributeForUserResponseData extends StObject {
  
  var active: Boolean = js.native
  
  var emails: js.Array[Primary] = js.native
  
  var externalId: String = js.native
  
  var id: String = js.native
  
  var meta: Created = js.native
  
  var name: FamilyName = js.native
  
  var schemas: js.Array[String] = js.native
  
  var userName: String = js.native
}
object ScimUpdateAttributeForUserResponseData {
  
  @scala.inline
  def apply(
    active: Boolean,
    emails: js.Array[Primary],
    externalId: String,
    id: String,
    meta: Created,
    name: FamilyName,
    schemas: js.Array[String],
    userName: String
  ): ScimUpdateAttributeForUserResponseData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimUpdateAttributeForUserResponseData]
  }
  
  @scala.inline
  implicit class ScimUpdateAttributeForUserResponseDataMutableBuilder[Self <: ScimUpdateAttributeForUserResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmails(value: js.Array[Primary]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsVarargs(value: Primary*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: Created): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FamilyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}

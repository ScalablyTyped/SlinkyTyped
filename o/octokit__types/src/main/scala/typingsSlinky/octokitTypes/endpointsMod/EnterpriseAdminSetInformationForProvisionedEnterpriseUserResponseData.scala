package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Created
import typingsSlinky.octokitTypes.anon.FamilyName
import typingsSlinky.octokitTypes.anon.Primary
import typingsSlinky.octokitTypes.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData extends js.Object {
  
  var active: Boolean = js.native
  
  var emails: js.Array[Primary] = js.native
  
  var externalId: String = js.native
  
  var groups: js.Array[Value] = js.native
  
  var id: String = js.native
  
  var meta: Created = js.native
  
  var name: FamilyName = js.native
  
  var schemas: js.Array[String] = js.native
  
  var userName: String = js.native
}
object EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData {
  
  @scala.inline
  def apply(
    active: Boolean,
    emails: js.Array[Primary],
    externalId: String,
    groups: js.Array[Value],
    id: String,
    meta: Created,
    name: FamilyName,
    schemas: js.Array[String],
    userName: String
  ): EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseDataOps[Self <: EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsVarargs(value: Primary*): Self = this.set("emails", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[Primary]): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: Value*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[Value]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: Created): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FamilyName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: String*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[String]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
  }
}

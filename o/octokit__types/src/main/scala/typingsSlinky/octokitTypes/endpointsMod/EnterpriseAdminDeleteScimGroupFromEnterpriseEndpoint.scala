package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String = js.native
  
  /**
    * Identifier generated by the GitHub SCIM endpoint.
    */
  var scim_group_id: String = js.native
}
object EnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String, scim_group_id: String): EnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], scim_group_id = scim_group_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminDeleteScimGroupFromEnterpriseEndpointMutableBuilder[Self <: EnterpriseAdminDeleteScimGroupFromEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScim_group_id(value: String): Self = StObject.set(x, "scim_group_id", value.asInstanceOf[js.Any])
  }
}

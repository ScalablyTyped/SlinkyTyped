package typingsSlinky.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyBinding extends StObject {
  
  /**
    * Required. Member to bind the role with. See /iam/docs/reference/rest/v1/Policy#Binding for how to format each member. Eg. - user:myuser@mydomain.com -
    * serviceAccount:my-service-account@app.gserviceaccount.com
    */
  var member: js.UndefOr[String] = js.native
  
  /**
    * Required. Role to apply. Only allowlisted roles can be used at the specified granularity. The role must be one of the following: - 'roles/container.hostServiceAgentUser' applied on
    * the shared VPC host project - 'roles/compute.securityAdmin' applied on the shared VPC host project
    */
  var role: js.UndefOr[String] = js.native
}
object PolicyBinding {
  
  @scala.inline
  def apply(): PolicyBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyBinding]
  }
  
  @scala.inline
  implicit class PolicyBindingMutableBuilder[Self <: PolicyBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}

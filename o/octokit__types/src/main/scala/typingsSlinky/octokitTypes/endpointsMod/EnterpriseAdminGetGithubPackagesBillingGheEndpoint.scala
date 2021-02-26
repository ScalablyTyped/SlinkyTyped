package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminGetGithubPackagesBillingGheEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String = js.native
}
object EnterpriseAdminGetGithubPackagesBillingGheEndpoint {
  
  @scala.inline
  def apply(enterprise: String): EnterpriseAdminGetGithubPackagesBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminGetGithubPackagesBillingGheEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminGetGithubPackagesBillingGheEndpointMutableBuilder[Self <: EnterpriseAdminGetGithubPackagesBillingGheEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
  }
}

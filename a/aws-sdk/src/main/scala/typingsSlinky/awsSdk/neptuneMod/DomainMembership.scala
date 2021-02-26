package typingsSlinky.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainMembership extends StObject {
  
  /**
    * The identifier of the Active Directory Domain.
    */
  var Domain: js.UndefOr[String] = js.native
  
  /**
    * The fully qualified domain name of the Active Directory Domain.
    */
  var FQDN: js.UndefOr[String] = js.native
  
  /**
    * The name of the IAM role to be used when making API calls to the Directory Service.
    */
  var IAMRoleName: js.UndefOr[String] = js.native
  
  /**
    * The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed etc).
    */
  var Status: js.UndefOr[String] = js.native
}
object DomainMembership {
  
  @scala.inline
  def apply(): DomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMembership]
  }
  
  @scala.inline
  implicit class DomainMembershipMutableBuilder[Self <: DomainMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setFQDN(value: String): Self = StObject.set(x, "FQDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFQDNUndefined: Self = StObject.set(x, "FQDN", js.undefined)
    
    @scala.inline
    def setIAMRoleName(value: String): Self = StObject.set(x, "IAMRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIAMRoleNameUndefined: Self = StObject.set(x, "IAMRoleName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

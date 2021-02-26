package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelegatedService extends StObject {
  
  /**
    * The date that the account became a delegated administrator for this service. 
    */
  var DelegationEnabledDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of a service that can request an operation for the specified service. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
    */
  var ServicePrincipal: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.ServicePrincipal] = js.native
}
object DelegatedService {
  
  @scala.inline
  def apply(): DelegatedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedService]
  }
  
  @scala.inline
  implicit class DelegatedServiceMutableBuilder[Self <: DelegatedService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegationEnabledDate(value: js.Date): Self = StObject.set(x, "DelegationEnabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegationEnabledDateUndefined: Self = StObject.set(x, "DelegationEnabledDate", js.undefined)
    
    @scala.inline
    def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePrincipalUndefined: Self = StObject.set(x, "ServicePrincipal", js.undefined)
  }
}

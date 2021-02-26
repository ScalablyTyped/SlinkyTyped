package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableAWSServiceAccessRequest extends StObject {
  
  /**
    * The service principal name of the AWS service for which you want to disable integration with your organization. This is typically in the form of a URL, such as  service-abbreviation.amazonaws.com.
    */
  var ServicePrincipal: typingsSlinky.awsSdk.organizationsMod.ServicePrincipal = js.native
}
object DisableAWSServiceAccessRequest {
  
  @scala.inline
  def apply(ServicePrincipal: ServicePrincipal): DisableAWSServiceAccessRequest = {
    val __obj = js.Dynamic.literal(ServicePrincipal = ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableAWSServiceAccessRequest]
  }
  
  @scala.inline
  implicit class DisableAWSServiceAccessRequestMutableBuilder[Self <: DisableAWSServiceAccessRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
  }
}

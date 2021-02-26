package typingsSlinky.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyDelegationSettings extends StObject {
  
  /** Permission to check in IAM. */
  var iamPermission: js.UndefOr[String] = js.native
  
  /**
    * The DNS name of the service (e.g. "resourcemanager.googleapis.com"). This should be the domain name part of the full resource names (see https://aip.dev/122#full-resource-names),
    * which is usually the same as IamServiceSpec.service of the service where the resource type is defined.
    */
  var iamServiceName: js.UndefOr[String] = js.native
  
  /** Policy name to be checked */
  var policyName: js.UndefOr[PolicyName] = js.native
  
  /** IAM resource to check permission on */
  var resource: js.UndefOr[Resource] = js.native
}
object PolicyDelegationSettings {
  
  @scala.inline
  def apply(): PolicyDelegationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDelegationSettings]
  }
  
  @scala.inline
  implicit class PolicyDelegationSettingsMutableBuilder[Self <: PolicyDelegationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamPermission(value: String): Self = StObject.set(x, "iamPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamPermissionUndefined: Self = StObject.set(x, "iamPermission", js.undefined)
    
    @scala.inline
    def setIamServiceName(value: String): Self = StObject.set(x, "iamServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamServiceNameUndefined: Self = StObject.set(x, "iamServiceName", js.undefined)
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}

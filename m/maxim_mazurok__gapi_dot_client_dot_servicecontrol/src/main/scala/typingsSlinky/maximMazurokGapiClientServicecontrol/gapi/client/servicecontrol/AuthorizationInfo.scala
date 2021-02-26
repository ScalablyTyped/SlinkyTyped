package typingsSlinky.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationInfo extends StObject {
  
  /** Whether or not authorization for `resource` and `permission` was granted. */
  var granted: js.UndefOr[Boolean] = js.native
  
  /** The required IAM permission. */
  var permission: js.UndefOr[String] = js.native
  
  /** The resource being accessed, as a REST-style string. For example: bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID */
  var resource: js.UndefOr[String] = js.native
  
  /**
    * Resource attributes used in IAM condition evaluation. This field contains resource attributes like resource type and resource name. To get the whole view of the attributes used in
    * IAM condition evaluation, the user must also look into `AuditLog.request_metadata.request_attributes`.
    */
  var resourceAttributes: js.UndefOr[Resource] = js.native
}
object AuthorizationInfo {
  
  @scala.inline
  def apply(): AuthorizationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationInfo]
  }
  
  @scala.inline
  implicit class AuthorizationInfoMutableBuilder[Self <: AuthorizationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGranted(value: Boolean): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantedUndefined: Self = StObject.set(x, "granted", js.undefined)
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAttributes(value: Resource): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}

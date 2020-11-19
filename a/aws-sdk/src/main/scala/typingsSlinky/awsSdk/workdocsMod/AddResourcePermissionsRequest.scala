package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddResourcePermissionsRequest extends js.Object {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The notification options.
    */
  var NotificationOptions: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.NotificationOptions] = js.native
  
  /**
    * The users, groups, or organization being granted permission.
    */
  var Principals: SharePrincipalList = js.native
  
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}
object AddResourcePermissionsRequest {
  
  @scala.inline
  def apply(Principals: SharePrincipalList, ResourceId: ResourceIdType): AddResourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(Principals = Principals.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddResourcePermissionsRequest]
  }
  
  @scala.inline
  implicit class AddResourcePermissionsRequestOps[Self <: AddResourcePermissionsRequest] (val x: Self) extends AnyVal {
    
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
    def setPrincipalsVarargs(value: SharePrincipal*): Self = this.set("Principals", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: SharePrincipalList): Self = this.set("Principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceIdType): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    
    @scala.inline
    def setNotificationOptions(value: NotificationOptions): Self = this.set("NotificationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationOptions: Self = this.set("NotificationOptions", js.undefined)
  }
}

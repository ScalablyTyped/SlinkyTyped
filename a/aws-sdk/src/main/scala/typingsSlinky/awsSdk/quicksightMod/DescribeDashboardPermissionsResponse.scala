package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDashboardPermissionsResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.native
  
  /**
    * A structure that contains the permissions for the dashboard.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object DescribeDashboardPermissionsResponse {
  
  @scala.inline
  def apply(): DescribeDashboardPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDashboardPermissionsResponse]
  }
  
  @scala.inline
  implicit class DescribeDashboardPermissionsResponseOps[Self <: DescribeDashboardPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDashboardArn(value: Arn): Self = this.set("DashboardArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboardArn: Self = this.set("DashboardArn", js.undefined)
    
    @scala.inline
    def setDashboardId(value: RestrictiveResourceId): Self = this.set("DashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboardId: Self = this.set("DashboardId", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = this.set("Permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: ResourcePermissionList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}

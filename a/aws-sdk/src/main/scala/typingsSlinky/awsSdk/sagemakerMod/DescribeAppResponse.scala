package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAppResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the app.
    */
  var AppArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AppArn] = js.native
  
  /**
    * The name of the app.
    */
  var AppName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AppName] = js.native
  
  /**
    * The type of app.
    */
  var AppType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AppType] = js.native
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DomainId] = js.native
  
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The timestamp of the last health check.
    */
  var LastHealthCheckTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The timestamp of the last user's activity.
    */
  var LastUserActivityTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
    */
  var ResourceSpec: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ResourceSpec] = js.native
  
  /**
    * The status.
    */
  var Status: js.UndefOr[AppStatus] = js.native
  
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.UserProfileName] = js.native
}
object DescribeAppResponse {
  
  @scala.inline
  def apply(): DescribeAppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppResponse]
  }
  
  @scala.inline
  implicit class DescribeAppResponseOps[Self <: DescribeAppResponse] (val x: Self) extends AnyVal {
    
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
    def setAppArn(value: AppArn): Self = this.set("AppArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppArn: Self = this.set("AppArn", js.undefined)
    
    @scala.inline
    def setAppName(value: AppName): Self = this.set("AppName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppName: Self = this.set("AppName", js.undefined)
    
    @scala.inline
    def setAppType(value: AppType): Self = this.set("AppType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppType: Self = this.set("AppType", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainId: Self = this.set("DomainId", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setLastHealthCheckTimestamp(value: js.Date): Self = this.set("LastHealthCheckTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastHealthCheckTimestamp: Self = this.set("LastHealthCheckTimestamp", js.undefined)
    
    @scala.inline
    def setLastUserActivityTimestamp(value: js.Date): Self = this.set("LastUserActivityTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUserActivityTimestamp: Self = this.set("LastUserActivityTimestamp", js.undefined)
    
    @scala.inline
    def setResourceSpec(value: ResourceSpec): Self = this.set("ResourceSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceSpec: Self = this.set("ResourceSpec", js.undefined)
    
    @scala.inline
    def setStatus(value: AppStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = this.set("UserProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProfileName: Self = this.set("UserProfileName", js.undefined)
  }
}

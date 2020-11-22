package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosUpdateDeviceStatus extends Entity {
  
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.native
  
  // Device name of the DevicePolicyStatus.
  var deviceDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The device id that is being reported.
  var deviceId: js.UndefOr[NullableOption[String]] = js.native
  
  // The device model that is being reported
  var deviceModel: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The installation status of the policy report. Possible values are: success, available, idle, unknown, downloading,
    * downloadFailed, downloadRequiresComputer, downloadInsufficientSpace, downloadInsufficientPower,
    * downloadInsufficientNetwork, installing, installInsufficientSpace, installInsufficientPower,
    * installPhoneCallInProgress, installFailed, notSupportedOperation, sharedDeviceUserLoggedInError.
    */
  var installStatus: js.UndefOr[IosUpdatesInstallStatus] = js.native
  
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[String] = js.native
  
  // The device version that is being reported.
  var osVersion: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.native
  
  // The User id that is being reported.
  var userId: js.UndefOr[NullableOption[String]] = js.native
  
  // The User Name that is being reported
  var userName: js.UndefOr[NullableOption[String]] = js.native
  
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
}
object IosUpdateDeviceStatus {
  
  @scala.inline
  def apply(): IosUpdateDeviceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosUpdateDeviceStatus]
  }
  
  @scala.inline
  implicit class IosUpdateDeviceStatusOps[Self <: IosUpdateDeviceStatus] (val x: Self) extends AnyVal {
    
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
    def setComplianceGracePeriodExpirationDateTime(value: String): Self = this.set("complianceGracePeriodExpirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceGracePeriodExpirationDateTime: Self = this.set("complianceGracePeriodExpirationDateTime", js.undefined)
    
    @scala.inline
    def setDeviceDisplayName(value: NullableOption[String]): Self = this.set("deviceDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceDisplayName: Self = this.set("deviceDisplayName", js.undefined)
    
    @scala.inline
    def setDeviceDisplayNameNull: Self = this.set("deviceDisplayName", null)
    
    @scala.inline
    def setDeviceId(value: NullableOption[String]): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdNull: Self = this.set("deviceId", null)
    
    @scala.inline
    def setDeviceModel(value: NullableOption[String]): Self = this.set("deviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceModel: Self = this.set("deviceModel", js.undefined)
    
    @scala.inline
    def setDeviceModelNull: Self = this.set("deviceModel", null)
    
    @scala.inline
    def setInstallStatus(value: IosUpdatesInstallStatus): Self = this.set("installStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallStatus: Self = this.set("installStatus", js.undefined)
    
    @scala.inline
    def setLastReportedDateTime(value: String): Self = this.set("lastReportedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastReportedDateTime: Self = this.set("lastReportedDateTime", js.undefined)
    
    @scala.inline
    def setOsVersion(value: NullableOption[String]): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    
    @scala.inline
    def setOsVersionNull: Self = this.set("osVersion", null)
    
    @scala.inline
    def setStatus(value: ComplianceStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUserId(value: NullableOption[String]): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserIdNull: Self = this.set("userId", null)
    
    @scala.inline
    def setUserName(value: NullableOption[String]): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    
    @scala.inline
    def setUserNameNull: Self = this.set("userName", null)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
    
    @scala.inline
    def setUserPrincipalNameNull: Self = this.set("userPrincipalName", null)
  }
}

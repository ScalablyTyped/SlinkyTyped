package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceConfigurationDeviceStatus extends Entity {
  
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.native
  
  // Device name of the DevicePolicyStatus.
  var deviceDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The device model that is being reported
  var deviceModel: js.UndefOr[NullableOption[String]] = js.native
  
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.native
  
  // The User Name that is being reported
  var userName: js.UndefOr[NullableOption[String]] = js.native
  
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
}
object DeviceConfigurationDeviceStatus {
  
  @scala.inline
  def apply(): DeviceConfigurationDeviceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationDeviceStatus]
  }
  
  @scala.inline
  implicit class DeviceConfigurationDeviceStatusMutableBuilder[Self <: DeviceConfigurationDeviceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceGracePeriodExpirationDateTime(value: String): Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceGracePeriodExpirationDateTimeUndefined: Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", js.undefined)
    
    @scala.inline
    def setDeviceDisplayName(value: NullableOption[String]): Self = StObject.set(x, "deviceDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDisplayNameNull: Self = StObject.set(x, "deviceDisplayName", null)
    
    @scala.inline
    def setDeviceDisplayNameUndefined: Self = StObject.set(x, "deviceDisplayName", js.undefined)
    
    @scala.inline
    def setDeviceModel(value: NullableOption[String]): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceModelNull: Self = StObject.set(x, "deviceModel", null)
    
    @scala.inline
    def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
    
    @scala.inline
    def setLastReportedDateTime(value: String): Self = StObject.set(x, "lastReportedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastReportedDateTimeUndefined: Self = StObject.set(x, "lastReportedDateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: ComplianceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUserName(value: NullableOption[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}

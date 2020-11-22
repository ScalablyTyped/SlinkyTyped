package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedAppRegistration extends Entity {
  
  // The app package Identifier
  var appIdentifier: js.UndefOr[NullableOption[MobileAppIdentifier]] = js.native
  
  // App version
  var applicationVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Zero or more policys already applied on the registered app when it last synchronized with managment service.
  var appliedPolicies: js.UndefOr[NullableOption[js.Array[ManagedAppPolicy]]] = js.native
  
  // Date and time of creation
  var createdDateTime: js.UndefOr[String] = js.native
  
  // Host device name
  var deviceName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in
    * all conditions.
    */
  var deviceTag: js.UndefOr[NullableOption[String]] = js.native
  
  // Host device type
  var deviceType: js.UndefOr[NullableOption[String]] = js.native
  
  // Zero or more reasons an app registration is flagged. E.g. app running on rooted device
  var flaggedReasons: js.UndefOr[js.Array[ManagedAppFlaggedReason]] = js.native
  
  // Zero or more policies admin intended for the app as of now.
  var intendedPolicies: js.UndefOr[NullableOption[js.Array[ManagedAppPolicy]]] = js.native
  
  // Date and time of last the app synced with management service.
  var lastSyncDateTime: js.UndefOr[String] = js.native
  
  // App management SDK version
  var managementSdkVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Zero or more long running operations triggered on the app registration.
  var operations: js.UndefOr[NullableOption[js.Array[ManagedAppOperation]]] = js.native
  
  // Operating System version
  var platformVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // The user Id to who this app registration belongs.
  var userId: js.UndefOr[NullableOption[String]] = js.native
  
  // Version of the entity.
  var version: js.UndefOr[NullableOption[String]] = js.native
}
object ManagedAppRegistration {
  
  @scala.inline
  def apply(): ManagedAppRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppRegistration]
  }
  
  @scala.inline
  implicit class ManagedAppRegistrationOps[Self <: ManagedAppRegistration] (val x: Self) extends AnyVal {
    
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
    def setAppIdentifier(value: NullableOption[MobileAppIdentifier]): Self = this.set("appIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppIdentifier: Self = this.set("appIdentifier", js.undefined)
    
    @scala.inline
    def setAppIdentifierNull: Self = this.set("appIdentifier", null)
    
    @scala.inline
    def setApplicationVersion(value: NullableOption[String]): Self = this.set("applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationVersion: Self = this.set("applicationVersion", js.undefined)
    
    @scala.inline
    def setApplicationVersionNull: Self = this.set("applicationVersion", null)
    
    @scala.inline
    def setAppliedPoliciesVarargs(value: ManagedAppPolicy*): Self = this.set("appliedPolicies", js.Array(value :_*))
    
    @scala.inline
    def setAppliedPolicies(value: NullableOption[js.Array[ManagedAppPolicy]]): Self = this.set("appliedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedPolicies: Self = this.set("appliedPolicies", js.undefined)
    
    @scala.inline
    def setAppliedPoliciesNull: Self = this.set("appliedPolicies", null)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setDeviceName(value: NullableOption[String]): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setDeviceNameNull: Self = this.set("deviceName", null)
    
    @scala.inline
    def setDeviceTag(value: NullableOption[String]): Self = this.set("deviceTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceTag: Self = this.set("deviceTag", js.undefined)
    
    @scala.inline
    def setDeviceTagNull: Self = this.set("deviceTag", null)
    
    @scala.inline
    def setDeviceType(value: NullableOption[String]): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceType: Self = this.set("deviceType", js.undefined)
    
    @scala.inline
    def setDeviceTypeNull: Self = this.set("deviceType", null)
    
    @scala.inline
    def setFlaggedReasonsVarargs(value: ManagedAppFlaggedReason*): Self = this.set("flaggedReasons", js.Array(value :_*))
    
    @scala.inline
    def setFlaggedReasons(value: js.Array[ManagedAppFlaggedReason]): Self = this.set("flaggedReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlaggedReasons: Self = this.set("flaggedReasons", js.undefined)
    
    @scala.inline
    def setIntendedPoliciesVarargs(value: ManagedAppPolicy*): Self = this.set("intendedPolicies", js.Array(value :_*))
    
    @scala.inline
    def setIntendedPolicies(value: NullableOption[js.Array[ManagedAppPolicy]]): Self = this.set("intendedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntendedPolicies: Self = this.set("intendedPolicies", js.undefined)
    
    @scala.inline
    def setIntendedPoliciesNull: Self = this.set("intendedPolicies", null)
    
    @scala.inline
    def setLastSyncDateTime(value: String): Self = this.set("lastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSyncDateTime: Self = this.set("lastSyncDateTime", js.undefined)
    
    @scala.inline
    def setManagementSdkVersion(value: NullableOption[String]): Self = this.set("managementSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagementSdkVersion: Self = this.set("managementSdkVersion", js.undefined)
    
    @scala.inline
    def setManagementSdkVersionNull: Self = this.set("managementSdkVersion", null)
    
    @scala.inline
    def setOperationsVarargs(value: ManagedAppOperation*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: NullableOption[js.Array[ManagedAppOperation]]): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    
    @scala.inline
    def setOperationsNull: Self = this.set("operations", null)
    
    @scala.inline
    def setPlatformVersion(value: NullableOption[String]): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformVersion: Self = this.set("platformVersion", js.undefined)
    
    @scala.inline
    def setPlatformVersionNull: Self = this.set("platformVersion", null)
    
    @scala.inline
    def setUserId(value: NullableOption[String]): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserIdNull: Self = this.set("userId", null)
    
    @scala.inline
    def setVersion(value: NullableOption[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionNull: Self = this.set("version", null)
  }
}

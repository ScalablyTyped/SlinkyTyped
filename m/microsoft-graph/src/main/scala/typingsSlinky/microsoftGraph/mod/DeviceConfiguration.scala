package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceConfiguration extends Entity {
  
  // The list of assignments for the device configuration profile.
  var assignments: js.UndefOr[NullableOption[js.Array[DeviceConfigurationAssignment]]] = js.native
  
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Device Configuration Setting State Device Summary
  var deviceSettingStateSummaries: js.UndefOr[NullableOption[js.Array[SettingStateDeviceSummary]]] = js.native
  
  // Device Configuration devices status overview
  var deviceStatusOverview: js.UndefOr[NullableOption[DeviceConfigurationDeviceOverview]] = js.native
  
  // Device configuration installation status by device.
  var deviceStatuses: js.UndefOr[NullableOption[js.Array[DeviceConfigurationDeviceStatus]]] = js.native
  
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.native
  
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  // Device Configuration users status overview
  var userStatusOverview: js.UndefOr[NullableOption[DeviceConfigurationUserOverview]] = js.native
  
  // Device configuration installation status by user.
  var userStatuses: js.UndefOr[NullableOption[js.Array[DeviceConfigurationUserStatus]]] = js.native
  
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.native
}
object DeviceConfiguration {
  
  @scala.inline
  def apply(): DeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfiguration]
  }
  
  @scala.inline
  implicit class DeviceConfigurationOps[Self <: DeviceConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAssignmentsVarargs(value: DeviceConfigurationAssignment*): Self = this.set("assignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[DeviceConfigurationAssignment]]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsNull: Self = this.set("assignments", null)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDeviceSettingStateSummariesVarargs(value: SettingStateDeviceSummary*): Self = this.set("deviceSettingStateSummaries", js.Array(value :_*))
    
    @scala.inline
    def setDeviceSettingStateSummaries(value: NullableOption[js.Array[SettingStateDeviceSummary]]): Self = this.set("deviceSettingStateSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSettingStateSummaries: Self = this.set("deviceSettingStateSummaries", js.undefined)
    
    @scala.inline
    def setDeviceSettingStateSummariesNull: Self = this.set("deviceSettingStateSummaries", null)
    
    @scala.inline
    def setDeviceStatusOverview(value: NullableOption[DeviceConfigurationDeviceOverview]): Self = this.set("deviceStatusOverview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceStatusOverview: Self = this.set("deviceStatusOverview", js.undefined)
    
    @scala.inline
    def setDeviceStatusOverviewNull: Self = this.set("deviceStatusOverview", null)
    
    @scala.inline
    def setDeviceStatusesVarargs(value: DeviceConfigurationDeviceStatus*): Self = this.set("deviceStatuses", js.Array(value :_*))
    
    @scala.inline
    def setDeviceStatuses(value: NullableOption[js.Array[DeviceConfigurationDeviceStatus]]): Self = this.set("deviceStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceStatuses: Self = this.set("deviceStatuses", js.undefined)
    
    @scala.inline
    def setDeviceStatusesNull: Self = this.set("deviceStatuses", null)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setUserStatusOverview(value: NullableOption[DeviceConfigurationUserOverview]): Self = this.set("userStatusOverview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStatusOverview: Self = this.set("userStatusOverview", js.undefined)
    
    @scala.inline
    def setUserStatusOverviewNull: Self = this.set("userStatusOverview", null)
    
    @scala.inline
    def setUserStatusesVarargs(value: DeviceConfigurationUserStatus*): Self = this.set("userStatuses", js.Array(value :_*))
    
    @scala.inline
    def setUserStatuses(value: NullableOption[js.Array[DeviceConfigurationUserStatus]]): Self = this.set("userStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStatuses: Self = this.set("userStatuses", js.undefined)
    
    @scala.inline
    def setUserStatusesNull: Self = this.set("userStatuses", null)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}

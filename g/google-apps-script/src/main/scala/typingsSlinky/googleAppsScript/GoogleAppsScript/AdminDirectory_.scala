package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.AspsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ChannelsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ChromeosdevicesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.CustomersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.DomainAliasesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.DomainsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.GroupsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.MembersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.MobiledevicesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.NotificationsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.OrgunitsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.PrivilegesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ResolvedAppAccessSettingsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ResourcesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.RoleAssignmentsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.RolesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.SchemasCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.TokensCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.UsersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.VerificationCodesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Alias
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Building
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.BuildingAddress
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.BuildingCoordinates
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.CalendarResource
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Channel
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDevice
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceAction
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceActiveTimeRanges
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceCpuStatusReports
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceDeviceFiles
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceDiskVolumeReports
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceDiskVolumeReportsVolumeInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceRecentUsers
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceSystemRamFreeReports
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceTpmVersionInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsMoveDevicesToOu
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Customer
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.CustomerPostalAddress
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.DomainAlias
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Domains
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Feature
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.FeatureRename
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Group
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Member
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.MobileDeviceAction
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Notification
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.OrgUnit
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Role
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.RoleAssignment
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.RoleRolePrivileges
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.SchemaFieldSpec
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.SchemaFieldSpecNumericIndexingSpec
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.User
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserMakeAdmin
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserName
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserPhoto
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserUndelete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminDirectory_ extends js.Object {
  var Asps: js.UndefOr[AspsCollection] = js.native
  var Channels: js.UndefOr[ChannelsCollection] = js.native
  var Chromeosdevices: js.UndefOr[ChromeosdevicesCollection] = js.native
  var Customers: js.UndefOr[CustomersCollection] = js.native
  var DomainAliases: js.UndefOr[DomainAliasesCollection] = js.native
  var Domains: js.UndefOr[DomainsCollection] = js.native
  var Groups: js.UndefOr[GroupsCollection] = js.native
  var Members: js.UndefOr[MembersCollection] = js.native
  var Mobiledevices: js.UndefOr[MobiledevicesCollection] = js.native
  var Notifications: js.UndefOr[NotificationsCollection] = js.native
  var Orgunits: js.UndefOr[OrgunitsCollection] = js.native
  var Privileges: js.UndefOr[PrivilegesCollection] = js.native
  var ResolvedAppAccessSettings: js.UndefOr[ResolvedAppAccessSettingsCollection] = js.native
  var Resources: js.UndefOr[ResourcesCollection] = js.native
  var RoleAssignments: js.UndefOr[RoleAssignmentsCollection] = js.native
  var Roles: js.UndefOr[RolesCollection] = js.native
  var Schemas: js.UndefOr[SchemasCollection] = js.native
  var Tokens: js.UndefOr[TokensCollection] = js.native
  var Users: js.UndefOr[UsersCollection] = js.native
  var VerificationCodes: js.UndefOr[VerificationCodesCollection] = js.native
  // Create a new instance of Alias
  def newAlias(): Alias = js.native
  // Create a new instance of Building
  def newBuilding(): Building = js.native
  // Create a new instance of BuildingAddress
  def newBuildingAddress(): BuildingAddress = js.native
  // Create a new instance of BuildingCoordinates
  def newBuildingCoordinates(): BuildingCoordinates = js.native
  // Create a new instance of CalendarResource
  def newCalendarResource(): CalendarResource = js.native
  // Create a new instance of Channel
  def newChannel(): Channel = js.native
  // Create a new instance of ChromeOsDevice
  def newChromeOsDevice(): ChromeOsDevice = js.native
  // Create a new instance of ChromeOsDeviceAction
  def newChromeOsDeviceAction(): ChromeOsDeviceAction = js.native
  // Create a new instance of ChromeOsDeviceActiveTimeRanges
  def newChromeOsDeviceActiveTimeRanges(): ChromeOsDeviceActiveTimeRanges = js.native
  // Create a new instance of ChromeOsDeviceCpuStatusReports
  def newChromeOsDeviceCpuStatusReports(): ChromeOsDeviceCpuStatusReports = js.native
  // Create a new instance of ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo
  def newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo(): ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo = js.native
  // Create a new instance of ChromeOsDeviceDeviceFiles
  def newChromeOsDeviceDeviceFiles(): ChromeOsDeviceDeviceFiles = js.native
  // Create a new instance of ChromeOsDeviceDiskVolumeReports
  def newChromeOsDeviceDiskVolumeReports(): ChromeOsDeviceDiskVolumeReports = js.native
  // Create a new instance of ChromeOsDeviceDiskVolumeReportsVolumeInfo
  def newChromeOsDeviceDiskVolumeReportsVolumeInfo(): ChromeOsDeviceDiskVolumeReportsVolumeInfo = js.native
  // Create a new instance of ChromeOsDeviceRecentUsers
  def newChromeOsDeviceRecentUsers(): ChromeOsDeviceRecentUsers = js.native
  // Create a new instance of ChromeOsDeviceSystemRamFreeReports
  def newChromeOsDeviceSystemRamFreeReports(): ChromeOsDeviceSystemRamFreeReports = js.native
  // Create a new instance of ChromeOsDeviceTpmVersionInfo
  def newChromeOsDeviceTpmVersionInfo(): ChromeOsDeviceTpmVersionInfo = js.native
  // Create a new instance of ChromeOsMoveDevicesToOu
  def newChromeOsMoveDevicesToOu(): ChromeOsMoveDevicesToOu = js.native
  // Create a new instance of Customer
  def newCustomer(): Customer = js.native
  // Create a new instance of CustomerPostalAddress
  def newCustomerPostalAddress(): CustomerPostalAddress = js.native
  // Create a new instance of DomainAlias
  def newDomainAlias(): DomainAlias = js.native
  // Create a new instance of Domains
  def newDomains(): Domains = js.native
  // Create a new instance of Feature
  def newFeature(): Feature = js.native
  // Create a new instance of FeatureRename
  def newFeatureRename(): FeatureRename = js.native
  // Create a new instance of Group
  def newGroup(): Group = js.native
  // Create a new instance of Member
  def newMember(): Member = js.native
  // Create a new instance of MobileDeviceAction
  def newMobileDeviceAction(): MobileDeviceAction = js.native
  // Create a new instance of Notification
  def newNotification(): Notification = js.native
  // Create a new instance of OrgUnit
  def newOrgUnit(): OrgUnit = js.native
  // Create a new instance of Role
  def newRole(): Role = js.native
  // Create a new instance of RoleAssignment
  def newRoleAssignment(): RoleAssignment = js.native
  // Create a new instance of RoleRolePrivileges
  def newRoleRolePrivileges(): RoleRolePrivileges = js.native
  // Create a new instance of Schema
  def newSchema(): Schema = js.native
  // Create a new instance of SchemaFieldSpec
  def newSchemaFieldSpec(): SchemaFieldSpec = js.native
  // Create a new instance of SchemaFieldSpecNumericIndexingSpec
  def newSchemaFieldSpecNumericIndexingSpec(): SchemaFieldSpecNumericIndexingSpec = js.native
  // Create a new instance of User
  def newUser(): User = js.native
  // Create a new instance of UserMakeAdmin
  def newUserMakeAdmin(): UserMakeAdmin = js.native
  // Create a new instance of UserName
  def newUserName(): UserName = js.native
  // Create a new instance of UserPhoto
  def newUserPhoto(): UserPhoto = js.native
  // Create a new instance of UserUndelete
  def newUserUndelete(): UserUndelete = js.native
}

object AdminDirectory_ {
  @scala.inline
  def apply(
    newAlias: () => Alias,
    newBuilding: () => Building,
    newBuildingAddress: () => BuildingAddress,
    newBuildingCoordinates: () => BuildingCoordinates,
    newCalendarResource: () => CalendarResource,
    newChannel: () => Channel,
    newChromeOsDevice: () => ChromeOsDevice,
    newChromeOsDeviceAction: () => ChromeOsDeviceAction,
    newChromeOsDeviceActiveTimeRanges: () => ChromeOsDeviceActiveTimeRanges,
    newChromeOsDeviceCpuStatusReports: () => ChromeOsDeviceCpuStatusReports,
    newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo: () => ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo,
    newChromeOsDeviceDeviceFiles: () => ChromeOsDeviceDeviceFiles,
    newChromeOsDeviceDiskVolumeReports: () => ChromeOsDeviceDiskVolumeReports,
    newChromeOsDeviceDiskVolumeReportsVolumeInfo: () => ChromeOsDeviceDiskVolumeReportsVolumeInfo,
    newChromeOsDeviceRecentUsers: () => ChromeOsDeviceRecentUsers,
    newChromeOsDeviceSystemRamFreeReports: () => ChromeOsDeviceSystemRamFreeReports,
    newChromeOsDeviceTpmVersionInfo: () => ChromeOsDeviceTpmVersionInfo,
    newChromeOsMoveDevicesToOu: () => ChromeOsMoveDevicesToOu,
    newCustomer: () => Customer,
    newCustomerPostalAddress: () => CustomerPostalAddress,
    newDomainAlias: () => DomainAlias,
    newDomains: () => Domains,
    newFeature: () => Feature,
    newFeatureRename: () => FeatureRename,
    newGroup: () => Group,
    newMember: () => Member,
    newMobileDeviceAction: () => MobileDeviceAction,
    newNotification: () => Notification,
    newOrgUnit: () => OrgUnit,
    newRole: () => Role,
    newRoleAssignment: () => RoleAssignment,
    newRoleRolePrivileges: () => RoleRolePrivileges,
    newSchema: () => Schema,
    newSchemaFieldSpec: () => SchemaFieldSpec,
    newSchemaFieldSpecNumericIndexingSpec: () => SchemaFieldSpecNumericIndexingSpec,
    newUser: () => User,
    newUserMakeAdmin: () => UserMakeAdmin,
    newUserName: () => UserName,
    newUserPhoto: () => UserPhoto,
    newUserUndelete: () => UserUndelete
  ): AdminDirectory_ = {
    val __obj = js.Dynamic.literal(newAlias = js.Any.fromFunction0(newAlias), newBuilding = js.Any.fromFunction0(newBuilding), newBuildingAddress = js.Any.fromFunction0(newBuildingAddress), newBuildingCoordinates = js.Any.fromFunction0(newBuildingCoordinates), newCalendarResource = js.Any.fromFunction0(newCalendarResource), newChannel = js.Any.fromFunction0(newChannel), newChromeOsDevice = js.Any.fromFunction0(newChromeOsDevice), newChromeOsDeviceAction = js.Any.fromFunction0(newChromeOsDeviceAction), newChromeOsDeviceActiveTimeRanges = js.Any.fromFunction0(newChromeOsDeviceActiveTimeRanges), newChromeOsDeviceCpuStatusReports = js.Any.fromFunction0(newChromeOsDeviceCpuStatusReports), newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo = js.Any.fromFunction0(newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo), newChromeOsDeviceDeviceFiles = js.Any.fromFunction0(newChromeOsDeviceDeviceFiles), newChromeOsDeviceDiskVolumeReports = js.Any.fromFunction0(newChromeOsDeviceDiskVolumeReports), newChromeOsDeviceDiskVolumeReportsVolumeInfo = js.Any.fromFunction0(newChromeOsDeviceDiskVolumeReportsVolumeInfo), newChromeOsDeviceRecentUsers = js.Any.fromFunction0(newChromeOsDeviceRecentUsers), newChromeOsDeviceSystemRamFreeReports = js.Any.fromFunction0(newChromeOsDeviceSystemRamFreeReports), newChromeOsDeviceTpmVersionInfo = js.Any.fromFunction0(newChromeOsDeviceTpmVersionInfo), newChromeOsMoveDevicesToOu = js.Any.fromFunction0(newChromeOsMoveDevicesToOu), newCustomer = js.Any.fromFunction0(newCustomer), newCustomerPostalAddress = js.Any.fromFunction0(newCustomerPostalAddress), newDomainAlias = js.Any.fromFunction0(newDomainAlias), newDomains = js.Any.fromFunction0(newDomains), newFeature = js.Any.fromFunction0(newFeature), newFeatureRename = js.Any.fromFunction0(newFeatureRename), newGroup = js.Any.fromFunction0(newGroup), newMember = js.Any.fromFunction0(newMember), newMobileDeviceAction = js.Any.fromFunction0(newMobileDeviceAction), newNotification = js.Any.fromFunction0(newNotification), newOrgUnit = js.Any.fromFunction0(newOrgUnit), newRole = js.Any.fromFunction0(newRole), newRoleAssignment = js.Any.fromFunction0(newRoleAssignment), newRoleRolePrivileges = js.Any.fromFunction0(newRoleRolePrivileges), newSchema = js.Any.fromFunction0(newSchema), newSchemaFieldSpec = js.Any.fromFunction0(newSchemaFieldSpec), newSchemaFieldSpecNumericIndexingSpec = js.Any.fromFunction0(newSchemaFieldSpecNumericIndexingSpec), newUser = js.Any.fromFunction0(newUser), newUserMakeAdmin = js.Any.fromFunction0(newUserMakeAdmin), newUserName = js.Any.fromFunction0(newUserName), newUserPhoto = js.Any.fromFunction0(newUserPhoto), newUserUndelete = js.Any.fromFunction0(newUserUndelete))
    __obj.asInstanceOf[AdminDirectory_]
  }
  @scala.inline
  implicit class AdminDirectory_Ops[Self <: AdminDirectory_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAlias(value: () => Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAlias")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBuilding(value: () => Building): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBuilding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBuildingAddress(value: () => BuildingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBuildingAddress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBuildingCoordinates(value: () => BuildingCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBuildingCoordinates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCalendarResource(value: () => CalendarResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCalendarResource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannel(value: () => Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsDevice(value: () => ChromeOsDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsDevice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsDeviceAction(value: () => ChromeOsDeviceAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsDeviceAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsDeviceActiveTimeRanges(value: () => ChromeOsDeviceActiveTimeRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsDeviceActiveTimeRanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsDeviceCpuStatusReports(value: () => ChromeOsDeviceCpuStatusReports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsDeviceCpuStatusReports")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsDeviceCpuStatusReportsCpuTemperatureInfo(value: () => ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsDeviceDeviceFiles(value: () => ChromeOsDeviceDeviceFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsDeviceDeviceFiles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsDeviceDiskVolumeReports(value: () => ChromeOsDeviceDiskVolumeReports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsDeviceDiskVolumeReports")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsDeviceDiskVolumeReportsVolumeInfo(value: () => ChromeOsDeviceDiskVolumeReportsVolumeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsDeviceDiskVolumeReportsVolumeInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsDeviceRecentUsers(value: () => ChromeOsDeviceRecentUsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsDeviceRecentUsers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsDeviceSystemRamFreeReports(value: () => ChromeOsDeviceSystemRamFreeReports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsDeviceSystemRamFreeReports")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsDeviceTpmVersionInfo(value: () => ChromeOsDeviceTpmVersionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsDeviceTpmVersionInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChromeOsMoveDevicesToOu(value: () => ChromeOsMoveDevicesToOu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChromeOsMoveDevicesToOu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCustomer(value: () => Customer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCustomer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCustomerPostalAddress(value: () => CustomerPostalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCustomerPostalAddress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDomainAlias(value: () => DomainAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDomainAlias")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDomains(value: () => Domains): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDomains")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFeature(value: () => Feature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFeature")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFeatureRename(value: () => FeatureRename): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFeatureRename")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGroup(value: () => Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMember(value: () => Member): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMember")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMobileDeviceAction(value: () => MobileDeviceAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMobileDeviceAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewNotification(value: () => Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNotification")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrgUnit(value: () => OrgUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrgUnit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRole(value: () => Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRole")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRoleAssignment(value: () => RoleAssignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRoleAssignment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRoleRolePrivileges(value: () => RoleRolePrivileges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRoleRolePrivileges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSchema(value: () => Schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSchemaFieldSpec(value: () => SchemaFieldSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSchemaFieldSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSchemaFieldSpecNumericIndexingSpec(value: () => SchemaFieldSpecNumericIndexingSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSchemaFieldSpecNumericIndexingSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUser(value: () => User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserMakeAdmin(value: () => UserMakeAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserMakeAdmin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserName(value: () => UserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserPhoto(value: () => UserPhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserPhoto")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserUndelete(value: () => UserUndelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserUndelete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsps(value: AspsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Asps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Asps")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: ChannelsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(js.undefined)
        ret
    }
    @scala.inline
    def withChromeosdevices(value: ChromeosdevicesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chromeosdevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromeosdevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chromeosdevices")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomers(value: CustomersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Customers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Customers")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainAliases(value: DomainAliasesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainAliases")(js.undefined)
        ret
    }
    @scala.inline
    def withDomains(value: DomainsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domains")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: GroupsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers(value: MembersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Members")(js.undefined)
        ret
    }
    @scala.inline
    def withMobiledevices(value: MobiledevicesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mobiledevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobiledevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mobiledevices")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifications(value: NotificationsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notifications")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgunits(value: OrgunitsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orgunits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgunits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orgunits")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivileges(value: PrivilegesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Privileges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivileges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Privileges")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedAppAccessSettings(value: ResolvedAppAccessSettingsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedAppAccessSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedAppAccessSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedAppAccessSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: ResourcesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleAssignments(value: RoleAssignmentsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withRoles(value: RolesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Roles")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemas(value: SchemasCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schemas")(js.undefined)
        ret
    }
    @scala.inline
    def withTokens(value: TokensCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tokens")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: UsersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationCodes(value: VerificationCodesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerificationCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerificationCodes")(js.undefined)
        ret
    }
  }
  
}


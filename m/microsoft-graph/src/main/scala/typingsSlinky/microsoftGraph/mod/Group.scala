package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends DirectoryObject {
  /**
    * The list of users or groups that are allowed to create post's or calendar events in this group. If this list is
    * non-empty then only users or groups listed here are allowed to post.
    */
  var acceptedSenders: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Indicates if people external to the organization can send messages to the group. Default value is false. Returned only
    * on $select.
    */
  var allowExternalSenders: js.UndefOr[Boolean] = js.native
  // The licenses that are assigned to the group. Returned only on $select. Read-only.
  var assignedLicenses: js.UndefOr[js.Array[AssignedLicense]] = js.native
  /**
    * Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set this
    * property in a PATCH request for the group; do not set it in the initial POST request that creates the group. Default
    * value is false. Returned only on $select.
    */
  var autoSubscribeNewMembers: js.UndefOr[Boolean] = js.native
  // The group's calendar. Read-only.
  var calendar: js.UndefOr[Calendar] = js.native
  // The calendar view for the calendar. Read-only.
  var calendarView: js.UndefOr[js.Array[Event]] = js.native
  /**
    * Describes a classification for the group (such as low, medium or high business impact). Valid values for this property
    * are defined by creating a ClassificationList setting value, based on the template definition.Returned by default.
    */
  var classification: js.UndefOr[String] = js.native
  // The group's conversations.
  var conversations: js.UndefOr[js.Array[Conversation]] = js.native
  /**
    * Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is
    * created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For
    * example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  // The user (or application) that created the group. NOTE: This is not set if the user is an administrator. Read-only.
  var createdOnBehalfOf: js.UndefOr[DirectoryObject] = js.native
  // An optional description for the group. Returned by default.
  var description: js.UndefOr[String] = js.native
  /**
    * The display name for the group. This property is required when a group is created and cannot be cleared during updates.
    * Returned by default. Supports $filter and $orderby.
    */
  var displayName: js.UndefOr[String] = js.native
  // The group's default drive. Read-only.
  var drive: js.UndefOr[Drive] = js.native
  // The group's drives. Read-only.
  var drives: js.UndefOr[js.Array[Drive]] = js.native
  // The group's calendar events.
  var events: js.UndefOr[js.Array[Event]] = js.native
  // The collection of open extensions defined for the group. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  // The collection of lifecycle policies for this group. Read-only. Nullable.
  var groupLifecyclePolicies: js.UndefOr[js.Array[GroupLifecyclePolicy]] = js.native
  /**
    * Specifies the group type and its membership. If the collection contains Unified then the group is an Office 365 group;
    * otherwise it's a security group. If the collection includes DynamicMembership, the group has dynamic membership;
    * otherwise, membership is static. Returned by default. Supports $filter.
    */
  var groupTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates whether there are members in this group that have license errors from its group-based license assignment.
    * This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have
    * members with license errors (that is, filter for this property being true). See an example.
    */
  var hasMembersWithLicenseErrors: js.UndefOr[Boolean] = js.native
  var isArchived: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only
    * on $select.
    */
  var isSubscribedByMail: js.UndefOr[Boolean] = js.native
  /**
    * Indicates status of the group license assignment to all members of the group. Default value is false. Read-only.
    * Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete.Returned only on $select. Read-only.
    */
  var licenseProcessingState: js.UndefOr[LicenseProcessingState] = js.native
  /**
    * The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only.
    * Supports $filter.
    */
  var mail: js.UndefOr[String] = js.native
  // Specifies whether the group is mail-enabled. Returned by default.
  var mailEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The mail alias for the group, unique in the organization. This property must be specified when a group is created.
    * Returned by default. Supports $filter.
    */
  var mailNickname: js.UndefOr[String] = js.native
  // Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Users and groups that are members of this group. HTTP Methods: GET (supported for all groups), POST (supported for
    * Office 365 groups, security groups and mail-enabled security groups), DELETE (supported for Office 365 groups and
    * security groups) Nullable.
    */
  var members: js.UndefOr[js.Array[DirectoryObject]] = js.native
  // A list of group members with license errors from this group-based license assignment. Read-only.
  var membersWithLicenseErrors: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Indicates the last time at which the group was synced with the on-premises directory.The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. Supports $filter.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.native
  // Errors when using Microsoft synchronization product during provisioning. Returned by default.
  var onPremisesProvisioningErrors: js.UndefOr[js.Array[OnPremisesProvisioningError]] = js.native
  /**
    * Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud.
    * Returned by default. Read-only.
    */
  var onPremisesSecurityIdentifier: js.UndefOr[String] = js.native
  /**
    * true if this group is synced from an on-premises directory; false if this group was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Returned by default. Read-only. Supports $filter.
    */
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.native
  // Read-only.
  var onenote: js.UndefOr[Onenote] = js.native
  /**
    * The owners of the group. The owners are a set of non-admin users who are allowed to modify this object. Limited to 10
    * owners. HTTP Methods: GET (supported for all groups), POST (supported for Office 365 groups, security groups and
    * mail-enabled security groups), DELETE (supported for Office 365 groups and security groups). Nullable.
    */
  var owners: js.UndefOr[js.Array[DirectoryObject]] = js.native
  // The group's profile photo
  var photo: js.UndefOr[ProfilePhoto] = js.native
  // The profile photos owned by the group. Read-only. Nullable.
  var photos: js.UndefOr[js.Array[ProfilePhoto]] = js.native
  // Entry-point to Planner resource that might exist for a Unified Group.
  var planner: js.UndefOr[PlannerGroup] = js.native
  // The preferred data location for the group. For more information, see OneDrive Online Multi-Geo. Returned by default.
  var preferredDataLocation: js.UndefOr[String] = js.native
  /**
    * Email addresses for the group that direct to the same group mailbox. For example: ['SMTP: bob@contoso.com', 'smtp:
    * bob@sales.contoso.com']. The any operator is required to filter expressions on multi-valued properties. Returned by
    * default. Read-only. Not nullable. Supports $filter.
    */
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.native
  // The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable
  var rejectedSenders: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew
    * service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC
    * time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default.
    * Read-only.
    */
  var renewedDateTime: js.UndefOr[String] = js.native
  // Specifies whether the group is a security group. Returned by default. Supports $filter.
  var securityEnabled: js.UndefOr[Boolean] = js.native
  // Read-only. Nullable.
  var settings: js.UndefOr[js.Array[GroupSetting]] = js.native
  // The list of SharePoint sites in this group. Access the default site with /sites/root.
  var sites: js.UndefOr[js.Array[Site]] = js.native
  var team: js.UndefOr[Team] = js.native
  // The group's conversation threads. Nullable.
  var threads: js.UndefOr[js.Array[ConversationThread]] = js.native
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  var transitiveMembers: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Count of conversations that have received new posts since the signed-in user last visited the group. Returned only on
    * $select.
    */
  var unseenCount: js.UndefOr[Double] = js.native
  /**
    * Specifies the visibility of an Office 365 group. Possible values are: Private, Public, or Hiddenmembership; blank
    * values are treated as public. See group visibility options to learn more.Visibility can be set only when a group is
    * created; it is not editable.Visibility is supported only for unified groups; it is not supported for security groups.
    * Returned by default.
    */
  var visibility: js.UndefOr[String] = js.native
}

object Group {
  @scala.inline
  def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptedSenders(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedSenders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptedSenders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedSenders")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowExternalSenders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExternalSenders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExternalSenders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExternalSenders")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignedLicenses(value: js.Array[AssignedLicense]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedLicenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedLicenses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedLicenses")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSubscribeNewMembers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSubscribeNewMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSubscribeNewMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSubscribeNewMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendar(value: Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarView(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarView")(js.undefined)
        ret
    }
    @scala.inline
    def withClassification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classification")(js.undefined)
        ret
    }
    @scala.inline
    def withConversations(value: js.Array[Conversation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversations")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedOnBehalfOf(value: DirectoryObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdOnBehalfOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedOnBehalfOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdOnBehalfOf")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDrive(value: Drive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drive")(js.undefined)
        ret
    }
    @scala.inline
    def withDrives(value: js.Array[Drive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drives")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[Extension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupLifecyclePolicies(value: js.Array[GroupLifecyclePolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLifecyclePolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupLifecyclePolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLifecyclePolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withHasMembersWithLicenseErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMembersWithLicenseErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMembersWithLicenseErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMembersWithLicenseErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withIsArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArchived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArchived")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSubscribedByMail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSubscribedByMail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSubscribedByMail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSubscribedByMail")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseProcessingState(value: LicenseProcessingState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseProcessingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseProcessingState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseProcessingState")(js.undefined)
        ret
    }
    @scala.inline
    def withMail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mail")(js.undefined)
        ret
    }
    @scala.inline
    def withMailEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMailNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailNickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailNickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailNickname")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberOf(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberOf")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.undefined)
        ret
    }
    @scala.inline
    def withMembersWithLicenseErrors(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membersWithLicenseErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembersWithLicenseErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membersWithLicenseErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesLastSyncDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesLastSyncDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesLastSyncDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesLastSyncDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesProvisioningErrors(value: js.Array[OnPremisesProvisioningError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesProvisioningErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesProvisioningErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesProvisioningErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesSecurityIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSecurityIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesSecurityIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSecurityIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesSyncEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSyncEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesSyncEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSyncEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnenote(value: Onenote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onenote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnenote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onenote")(js.undefined)
        ret
    }
    @scala.inline
    def withOwners(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto(value: ProfilePhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotos(value: js.Array[ProfilePhoto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanner(value: PlannerGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planner")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredDataLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredDataLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredDataLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredDataLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectedSenders(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedSenders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectedSenders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedSenders")(js.undefined)
        ret
    }
    @scala.inline
    def withRenewedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenewedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: js.Array[GroupSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withSites(value: js.Array[Site]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sites")(js.undefined)
        ret
    }
    @scala.inline
    def withTeam(value: Team): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(js.undefined)
        ret
    }
    @scala.inline
    def withThreads(value: js.Array[ConversationThread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitiveMemberOf(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveMemberOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitiveMemberOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveMemberOf")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitiveMembers(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitiveMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withUnseenCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unseenCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnseenCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unseenCount")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}


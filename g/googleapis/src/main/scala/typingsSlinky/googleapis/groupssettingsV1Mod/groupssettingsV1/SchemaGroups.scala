package typingsSlinky.googleapis.groupssettingsV1Mod.groupssettingsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Group resource
  */
@js.native
trait SchemaGroups extends js.Object {
  /**
    * Are external members allowed to join the group.
    */
  var allowExternalMembers: js.UndefOr[String] = js.native
  /**
    * Is google allowed to contact admins.
    */
  var allowGoogleCommunication: js.UndefOr[String] = js.native
  /**
    * If posting from web is allowed.
    */
  var allowWebPosting: js.UndefOr[String] = js.native
  /**
    * If the group is archive only
    */
  var archiveOnly: js.UndefOr[String] = js.native
  /**
    * Custom footer text.
    */
  var customFooterText: js.UndefOr[String] = js.native
  /**
    * Default email to which reply to any message should go.
    */
  var customReplyTo: js.UndefOr[String] = js.native
  /**
    * If any of the settings that will be merged have custom roles which is
    * anything other than owners, managers, or group scopes.
    */
  var customRolesEnabledForSettingsToBeMerged: js.UndefOr[String] = js.native
  /**
    * Default message deny notification message
    */
  var defaultMessageDenyNotificationText: js.UndefOr[String] = js.native
  /**
    * Description of the group
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Email id of the group
    */
  var email: js.UndefOr[String] = js.native
  /**
    * If a primary Collab Inbox feature is enabled.
    */
  var enableCollaborativeInbox: js.UndefOr[String] = js.native
  /**
    * If favorite replies should be displayed above other replies.
    */
  var favoriteRepliesOnTop: js.UndefOr[String] = js.native
  /**
    * Whether to include custom footer.
    */
  var includeCustomFooter: js.UndefOr[String] = js.native
  /**
    * If this groups should be included in global address list or not.
    */
  var includeInGlobalAddressList: js.UndefOr[String] = js.native
  /**
    * If the contents of the group are archived.
    */
  var isArchived: js.UndefOr[String] = js.native
  /**
    * The type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Maximum message size allowed.
    */
  var maxMessageBytes: js.UndefOr[Double] = js.native
  /**
    * Can members post using the group email address.
    */
  var membersCanPostAsTheGroup: js.UndefOr[String] = js.native
  /**
    * Default message display font. Possible values are: DEFAULT_FONT
    * FIXED_WIDTH_FONT
    */
  var messageDisplayFont: js.UndefOr[String] = js.native
  /**
    * Moderation level for messages. Possible values are: MODERATE_ALL_MESSAGES
    * MODERATE_NON_MEMBERS MODERATE_NEW_MEMBERS MODERATE_NONE
    */
  var messageModerationLevel: js.UndefOr[String] = js.native
  /**
    * Name of the Group
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Primary language for the group.
    */
  var primaryLanguage: js.UndefOr[String] = js.native
  /**
    * Whome should the default reply to a message go to. Possible values are:
    * REPLY_TO_CUSTOM REPLY_TO_SENDER REPLY_TO_LIST REPLY_TO_OWNER
    * REPLY_TO_IGNORE REPLY_TO_MANAGERS
    */
  var replyTo: js.UndefOr[String] = js.native
  /**
    * Should the member be notified if his message is denied by owner.
    */
  var sendMessageDenyNotification: js.UndefOr[String] = js.native
  /**
    * Is the group listed in groups directory
    */
  var showInGroupDirectory: js.UndefOr[String] = js.native
  /**
    * Moderation level for messages detected as spam. Possible values are:
    * ALLOW MODERATE SILENTLY_MODERATE REJECT
    */
  var spamModerationLevel: js.UndefOr[String] = js.native
  /**
    * Permissions to add members. Possible values are: ALL_MANAGERS_CAN_ADD
    * ALL_OWNERS_CAN_ADD ALL_MEMBERS_CAN_ADD NONE_CAN_ADD
    */
  var whoCanAdd: js.UndefOr[String] = js.native
  /**
    * Permission to add references to a topic. Possible values are: NONE
    * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanAddReferences: js.UndefOr[String] = js.native
  /**
    * Permission to approve members. Possible values are:
    * ALL_OWNERS_CAN_APPROVE ALL_MANAGERS_CAN_APPROVE ALL_MEMBERS_CAN_APPROVE
    * NONE_CAN_APPROVE
    */
  var whoCanApproveMembers: js.UndefOr[String] = js.native
  /**
    * Permission to approve pending messages in the moderation queue. Possible
    * values are: NONE OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanApproveMessages: js.UndefOr[String] = js.native
  /**
    * Permission to assign topics in a forum to another user. Possible values
    * are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanAssignTopics: js.UndefOr[String] = js.native
  /**
    * Permission for content assistants. Possible values are: Possible values
    * are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanAssistContent: js.UndefOr[String] = js.native
  /**
    * Permission to ban users. Possible values are: NONE OWNERS_ONLY
    * OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanBanUsers: js.UndefOr[String] = js.native
  /**
    * Permission to contact owner of the group via web UI. Possible values are:
    * ANYONE_CAN_CONTACT ALL_IN_DOMAIN_CAN_CONTACT ALL_MEMBERS_CAN_CONTACT
    * ALL_MANAGERS_CAN_CONTACT
    */
  var whoCanContactOwner: js.UndefOr[String] = js.native
  /**
    * Permission to delete replies to topics. Possible values are: NONE
    * OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanDeleteAnyPost: js.UndefOr[String] = js.native
  /**
    * Permission to delete topics. Possible values are: NONE OWNERS_ONLY
    * OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanDeleteTopics: js.UndefOr[String] = js.native
  /**
    * Permission for who can discover the group. Possible values are:
    * ALL_MEMBERS_CAN_DISCOVER ALL_IN_DOMAIN_CAN_DISCOVER ANYONE_CAN_DISCOVER
    */
  var whoCanDiscoverGroup: js.UndefOr[String] = js.native
  /**
    * Permission to enter free form tags for topics in a forum. Possible values
    * are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanEnterFreeFormTags: js.UndefOr[String] = js.native
  /**
    * Permission to hide posts by reporting them as abuse. Possible values are:
    * NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanHideAbuse: js.UndefOr[String] = js.native
  /**
    * Permissions to invite members. Possible values are:
    * ALL_MEMBERS_CAN_INVITE ALL_MANAGERS_CAN_INVITE ALL_OWNERS_CAN_INVITE
    * NONE_CAN_INVITE
    */
  var whoCanInvite: js.UndefOr[String] = js.native
  /**
    * Permissions to join the group. Possible values are: ANYONE_CAN_JOIN
    * ALL_IN_DOMAIN_CAN_JOIN INVITED_CAN_JOIN CAN_REQUEST_TO_JOIN
    */
  var whoCanJoin: js.UndefOr[String] = js.native
  /**
    * Permission to leave the group. Possible values are:
    * ALL_MANAGERS_CAN_LEAVE ALL_OWNERS_CAN_LEAVE ALL_MEMBERS_CAN_LEAVE
    * NONE_CAN_LEAVE
    */
  var whoCanLeaveGroup: js.UndefOr[String] = js.native
  /**
    * Permission to lock topics. Possible values are: NONE OWNERS_ONLY
    * OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanLockTopics: js.UndefOr[String] = js.native
  /**
    * Permission to make topics appear at the top of the topic list. Possible
    * values are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS
    * ALL_MEMBERS
    */
  var whoCanMakeTopicsSticky: js.UndefOr[String] = js.native
  /**
    * Permission to mark a topic as a duplicate of another topic. Possible
    * values are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS
    * ALL_MEMBERS
    */
  var whoCanMarkDuplicate: js.UndefOr[String] = js.native
  /**
    * Permission to mark any other user&#39;s post as a favorite reply.
    * Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS
    * ALL_MEMBERS
    */
  var whoCanMarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.native
  /**
    * Permission to mark a post for a topic they started as a favorite reply.
    * Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS
    * ALL_MEMBERS
    */
  var whoCanMarkFavoriteReplyOnOwnTopic: js.UndefOr[String] = js.native
  /**
    * Permission to mark a topic as not needing a response. Possible values
    * are: NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanMarkNoResponseNeeded: js.UndefOr[String] = js.native
  /**
    * Permission for content moderation. Possible values are: NONE OWNERS_ONLY
    * OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanModerateContent: js.UndefOr[String] = js.native
  /**
    * Permission for membership moderation. Possible values are: NONE
    * OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanModerateMembers: js.UndefOr[String] = js.native
  /**
    * Permission to modify members (change member roles). Possible values are:
    * NONE OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanModifyMembers: js.UndefOr[String] = js.native
  /**
    * Permission to change tags and categories. Possible values are: NONE
    * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanModifyTagsAndCategories: js.UndefOr[String] = js.native
  /**
    * Permission to move topics into the group or forum. Possible values are:
    * NONE OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanMoveTopicsIn: js.UndefOr[String] = js.native
  /**
    * Permission to move topics out of the group or forum. Possible values are:
    * NONE OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanMoveTopicsOut: js.UndefOr[String] = js.native
  /**
    * Permission to post announcements, a special topic type. Possible values
    * are: NONE OWNERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanPostAnnouncements: js.UndefOr[String] = js.native
  /**
    * Permissions to post messages to the group. Possible values are:
    * NONE_CAN_POST ALL_MANAGERS_CAN_POST ALL_MEMBERS_CAN_POST
    * ALL_OWNERS_CAN_POST ALL_IN_DOMAIN_CAN_POST ANYONE_CAN_POST
    */
  var whoCanPostMessage: js.UndefOr[String] = js.native
  /**
    * Permission to take topics in a forum. Possible values are: NONE
    * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanTakeTopics: js.UndefOr[String] = js.native
  /**
    * Permission to unassign any topic in a forum. Possible values are: NONE
    * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanUnassignTopic: js.UndefOr[String] = js.native
  /**
    * Permission to unmark any post from a favorite reply. Possible values are:
    * NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
    */
  var whoCanUnmarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.native
  /**
    * Permissions to view group. Possible values are: ANYONE_CAN_VIEW
    * ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW
    * ALL_OWNERS_CAN_VIEW
    */
  var whoCanViewGroup: js.UndefOr[String] = js.native
  /**
    * Permissions to view membership. Possible values are:
    * ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW
    * ALL_OWNERS_CAN_VIEW
    */
  var whoCanViewMembership: js.UndefOr[String] = js.native
}

object SchemaGroups {
  @scala.inline
  def apply(): SchemaGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroups]
  }
  @scala.inline
  implicit class SchemaGroupsOps[Self <: SchemaGroups] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowExternalMembers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExternalMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExternalMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExternalMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowGoogleCommunication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGoogleCommunication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowGoogleCommunication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGoogleCommunication")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowWebPosting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWebPosting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowWebPosting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWebPosting")(js.undefined)
        ret
    }
    @scala.inline
    def withArchiveOnly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archiveOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchiveOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archiveOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFooterText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFooterText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFooterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFooterText")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomReplyTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customReplyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customReplyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRolesEnabledForSettingsToBeMerged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRolesEnabledForSettingsToBeMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRolesEnabledForSettingsToBeMerged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRolesEnabledForSettingsToBeMerged")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMessageDenyNotificationText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMessageDenyNotificationText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMessageDenyNotificationText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMessageDenyNotificationText")(js.undefined)
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
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCollaborativeInbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCollaborativeInbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCollaborativeInbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCollaborativeInbox")(js.undefined)
        ret
    }
    @scala.inline
    def withFavoriteRepliesOnTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favoriteRepliesOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavoriteRepliesOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favoriteRepliesOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeCustomFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCustomFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCustomFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCustomFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeInGlobalAddressList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInGlobalAddressList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeInGlobalAddressList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInGlobalAddressList")(js.undefined)
        ret
    }
    @scala.inline
    def withIsArchived(value: String): Self = {
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMessageBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessageBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMessageBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessageBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withMembersCanPostAsTheGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membersCanPostAsTheGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembersCanPostAsTheGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membersCanPostAsTheGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageDisplayFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDisplayFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageDisplayFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDisplayFont")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageModerationLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageModerationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageModerationLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageModerationLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSendMessageDenyNotification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessageDenyNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendMessageDenyNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessageDenyNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInGroupDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInGroupDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInGroupDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInGroupDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withSpamModerationLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spamModerationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpamModerationLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spamModerationLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanAdd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanAddReferences(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanAddReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanAddReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanAddReferences")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanApproveMembers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanApproveMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanApproveMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanApproveMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanApproveMessages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanApproveMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanApproveMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanApproveMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanAssignTopics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanAssignTopics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanAssignTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanAssignTopics")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanAssistContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanAssistContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanAssistContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanAssistContent")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanBanUsers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanBanUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanBanUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanBanUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanContactOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanContactOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanContactOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanContactOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanDeleteAnyPost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanDeleteAnyPost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanDeleteAnyPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanDeleteAnyPost")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanDeleteTopics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanDeleteTopics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanDeleteTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanDeleteTopics")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanDiscoverGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanDiscoverGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanDiscoverGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanDiscoverGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanEnterFreeFormTags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanEnterFreeFormTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanEnterFreeFormTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanEnterFreeFormTags")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanHideAbuse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanHideAbuse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanHideAbuse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanHideAbuse")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanInvite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanInvite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanInvite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanInvite")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanLeaveGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanLeaveGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanLeaveGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanLeaveGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanLockTopics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanLockTopics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanLockTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanLockTopics")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanMakeTopicsSticky(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMakeTopicsSticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanMakeTopicsSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMakeTopicsSticky")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanMarkDuplicate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMarkDuplicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanMarkDuplicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMarkDuplicate")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanMarkFavoriteReplyOnAnyTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMarkFavoriteReplyOnAnyTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanMarkFavoriteReplyOnAnyTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMarkFavoriteReplyOnAnyTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanMarkFavoriteReplyOnOwnTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMarkFavoriteReplyOnOwnTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanMarkFavoriteReplyOnOwnTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMarkFavoriteReplyOnOwnTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanMarkNoResponseNeeded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMarkNoResponseNeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanMarkNoResponseNeeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMarkNoResponseNeeded")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanModerateContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanModerateContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanModerateContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanModerateContent")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanModerateMembers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanModerateMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanModerateMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanModerateMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanModifyMembers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanModifyMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanModifyMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanModifyMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanModifyTagsAndCategories(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanModifyTagsAndCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanModifyTagsAndCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanModifyTagsAndCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanMoveTopicsIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMoveTopicsIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanMoveTopicsIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMoveTopicsIn")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanMoveTopicsOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMoveTopicsOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanMoveTopicsOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanMoveTopicsOut")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanPostAnnouncements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanPostAnnouncements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanPostAnnouncements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanPostAnnouncements")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanPostMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanPostMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanPostMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanPostMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanTakeTopics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanTakeTopics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanTakeTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanTakeTopics")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanUnassignTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanUnassignTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanUnassignTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanUnassignTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanUnmarkFavoriteReplyOnAnyTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanUnmarkFavoriteReplyOnAnyTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanUnmarkFavoriteReplyOnAnyTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanUnmarkFavoriteReplyOnAnyTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanViewGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanViewGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanViewGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanViewGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoCanViewMembership(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanViewMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoCanViewMembership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoCanViewMembership")(js.undefined)
        ret
    }
  }
  
}


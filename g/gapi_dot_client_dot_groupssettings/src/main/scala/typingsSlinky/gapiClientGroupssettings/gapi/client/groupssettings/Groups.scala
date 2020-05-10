package typingsSlinky.gapiClientGroupssettings.gapi.client.groupssettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  /** Are external members allowed to join the group. */
  var allowExternalMembers: js.UndefOr[String] = js.native
  /** Is google allowed to contact admins. */
  var allowGoogleCommunication: js.UndefOr[String] = js.native
  /** If posting from web is allowed. */
  var allowWebPosting: js.UndefOr[String] = js.native
  /** If the group is archive only */
  var archiveOnly: js.UndefOr[String] = js.native
  /** Custom footer text. */
  var customFooterText: js.UndefOr[String] = js.native
  /** Default email to which reply to any message should go. */
  var customReplyTo: js.UndefOr[String] = js.native
  /** Default message deny notification message */
  var defaultMessageDenyNotificationText: js.UndefOr[String] = js.native
  /** Description of the group */
  var description: js.UndefOr[String] = js.native
  /** Email id of the group */
  var email: js.UndefOr[String] = js.native
  /** Whether to include custom footer. */
  var includeCustomFooter: js.UndefOr[String] = js.native
  /** If this groups should be included in global address list or not. */
  var includeInGlobalAddressList: js.UndefOr[String] = js.native
  /** If the contents of the group are archived. */
  var isArchived: js.UndefOr[String] = js.native
  /** The type of the resource. */
  var kind: js.UndefOr[String] = js.native
  /** Maximum message size allowed. */
  var maxMessageBytes: js.UndefOr[Double] = js.native
  /** Can members post using the group email address. */
  var membersCanPostAsTheGroup: js.UndefOr[String] = js.native
  /** Default message display font. Possible values are: DEFAULT_FONT FIXED_WIDTH_FONT */
  var messageDisplayFont: js.UndefOr[String] = js.native
  /** Moderation level for messages. Possible values are: MODERATE_ALL_MESSAGES MODERATE_NON_MEMBERS MODERATE_NEW_MEMBERS MODERATE_NONE */
  var messageModerationLevel: js.UndefOr[String] = js.native
  /** Name of the Group */
  var name: js.UndefOr[String] = js.native
  /** Primary language for the group. */
  var primaryLanguage: js.UndefOr[String] = js.native
  /**
    * Whome should the default reply to a message go to. Possible values are: REPLY_TO_CUSTOM REPLY_TO_SENDER REPLY_TO_LIST REPLY_TO_OWNER REPLY_TO_IGNORE
    * REPLY_TO_MANAGERS
    */
  var replyTo: js.UndefOr[String] = js.native
  /** Should the member be notified if their message is denied by owner. */
  var sendMessageDenyNotification: js.UndefOr[String] = js.native
  /** Is the group listed in groups directory */
  var showInGroupDirectory: js.UndefOr[String] = js.native
  /** Moderation level for messages detected as spam. Possible values are: ALLOW MODERATE SILENTLY_MODERATE REJECT */
  var spamModerationLevel: js.UndefOr[String] = js.native
  /** Permissions to add members. Possible values are: ALL_MANAGERS_CAN_ADD ALL_MEMBERS_CAN_ADD NONE_CAN_ADD */
  var whoCanAdd: js.UndefOr[String] = js.native
  /**
    * Permission to contact owner of the group via web UI. Possible values are: ANYONE_CAN_CONTACT ALL_IN_DOMAIN_CAN_CONTACT ALL_MEMBERS_CAN_CONTACT
    * ALL_MANAGERS_CAN_CONTACT
    */
  var whoCanContactOwner: js.UndefOr[String] = js.native
  /** Permissions to invite members. Possible values are: ALL_MEMBERS_CAN_INVITE ALL_MANAGERS_CAN_INVITE NONE_CAN_INVITE */
  var whoCanInvite: js.UndefOr[String] = js.native
  /** Permissions to join the group. Possible values are: ANYONE_CAN_JOIN ALL_IN_DOMAIN_CAN_JOIN INVITED_CAN_JOIN CAN_REQUEST_TO_JOIN */
  var whoCanJoin: js.UndefOr[String] = js.native
  /** Permission to leave the group. Possible values are: ALL_MANAGERS_CAN_LEAVE ALL_MEMBERS_CAN_LEAVE NONE_CAN_LEAVE */
  var whoCanLeaveGroup: js.UndefOr[String] = js.native
  /**
    * Permissions to post messages to the group. Possible values are: NONE_CAN_POST ALL_MANAGERS_CAN_POST ALL_MEMBERS_CAN_POST ALL_OWNERS_CAN_POST
    * ALL_IN_DOMAIN_CAN_POST ANYONE_CAN_POST
    */
  var whoCanPostMessage: js.UndefOr[String] = js.native
  /** Permissions to view group. Possible values are: ANYONE_CAN_VIEW ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW */
  var whoCanViewGroup: js.UndefOr[String] = js.native
  /** Permissions to view membership. Possible values are: ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW */
  var whoCanViewMembership: js.UndefOr[String] = js.native
}

object Groups {
  @scala.inline
  def apply(): Groups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groups]
  }
  @scala.inline
  implicit class GroupsOps[Self <: Groups] (val x: Self) extends AnyVal {
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


package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  var allowExternalMembers: js.UndefOr[String] = js.native
  var allowGoogleCommunication: js.UndefOr[String] = js.native
  var allowWebPosting: js.UndefOr[String] = js.native
  var archiveOnly: js.UndefOr[String] = js.native
  var customFooterText: js.UndefOr[String] = js.native
  var customReplyTo: js.UndefOr[String] = js.native
  var customRolesEnabledForSettingsToBeMerged: js.UndefOr[String] = js.native
  var defaultMessageDenyNotificationText: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var enableCollaborativeInbox: js.UndefOr[String] = js.native
  var favoriteRepliesOnTop: js.UndefOr[String] = js.native
  var includeCustomFooter: js.UndefOr[String] = js.native
  var includeInGlobalAddressList: js.UndefOr[String] = js.native
  var isArchived: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var maxMessageBytes: js.UndefOr[Double] = js.native
  var membersCanPostAsTheGroup: js.UndefOr[String] = js.native
  var messageDisplayFont: js.UndefOr[String] = js.native
  var messageModerationLevel: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var primaryLanguage: js.UndefOr[String] = js.native
  var replyTo: js.UndefOr[String] = js.native
  var sendMessageDenyNotification: js.UndefOr[String] = js.native
  var showInGroupDirectory: js.UndefOr[String] = js.native
  var spamModerationLevel: js.UndefOr[String] = js.native
  var whoCanAdd: js.UndefOr[String] = js.native
  var whoCanAddReferences: js.UndefOr[String] = js.native
  var whoCanApproveMembers: js.UndefOr[String] = js.native
  var whoCanApproveMessages: js.UndefOr[String] = js.native
  var whoCanAssignTopics: js.UndefOr[String] = js.native
  var whoCanAssistContent: js.UndefOr[String] = js.native
  var whoCanBanUsers: js.UndefOr[String] = js.native
  var whoCanContactOwner: js.UndefOr[String] = js.native
  var whoCanDeleteAnyPost: js.UndefOr[String] = js.native
  var whoCanDeleteTopics: js.UndefOr[String] = js.native
  var whoCanDiscoverGroup: js.UndefOr[String] = js.native
  var whoCanEnterFreeFormTags: js.UndefOr[String] = js.native
  var whoCanHideAbuse: js.UndefOr[String] = js.native
  var whoCanInvite: js.UndefOr[String] = js.native
  var whoCanJoin: js.UndefOr[String] = js.native
  var whoCanLeaveGroup: js.UndefOr[String] = js.native
  var whoCanLockTopics: js.UndefOr[String] = js.native
  var whoCanMakeTopicsSticky: js.UndefOr[String] = js.native
  var whoCanMarkDuplicate: js.UndefOr[String] = js.native
  var whoCanMarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.native
  var whoCanMarkFavoriteReplyOnOwnTopic: js.UndefOr[String] = js.native
  var whoCanMarkNoResponseNeeded: js.UndefOr[String] = js.native
  var whoCanModerateContent: js.UndefOr[String] = js.native
  var whoCanModerateMembers: js.UndefOr[String] = js.native
  var whoCanModifyMembers: js.UndefOr[String] = js.native
  var whoCanModifyTagsAndCategories: js.UndefOr[String] = js.native
  var whoCanMoveTopicsIn: js.UndefOr[String] = js.native
  var whoCanMoveTopicsOut: js.UndefOr[String] = js.native
  var whoCanPostAnnouncements: js.UndefOr[String] = js.native
  var whoCanPostMessage: js.UndefOr[String] = js.native
  var whoCanTakeTopics: js.UndefOr[String] = js.native
  var whoCanUnassignTopic: js.UndefOr[String] = js.native
  var whoCanUnmarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.native
  var whoCanViewGroup: js.UndefOr[String] = js.native
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


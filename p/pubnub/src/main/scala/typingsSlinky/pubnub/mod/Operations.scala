package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operations extends js.Object {
  var PNAccessManagerAudit: String = js.native
  var PNAccessManagerGrant: String = js.native
  var PNAddChannelsToGroupOperation: String = js.native
  var PNAddMessageActionOperation: String = js.native
  var PNChannelGroupsOperation: String = js.native
  var PNChannelsForGroupOperation: String = js.native
  var PNCreateSpaceOperation: String = js.native
  var PNCreateUserOperation: String = js.native
  var PNDeleteMessagesOperation: String = js.native
  var PNDeleteSpaceOperation: String = js.native
  var PNDeleteUserOperation: String = js.native
  var PNFetchMessagesOperation: String = js.native
  var PNGetMembersOperation: String = js.native
  var PNGetMembershipsOperation: String = js.native
  var PNGetMessageActionsOperation: String = js.native
  var PNGetSpacesOperation: String = js.native
  var PNGetStateOperation: String = js.native
  var PNGetUsersOperation: String = js.native
  var PNHeartbeatOperation: String = js.native
  var PNHereNowOperation: String = js.native
  var PNHistoryOperation: String = js.native
  var PNMessageCountsOperation: String = js.native
  var PNPublishOperation: String = js.native
  var PNPushNotificationEnabledChannelsOperation: String = js.native
  var PNRemoveAllPushNotificationsOperation: String = js.native
  var PNRemoveChannelsFromGroupOperation: String = js.native
  var PNRemoveGroupOperation: String = js.native
  var PNRemoveMessageActionOperation: String = js.native
  var PNSetStateOperation: String = js.native
  var PNSubscribeOperation: String = js.native
  var PNTimeOperation: String = js.native
  var PNUnsubscribeOperation: String = js.native
  var PNUpdateMembershipsOperation: String = js.native
  var PNUpdateSpaceOperation: String = js.native
  var PNUpdateUserOperation: String = js.native
  var PNWhereNowOperation: String = js.native
}

object Operations {
  @scala.inline
  def apply(
    PNAccessManagerAudit: String,
    PNAccessManagerGrant: String,
    PNAddChannelsToGroupOperation: String,
    PNAddMessageActionOperation: String,
    PNChannelGroupsOperation: String,
    PNChannelsForGroupOperation: String,
    PNCreateSpaceOperation: String,
    PNCreateUserOperation: String,
    PNDeleteMessagesOperation: String,
    PNDeleteSpaceOperation: String,
    PNDeleteUserOperation: String,
    PNFetchMessagesOperation: String,
    PNGetMembersOperation: String,
    PNGetMembershipsOperation: String,
    PNGetMessageActionsOperation: String,
    PNGetSpacesOperation: String,
    PNGetStateOperation: String,
    PNGetUsersOperation: String,
    PNHeartbeatOperation: String,
    PNHereNowOperation: String,
    PNHistoryOperation: String,
    PNMessageCountsOperation: String,
    PNPublishOperation: String,
    PNPushNotificationEnabledChannelsOperation: String,
    PNRemoveAllPushNotificationsOperation: String,
    PNRemoveChannelsFromGroupOperation: String,
    PNRemoveGroupOperation: String,
    PNRemoveMessageActionOperation: String,
    PNSetStateOperation: String,
    PNSubscribeOperation: String,
    PNTimeOperation: String,
    PNUnsubscribeOperation: String,
    PNUpdateMembershipsOperation: String,
    PNUpdateSpaceOperation: String,
    PNUpdateUserOperation: String,
    PNWhereNowOperation: String
  ): Operations = {
    val __obj = js.Dynamic.literal(PNAccessManagerAudit = PNAccessManagerAudit.asInstanceOf[js.Any], PNAccessManagerGrant = PNAccessManagerGrant.asInstanceOf[js.Any], PNAddChannelsToGroupOperation = PNAddChannelsToGroupOperation.asInstanceOf[js.Any], PNAddMessageActionOperation = PNAddMessageActionOperation.asInstanceOf[js.Any], PNChannelGroupsOperation = PNChannelGroupsOperation.asInstanceOf[js.Any], PNChannelsForGroupOperation = PNChannelsForGroupOperation.asInstanceOf[js.Any], PNCreateSpaceOperation = PNCreateSpaceOperation.asInstanceOf[js.Any], PNCreateUserOperation = PNCreateUserOperation.asInstanceOf[js.Any], PNDeleteMessagesOperation = PNDeleteMessagesOperation.asInstanceOf[js.Any], PNDeleteSpaceOperation = PNDeleteSpaceOperation.asInstanceOf[js.Any], PNDeleteUserOperation = PNDeleteUserOperation.asInstanceOf[js.Any], PNFetchMessagesOperation = PNFetchMessagesOperation.asInstanceOf[js.Any], PNGetMembersOperation = PNGetMembersOperation.asInstanceOf[js.Any], PNGetMembershipsOperation = PNGetMembershipsOperation.asInstanceOf[js.Any], PNGetMessageActionsOperation = PNGetMessageActionsOperation.asInstanceOf[js.Any], PNGetSpacesOperation = PNGetSpacesOperation.asInstanceOf[js.Any], PNGetStateOperation = PNGetStateOperation.asInstanceOf[js.Any], PNGetUsersOperation = PNGetUsersOperation.asInstanceOf[js.Any], PNHeartbeatOperation = PNHeartbeatOperation.asInstanceOf[js.Any], PNHereNowOperation = PNHereNowOperation.asInstanceOf[js.Any], PNHistoryOperation = PNHistoryOperation.asInstanceOf[js.Any], PNMessageCountsOperation = PNMessageCountsOperation.asInstanceOf[js.Any], PNPublishOperation = PNPublishOperation.asInstanceOf[js.Any], PNPushNotificationEnabledChannelsOperation = PNPushNotificationEnabledChannelsOperation.asInstanceOf[js.Any], PNRemoveAllPushNotificationsOperation = PNRemoveAllPushNotificationsOperation.asInstanceOf[js.Any], PNRemoveChannelsFromGroupOperation = PNRemoveChannelsFromGroupOperation.asInstanceOf[js.Any], PNRemoveGroupOperation = PNRemoveGroupOperation.asInstanceOf[js.Any], PNRemoveMessageActionOperation = PNRemoveMessageActionOperation.asInstanceOf[js.Any], PNSetStateOperation = PNSetStateOperation.asInstanceOf[js.Any], PNSubscribeOperation = PNSubscribeOperation.asInstanceOf[js.Any], PNTimeOperation = PNTimeOperation.asInstanceOf[js.Any], PNUnsubscribeOperation = PNUnsubscribeOperation.asInstanceOf[js.Any], PNUpdateMembershipsOperation = PNUpdateMembershipsOperation.asInstanceOf[js.Any], PNUpdateSpaceOperation = PNUpdateSpaceOperation.asInstanceOf[js.Any], PNUpdateUserOperation = PNUpdateUserOperation.asInstanceOf[js.Any], PNWhereNowOperation = PNWhereNowOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operations]
  }
  @scala.inline
  implicit class OperationsOps[Self <: Operations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPNAccessManagerAudit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNAccessManagerAudit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNAccessManagerGrant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNAccessManagerGrant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNAddChannelsToGroupOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNAddChannelsToGroupOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNAddMessageActionOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNAddMessageActionOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNChannelGroupsOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNChannelGroupsOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNChannelsForGroupOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNChannelsForGroupOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNCreateSpaceOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNCreateSpaceOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNCreateUserOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNCreateUserOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNDeleteMessagesOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNDeleteMessagesOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNDeleteSpaceOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNDeleteSpaceOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNDeleteUserOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNDeleteUserOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNFetchMessagesOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNFetchMessagesOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNGetMembersOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNGetMembersOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNGetMembershipsOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNGetMembershipsOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNGetMessageActionsOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNGetMessageActionsOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNGetSpacesOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNGetSpacesOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNGetStateOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNGetStateOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNGetUsersOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNGetUsersOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNHeartbeatOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNHeartbeatOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNHereNowOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNHereNowOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNHistoryOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNHistoryOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNMessageCountsOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNMessageCountsOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNPublishOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNPublishOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNPushNotificationEnabledChannelsOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNPushNotificationEnabledChannelsOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNRemoveAllPushNotificationsOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNRemoveAllPushNotificationsOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNRemoveChannelsFromGroupOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNRemoveChannelsFromGroupOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNRemoveGroupOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNRemoveGroupOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNRemoveMessageActionOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNRemoveMessageActionOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNSetStateOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNSetStateOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNSubscribeOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNSubscribeOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNTimeOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNTimeOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNUnsubscribeOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNUnsubscribeOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNUpdateMembershipsOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNUpdateMembershipsOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNUpdateSpaceOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNUpdateSpaceOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNUpdateUserOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNUpdateUserOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNWhereNowOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNWhereNowOperation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


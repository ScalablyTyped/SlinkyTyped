package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddEmails extends js.Object {
  var addEmails: ParamsEmails = js.native
  var block: MethodStringParamsUsernameRequired = js.native
  var checkBlocked: MethodStringParamsUsernameRequired = js.native
  var checkFollowing: MethodStringParamsUsernameRequired = js.native
  var checkFollowingForUser: ParamsTargetuser = js.native
  var createGpgKey: ParamsArmoredpublickey = js.native
  var createPublicKey: ParamsKeyTitle = js.native
  var deleteEmails: ParamsEmails = js.native
  var deleteGpgKey: ParamsGpgkeyid = js.native
  var deletePublicKey: ParamsKeyidRequired = js.native
  var follow: MethodStringParamsUsernameRequired = js.native
  var getAuthenticated: UrlString = js.native
  var getByUsername: MethodStringParamsUsernameRequired = js.native
  var getContextForUser: ParamsSubjectid = js.native
  var getGpgKey: ParamsGpgkeyid = js.native
  var getPublicKey: ParamsKeyidRequired = js.native
  var list: ParamsSince = js.native
  var listBlocked: UrlString = js.native
  var listEmails: ParamsPagePerpage = js.native
  var listFollowersForAuthenticatedUser: ParamsPagePerpage = js.native
  var listFollowersForUser: ParamsUsername = js.native
  var listFollowingForAuthenticatedUser: ParamsPagePerpage = js.native
  var listFollowingForUser: ParamsUsername = js.native
  var listGpgKeys: ParamsPagePerpage = js.native
  var listGpgKeysForUser: ParamsUsername = js.native
  var listPublicEmails: ParamsPagePerpage = js.native
  var listPublicKeys: ParamsPagePerpage = js.native
  var listPublicKeysForUser: ParamsUsername = js.native
  var togglePrimaryEmailVisibility: ParamsEmailVisibility = js.native
  var unblock: MethodStringParamsUsernameRequired = js.native
  var unfollow: MethodStringParamsUsernameRequired = js.native
  var updateAuthenticated: ParamsBio = js.native
}

object AddEmails {
  @scala.inline
  def apply(
    addEmails: ParamsEmails,
    block: MethodStringParamsUsernameRequired,
    checkBlocked: MethodStringParamsUsernameRequired,
    checkFollowing: MethodStringParamsUsernameRequired,
    checkFollowingForUser: ParamsTargetuser,
    createGpgKey: ParamsArmoredpublickey,
    createPublicKey: ParamsKeyTitle,
    deleteEmails: ParamsEmails,
    deleteGpgKey: ParamsGpgkeyid,
    deletePublicKey: ParamsKeyidRequired,
    follow: MethodStringParamsUsernameRequired,
    getAuthenticated: UrlString,
    getByUsername: MethodStringParamsUsernameRequired,
    getContextForUser: ParamsSubjectid,
    getGpgKey: ParamsGpgkeyid,
    getPublicKey: ParamsKeyidRequired,
    list: ParamsSince,
    listBlocked: UrlString,
    listEmails: ParamsPagePerpage,
    listFollowersForAuthenticatedUser: ParamsPagePerpage,
    listFollowersForUser: ParamsUsername,
    listFollowingForAuthenticatedUser: ParamsPagePerpage,
    listFollowingForUser: ParamsUsername,
    listGpgKeys: ParamsPagePerpage,
    listGpgKeysForUser: ParamsUsername,
    listPublicEmails: ParamsPagePerpage,
    listPublicKeys: ParamsPagePerpage,
    listPublicKeysForUser: ParamsUsername,
    togglePrimaryEmailVisibility: ParamsEmailVisibility,
    unblock: MethodStringParamsUsernameRequired,
    unfollow: MethodStringParamsUsernameRequired,
    updateAuthenticated: ParamsBio
  ): AddEmails = {
    val __obj = js.Dynamic.literal(addEmails = addEmails.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], checkBlocked = checkBlocked.asInstanceOf[js.Any], checkFollowing = checkFollowing.asInstanceOf[js.Any], checkFollowingForUser = checkFollowingForUser.asInstanceOf[js.Any], createGpgKey = createGpgKey.asInstanceOf[js.Any], createPublicKey = createPublicKey.asInstanceOf[js.Any], deleteEmails = deleteEmails.asInstanceOf[js.Any], deleteGpgKey = deleteGpgKey.asInstanceOf[js.Any], deletePublicKey = deletePublicKey.asInstanceOf[js.Any], follow = follow.asInstanceOf[js.Any], getAuthenticated = getAuthenticated.asInstanceOf[js.Any], getByUsername = getByUsername.asInstanceOf[js.Any], getContextForUser = getContextForUser.asInstanceOf[js.Any], getGpgKey = getGpgKey.asInstanceOf[js.Any], getPublicKey = getPublicKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listBlocked = listBlocked.asInstanceOf[js.Any], listEmails = listEmails.asInstanceOf[js.Any], listFollowersForAuthenticatedUser = listFollowersForAuthenticatedUser.asInstanceOf[js.Any], listFollowersForUser = listFollowersForUser.asInstanceOf[js.Any], listFollowingForAuthenticatedUser = listFollowingForAuthenticatedUser.asInstanceOf[js.Any], listFollowingForUser = listFollowingForUser.asInstanceOf[js.Any], listGpgKeys = listGpgKeys.asInstanceOf[js.Any], listGpgKeysForUser = listGpgKeysForUser.asInstanceOf[js.Any], listPublicEmails = listPublicEmails.asInstanceOf[js.Any], listPublicKeys = listPublicKeys.asInstanceOf[js.Any], listPublicKeysForUser = listPublicKeysForUser.asInstanceOf[js.Any], togglePrimaryEmailVisibility = togglePrimaryEmailVisibility.asInstanceOf[js.Any], unblock = unblock.asInstanceOf[js.Any], unfollow = unfollow.asInstanceOf[js.Any], updateAuthenticated = updateAuthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEmails]
  }
  @scala.inline
  implicit class AddEmailsOps[Self <: AddEmails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEmails(value: ParamsEmails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlock(value: MethodStringParamsUsernameRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckBlocked(value: MethodStringParamsUsernameRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckFollowing(value: MethodStringParamsUsernameRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkFollowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckFollowingForUser(value: ParamsTargetuser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkFollowingForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateGpgKey(value: ParamsArmoredpublickey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createGpgKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatePublicKey(value: ParamsKeyTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteEmails(value: ParamsEmails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteGpgKey(value: ParamsGpgkeyid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteGpgKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletePublicKey(value: ParamsKeyidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollow(value: MethodStringParamsUsernameRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAuthenticated(value: UrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetByUsername(value: MethodStringParamsUsernameRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContextForUser(value: ParamsSubjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContextForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetGpgKey(value: ParamsGpgkeyid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGpgKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPublicKey(value: ParamsKeyidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: ParamsSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListBlocked(value: UrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEmails(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFollowersForAuthenticatedUser(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFollowersForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFollowersForUser(value: ParamsUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFollowersForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFollowingForAuthenticatedUser(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFollowingForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFollowingForUser(value: ParamsUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFollowingForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListGpgKeys(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listGpgKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListGpgKeysForUser(value: ParamsUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listGpgKeysForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicEmails(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicKeys(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicKeysForUser(value: ParamsUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicKeysForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTogglePrimaryEmailVisibility(value: ParamsEmailVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePrimaryEmailVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnblock(value: MethodStringParamsUsernameRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unblock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnfollow(value: MethodStringParamsUsernameRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfollow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateAuthenticated(value: ParamsBio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


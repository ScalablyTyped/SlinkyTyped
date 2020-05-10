package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddEmails extends js.Object {
  var addEmails: AnonParamsAnonEmails = js.native
  var block: AnonMethodStringParamsAnonUsernameAnonRequired = js.native
  var checkBlocked: AnonMethodStringParamsAnonUsernameAnonRequired = js.native
  var checkFollowing: AnonMethodStringParamsAnonUsernameAnonRequired = js.native
  var checkFollowingForUser: AnonParamsAnonTargetuser = js.native
  var createGpgKey: AnonParamsAnonArmoredpublickey = js.native
  var createPublicKey: AnonParamsAnonKeyTitle = js.native
  var deleteEmails: AnonParamsAnonEmails = js.native
  var deleteGpgKey: AnonParamsAnonGpgkeyid = js.native
  var deletePublicKey: AnonParamsAnonKeyidAnonRequired = js.native
  var follow: AnonMethodStringParamsAnonUsernameAnonRequired = js.native
  var getAuthenticated: AnonUrlString = js.native
  var getByUsername: AnonMethodStringParamsAnonUsernameAnonRequired = js.native
  var getContextForUser: AnonParamsAnonSubjectid = js.native
  var getGpgKey: AnonParamsAnonGpgkeyid = js.native
  var getPublicKey: AnonParamsAnonKeyidAnonRequired = js.native
  var list: AnonParamsAnonSince = js.native
  var listBlocked: AnonUrlString = js.native
  var listEmails: AnonParamsAnonPagePerpage = js.native
  var listFollowersForAuthenticatedUser: AnonParamsAnonPagePerpage = js.native
  var listFollowersForUser: AnonParamsAnonUsername = js.native
  var listFollowingForAuthenticatedUser: AnonParamsAnonPagePerpage = js.native
  var listFollowingForUser: AnonParamsAnonUsername = js.native
  var listGpgKeys: AnonParamsAnonPagePerpage = js.native
  var listGpgKeysForUser: AnonParamsAnonUsername = js.native
  var listPublicEmails: AnonParamsAnonPagePerpage = js.native
  var listPublicKeys: AnonParamsAnonPagePerpage = js.native
  var listPublicKeysForUser: AnonParamsAnonUsername = js.native
  var togglePrimaryEmailVisibility: AnonParamsAnonEmailVisibility = js.native
  var unblock: AnonMethodStringParamsAnonUsernameAnonRequired = js.native
  var unfollow: AnonMethodStringParamsAnonUsernameAnonRequired = js.native
  var updateAuthenticated: AnonParamsAnonBio = js.native
}

object AnonAddEmails {
  @scala.inline
  def apply(
    addEmails: AnonParamsAnonEmails,
    block: AnonMethodStringParamsAnonUsernameAnonRequired,
    checkBlocked: AnonMethodStringParamsAnonUsernameAnonRequired,
    checkFollowing: AnonMethodStringParamsAnonUsernameAnonRequired,
    checkFollowingForUser: AnonParamsAnonTargetuser,
    createGpgKey: AnonParamsAnonArmoredpublickey,
    createPublicKey: AnonParamsAnonKeyTitle,
    deleteEmails: AnonParamsAnonEmails,
    deleteGpgKey: AnonParamsAnonGpgkeyid,
    deletePublicKey: AnonParamsAnonKeyidAnonRequired,
    follow: AnonMethodStringParamsAnonUsernameAnonRequired,
    getAuthenticated: AnonUrlString,
    getByUsername: AnonMethodStringParamsAnonUsernameAnonRequired,
    getContextForUser: AnonParamsAnonSubjectid,
    getGpgKey: AnonParamsAnonGpgkeyid,
    getPublicKey: AnonParamsAnonKeyidAnonRequired,
    list: AnonParamsAnonSince,
    listBlocked: AnonUrlString,
    listEmails: AnonParamsAnonPagePerpage,
    listFollowersForAuthenticatedUser: AnonParamsAnonPagePerpage,
    listFollowersForUser: AnonParamsAnonUsername,
    listFollowingForAuthenticatedUser: AnonParamsAnonPagePerpage,
    listFollowingForUser: AnonParamsAnonUsername,
    listGpgKeys: AnonParamsAnonPagePerpage,
    listGpgKeysForUser: AnonParamsAnonUsername,
    listPublicEmails: AnonParamsAnonPagePerpage,
    listPublicKeys: AnonParamsAnonPagePerpage,
    listPublicKeysForUser: AnonParamsAnonUsername,
    togglePrimaryEmailVisibility: AnonParamsAnonEmailVisibility,
    unblock: AnonMethodStringParamsAnonUsernameAnonRequired,
    unfollow: AnonMethodStringParamsAnonUsernameAnonRequired,
    updateAuthenticated: AnonParamsAnonBio
  ): AnonAddEmails = {
    val __obj = js.Dynamic.literal(addEmails = addEmails.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], checkBlocked = checkBlocked.asInstanceOf[js.Any], checkFollowing = checkFollowing.asInstanceOf[js.Any], checkFollowingForUser = checkFollowingForUser.asInstanceOf[js.Any], createGpgKey = createGpgKey.asInstanceOf[js.Any], createPublicKey = createPublicKey.asInstanceOf[js.Any], deleteEmails = deleteEmails.asInstanceOf[js.Any], deleteGpgKey = deleteGpgKey.asInstanceOf[js.Any], deletePublicKey = deletePublicKey.asInstanceOf[js.Any], follow = follow.asInstanceOf[js.Any], getAuthenticated = getAuthenticated.asInstanceOf[js.Any], getByUsername = getByUsername.asInstanceOf[js.Any], getContextForUser = getContextForUser.asInstanceOf[js.Any], getGpgKey = getGpgKey.asInstanceOf[js.Any], getPublicKey = getPublicKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listBlocked = listBlocked.asInstanceOf[js.Any], listEmails = listEmails.asInstanceOf[js.Any], listFollowersForAuthenticatedUser = listFollowersForAuthenticatedUser.asInstanceOf[js.Any], listFollowersForUser = listFollowersForUser.asInstanceOf[js.Any], listFollowingForAuthenticatedUser = listFollowingForAuthenticatedUser.asInstanceOf[js.Any], listFollowingForUser = listFollowingForUser.asInstanceOf[js.Any], listGpgKeys = listGpgKeys.asInstanceOf[js.Any], listGpgKeysForUser = listGpgKeysForUser.asInstanceOf[js.Any], listPublicEmails = listPublicEmails.asInstanceOf[js.Any], listPublicKeys = listPublicKeys.asInstanceOf[js.Any], listPublicKeysForUser = listPublicKeysForUser.asInstanceOf[js.Any], togglePrimaryEmailVisibility = togglePrimaryEmailVisibility.asInstanceOf[js.Any], unblock = unblock.asInstanceOf[js.Any], unfollow = unfollow.asInstanceOf[js.Any], updateAuthenticated = updateAuthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddEmails]
  }
  @scala.inline
  implicit class AnonAddEmailsOps[Self <: AnonAddEmails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEmails(value: AnonParamsAnonEmails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlock(value: AnonMethodStringParamsAnonUsernameAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckBlocked(value: AnonMethodStringParamsAnonUsernameAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckFollowing(value: AnonMethodStringParamsAnonUsernameAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkFollowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckFollowingForUser(value: AnonParamsAnonTargetuser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkFollowingForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateGpgKey(value: AnonParamsAnonArmoredpublickey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createGpgKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatePublicKey(value: AnonParamsAnonKeyTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteEmails(value: AnonParamsAnonEmails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteGpgKey(value: AnonParamsAnonGpgkeyid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteGpgKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletePublicKey(value: AnonParamsAnonKeyidAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollow(value: AnonMethodStringParamsAnonUsernameAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAuthenticated(value: AnonUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetByUsername(value: AnonMethodStringParamsAnonUsernameAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContextForUser(value: AnonParamsAnonSubjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContextForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetGpgKey(value: AnonParamsAnonGpgkeyid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGpgKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPublicKey(value: AnonParamsAnonKeyidAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonParamsAnonSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListBlocked(value: AnonUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEmails(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFollowersForAuthenticatedUser(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFollowersForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFollowersForUser(value: AnonParamsAnonUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFollowersForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFollowingForAuthenticatedUser(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFollowingForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFollowingForUser(value: AnonParamsAnonUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFollowingForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListGpgKeys(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listGpgKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListGpgKeysForUser(value: AnonParamsAnonUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listGpgKeysForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicEmails(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicKeys(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicKeysForUser(value: AnonParamsAnonUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicKeysForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTogglePrimaryEmailVisibility(value: AnonParamsAnonEmailVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePrimaryEmailVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnblock(value: AnonMethodStringParamsAnonUsernameAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unblock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnfollow(value: AnonMethodStringParamsAnonUsernameAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfollow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateAuthenticated(value: AnonParamsAnonBio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


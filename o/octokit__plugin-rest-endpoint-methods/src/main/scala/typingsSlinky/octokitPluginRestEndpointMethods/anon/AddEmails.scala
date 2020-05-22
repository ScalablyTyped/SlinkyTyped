package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddEmails extends js.Object {
  var addEmails: ParamsEmails
  var block: MethodStringParamsUsernameRequired
  var checkBlocked: MethodStringParamsUsernameRequired
  var checkFollowing: MethodStringParamsUsernameRequired
  var checkFollowingForUser: ParamsTargetuser
  var createGpgKey: ParamsArmoredpublickey
  var createPublicKey: ParamsKeyTitle
  var deleteEmails: ParamsEmails
  var deleteGpgKey: ParamsGpgkeyid
  var deletePublicKey: ParamsKeyidRequired
  var follow: MethodStringParamsUsernameRequired
  var getAuthenticated: UrlString
  var getByUsername: MethodStringParamsUsernameRequired
  var getContextForUser: ParamsSubjectid
  var getGpgKey: ParamsGpgkeyid
  var getPublicKey: ParamsKeyidRequired
  var list: ParamsSince
  var listBlocked: UrlString
  var listEmails: ParamsPagePerpage
  var listFollowersForAuthenticatedUser: ParamsPagePerpage
  var listFollowersForUser: ParamsUsername
  var listFollowingForAuthenticatedUser: ParamsPagePerpage
  var listFollowingForUser: ParamsUsername
  var listGpgKeys: ParamsPagePerpage
  var listGpgKeysForUser: ParamsUsername
  var listPublicEmails: ParamsPagePerpage
  var listPublicKeys: ParamsPagePerpage
  var listPublicKeysForUser: ParamsUsername
  var togglePrimaryEmailVisibility: ParamsEmailVisibility
  var unblock: MethodStringParamsUsernameRequired
  var unfollow: MethodStringParamsUsernameRequired
  var updateAuthenticated: ParamsBio
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
}


package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddEmails extends js.Object {
  var addEmails: AnonParamsAnonEmails
  var block: AnonMethodStringParamsAnonUsernameAnonRequired
  var checkBlocked: AnonMethodStringParamsAnonUsernameAnonRequired
  var checkFollowing: AnonMethodStringParamsAnonUsernameAnonRequired
  var checkFollowingForUser: AnonParamsAnonTargetuser
  var createGpgKey: AnonParamsAnonArmoredpublickey
  var createPublicKey: AnonParamsAnonKeyTitle
  var deleteEmails: AnonParamsAnonEmails
  var deleteGpgKey: AnonParamsAnonGpgkeyid
  var deletePublicKey: AnonParamsAnonKeyidAnonRequired
  var follow: AnonMethodStringParamsAnonUsernameAnonRequired
  var getAuthenticated: AnonUrlString
  var getByUsername: AnonMethodStringParamsAnonUsernameAnonRequired
  var getContextForUser: AnonParamsAnonSubjectid
  var getGpgKey: AnonParamsAnonGpgkeyid
  var getPublicKey: AnonParamsAnonKeyidAnonRequired
  var list: AnonParamsAnonSince
  var listBlocked: AnonUrlString
  var listEmails: AnonParamsAnonPagePerpage
  var listFollowersForAuthenticatedUser: AnonParamsAnonPagePerpage
  var listFollowersForUser: AnonParamsAnonUsername
  var listFollowingForAuthenticatedUser: AnonParamsAnonPagePerpage
  var listFollowingForUser: AnonParamsAnonUsername
  var listGpgKeys: AnonParamsAnonPagePerpage
  var listGpgKeysForUser: AnonParamsAnonUsername
  var listPublicEmails: AnonParamsAnonPagePerpage
  var listPublicKeys: AnonParamsAnonPagePerpage
  var listPublicKeysForUser: AnonParamsAnonUsername
  var togglePrimaryEmailVisibility: AnonParamsAnonEmailVisibility
  var unblock: AnonMethodStringParamsAnonUsernameAnonRequired
  var unfollow: AnonMethodStringParamsAnonUsernameAnonRequired
  var updateAuthenticated: AnonParamsAnonBio
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
}


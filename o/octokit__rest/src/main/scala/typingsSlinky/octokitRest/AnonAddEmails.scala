package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.EmptyParams
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import typingsSlinky.octokitRest.mod.Octokit.UsersAddEmailsParams
import typingsSlinky.octokitRest.mod.Octokit.UsersAddEmailsResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersBlockParams
import typingsSlinky.octokitRest.mod.Octokit.UsersCheckBlockedParams
import typingsSlinky.octokitRest.mod.Octokit.UsersCheckFollowingForUserParams
import typingsSlinky.octokitRest.mod.Octokit.UsersCheckFollowingParams
import typingsSlinky.octokitRest.mod.Octokit.UsersCreateGpgKeyParams
import typingsSlinky.octokitRest.mod.Octokit.UsersCreateGpgKeyResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersCreatePublicKeyParams
import typingsSlinky.octokitRest.mod.Octokit.UsersCreatePublicKeyResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersDeleteEmailsParams
import typingsSlinky.octokitRest.mod.Octokit.UsersDeleteGpgKeyParams
import typingsSlinky.octokitRest.mod.Octokit.UsersDeletePublicKeyParams
import typingsSlinky.octokitRest.mod.Octokit.UsersFollowParams
import typingsSlinky.octokitRest.mod.Octokit.UsersGetAuthenticatedResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersGetByUsernameParams
import typingsSlinky.octokitRest.mod.Octokit.UsersGetByUsernameResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersGetContextForUserParams
import typingsSlinky.octokitRest.mod.Octokit.UsersGetContextForUserResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersGetGpgKeyParams
import typingsSlinky.octokitRest.mod.Octokit.UsersGetGpgKeyResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersGetPublicKeyParams
import typingsSlinky.octokitRest.mod.Octokit.UsersGetPublicKeyResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListBlockedResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListEmailsParams
import typingsSlinky.octokitRest.mod.Octokit.UsersListEmailsResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListFollowersForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.UsersListFollowersForAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListFollowersForUserParams
import typingsSlinky.octokitRest.mod.Octokit.UsersListFollowersForUserResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListFollowingForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.UsersListFollowingForAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListFollowingForUserParams
import typingsSlinky.octokitRest.mod.Octokit.UsersListFollowingForUserResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListGpgKeysForUserParams
import typingsSlinky.octokitRest.mod.Octokit.UsersListGpgKeysForUserResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListGpgKeysParams
import typingsSlinky.octokitRest.mod.Octokit.UsersListGpgKeysResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListParams
import typingsSlinky.octokitRest.mod.Octokit.UsersListPublicEmailsParams
import typingsSlinky.octokitRest.mod.Octokit.UsersListPublicEmailsResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListPublicKeysForUserParams
import typingsSlinky.octokitRest.mod.Octokit.UsersListPublicKeysForUserResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListPublicKeysParams
import typingsSlinky.octokitRest.mod.Octokit.UsersListPublicKeysResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersListResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersTogglePrimaryEmailVisibilityParams
import typingsSlinky.octokitRest.mod.Octokit.UsersTogglePrimaryEmailVisibilityResponse
import typingsSlinky.octokitRest.mod.Octokit.UsersUnblockParams
import typingsSlinky.octokitRest.mod.Octokit.UsersUnfollowParams
import typingsSlinky.octokitRest.mod.Octokit.UsersUpdateAuthenticatedParams
import typingsSlinky.octokitRest.mod.Octokit.UsersUpdateAuthenticatedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddEmails extends js.Object {
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("addEmails")
  var addEmails_Original: Anon592 = js.native
  @JSName("block")
  var block_Original: Anon593 = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  @JSName("checkBlocked")
  var checkBlocked_Original: Anon594 = js.native
  @JSName("checkFollowingForUser")
  var checkFollowingForUser_Original: Anon596 = js.native
  @JSName("checkFollowing")
  var checkFollowing_Original: Anon595 = js.native
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createGpgKey")
  var createGpgKey_Original: Anon597 = js.native
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createPublicKey")
  var createPublicKey_Original: Anon598 = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("deleteEmails")
  var deleteEmails_Original: Anon599 = js.native
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteGpgKey")
  var deleteGpgKey_Original: Anon600 = js.native
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deletePublicKey")
  var deletePublicKey_Original: Anon601 = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("follow")
  var follow_Original: Anon602 = js.native
  /**
    * Lists public and private profile information when authenticated through basic auth or OAuth with the `user` scope.
    *
    * Lists public profile information when authenticated through OAuth without the `user` scope.
    */
  @JSName("getAuthenticated")
  var getAuthenticated_Original: Anon603 = js.native
  /**
    * Provides publicly available information about someone with a GitHub account.
    *
    * GitHub Apps with the `Plan` user permission can use this endpoint to retrieve information about a user's GitHub plan. The GitHub App must be authenticated as a user. See "[Identifying and authorizing users for GitHub Apps](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)" for details about authentication. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/users/#response-with-github-plan-information)."
    *
    * The `email` key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://developer.github.com/v3/#authentication).
    *
    * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see "[Emails API](https://developer.github.com/v3/users/emails/)".
    */
  @JSName("getByUsername")
  var getByUsername_Original: Anon604 = js.native
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    */
  @JSName("getContextForUser")
  var getContextForUser_Original: Anon605 = js.native
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getGpgKey")
  var getGpgKey_Original: Anon606 = js.native
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getPublicKey")
  var getPublicKey_Original: Anon607 = js.native
  /**
    * List the users you've blocked on your personal account.
    */
  @JSName("listBlocked")
  var listBlocked_Original: Anon609 = js.native
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listEmails")
  var listEmails_Original: Anon610 = js.native
  @JSName("listFollowersForAuthenticatedUser")
  var listFollowersForAuthenticatedUser_Original: Anon611 = js.native
  @JSName("listFollowersForUser")
  var listFollowersForUser_Original: Anon612 = js.native
  @JSName("listFollowingForAuthenticatedUser")
  var listFollowingForAuthenticatedUser_Original: Anon613 = js.native
  @JSName("listFollowingForUser")
  var listFollowingForUser_Original: Anon614 = js.native
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  @JSName("listGpgKeysForUser")
  var listGpgKeysForUser_Original: Anon616 = js.native
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listGpgKeys")
  var listGpgKeys_Original: Anon615 = js.native
  /**
    * Lists your publicly visible email address, which you can set with the [Toggle primary email visibility](https://developer.github.com/v3/users/emails/#toggle-primary-email-visibility) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listPublicEmails")
  var listPublicEmails_Original: Anon617 = js.native
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  @JSName("listPublicKeysForUser")
  var listPublicKeysForUser_Original: Anon619 = js.native
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listPublicKeys")
  var listPublicKeys_Original: Anon618 = js.native
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  @JSName("list")
  var list_Original: Anon608 = js.native
  /**
    * Sets the visibility for your primary email addresses.
    */
  @JSName("togglePrimaryEmailVisibility")
  var togglePrimaryEmailVisibility_Original: Anon620 = js.native
  @JSName("unblock")
  var unblock_Original: Anon621 = js.native
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("unfollow")
  var unfollow_Original: Anon622 = js.native
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  @JSName("updateAuthenticated")
  var updateAuthenticated_Original: Anon623 = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  def addEmails(): js.Promise[Response[UsersAddEmailsResponse]] = js.native
  def addEmails(params: RequestOptions with UsersAddEmailsParams): js.Promise[Response[UsersAddEmailsResponse]] = js.native
  def block(): js.Promise[AnyResponse] = js.native
  def block(params: RequestOptions with UsersBlockParams): js.Promise[AnyResponse] = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  def checkBlocked(): js.Promise[AnyResponse] = js.native
  def checkBlocked(params: RequestOptions with UsersCheckBlockedParams): js.Promise[AnyResponse] = js.native
  def checkFollowing(): js.Promise[AnyResponse] = js.native
  def checkFollowing(params: RequestOptions with UsersCheckFollowingParams): js.Promise[AnyResponse] = js.native
  def checkFollowingForUser(): js.Promise[AnyResponse] = js.native
  def checkFollowingForUser(params: RequestOptions with UsersCheckFollowingForUserParams): js.Promise[AnyResponse] = js.native
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createGpgKey(): js.Promise[Response[UsersCreateGpgKeyResponse]] = js.native
  def createGpgKey(params: RequestOptions with UsersCreateGpgKeyParams): js.Promise[Response[UsersCreateGpgKeyResponse]] = js.native
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createPublicKey(): js.Promise[Response[UsersCreatePublicKeyResponse]] = js.native
  def createPublicKey(params: RequestOptions with UsersCreatePublicKeyParams): js.Promise[Response[UsersCreatePublicKeyResponse]] = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  def deleteEmails(): js.Promise[AnyResponse] = js.native
  def deleteEmails(params: RequestOptions with UsersDeleteEmailsParams): js.Promise[AnyResponse] = js.native
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteGpgKey(): js.Promise[AnyResponse] = js.native
  def deleteGpgKey(params: RequestOptions with UsersDeleteGpgKeyParams): js.Promise[AnyResponse] = js.native
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deletePublicKey(): js.Promise[AnyResponse] = js.native
  def deletePublicKey(params: RequestOptions with UsersDeletePublicKeyParams): js.Promise[AnyResponse] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def follow(): js.Promise[AnyResponse] = js.native
  def follow(params: RequestOptions with UsersFollowParams): js.Promise[AnyResponse] = js.native
  /**
    * Lists public and private profile information when authenticated through basic auth or OAuth with the `user` scope.
    *
    * Lists public profile information when authenticated through OAuth without the `user` scope.
    */
  def getAuthenticated(): js.Promise[Response[UsersGetAuthenticatedResponse]] = js.native
  def getAuthenticated(params: RequestOptions with EmptyParams): js.Promise[Response[UsersGetAuthenticatedResponse]] = js.native
  /**
    * Provides publicly available information about someone with a GitHub account.
    *
    * GitHub Apps with the `Plan` user permission can use this endpoint to retrieve information about a user's GitHub plan. The GitHub App must be authenticated as a user. See "[Identifying and authorizing users for GitHub Apps](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)" for details about authentication. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/users/#response-with-github-plan-information)."
    *
    * The `email` key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://developer.github.com/v3/#authentication).
    *
    * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see "[Emails API](https://developer.github.com/v3/users/emails/)".
    */
  def getByUsername(): js.Promise[Response[UsersGetByUsernameResponse]] = js.native
  def getByUsername(params: RequestOptions with UsersGetByUsernameParams): js.Promise[Response[UsersGetByUsernameResponse]] = js.native
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    */
  def getContextForUser(): js.Promise[Response[UsersGetContextForUserResponse]] = js.native
  def getContextForUser(params: RequestOptions with UsersGetContextForUserParams): js.Promise[Response[UsersGetContextForUserResponse]] = js.native
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getGpgKey(): js.Promise[Response[UsersGetGpgKeyResponse]] = js.native
  def getGpgKey(params: RequestOptions with UsersGetGpgKeyParams): js.Promise[Response[UsersGetGpgKeyResponse]] = js.native
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getPublicKey(): js.Promise[Response[UsersGetPublicKeyResponse]] = js.native
  def getPublicKey(params: RequestOptions with UsersGetPublicKeyParams): js.Promise[Response[UsersGetPublicKeyResponse]] = js.native
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  def list(): js.Promise[Response[UsersListResponse]] = js.native
  def list(params: RequestOptions with UsersListParams): js.Promise[Response[UsersListResponse]] = js.native
  /**
    * List the users you've blocked on your personal account.
    */
  def listBlocked(): js.Promise[Response[UsersListBlockedResponse]] = js.native
  def listBlocked(params: RequestOptions with EmptyParams): js.Promise[Response[UsersListBlockedResponse]] = js.native
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  def listEmails(): js.Promise[Response[UsersListEmailsResponse]] = js.native
  def listEmails(params: RequestOptions with UsersListEmailsParams): js.Promise[Response[UsersListEmailsResponse]] = js.native
  def listFollowersForAuthenticatedUser(): js.Promise[Response[UsersListFollowersForAuthenticatedUserResponse]] = js.native
  def listFollowersForAuthenticatedUser(params: RequestOptions with UsersListFollowersForAuthenticatedUserParams): js.Promise[Response[UsersListFollowersForAuthenticatedUserResponse]] = js.native
  def listFollowersForUser(): js.Promise[Response[UsersListFollowersForUserResponse]] = js.native
  def listFollowersForUser(params: RequestOptions with UsersListFollowersForUserParams): js.Promise[Response[UsersListFollowersForUserResponse]] = js.native
  def listFollowingForAuthenticatedUser(): js.Promise[Response[UsersListFollowingForAuthenticatedUserResponse]] = js.native
  def listFollowingForAuthenticatedUser(params: RequestOptions with UsersListFollowingForAuthenticatedUserParams): js.Promise[Response[UsersListFollowingForAuthenticatedUserResponse]] = js.native
  def listFollowingForUser(): js.Promise[Response[UsersListFollowingForUserResponse]] = js.native
  def listFollowingForUser(params: RequestOptions with UsersListFollowingForUserParams): js.Promise[Response[UsersListFollowingForUserResponse]] = js.native
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listGpgKeys(): js.Promise[Response[UsersListGpgKeysResponse]] = js.native
  def listGpgKeys(params: RequestOptions with UsersListGpgKeysParams): js.Promise[Response[UsersListGpgKeysResponse]] = js.native
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  def listGpgKeysForUser(): js.Promise[Response[UsersListGpgKeysForUserResponse]] = js.native
  def listGpgKeysForUser(params: RequestOptions with UsersListGpgKeysForUserParams): js.Promise[Response[UsersListGpgKeysForUserResponse]] = js.native
  /**
    * Lists your publicly visible email address, which you can set with the [Toggle primary email visibility](https://developer.github.com/v3/users/emails/#toggle-primary-email-visibility) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  def listPublicEmails(): js.Promise[Response[UsersListPublicEmailsResponse]] = js.native
  def listPublicEmails(params: RequestOptions with UsersListPublicEmailsParams): js.Promise[Response[UsersListPublicEmailsResponse]] = js.native
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listPublicKeys(): js.Promise[Response[UsersListPublicKeysResponse]] = js.native
  def listPublicKeys(params: RequestOptions with UsersListPublicKeysParams): js.Promise[Response[UsersListPublicKeysResponse]] = js.native
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  def listPublicKeysForUser(): js.Promise[Response[UsersListPublicKeysForUserResponse]] = js.native
  def listPublicKeysForUser(params: RequestOptions with UsersListPublicKeysForUserParams): js.Promise[Response[UsersListPublicKeysForUserResponse]] = js.native
  /**
    * Sets the visibility for your primary email addresses.
    */
  def togglePrimaryEmailVisibility(): js.Promise[Response[UsersTogglePrimaryEmailVisibilityResponse]] = js.native
  def togglePrimaryEmailVisibility(params: RequestOptions with UsersTogglePrimaryEmailVisibilityParams): js.Promise[Response[UsersTogglePrimaryEmailVisibilityResponse]] = js.native
  def unblock(): js.Promise[AnyResponse] = js.native
  def unblock(params: RequestOptions with UsersUnblockParams): js.Promise[AnyResponse] = js.native
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def unfollow(): js.Promise[AnyResponse] = js.native
  def unfollow(params: RequestOptions with UsersUnfollowParams): js.Promise[AnyResponse] = js.native
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  def updateAuthenticated(): js.Promise[Response[UsersUpdateAuthenticatedResponse]] = js.native
  def updateAuthenticated(params: RequestOptions with UsersUpdateAuthenticatedParams): js.Promise[Response[UsersUpdateAuthenticatedResponse]] = js.native
}


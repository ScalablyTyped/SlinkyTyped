package typingsSlinky.atOctokitRest

import typingsSlinky.atOctokitRest.atOctokitRestMod.AnyResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.EmptyParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.RequestOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.Response
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersAddEmailsParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersAddEmailsResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersBlockParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersCheckBlockedParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersCheckFollowingForUserParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersCheckFollowingParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersCreateGpgKeyParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersCreateGpgKeyResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersCreatePublicKeyParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersCreatePublicKeyResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersDeleteEmailsParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersDeleteGpgKeyParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersDeletePublicKeyParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersFollowParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersGetAuthenticatedResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersGetByUsernameParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersGetByUsernameResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersGetContextForUserParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersGetContextForUserResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersGetGpgKeyParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersGetGpgKeyResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersGetPublicKeyParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersGetPublicKeyResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListBlockedResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListEmailsParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListEmailsResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListFollowersForAuthenticatedUserParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListFollowersForAuthenticatedUserResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListFollowersForUserParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListFollowersForUserResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListFollowingForAuthenticatedUserParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListFollowingForAuthenticatedUserResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListFollowingForUserParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListFollowingForUserResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListGpgKeysForUserParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListGpgKeysForUserResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListGpgKeysParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListGpgKeysResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListPublicEmailsParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListPublicEmailsResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListPublicKeysForUserParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListPublicKeysForUserResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListPublicKeysParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListPublicKeysResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersListResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersTogglePrimaryEmailVisibilityParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersTogglePrimaryEmailVisibilityResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersUnblockParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersUnfollowParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersUpdateAuthenticatedParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.UsersUpdateAuthenticatedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddEmails extends js.Object {
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("addEmails")
  var addEmails_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersAddEmailsParams = js.native
  @JSName("block")
  var block_Original: Anon_EndpointParamsAnyResponsePromiseRequestOptionsUsersBlockParams = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  @JSName("checkBlocked")
  var checkBlocked_Original: Anon_EndpointParamsAnyResponsePromiseRequestOptionsUsersCheckBlockedParams = js.native
  @JSName("checkFollowingForUser")
  var checkFollowingForUser_Original: Anon_EndpointParamsAnyResponsePromiseRequestOptionsUsersCheckFollowingForUserParams = js.native
  @JSName("checkFollowing")
  var checkFollowing_Original: Anon_EndpointParamsAnyResponsePromiseRequestOptionsUsersCheckFollowingParams = js.native
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createGpgKey")
  var createGpgKey_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersCreateGpgKeyParams = js.native
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createPublicKey")
  var createPublicKey_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersCreatePublicKeyParams = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("deleteEmails")
  var deleteEmails_Original: Anon_EndpointParamsAnyResponsePromiseRequestOptionsUsersDeleteEmailsParams = js.native
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteGpgKey")
  var deleteGpgKey_Original: Anon_EndpointParamsAnyResponsePromiseRequestOptionsUsersDeleteGpgKeyParams = js.native
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deletePublicKey")
  var deletePublicKey_Original: Anon_EndpointParamsAnyResponsePromiseRequestOptionsUsersDeletePublicKeyParams = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("follow")
  var follow_Original: Anon_EndpointParamsAnyResponsePromiseRequestOptionsUsersFollowParams = js.native
  /**
    * Lists public and private profile information when authenticated through basic auth or OAuth with the `user` scope.
    *
    * Lists public profile information when authenticated through OAuth without the `user` scope.
    */
  @JSName("getAuthenticated")
  var getAuthenticated_Original: Anon_EndpointParamsEmptyParamsPromiseRequestOptions = js.native
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
  var getByUsername_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersGetByUsernameParams = js.native
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    */
  @JSName("getContextForUser")
  var getContextForUser_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersGetContextForUserParams = js.native
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getGpgKey")
  var getGpgKey_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersGetGpgKeyParams = js.native
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getPublicKey")
  var getPublicKey_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersGetPublicKeyParams = js.native
  /**
    * List the users you've blocked on your personal account.
    */
  @JSName("listBlocked")
  var listBlocked_Original: Anon_EndpointParamsEmptyParamsPromiseRequestOptionsResponse = js.native
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listEmails")
  var listEmails_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersListEmailsParams = js.native
  @JSName("listFollowersForAuthenticatedUser")
  var listFollowersForAuthenticatedUser_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersListFollowersForAuthenticatedUserParams = js.native
  @JSName("listFollowersForUser")
  var listFollowersForUser_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersListFollowersForUserParams = js.native
  @JSName("listFollowingForAuthenticatedUser")
  var listFollowingForAuthenticatedUser_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersListFollowingForAuthenticatedUserParams = js.native
  @JSName("listFollowingForUser")
  var listFollowingForUser_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersListFollowingForUserParams = js.native
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  @JSName("listGpgKeysForUser")
  var listGpgKeysForUser_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersListGpgKeysForUserParams = js.native
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listGpgKeys")
  var listGpgKeys_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersListGpgKeysParams = js.native
  /**
    * Lists your publicly visible email address, which you can set with the [Toggle primary email visibility](https://developer.github.com/v3/users/emails/#toggle-primary-email-visibility) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listPublicEmails")
  var listPublicEmails_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersListPublicEmailsParams = js.native
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  @JSName("listPublicKeysForUser")
  var listPublicKeysForUser_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersListPublicKeysForUserParams = js.native
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listPublicKeys")
  var listPublicKeys_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersListPublicKeysParams = js.native
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  @JSName("list")
  var list_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersListParams = js.native
  /**
    * Sets the visibility for your primary email addresses.
    */
  @JSName("togglePrimaryEmailVisibility")
  var togglePrimaryEmailVisibility_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersTogglePrimaryEmailVisibilityParams = js.native
  @JSName("unblock")
  var unblock_Original: Anon_EndpointParamsAnyResponsePromiseRequestOptionsUsersUnblockParams = js.native
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("unfollow")
  var unfollow_Original: Anon_EndpointParamsAnyResponsePromiseRequestOptionsUsersUnfollowParams = js.native
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  @JSName("updateAuthenticated")
  var updateAuthenticated_Original: Anon_EndpointParamsPromiseRequestOptionsResponseUsersUpdateAuthenticatedParams = js.native
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


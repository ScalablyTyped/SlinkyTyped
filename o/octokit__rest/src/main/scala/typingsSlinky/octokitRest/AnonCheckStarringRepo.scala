package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.ActivityCheckStarringRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityCheckWatchingRepoLegacyParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityDeleteRepoSubscriptionParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityDeleteThreadSubscriptionParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityGetRepoSubscriptionParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityGetRepoSubscriptionResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityGetThreadParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityGetThreadResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityGetThreadSubscriptionParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityGetThreadSubscriptionResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityListEventsForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListEventsForUserParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListFeedsResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityListNotificationsForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListNotificationsForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityListNotificationsParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListNotificationsResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityListPublicEventsForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListPublicEventsForRepoNetworkParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListPublicEventsForUserParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListPublicEventsParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListReceivedEventsForUserParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListReceivedPublicEventsForUserParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListRepoEventsParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListReposStarredByAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListReposStarredByAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityListReposStarredByUserParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListReposStarredByUserResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityListReposWatchedByUserParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListReposWatchedByUserResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityListStargazersForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListStargazersForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityListWatchedReposForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListWatchedReposForAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityListWatchersForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityListWatchersForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityMarkAsReadParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityMarkNotificationsAsReadForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityMarkThreadAsReadParams
import typingsSlinky.octokitRest.mod.Octokit.ActivitySetRepoSubscriptionParams
import typingsSlinky.octokitRest.mod.Octokit.ActivitySetRepoSubscriptionResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivitySetThreadSubscriptionParams
import typingsSlinky.octokitRest.mod.Octokit.ActivitySetThreadSubscriptionResponse
import typingsSlinky.octokitRest.mod.Octokit.ActivityStarRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityStopWatchingRepoLegacyParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityUnstarRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ActivityWatchRepoLegacyParams
import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.EmptyParams
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckStarringRepo extends js.Object {
  /**
    * Requires for the user to be authenticated.
    */
  @JSName("checkStarringRepo")
  var checkStarringRepo_Original: Anon20 = js.native
  /**
    * Requires for the user to be authenticated.
    */
  @JSName("checkWatchingRepoLegacy")
  var checkWatchingRepoLegacy_Original: Anon21 = js.native
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://developer.github.com/v3/activity/watching/#set-a-repository-subscription).
    */
  @JSName("deleteRepoSubscription")
  var deleteRepoSubscription_Original: Anon22 = js.native
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get **@mention**ed.
    */
  @JSName("deleteThreadSubscription")
  var deleteThreadSubscription_Original: Anon23 = js.native
  @JSName("getRepoSubscription")
  var getRepoSubscription_Original: Anon24 = js.native
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://developer.github.com/v3/activity/watching/#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  @JSName("getThreadSubscription")
  var getThreadSubscription_Original: Anon26 = js.native
  @JSName("getThread")
  var getThread_Original: Anon25 = js.native
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  @JSName("listEventsForOrg")
  var listEventsForOrg_Original: Anon27 = js.native
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  @JSName("listEventsForUser")
  var listEventsForUser_Original: Anon28 = js.native
  /**
    * GitHub provides several timeline resources in [Atom](http://en.wikipedia.org/wiki/Atom_(standard)) format. The Feeds API lists all the feeds available to the authenticated user:
    *
    * *   **Timeline**: The GitHub global public timeline
    * *   **User**: The public timeline for any user, using [URI template](https://developer.github.com/v3/#hypermedia)
    * *   **Current user public**: The public timeline for the authenticated user
    * *   **Current user**: The private timeline for the authenticated user
    * *   **Current user actor**: The private timeline for activity created by the authenticated user
    * *   **Current user organizations**: The private timeline for the organizations the authenticated user is a member of.
    * *   **Security advisories**: A collection of public announcements that provide information about security-related vulnerabilities in software on GitHub.
    *
    * **Note**: Private feeds are only returned when [authenticating via Basic Auth](https://developer.github.com/v3/#basic-authentication) since current feed URIs use the older, non revocable auth tokens.
    */
  @JSName("listFeeds")
  var listFeeds_Original: Anon29 = js.native
  /**
    * List all notifications for the current user.
    */
  @JSName("listNotificationsForRepo")
  var listNotificationsForRepo_Original: Anon31 = js.native
  /**
    * List all notifications for the current user, sorted by most recently updated.
    *
    * The following example uses the `since` parameter to list notifications that have been updated after the specified time.
    */
  @JSName("listNotifications")
  var listNotifications_Original: Anon30 = js.native
  @JSName("listPublicEventsForOrg")
  var listPublicEventsForOrg_Original: Anon33 = js.native
  @JSName("listPublicEventsForRepoNetwork")
  var listPublicEventsForRepoNetwork_Original: Anon34 = js.native
  @JSName("listPublicEventsForUser")
  var listPublicEventsForUser_Original: Anon35 = js.native
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  @JSName("listPublicEvents")
  var listPublicEvents_Original: Anon32 = js.native
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  @JSName("listReceivedEventsForUser")
  var listReceivedEventsForUser_Original: Anon36 = js.native
  @JSName("listReceivedPublicEventsForUser")
  var listReceivedPublicEventsForUser_Original: Anon37 = js.native
  @JSName("listRepoEvents")
  var listRepoEvents_Original: Anon38 = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listReposStarredByAuthenticatedUser")
  var listReposStarredByAuthenticatedUser_Original: Anon39 = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listReposStarredByUser")
  var listReposStarredByUser_Original: Anon40 = js.native
  @JSName("listReposWatchedByUser")
  var listReposWatchedByUser_Original: Anon41 = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  @JSName("listStargazersForRepo")
  var listStargazersForRepo_Original: Anon42 = js.native
  @JSName("listWatchedReposForAuthenticatedUser")
  var listWatchedReposForAuthenticatedUser_Original: Anon43 = js.native
  @JSName("listWatchersForRepo")
  var listWatchersForRepo_Original: Anon44 = js.native
  /**
    * Marks a notification as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List your notifications](https://developer.github.com/v3/activity/notifications/#list-your-notifications) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markAsRead")
  var markAsRead_Original: Anon45 = js.native
  /**
    * Marks all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List your notifications in a repository](https://developer.github.com/v3/activity/notifications/#list-your-notifications-in-a-repository) endpoint and pass the query parameter `all=false`.
    */
  @JSName("markNotificationsAsReadForRepo")
  var markNotificationsAsReadForRepo_Original: Anon46 = js.native
  @JSName("markThreadAsRead")
  var markThreadAsRead_Original: Anon47 = js.native
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription) completely.
    */
  @JSName("setRepoSubscription")
  var setRepoSubscription_Original: Anon48 = js.native
  /**
    * This lets you subscribe or unsubscribe from a conversation.
    */
  @JSName("setThreadSubscription")
  var setThreadSubscription_Original: Anon49 = js.native
  /**
    * Requires for the user to be authenticated.
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("starRepo")
  var starRepo_Original: Anon50 = js.native
  /**
    * Requires for the user to be authenticated.
    */
  @JSName("stopWatchingRepoLegacy")
  var stopWatchingRepoLegacy_Original: Anon51 = js.native
  /**
    * Requires for the user to be authenticated.
    */
  @JSName("unstarRepo")
  var unstarRepo_Original: Anon52 = js.native
  /**
    * Requires the user to be authenticated.
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("watchRepoLegacy")
  var watchRepoLegacy_Original: Anon53 = js.native
  /**
    * Requires for the user to be authenticated.
    */
  def checkStarringRepo(): js.Promise[AnyResponse] = js.native
  def checkStarringRepo(params: RequestOptions with ActivityCheckStarringRepoParams): js.Promise[AnyResponse] = js.native
  /**
    * Requires for the user to be authenticated.
    */
  def checkWatchingRepoLegacy(): js.Promise[AnyResponse] = js.native
  def checkWatchingRepoLegacy(params: RequestOptions with ActivityCheckWatchingRepoLegacyParams): js.Promise[AnyResponse] = js.native
  /**
    * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://developer.github.com/v3/activity/watching/#set-a-repository-subscription).
    */
  def deleteRepoSubscription(): js.Promise[AnyResponse] = js.native
  def deleteRepoSubscription(params: RequestOptions with ActivityDeleteRepoSubscriptionParams): js.Promise[AnyResponse] = js.native
  /**
    * Mutes all future notifications for a conversation until you comment on the thread or get **@mention**ed.
    */
  def deleteThreadSubscription(): js.Promise[AnyResponse] = js.native
  def deleteThreadSubscription(params: RequestOptions with ActivityDeleteThreadSubscriptionParams): js.Promise[AnyResponse] = js.native
  def getRepoSubscription(): js.Promise[Response[ActivityGetRepoSubscriptionResponse]] = js.native
  def getRepoSubscription(params: RequestOptions with ActivityGetRepoSubscriptionParams): js.Promise[Response[ActivityGetRepoSubscriptionResponse]] = js.native
  def getThread(): js.Promise[Response[ActivityGetThreadResponse]] = js.native
  def getThread(params: RequestOptions with ActivityGetThreadParams): js.Promise[Response[ActivityGetThreadResponse]] = js.native
  /**
    * This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://developer.github.com/v3/activity/watching/#get-a-repository-subscription).
    *
    * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.
    */
  def getThreadSubscription(): js.Promise[Response[ActivityGetThreadSubscriptionResponse]] = js.native
  def getThreadSubscription(params: RequestOptions with ActivityGetThreadSubscriptionParams): js.Promise[Response[ActivityGetThreadSubscriptionResponse]] = js.native
  /**
    * This is the user's organization dashboard. You must be authenticated as the user to view this.
    */
  def listEventsForOrg(): js.Promise[AnyResponse] = js.native
  def listEventsForOrg(params: RequestOptions with ActivityListEventsForOrgParams): js.Promise[AnyResponse] = js.native
  /**
    * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
    */
  def listEventsForUser(): js.Promise[AnyResponse] = js.native
  def listEventsForUser(params: RequestOptions with ActivityListEventsForUserParams): js.Promise[AnyResponse] = js.native
  /**
    * GitHub provides several timeline resources in [Atom](http://en.wikipedia.org/wiki/Atom_(standard)) format. The Feeds API lists all the feeds available to the authenticated user:
    *
    * *   **Timeline**: The GitHub global public timeline
    * *   **User**: The public timeline for any user, using [URI template](https://developer.github.com/v3/#hypermedia)
    * *   **Current user public**: The public timeline for the authenticated user
    * *   **Current user**: The private timeline for the authenticated user
    * *   **Current user actor**: The private timeline for activity created by the authenticated user
    * *   **Current user organizations**: The private timeline for the organizations the authenticated user is a member of.
    * *   **Security advisories**: A collection of public announcements that provide information about security-related vulnerabilities in software on GitHub.
    *
    * **Note**: Private feeds are only returned when [authenticating via Basic Auth](https://developer.github.com/v3/#basic-authentication) since current feed URIs use the older, non revocable auth tokens.
    */
  def listFeeds(): js.Promise[Response[ActivityListFeedsResponse]] = js.native
  def listFeeds(params: RequestOptions with EmptyParams): js.Promise[Response[ActivityListFeedsResponse]] = js.native
  /**
    * List all notifications for the current user, sorted by most recently updated.
    *
    * The following example uses the `since` parameter to list notifications that have been updated after the specified time.
    */
  def listNotifications(): js.Promise[Response[ActivityListNotificationsResponse]] = js.native
  def listNotifications(params: RequestOptions with ActivityListNotificationsParams): js.Promise[Response[ActivityListNotificationsResponse]] = js.native
  /**
    * List all notifications for the current user.
    */
  def listNotificationsForRepo(): js.Promise[Response[ActivityListNotificationsForRepoResponse]] = js.native
  def listNotificationsForRepo(params: RequestOptions with ActivityListNotificationsForRepoParams): js.Promise[Response[ActivityListNotificationsForRepoResponse]] = js.native
  /**
    * We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.
    */
  def listPublicEvents(): js.Promise[AnyResponse] = js.native
  def listPublicEvents(params: RequestOptions with ActivityListPublicEventsParams): js.Promise[AnyResponse] = js.native
  def listPublicEventsForOrg(): js.Promise[AnyResponse] = js.native
  def listPublicEventsForOrg(params: RequestOptions with ActivityListPublicEventsForOrgParams): js.Promise[AnyResponse] = js.native
  def listPublicEventsForRepoNetwork(): js.Promise[AnyResponse] = js.native
  def listPublicEventsForRepoNetwork(params: RequestOptions with ActivityListPublicEventsForRepoNetworkParams): js.Promise[AnyResponse] = js.native
  def listPublicEventsForUser(): js.Promise[AnyResponse] = js.native
  def listPublicEventsForUser(params: RequestOptions with ActivityListPublicEventsForUserParams): js.Promise[AnyResponse] = js.native
  /**
    * These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.
    */
  def listReceivedEventsForUser(): js.Promise[AnyResponse] = js.native
  def listReceivedEventsForUser(params: RequestOptions with ActivityListReceivedEventsForUserParams): js.Promise[AnyResponse] = js.native
  def listReceivedPublicEventsForUser(): js.Promise[AnyResponse] = js.native
  def listReceivedPublicEventsForUser(params: RequestOptions with ActivityListReceivedPublicEventsForUserParams): js.Promise[AnyResponse] = js.native
  def listRepoEvents(): js.Promise[AnyResponse] = js.native
  def listRepoEvents(params: RequestOptions with ActivityListRepoEventsParams): js.Promise[AnyResponse] = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByAuthenticatedUser(): js.Promise[Response[ActivityListReposStarredByAuthenticatedUserResponse]] = js.native
  def listReposStarredByAuthenticatedUser(params: RequestOptions with ActivityListReposStarredByAuthenticatedUserParams): js.Promise[Response[ActivityListReposStarredByAuthenticatedUserResponse]] = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listReposStarredByUser(): js.Promise[Response[ActivityListReposStarredByUserResponse]] = js.native
  def listReposStarredByUser(params: RequestOptions with ActivityListReposStarredByUserParams): js.Promise[Response[ActivityListReposStarredByUserResponse]] = js.native
  def listReposWatchedByUser(): js.Promise[Response[ActivityListReposWatchedByUserResponse]] = js.native
  def listReposWatchedByUser(params: RequestOptions with ActivityListReposWatchedByUserParams): js.Promise[Response[ActivityListReposWatchedByUserResponse]] = js.native
  /**
    * You can also find out _when_ stars were created by passing the following custom [media type](https://developer.github.com/v3/media/) via the `Accept` header:
    */
  def listStargazersForRepo(): js.Promise[Response[ActivityListStargazersForRepoResponse]] = js.native
  def listStargazersForRepo(params: RequestOptions with ActivityListStargazersForRepoParams): js.Promise[Response[ActivityListStargazersForRepoResponse]] = js.native
  def listWatchedReposForAuthenticatedUser(): js.Promise[Response[ActivityListWatchedReposForAuthenticatedUserResponse]] = js.native
  def listWatchedReposForAuthenticatedUser(params: RequestOptions with ActivityListWatchedReposForAuthenticatedUserParams): js.Promise[Response[ActivityListWatchedReposForAuthenticatedUserResponse]] = js.native
  def listWatchersForRepo(): js.Promise[Response[ActivityListWatchersForRepoResponse]] = js.native
  def listWatchersForRepo(params: RequestOptions with ActivityListWatchersForRepoParams): js.Promise[Response[ActivityListWatchersForRepoResponse]] = js.native
  /**
    * Marks a notification as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List your notifications](https://developer.github.com/v3/activity/notifications/#list-your-notifications) endpoint and pass the query parameter `all=false`.
    */
  def markAsRead(): js.Promise[AnyResponse] = js.native
  def markAsRead(params: RequestOptions with ActivityMarkAsReadParams): js.Promise[AnyResponse] = js.native
  /**
    * Marks all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List your notifications in a repository](https://developer.github.com/v3/activity/notifications/#list-your-notifications-in-a-repository) endpoint and pass the query parameter `all=false`.
    */
  def markNotificationsAsReadForRepo(): js.Promise[AnyResponse] = js.native
  def markNotificationsAsReadForRepo(params: RequestOptions with ActivityMarkNotificationsAsReadForRepoParams): js.Promise[AnyResponse] = js.native
  def markThreadAsRead(): js.Promise[AnyResponse] = js.native
  def markThreadAsRead(params: RequestOptions with ActivityMarkThreadAsReadParams): js.Promise[AnyResponse] = js.native
  /**
    * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription) completely.
    */
  def setRepoSubscription(): js.Promise[Response[ActivitySetRepoSubscriptionResponse]] = js.native
  def setRepoSubscription(params: RequestOptions with ActivitySetRepoSubscriptionParams): js.Promise[Response[ActivitySetRepoSubscriptionResponse]] = js.native
  /**
    * This lets you subscribe or unsubscribe from a conversation.
    */
  def setThreadSubscription(): js.Promise[Response[ActivitySetThreadSubscriptionResponse]] = js.native
  def setThreadSubscription(params: RequestOptions with ActivitySetThreadSubscriptionParams): js.Promise[Response[ActivitySetThreadSubscriptionResponse]] = js.native
  /**
    * Requires for the user to be authenticated.
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def starRepo(): js.Promise[AnyResponse] = js.native
  def starRepo(params: RequestOptions with ActivityStarRepoParams): js.Promise[AnyResponse] = js.native
  /**
    * Requires for the user to be authenticated.
    */
  def stopWatchingRepoLegacy(): js.Promise[AnyResponse] = js.native
  def stopWatchingRepoLegacy(params: RequestOptions with ActivityStopWatchingRepoLegacyParams): js.Promise[AnyResponse] = js.native
  /**
    * Requires for the user to be authenticated.
    */
  def unstarRepo(): js.Promise[AnyResponse] = js.native
  def unstarRepo(params: RequestOptions with ActivityUnstarRepoParams): js.Promise[AnyResponse] = js.native
  /**
    * Requires the user to be authenticated.
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def watchRepoLegacy(): js.Promise[AnyResponse] = js.native
  def watchRepoLegacy(params: RequestOptions with ActivityWatchRepoLegacyParams): js.Promise[AnyResponse] = js.native
}


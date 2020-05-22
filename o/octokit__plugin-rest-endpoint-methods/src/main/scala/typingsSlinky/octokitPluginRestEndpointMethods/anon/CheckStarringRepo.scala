package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckStarringRepo extends js.Object {
  var checkStarringRepo: Url
  var deleteRepoSubscription: Url
  var deleteThreadSubscription: ParamsThreadid
  var getRepoSubscription: Url
  var getThread: ParamsThreadid
  var getThreadSubscription: ParamsThreadid
  var listEventsForOrg: ParamsOrg
  var listEventsForUser: ParamsUsername
  var listFeeds: UrlString
  var listNotifications: ParamsAll
  var listNotificationsForRepo: ParamsBefore
  var listPublicEvents: ParamsPagePerpage
  var listPublicEventsForOrg: ParamsOrgPage
  var listPublicEventsForRepoNetwork: ParamsOwnerPage
  var listPublicEventsForUser: ParamsUsername
  var listReceivedEventsForUser: ParamsUsername
  var listReceivedPublicEventsForUser: ParamsUsername
  var listRepoEvents: ParamsOwnerPage
  var listReposStarredByAuthenticatedUser: ParamsDirection
  var listReposStarredByUser: ParamsSort
  var listReposWatchedByUser: ParamsUsername
  var listStargazersForRepo: ParamsOwnerPage
  var listWatchedReposForAuthenticatedUser: ParamsPagePerpage
  var listWatchersForRepo: ParamsOwnerPage
  var markAsRead: ParamsLastreadat
  var markNotificationsAsReadForRepo: ParamsLastreadatOwner
  var markThreadAsRead: ParamsThreadid
  var setRepoSubscription: ParamsIgnored
  var setThreadSubscription: ParamsIgnoredThreadid
  var starRepo: Url
  var unstarRepo: Url
}

object CheckStarringRepo {
  @scala.inline
  def apply(
    checkStarringRepo: Url,
    deleteRepoSubscription: Url,
    deleteThreadSubscription: ParamsThreadid,
    getRepoSubscription: Url,
    getThread: ParamsThreadid,
    getThreadSubscription: ParamsThreadid,
    listEventsForOrg: ParamsOrg,
    listEventsForUser: ParamsUsername,
    listFeeds: UrlString,
    listNotifications: ParamsAll,
    listNotificationsForRepo: ParamsBefore,
    listPublicEvents: ParamsPagePerpage,
    listPublicEventsForOrg: ParamsOrgPage,
    listPublicEventsForRepoNetwork: ParamsOwnerPage,
    listPublicEventsForUser: ParamsUsername,
    listReceivedEventsForUser: ParamsUsername,
    listReceivedPublicEventsForUser: ParamsUsername,
    listRepoEvents: ParamsOwnerPage,
    listReposStarredByAuthenticatedUser: ParamsDirection,
    listReposStarredByUser: ParamsSort,
    listReposWatchedByUser: ParamsUsername,
    listStargazersForRepo: ParamsOwnerPage,
    listWatchedReposForAuthenticatedUser: ParamsPagePerpage,
    listWatchersForRepo: ParamsOwnerPage,
    markAsRead: ParamsLastreadat,
    markNotificationsAsReadForRepo: ParamsLastreadatOwner,
    markThreadAsRead: ParamsThreadid,
    setRepoSubscription: ParamsIgnored,
    setThreadSubscription: ParamsIgnoredThreadid,
    starRepo: Url,
    unstarRepo: Url
  ): CheckStarringRepo = {
    val __obj = js.Dynamic.literal(checkStarringRepo = checkStarringRepo.asInstanceOf[js.Any], deleteRepoSubscription = deleteRepoSubscription.asInstanceOf[js.Any], deleteThreadSubscription = deleteThreadSubscription.asInstanceOf[js.Any], getRepoSubscription = getRepoSubscription.asInstanceOf[js.Any], getThread = getThread.asInstanceOf[js.Any], getThreadSubscription = getThreadSubscription.asInstanceOf[js.Any], listEventsForOrg = listEventsForOrg.asInstanceOf[js.Any], listEventsForUser = listEventsForUser.asInstanceOf[js.Any], listFeeds = listFeeds.asInstanceOf[js.Any], listNotifications = listNotifications.asInstanceOf[js.Any], listNotificationsForRepo = listNotificationsForRepo.asInstanceOf[js.Any], listPublicEvents = listPublicEvents.asInstanceOf[js.Any], listPublicEventsForOrg = listPublicEventsForOrg.asInstanceOf[js.Any], listPublicEventsForRepoNetwork = listPublicEventsForRepoNetwork.asInstanceOf[js.Any], listPublicEventsForUser = listPublicEventsForUser.asInstanceOf[js.Any], listReceivedEventsForUser = listReceivedEventsForUser.asInstanceOf[js.Any], listReceivedPublicEventsForUser = listReceivedPublicEventsForUser.asInstanceOf[js.Any], listRepoEvents = listRepoEvents.asInstanceOf[js.Any], listReposStarredByAuthenticatedUser = listReposStarredByAuthenticatedUser.asInstanceOf[js.Any], listReposStarredByUser = listReposStarredByUser.asInstanceOf[js.Any], listReposWatchedByUser = listReposWatchedByUser.asInstanceOf[js.Any], listStargazersForRepo = listStargazersForRepo.asInstanceOf[js.Any], listWatchedReposForAuthenticatedUser = listWatchedReposForAuthenticatedUser.asInstanceOf[js.Any], listWatchersForRepo = listWatchersForRepo.asInstanceOf[js.Any], markAsRead = markAsRead.asInstanceOf[js.Any], markNotificationsAsReadForRepo = markNotificationsAsReadForRepo.asInstanceOf[js.Any], markThreadAsRead = markThreadAsRead.asInstanceOf[js.Any], setRepoSubscription = setRepoSubscription.asInstanceOf[js.Any], setThreadSubscription = setThreadSubscription.asInstanceOf[js.Any], starRepo = starRepo.asInstanceOf[js.Any], unstarRepo = unstarRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckStarringRepo]
  }
}


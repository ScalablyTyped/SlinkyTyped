package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckStarringRepo extends js.Object {
  var checkStarringRepo: AnonUrl = js.native
  var deleteRepoSubscription: AnonUrl = js.native
  var deleteThreadSubscription: AnonParamsAnonThreadid = js.native
  var getRepoSubscription: AnonUrl = js.native
  var getThread: AnonParamsAnonThreadid = js.native
  var getThreadSubscription: AnonParamsAnonThreadid = js.native
  var listEventsForOrg: AnonParamsAnonOrg = js.native
  var listEventsForUser: AnonParamsAnonUsername = js.native
  var listFeeds: AnonUrlString = js.native
  var listNotifications: AnonParamsAnonAll = js.native
  var listNotificationsForRepo: AnonParamsAnonBefore = js.native
  var listPublicEvents: AnonParamsAnonPagePerpage = js.native
  var listPublicEventsForOrg: AnonParamsAnonOrgPage = js.native
  var listPublicEventsForRepoNetwork: AnonParamsAnonOwnerPage = js.native
  var listPublicEventsForUser: AnonParamsAnonUsername = js.native
  var listReceivedEventsForUser: AnonParamsAnonUsername = js.native
  var listReceivedPublicEventsForUser: AnonParamsAnonUsername = js.native
  var listRepoEvents: AnonParamsAnonOwnerPage = js.native
  var listReposStarredByAuthenticatedUser: AnonParamsAnonDirection = js.native
  var listReposStarredByUser: AnonParamsAnonSort = js.native
  var listReposWatchedByUser: AnonParamsAnonUsername = js.native
  var listStargazersForRepo: AnonParamsAnonOwnerPage = js.native
  var listWatchedReposForAuthenticatedUser: AnonParamsAnonPagePerpage = js.native
  var listWatchersForRepo: AnonParamsAnonOwnerPage = js.native
  var markAsRead: AnonParamsAnonLastreadat = js.native
  var markNotificationsAsReadForRepo: AnonParamsAnonLastreadatOwner = js.native
  var markThreadAsRead: AnonParamsAnonThreadid = js.native
  var setRepoSubscription: AnonParamsAnonIgnored = js.native
  var setThreadSubscription: AnonParamsAnonIgnoredThreadid = js.native
  var starRepo: AnonUrl = js.native
  var unstarRepo: AnonUrl = js.native
}

object AnonCheckStarringRepo {
  @scala.inline
  def apply(
    checkStarringRepo: AnonUrl,
    deleteRepoSubscription: AnonUrl,
    deleteThreadSubscription: AnonParamsAnonThreadid,
    getRepoSubscription: AnonUrl,
    getThread: AnonParamsAnonThreadid,
    getThreadSubscription: AnonParamsAnonThreadid,
    listEventsForOrg: AnonParamsAnonOrg,
    listEventsForUser: AnonParamsAnonUsername,
    listFeeds: AnonUrlString,
    listNotifications: AnonParamsAnonAll,
    listNotificationsForRepo: AnonParamsAnonBefore,
    listPublicEvents: AnonParamsAnonPagePerpage,
    listPublicEventsForOrg: AnonParamsAnonOrgPage,
    listPublicEventsForRepoNetwork: AnonParamsAnonOwnerPage,
    listPublicEventsForUser: AnonParamsAnonUsername,
    listReceivedEventsForUser: AnonParamsAnonUsername,
    listReceivedPublicEventsForUser: AnonParamsAnonUsername,
    listRepoEvents: AnonParamsAnonOwnerPage,
    listReposStarredByAuthenticatedUser: AnonParamsAnonDirection,
    listReposStarredByUser: AnonParamsAnonSort,
    listReposWatchedByUser: AnonParamsAnonUsername,
    listStargazersForRepo: AnonParamsAnonOwnerPage,
    listWatchedReposForAuthenticatedUser: AnonParamsAnonPagePerpage,
    listWatchersForRepo: AnonParamsAnonOwnerPage,
    markAsRead: AnonParamsAnonLastreadat,
    markNotificationsAsReadForRepo: AnonParamsAnonLastreadatOwner,
    markThreadAsRead: AnonParamsAnonThreadid,
    setRepoSubscription: AnonParamsAnonIgnored,
    setThreadSubscription: AnonParamsAnonIgnoredThreadid,
    starRepo: AnonUrl,
    unstarRepo: AnonUrl
  ): AnonCheckStarringRepo = {
    val __obj = js.Dynamic.literal(checkStarringRepo = checkStarringRepo.asInstanceOf[js.Any], deleteRepoSubscription = deleteRepoSubscription.asInstanceOf[js.Any], deleteThreadSubscription = deleteThreadSubscription.asInstanceOf[js.Any], getRepoSubscription = getRepoSubscription.asInstanceOf[js.Any], getThread = getThread.asInstanceOf[js.Any], getThreadSubscription = getThreadSubscription.asInstanceOf[js.Any], listEventsForOrg = listEventsForOrg.asInstanceOf[js.Any], listEventsForUser = listEventsForUser.asInstanceOf[js.Any], listFeeds = listFeeds.asInstanceOf[js.Any], listNotifications = listNotifications.asInstanceOf[js.Any], listNotificationsForRepo = listNotificationsForRepo.asInstanceOf[js.Any], listPublicEvents = listPublicEvents.asInstanceOf[js.Any], listPublicEventsForOrg = listPublicEventsForOrg.asInstanceOf[js.Any], listPublicEventsForRepoNetwork = listPublicEventsForRepoNetwork.asInstanceOf[js.Any], listPublicEventsForUser = listPublicEventsForUser.asInstanceOf[js.Any], listReceivedEventsForUser = listReceivedEventsForUser.asInstanceOf[js.Any], listReceivedPublicEventsForUser = listReceivedPublicEventsForUser.asInstanceOf[js.Any], listRepoEvents = listRepoEvents.asInstanceOf[js.Any], listReposStarredByAuthenticatedUser = listReposStarredByAuthenticatedUser.asInstanceOf[js.Any], listReposStarredByUser = listReposStarredByUser.asInstanceOf[js.Any], listReposWatchedByUser = listReposWatchedByUser.asInstanceOf[js.Any], listStargazersForRepo = listStargazersForRepo.asInstanceOf[js.Any], listWatchedReposForAuthenticatedUser = listWatchedReposForAuthenticatedUser.asInstanceOf[js.Any], listWatchersForRepo = listWatchersForRepo.asInstanceOf[js.Any], markAsRead = markAsRead.asInstanceOf[js.Any], markNotificationsAsReadForRepo = markNotificationsAsReadForRepo.asInstanceOf[js.Any], markThreadAsRead = markThreadAsRead.asInstanceOf[js.Any], setRepoSubscription = setRepoSubscription.asInstanceOf[js.Any], setThreadSubscription = setThreadSubscription.asInstanceOf[js.Any], starRepo = starRepo.asInstanceOf[js.Any], unstarRepo = unstarRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckStarringRepo]
  }
  @scala.inline
  implicit class AnonCheckStarringRepoOps[Self <: AnonCheckStarringRepo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckStarringRepo(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkStarringRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteRepoSubscription(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRepoSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteThreadSubscription(value: AnonParamsAnonThreadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteThreadSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRepoSubscription(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRepoSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetThread(value: AnonParamsAnonThreadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetThreadSubscription(value: AnonParamsAnonThreadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThreadSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEventsForOrg(value: AnonParamsAnonOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listEventsForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEventsForUser(value: AnonParamsAnonUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listEventsForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFeeds(value: AnonUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFeeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListNotifications(value: AnonParamsAnonAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListNotificationsForRepo(value: AnonParamsAnonBefore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listNotificationsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicEvents(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicEventsForOrg(value: AnonParamsAnonOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicEventsForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicEventsForRepoNetwork(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicEventsForRepoNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicEventsForUser(value: AnonParamsAnonUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicEventsForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReceivedEventsForUser(value: AnonParamsAnonUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReceivedEventsForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReceivedPublicEventsForUser(value: AnonParamsAnonUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReceivedPublicEventsForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRepoEvents(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRepoEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposStarredByAuthenticatedUser(value: AnonParamsAnonDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposStarredByAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposStarredByUser(value: AnonParamsAnonSort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposStarredByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposWatchedByUser(value: AnonParamsAnonUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposWatchedByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListStargazersForRepo(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStargazersForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWatchedReposForAuthenticatedUser(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWatchedReposForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWatchersForRepo(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWatchersForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkAsRead(value: AnonParamsAnonLastreadat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAsRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkNotificationsAsReadForRepo(value: AnonParamsAnonLastreadatOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markNotificationsAsReadForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkThreadAsRead(value: AnonParamsAnonThreadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markThreadAsRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetRepoSubscription(value: AnonParamsAnonIgnored): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRepoSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetThreadSubscription(value: AnonParamsAnonIgnoredThreadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThreadSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarRepo(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnstarRepo(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstarRepo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


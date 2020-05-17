package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckStarringRepo extends js.Object {
  var checkStarringRepo: Url = js.native
  var deleteRepoSubscription: Url = js.native
  var deleteThreadSubscription: ParamsThreadid = js.native
  var getRepoSubscription: Url = js.native
  var getThread: ParamsThreadid = js.native
  var getThreadSubscription: ParamsThreadid = js.native
  var listEventsForOrg: ParamsOrg = js.native
  var listEventsForUser: ParamsUsername = js.native
  var listFeeds: UrlString = js.native
  var listNotifications: ParamsAll = js.native
  var listNotificationsForRepo: ParamsBefore = js.native
  var listPublicEvents: ParamsPagePerpage = js.native
  var listPublicEventsForOrg: ParamsOrgPage = js.native
  var listPublicEventsForRepoNetwork: ParamsOwnerPage = js.native
  var listPublicEventsForUser: ParamsUsername = js.native
  var listReceivedEventsForUser: ParamsUsername = js.native
  var listReceivedPublicEventsForUser: ParamsUsername = js.native
  var listRepoEvents: ParamsOwnerPage = js.native
  var listReposStarredByAuthenticatedUser: ParamsDirection = js.native
  var listReposStarredByUser: ParamsSort = js.native
  var listReposWatchedByUser: ParamsUsername = js.native
  var listStargazersForRepo: ParamsOwnerPage = js.native
  var listWatchedReposForAuthenticatedUser: ParamsPagePerpage = js.native
  var listWatchersForRepo: ParamsOwnerPage = js.native
  var markAsRead: ParamsLastreadat = js.native
  var markNotificationsAsReadForRepo: ParamsLastreadatOwner = js.native
  var markThreadAsRead: ParamsThreadid = js.native
  var setRepoSubscription: ParamsIgnored = js.native
  var setThreadSubscription: ParamsIgnoredThreadid = js.native
  var starRepo: Url = js.native
  var unstarRepo: Url = js.native
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
  @scala.inline
  implicit class CheckStarringRepoOps[Self <: CheckStarringRepo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckStarringRepo(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkStarringRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteRepoSubscription(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRepoSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteThreadSubscription(value: ParamsThreadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteThreadSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRepoSubscription(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRepoSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetThread(value: ParamsThreadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetThreadSubscription(value: ParamsThreadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThreadSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEventsForOrg(value: ParamsOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listEventsForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEventsForUser(value: ParamsUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listEventsForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFeeds(value: UrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFeeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListNotifications(value: ParamsAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListNotificationsForRepo(value: ParamsBefore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listNotificationsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicEvents(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicEventsForOrg(value: ParamsOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicEventsForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicEventsForRepoNetwork(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicEventsForRepoNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicEventsForUser(value: ParamsUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicEventsForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReceivedEventsForUser(value: ParamsUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReceivedEventsForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReceivedPublicEventsForUser(value: ParamsUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReceivedPublicEventsForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRepoEvents(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRepoEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposStarredByAuthenticatedUser(value: ParamsDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposStarredByAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposStarredByUser(value: ParamsSort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposStarredByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposWatchedByUser(value: ParamsUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposWatchedByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListStargazersForRepo(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStargazersForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWatchedReposForAuthenticatedUser(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWatchedReposForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWatchersForRepo(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWatchersForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkAsRead(value: ParamsLastreadat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAsRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkNotificationsAsReadForRepo(value: ParamsLastreadatOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markNotificationsAsReadForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkThreadAsRead(value: ParamsThreadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markThreadAsRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetRepoSubscription(value: ParamsIgnored): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRepoSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetThreadSubscription(value: ParamsIgnoredThreadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThreadSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarRepo(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnstarRepo(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstarRepo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


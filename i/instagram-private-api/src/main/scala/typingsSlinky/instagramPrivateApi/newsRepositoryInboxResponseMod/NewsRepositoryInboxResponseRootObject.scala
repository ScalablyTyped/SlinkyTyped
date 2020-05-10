package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewsRepositoryInboxResponseRootObject extends js.Object {
  var ads_manager: NewsRepositoryInboxResponseAdsManager = js.native
  var aymf: NewsRepositoryInboxResponseAymf = js.native
  var business_profile_reminder: NewsRepositoryInboxResponseBusinessProfileReminder = js.native
  var continuation_token: Double = js.native
  var counts: NewsRepositoryInboxResponseCounts = js.native
  var friend_request_stories: js.Array[_] = js.native
  var new_stories: js.Array[NewsRepositoryInboxResponseNewStoriesItem] = js.native
  var old_stories: js.Array[NewsRepositoryInboxResponseOldStoriesItem] = js.native
  var partition: NewsRepositoryInboxResponsePartition = js.native
  var status: String = js.native
  var subscription: js.Any = js.native
}

object NewsRepositoryInboxResponseRootObject {
  @scala.inline
  def apply(
    ads_manager: NewsRepositoryInboxResponseAdsManager,
    aymf: NewsRepositoryInboxResponseAymf,
    business_profile_reminder: NewsRepositoryInboxResponseBusinessProfileReminder,
    continuation_token: Double,
    counts: NewsRepositoryInboxResponseCounts,
    friend_request_stories: js.Array[_],
    new_stories: js.Array[NewsRepositoryInboxResponseNewStoriesItem],
    old_stories: js.Array[NewsRepositoryInboxResponseOldStoriesItem],
    partition: NewsRepositoryInboxResponsePartition,
    status: String,
    subscription: js.Any
  ): NewsRepositoryInboxResponseRootObject = {
    val __obj = js.Dynamic.literal(ads_manager = ads_manager.asInstanceOf[js.Any], aymf = aymf.asInstanceOf[js.Any], business_profile_reminder = business_profile_reminder.asInstanceOf[js.Any], continuation_token = continuation_token.asInstanceOf[js.Any], counts = counts.asInstanceOf[js.Any], friend_request_stories = friend_request_stories.asInstanceOf[js.Any], new_stories = new_stories.asInstanceOf[js.Any], old_stories = old_stories.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseRootObject]
  }
  @scala.inline
  implicit class NewsRepositoryInboxResponseRootObjectOps[Self <: NewsRepositoryInboxResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAds_manager(value: NewsRepositoryInboxResponseAdsManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ads_manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAymf(value: NewsRepositoryInboxResponseAymf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aymf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusiness_profile_reminder(value: NewsRepositoryInboxResponseBusinessProfileReminder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_profile_reminder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinuation_token(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuation_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounts(value: NewsRepositoryInboxResponseCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriend_request_stories(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friend_request_stories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNew_stories(value: js.Array[NewsRepositoryInboxResponseNewStoriesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_stories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOld_stories(value: js.Array[NewsRepositoryInboxResponseOldStoriesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old_stories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartition(value: NewsRepositoryInboxResponsePartition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


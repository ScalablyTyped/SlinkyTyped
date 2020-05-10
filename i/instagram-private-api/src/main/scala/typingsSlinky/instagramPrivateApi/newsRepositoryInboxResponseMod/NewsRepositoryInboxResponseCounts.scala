package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewsRepositoryInboxResponseCounts extends js.Object {
  var campaign_notification: js.UndefOr[Double] = js.native
  var comment_likes: js.UndefOr[Double] = js.native
  var comments: js.UndefOr[Double] = js.native
  var likes: js.UndefOr[Double] = js.native
  var photos_of_you: js.UndefOr[Double] = js.native
  var relationships: js.UndefOr[Double] = js.native
  var requests: js.UndefOr[Double] = js.native
  var usertags: js.UndefOr[Double] = js.native
}

object NewsRepositoryInboxResponseCounts {
  @scala.inline
  def apply(): NewsRepositoryInboxResponseCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewsRepositoryInboxResponseCounts]
  }
  @scala.inline
  implicit class NewsRepositoryInboxResponseCountsOps[Self <: NewsRepositoryInboxResponseCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaign_notification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaign_notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaign_notification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaign_notification")(js.undefined)
        ret
    }
    @scala.inline
    def withComment_likes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_likes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_likes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_likes")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withLikes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLikes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likes")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotos_of_you(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos_of_you")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotos_of_you: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos_of_you")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationships(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationships")(js.undefined)
        ret
    }
    @scala.inline
    def withRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
    @scala.inline
    def withUsertags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usertags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsertags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usertags")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewsListResponse extends js.Object {
  var pageInfo: js.UndefOr[PageInfo] = js.native
  var reviews: js.UndefOr[js.Array[Review]] = js.native
  var tokenPagination: js.UndefOr[TokenPagination] = js.native
}

object ReviewsListResponse {
  @scala.inline
  def apply(): ReviewsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewsListResponse]
  }
  @scala.inline
  implicit class ReviewsListResponseOps[Self <: ReviewsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageInfo(value: PageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withReviews(value: js.Array[Review]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviews")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenPagination(value: TokenPagination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenPagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenPagination")(js.undefined)
        ret
    }
  }
  
}


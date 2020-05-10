package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReviewsListResponse extends js.Object {
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.native
  var reviews: js.UndefOr[js.Array[SchemaReview]] = js.native
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.native
}

object SchemaReviewsListResponse {
  @scala.inline
  def apply(): SchemaReviewsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewsListResponse]
  }
  @scala.inline
  implicit class SchemaReviewsListResponseOps[Self <: SchemaReviewsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageInfo(value: SchemaPageInfo): Self = {
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
    def withReviews(value: js.Array[SchemaReview]): Self = {
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
    def withTokenPagination(value: SchemaTokenPagination): Self = {
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


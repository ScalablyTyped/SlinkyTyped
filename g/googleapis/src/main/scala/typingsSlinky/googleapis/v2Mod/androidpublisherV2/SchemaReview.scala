package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReview extends js.Object {
  /**
    * The name of the user who wrote the review.
    */
  var authorName: js.UndefOr[String] = js.native
  /**
    * A repeated field containing comments for the review.
    */
  var comments: js.UndefOr[js.Array[SchemaComment]] = js.native
  /**
    * Unique identifier for this review.
    */
  var reviewId: js.UndefOr[String] = js.native
}

object SchemaReview {
  @scala.inline
  def apply(): SchemaReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReview]
  }
  @scala.inline
  implicit class SchemaReviewOps[Self <: SchemaReview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorName")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: js.Array[SchemaComment]): Self = {
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
    def withReviewId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviewId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewId")(js.undefined)
        ret
    }
  }
  
}


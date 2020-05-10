package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReviewsReplyResponse extends js.Object {
  var result: js.UndefOr[SchemaReviewReplyResult] = js.native
}

object SchemaReviewsReplyResponse {
  @scala.inline
  def apply(): SchemaReviewsReplyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewsReplyResponse]
  }
  @scala.inline
  implicit class SchemaReviewsReplyResponseOps[Self <: SchemaReviewsReplyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: SchemaReviewReplyResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}


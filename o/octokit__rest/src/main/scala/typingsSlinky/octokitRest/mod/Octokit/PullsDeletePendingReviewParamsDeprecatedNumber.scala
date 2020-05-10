package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsDeletePendingReviewParamsDeprecatedNumber extends js.Object {
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double = js.native
  var owner: String = js.native
  var repo: String = js.native
  var review_id: Double = js.native
}

object PullsDeletePendingReviewParamsDeprecatedNumber {
  @scala.inline
  def apply(number: Double, owner: String, repo: String, review_id: Double): PullsDeletePendingReviewParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDeletePendingReviewParamsDeprecatedNumber]
  }
  @scala.inline
  implicit class PullsDeletePendingReviewParamsDeprecatedNumberOps[Self <: PullsDeletePendingReviewParamsDeprecatedNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


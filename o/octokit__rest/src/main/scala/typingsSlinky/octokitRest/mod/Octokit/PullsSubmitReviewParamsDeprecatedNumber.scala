package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.APPROVE
import typingsSlinky.octokitRest.octokitRestStrings.COMMENT
import typingsSlinky.octokitRest.octokitRestStrings.REQUEST_CHANGES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsSubmitReviewParamsDeprecatedNumber extends js.Object {
  /**
    * The body text of the pull request review
    */
  var body: js.UndefOr[String] = js.native
  /**
    * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.
    */
  var event: APPROVE | REQUEST_CHANGES | COMMENT = js.native
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double = js.native
  var owner: String = js.native
  var repo: String = js.native
  var review_id: Double = js.native
}

object PullsSubmitReviewParamsDeprecatedNumber {
  @scala.inline
  def apply(
    event: APPROVE | REQUEST_CHANGES | COMMENT,
    number: Double,
    owner: String,
    repo: String,
    review_id: Double
  ): PullsSubmitReviewParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsSubmitReviewParamsDeprecatedNumber]
  }
  @scala.inline
  implicit class PullsSubmitReviewParamsDeprecatedNumberOps[Self <: PullsSubmitReviewParamsDeprecatedNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: APPROVE | REQUEST_CHANGES | COMMENT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
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
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
  }
  
}


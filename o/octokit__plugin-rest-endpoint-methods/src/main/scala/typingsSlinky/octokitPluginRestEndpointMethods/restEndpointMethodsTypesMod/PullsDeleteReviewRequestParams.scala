package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsDeleteReviewRequestParams extends js.Object {
  var owner: String = js.native
  var pull_number: Double = js.native
  var repo: String = js.native
  /**
    * An array of user `login`s that will be removed.
    */
  var reviewers: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array of team `slug`s that will be removed.
    */
  var team_reviewers: js.UndefOr[js.Array[String]] = js.native
}

object PullsDeleteReviewRequestParams {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String): PullsDeleteReviewRequestParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDeleteReviewRequestParams]
  }
  @scala.inline
  implicit class PullsDeleteReviewRequestParamsOps[Self <: PullsDeleteReviewRequestParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviewers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewers")(js.undefined)
        ret
    }
    @scala.inline
    def withTeam_reviewers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_reviewers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeam_reviewers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_reviewers")(js.undefined)
        ret
    }
  }
  
}


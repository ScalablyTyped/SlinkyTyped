package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reviewers extends js.Object {
  var number: Alias = js.native
  var owner: Required = js.native
  var pull_number: Required = js.native
  var repo: Required = js.native
  var reviewers: Type = js.native
  var team_reviewers: Type = js.native
}

object Reviewers {
  @scala.inline
  def apply(
    number: Alias,
    owner: Required,
    pull_number: Required,
    repo: Required,
    reviewers: Type,
    team_reviewers: Type
  ): Reviewers = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], reviewers = reviewers.asInstanceOf[js.Any], team_reviewers = team_reviewers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reviewers]
  }
  @scala.inline
  implicit class ReviewersOps[Self <: Reviewers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumber(value: Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_number(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewers(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_reviewers(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_reviewers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


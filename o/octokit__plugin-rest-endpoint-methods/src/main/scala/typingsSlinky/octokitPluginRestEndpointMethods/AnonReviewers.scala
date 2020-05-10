package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReviewers extends js.Object {
  var number: AnonAlias = js.native
  var owner: AnonRequired = js.native
  var pull_number: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var reviewers: AnonType = js.native
  var team_reviewers: AnonType = js.native
}

object AnonReviewers {
  @scala.inline
  def apply(
    number: AnonAlias,
    owner: AnonRequired,
    pull_number: AnonRequired,
    repo: AnonRequired,
    reviewers: AnonType,
    team_reviewers: AnonType
  ): AnonReviewers = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], reviewers = reviewers.asInstanceOf[js.Any], team_reviewers = team_reviewers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReviewers]
  }
  @scala.inline
  implicit class AnonReviewersOps[Self <: AnonReviewers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumber(value: AnonAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_number(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewers(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_reviewers(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_reviewers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


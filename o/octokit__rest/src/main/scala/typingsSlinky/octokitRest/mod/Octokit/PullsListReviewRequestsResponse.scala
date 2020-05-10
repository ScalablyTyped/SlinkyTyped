package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsListReviewRequestsResponse extends js.Object {
  var teams: js.Array[PullsListReviewRequestsResponseTeamsItem] = js.native
  var users: js.Array[PullsListReviewRequestsResponseUsersItem] = js.native
}

object PullsListReviewRequestsResponse {
  @scala.inline
  def apply(
    teams: js.Array[PullsListReviewRequestsResponseTeamsItem],
    users: js.Array[PullsListReviewRequestsResponseUsersItem]
  ): PullsListReviewRequestsResponse = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListReviewRequestsResponse]
  }
  @scala.inline
  implicit class PullsListReviewRequestsResponseOps[Self <: PullsListReviewRequestsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTeams(value: js.Array[PullsListReviewRequestsResponseTeamsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[PullsListReviewRequestsResponseUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


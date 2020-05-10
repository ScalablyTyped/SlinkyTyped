package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.issue
import typingsSlinky.octokitRest.octokitRestStrings.organization
import typingsSlinky.octokitRest.octokitRestStrings.pull_request
import typingsSlinky.octokitRest.octokitRestStrings.repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersGetContextForUserParams extends js.Object {
  /**
    * Uses the ID for the `subject_type` you specified. **Required** when using `subject_type`.
    */
  var subject_id: js.UndefOr[String] = js.native
  /**
    * Identifies which additional information you'd like to receive about the person's hovercard. Can be `organization`, `repository`, `issue`, `pull_request`. **Required** when using `subject_id`.
    */
  var subject_type: js.UndefOr[organization | repository | issue | pull_request] = js.native
  var username: String = js.native
}

object UsersGetContextForUserParams {
  @scala.inline
  def apply(username: String): UsersGetContextForUserParams = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetContextForUserParams]
  }
  @scala.inline
  implicit class UsersGetContextForUserParamsOps[Self <: UsersGetContextForUserParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject_type(value: organization | repository | issue | pull_request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject_type")(js.undefined)
        ret
    }
  }
  
}


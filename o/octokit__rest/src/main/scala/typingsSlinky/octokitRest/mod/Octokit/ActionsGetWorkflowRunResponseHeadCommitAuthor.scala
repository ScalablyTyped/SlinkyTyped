package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsGetWorkflowRunResponseHeadCommitAuthor extends js.Object {
  var email: String = js.native
  var name: String = js.native
}

object ActionsGetWorkflowRunResponseHeadCommitAuthor {
  @scala.inline
  def apply(email: String, name: String): ActionsGetWorkflowRunResponseHeadCommitAuthor = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowRunResponseHeadCommitAuthor]
  }
  @scala.inline
  implicit class ActionsGetWorkflowRunResponseHeadCommitAuthorOps[Self <: ActionsGetWorkflowRunResponseHeadCommitAuthor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsGetWorkflowRunResponseHeadCommit extends js.Object {
  var author: ActionsGetWorkflowRunResponseHeadCommitAuthor = js.native
  var committer: ActionsGetWorkflowRunResponseHeadCommitCommitter = js.native
  var id: String = js.native
  var message: String = js.native
  var timestamp: String = js.native
  var tree_id: String = js.native
}

object ActionsGetWorkflowRunResponseHeadCommit {
  @scala.inline
  def apply(
    author: ActionsGetWorkflowRunResponseHeadCommitAuthor,
    committer: ActionsGetWorkflowRunResponseHeadCommitCommitter,
    id: String,
    message: String,
    timestamp: String,
    tree_id: String
  ): ActionsGetWorkflowRunResponseHeadCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tree_id = tree_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowRunResponseHeadCommit]
  }
  @scala.inline
  implicit class ActionsGetWorkflowRunResponseHeadCommitOps[Self <: ActionsGetWorkflowRunResponseHeadCommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: ActionsGetWorkflowRunResponseHeadCommitAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: ActionsGetWorkflowRunResponseHeadCommitCommitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


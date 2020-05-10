package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommit extends js.Object {
  var author: ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommitAuthor = js.native
  var committer: ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommitCommitter = js.native
  var id: String = js.native
  var message: String = js.native
  var timestamp: String = js.native
  var tree_id: String = js.native
}

object ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommit {
  @scala.inline
  def apply(
    author: ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommitAuthor,
    committer: ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommitCommitter,
    id: String,
    message: String,
    timestamp: String,
    tree_id: String
  ): ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tree_id = tree_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommit]
  }
  @scala.inline
  implicit class ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommitOps[Self <: ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommitAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommitCommitter): Self = {
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


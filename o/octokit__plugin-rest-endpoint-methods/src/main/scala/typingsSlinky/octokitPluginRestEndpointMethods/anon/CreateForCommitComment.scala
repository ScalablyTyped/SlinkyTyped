package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateForCommitComment extends js.Object {
  var createForCommitComment: ParamsCommentidContent = js.native
  var createForIssue: ParamsContentIssuenumber = js.native
  var createForIssueComment: ParamsCommentidContent = js.native
  var createForPullRequestReviewComment: ParamsCommentidContent = js.native
  var createForTeamDiscussion: ParamsDiscussionnumber = js.native
  var createForTeamDiscussionComment: ParamsCommentnumber = js.native
  var createForTeamDiscussionCommentInOrg: ParamsTeamslug = js.native
  var createForTeamDiscussionCommentLegacy: ParamsCommentnumber = js.native
  var createForTeamDiscussionInOrg: ParamsContentDiscussionnumber = js.native
  var createForTeamDiscussionLegacy: ParamsDiscussionnumber = js.native
  var delete: ParamsReactionid = js.native
  var listForCommitComment: ParamsContentOwner = js.native
  var listForIssue: ParamsContentIssuenumberNumber = js.native
  var listForIssueComment: ParamsContentOwner = js.native
  var listForPullRequestReviewComment: ParamsContentOwner = js.native
  var listForTeamDiscussion: ParamsTeamid = js.native
  var listForTeamDiscussionComment: ParamsCommentnumberContent = js.native
  var listForTeamDiscussionCommentInOrg: ParamsDiscussionnumberOrg = js.native
  var listForTeamDiscussionCommentLegacy: ParamsCommentnumberContent = js.native
  var listForTeamDiscussionInOrg: ParamsPerpageTeamslug = js.native
  var listForTeamDiscussionLegacy: ParamsTeamid = js.native
}

object CreateForCommitComment {
  @scala.inline
  def apply(
    createForCommitComment: ParamsCommentidContent,
    createForIssue: ParamsContentIssuenumber,
    createForIssueComment: ParamsCommentidContent,
    createForPullRequestReviewComment: ParamsCommentidContent,
    createForTeamDiscussion: ParamsDiscussionnumber,
    createForTeamDiscussionComment: ParamsCommentnumber,
    createForTeamDiscussionCommentInOrg: ParamsTeamslug,
    createForTeamDiscussionCommentLegacy: ParamsCommentnumber,
    createForTeamDiscussionInOrg: ParamsContentDiscussionnumber,
    createForTeamDiscussionLegacy: ParamsDiscussionnumber,
    delete: ParamsReactionid,
    listForCommitComment: ParamsContentOwner,
    listForIssue: ParamsContentIssuenumberNumber,
    listForIssueComment: ParamsContentOwner,
    listForPullRequestReviewComment: ParamsContentOwner,
    listForTeamDiscussion: ParamsTeamid,
    listForTeamDiscussionComment: ParamsCommentnumberContent,
    listForTeamDiscussionCommentInOrg: ParamsDiscussionnumberOrg,
    listForTeamDiscussionCommentLegacy: ParamsCommentnumberContent,
    listForTeamDiscussionInOrg: ParamsPerpageTeamslug,
    listForTeamDiscussionLegacy: ParamsTeamid
  ): CreateForCommitComment = {
    val __obj = js.Dynamic.literal(createForCommitComment = createForCommitComment.asInstanceOf[js.Any], createForIssue = createForIssue.asInstanceOf[js.Any], createForIssueComment = createForIssueComment.asInstanceOf[js.Any], createForPullRequestReviewComment = createForPullRequestReviewComment.asInstanceOf[js.Any], createForTeamDiscussion = createForTeamDiscussion.asInstanceOf[js.Any], createForTeamDiscussionComment = createForTeamDiscussionComment.asInstanceOf[js.Any], createForTeamDiscussionCommentInOrg = createForTeamDiscussionCommentInOrg.asInstanceOf[js.Any], createForTeamDiscussionCommentLegacy = createForTeamDiscussionCommentLegacy.asInstanceOf[js.Any], createForTeamDiscussionInOrg = createForTeamDiscussionInOrg.asInstanceOf[js.Any], createForTeamDiscussionLegacy = createForTeamDiscussionLegacy.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], listForCommitComment = listForCommitComment.asInstanceOf[js.Any], listForIssue = listForIssue.asInstanceOf[js.Any], listForIssueComment = listForIssueComment.asInstanceOf[js.Any], listForPullRequestReviewComment = listForPullRequestReviewComment.asInstanceOf[js.Any], listForTeamDiscussion = listForTeamDiscussion.asInstanceOf[js.Any], listForTeamDiscussionComment = listForTeamDiscussionComment.asInstanceOf[js.Any], listForTeamDiscussionCommentInOrg = listForTeamDiscussionCommentInOrg.asInstanceOf[js.Any], listForTeamDiscussionCommentLegacy = listForTeamDiscussionCommentLegacy.asInstanceOf[js.Any], listForTeamDiscussionInOrg = listForTeamDiscussionInOrg.asInstanceOf[js.Any], listForTeamDiscussionLegacy = listForTeamDiscussionLegacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateForCommitComment]
  }
  @scala.inline
  implicit class CreateForCommitCommentOps[Self <: CreateForCommitComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateForCommitComment(value: ParamsCommentidContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForIssue(value: ParamsContentIssuenumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForIssue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForIssueComment(value: ParamsCommentidContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForIssueComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForPullRequestReviewComment(value: ParamsCommentidContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForPullRequestReviewComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussion(value: ParamsDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussionComment(value: ParamsCommentnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussionCommentInOrg(value: ParamsTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussionCommentLegacy(value: ParamsCommentnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussionInOrg(value: ParamsContentDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussionLegacy(value: ParamsDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: ParamsReactionid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForCommitComment(value: ParamsContentOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForIssue(value: ParamsContentIssuenumberNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForIssue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForIssueComment(value: ParamsContentOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForIssueComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForPullRequestReviewComment(value: ParamsContentOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForPullRequestReviewComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussion(value: ParamsTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussionComment(value: ParamsCommentnumberContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussionCommentInOrg(value: ParamsDiscussionnumberOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussionCommentLegacy(value: ParamsCommentnumberContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussionInOrg(value: ParamsPerpageTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussionLegacy(value: ParamsTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


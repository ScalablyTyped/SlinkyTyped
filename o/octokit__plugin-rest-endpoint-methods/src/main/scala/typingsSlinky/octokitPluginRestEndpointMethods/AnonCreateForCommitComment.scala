package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateForCommitComment extends js.Object {
  var createForCommitComment: AnonParamsAnonCommentidContent = js.native
  var createForIssue: AnonParamsAnonContentIssuenumber = js.native
  var createForIssueComment: AnonParamsAnonCommentidContent = js.native
  var createForPullRequestReviewComment: AnonParamsAnonCommentidContent = js.native
  var createForTeamDiscussion: AnonParamsAnonDiscussionnumber = js.native
  var createForTeamDiscussionComment: AnonParamsAnonCommentnumber = js.native
  var createForTeamDiscussionCommentInOrg: AnonParamsAnonTeamslug = js.native
  var createForTeamDiscussionCommentLegacy: AnonParamsAnonCommentnumber = js.native
  var createForTeamDiscussionInOrg: AnonParamsAnonContentDiscussionnumber = js.native
  var createForTeamDiscussionLegacy: AnonParamsAnonDiscussionnumber = js.native
  var delete: AnonParamsAnonReactionid = js.native
  var listForCommitComment: AnonParamsAnonContentOwner = js.native
  var listForIssue: AnonParamsAnonContentIssuenumberNumber = js.native
  var listForIssueComment: AnonParamsAnonContentOwner = js.native
  var listForPullRequestReviewComment: AnonParamsAnonContentOwner = js.native
  var listForTeamDiscussion: AnonParamsAnonTeamid = js.native
  var listForTeamDiscussionComment: AnonParamsAnonCommentnumberContent = js.native
  var listForTeamDiscussionCommentInOrg: AnonParamsAnonDiscussionnumberOrg = js.native
  var listForTeamDiscussionCommentLegacy: AnonParamsAnonCommentnumberContent = js.native
  var listForTeamDiscussionInOrg: AnonParamsAnonPerpageTeamslug = js.native
  var listForTeamDiscussionLegacy: AnonParamsAnonTeamid = js.native
}

object AnonCreateForCommitComment {
  @scala.inline
  def apply(
    createForCommitComment: AnonParamsAnonCommentidContent,
    createForIssue: AnonParamsAnonContentIssuenumber,
    createForIssueComment: AnonParamsAnonCommentidContent,
    createForPullRequestReviewComment: AnonParamsAnonCommentidContent,
    createForTeamDiscussion: AnonParamsAnonDiscussionnumber,
    createForTeamDiscussionComment: AnonParamsAnonCommentnumber,
    createForTeamDiscussionCommentInOrg: AnonParamsAnonTeamslug,
    createForTeamDiscussionCommentLegacy: AnonParamsAnonCommentnumber,
    createForTeamDiscussionInOrg: AnonParamsAnonContentDiscussionnumber,
    createForTeamDiscussionLegacy: AnonParamsAnonDiscussionnumber,
    delete: AnonParamsAnonReactionid,
    listForCommitComment: AnonParamsAnonContentOwner,
    listForIssue: AnonParamsAnonContentIssuenumberNumber,
    listForIssueComment: AnonParamsAnonContentOwner,
    listForPullRequestReviewComment: AnonParamsAnonContentOwner,
    listForTeamDiscussion: AnonParamsAnonTeamid,
    listForTeamDiscussionComment: AnonParamsAnonCommentnumberContent,
    listForTeamDiscussionCommentInOrg: AnonParamsAnonDiscussionnumberOrg,
    listForTeamDiscussionCommentLegacy: AnonParamsAnonCommentnumberContent,
    listForTeamDiscussionInOrg: AnonParamsAnonPerpageTeamslug,
    listForTeamDiscussionLegacy: AnonParamsAnonTeamid
  ): AnonCreateForCommitComment = {
    val __obj = js.Dynamic.literal(createForCommitComment = createForCommitComment.asInstanceOf[js.Any], createForIssue = createForIssue.asInstanceOf[js.Any], createForIssueComment = createForIssueComment.asInstanceOf[js.Any], createForPullRequestReviewComment = createForPullRequestReviewComment.asInstanceOf[js.Any], createForTeamDiscussion = createForTeamDiscussion.asInstanceOf[js.Any], createForTeamDiscussionComment = createForTeamDiscussionComment.asInstanceOf[js.Any], createForTeamDiscussionCommentInOrg = createForTeamDiscussionCommentInOrg.asInstanceOf[js.Any], createForTeamDiscussionCommentLegacy = createForTeamDiscussionCommentLegacy.asInstanceOf[js.Any], createForTeamDiscussionInOrg = createForTeamDiscussionInOrg.asInstanceOf[js.Any], createForTeamDiscussionLegacy = createForTeamDiscussionLegacy.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], listForCommitComment = listForCommitComment.asInstanceOf[js.Any], listForIssue = listForIssue.asInstanceOf[js.Any], listForIssueComment = listForIssueComment.asInstanceOf[js.Any], listForPullRequestReviewComment = listForPullRequestReviewComment.asInstanceOf[js.Any], listForTeamDiscussion = listForTeamDiscussion.asInstanceOf[js.Any], listForTeamDiscussionComment = listForTeamDiscussionComment.asInstanceOf[js.Any], listForTeamDiscussionCommentInOrg = listForTeamDiscussionCommentInOrg.asInstanceOf[js.Any], listForTeamDiscussionCommentLegacy = listForTeamDiscussionCommentLegacy.asInstanceOf[js.Any], listForTeamDiscussionInOrg = listForTeamDiscussionInOrg.asInstanceOf[js.Any], listForTeamDiscussionLegacy = listForTeamDiscussionLegacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreateForCommitComment]
  }
  @scala.inline
  implicit class AnonCreateForCommitCommentOps[Self <: AnonCreateForCommitComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateForCommitComment(value: AnonParamsAnonCommentidContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForIssue(value: AnonParamsAnonContentIssuenumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForIssue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForIssueComment(value: AnonParamsAnonCommentidContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForIssueComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForPullRequestReviewComment(value: AnonParamsAnonCommentidContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForPullRequestReviewComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussion(value: AnonParamsAnonDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussionComment(value: AnonParamsAnonCommentnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussionCommentInOrg(value: AnonParamsAnonTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussionCommentLegacy(value: AnonParamsAnonCommentnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussionInOrg(value: AnonParamsAnonContentDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForTeamDiscussionLegacy(value: AnonParamsAnonDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForTeamDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: AnonParamsAnonReactionid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForCommitComment(value: AnonParamsAnonContentOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForIssue(value: AnonParamsAnonContentIssuenumberNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForIssue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForIssueComment(value: AnonParamsAnonContentOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForIssueComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForPullRequestReviewComment(value: AnonParamsAnonContentOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForPullRequestReviewComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussion(value: AnonParamsAnonTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussionComment(value: AnonParamsAnonCommentnumberContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussionCommentInOrg(value: AnonParamsAnonDiscussionnumberOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussionCommentLegacy(value: AnonParamsAnonCommentnumberContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussionInOrg(value: AnonParamsAnonPerpageTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForTeamDiscussionLegacy(value: AnonParamsAnonTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForTeamDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckIfMerged extends js.Object {
  var checkIfMerged: AnonParamsAnonPullnumber = js.native
  var create: AnonParamsAnonBase = js.native
  var createComment: AnonParamsAnonCommitid = js.native
  var createCommentReply: AnonMethodStringParamsAnonCommitid = js.native
  var createFromIssue: AnonParamsAnonDraft = js.native
  var createReview: AnonParamsAnonComments = js.native
  var createReviewCommentReply: AnonParamsAnonOwnerPullnumber = js.native
  var createReviewRequest: AnonParamsAnonReviewers = js.native
  var deleteComment: AnonParamsAnonCommentidOwner = js.native
  var deletePendingReview: AnonParamsAnonReviewid = js.native
  var deleteReviewRequest: AnonParamsAnonReviewers = js.native
  var dismissReview: AnonParamsAnonMessageNumber = js.native
  var get: AnonParamsAnonPullnumber = js.native
  var getComment: AnonParamsAnonCommentidOwner = js.native
  var getCommentsForReview: AnonParamsAnonPerpagePullnumber = js.native
  var getReview: AnonParamsAnonReviewid = js.native
  var list: AnonParamsAnonHead = js.native
  var listComments: AnonParamsAnonDirectionNumber = js.native
  var listCommentsForRepo: AnonParamsAnonSinceSort = js.native
  var listCommits: AnonParamsAnonPullnumberRepo = js.native
  var listFiles: AnonParamsAnonPullnumberRepo = js.native
  var listReviewRequests: AnonParamsAnonPullnumberRepo = js.native
  var listReviews: AnonParamsAnonPullnumberRepo = js.native
  var merge: AnonParamsAnonCommitmessage = js.native
  var submitReview: AnonParamsAnonEvent = js.native
  var update: AnonParamsAnonMaintainercanmodify = js.native
  var updateBranch: AnonParamsAnonExpectedheadsha = js.native
  var updateComment: AnonParamsAnonOwnerRepo = js.native
  var updateReview: AnonParamsAnonBodyNumber = js.native
}

object AnonCheckIfMerged {
  @scala.inline
  def apply(
    checkIfMerged: AnonParamsAnonPullnumber,
    create: AnonParamsAnonBase,
    createComment: AnonParamsAnonCommitid,
    createCommentReply: AnonMethodStringParamsAnonCommitid,
    createFromIssue: AnonParamsAnonDraft,
    createReview: AnonParamsAnonComments,
    createReviewCommentReply: AnonParamsAnonOwnerPullnumber,
    createReviewRequest: AnonParamsAnonReviewers,
    deleteComment: AnonParamsAnonCommentidOwner,
    deletePendingReview: AnonParamsAnonReviewid,
    deleteReviewRequest: AnonParamsAnonReviewers,
    dismissReview: AnonParamsAnonMessageNumber,
    get: AnonParamsAnonPullnumber,
    getComment: AnonParamsAnonCommentidOwner,
    getCommentsForReview: AnonParamsAnonPerpagePullnumber,
    getReview: AnonParamsAnonReviewid,
    list: AnonParamsAnonHead,
    listComments: AnonParamsAnonDirectionNumber,
    listCommentsForRepo: AnonParamsAnonSinceSort,
    listCommits: AnonParamsAnonPullnumberRepo,
    listFiles: AnonParamsAnonPullnumberRepo,
    listReviewRequests: AnonParamsAnonPullnumberRepo,
    listReviews: AnonParamsAnonPullnumberRepo,
    merge: AnonParamsAnonCommitmessage,
    submitReview: AnonParamsAnonEvent,
    update: AnonParamsAnonMaintainercanmodify,
    updateBranch: AnonParamsAnonExpectedheadsha,
    updateComment: AnonParamsAnonOwnerRepo,
    updateReview: AnonParamsAnonBodyNumber
  ): AnonCheckIfMerged = {
    val __obj = js.Dynamic.literal(checkIfMerged = checkIfMerged.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], createCommentReply = createCommentReply.asInstanceOf[js.Any], createFromIssue = createFromIssue.asInstanceOf[js.Any], createReview = createReview.asInstanceOf[js.Any], createReviewCommentReply = createReviewCommentReply.asInstanceOf[js.Any], createReviewRequest = createReviewRequest.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], deletePendingReview = deletePendingReview.asInstanceOf[js.Any], deleteReviewRequest = deleteReviewRequest.asInstanceOf[js.Any], dismissReview = dismissReview.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getCommentsForReview = getCommentsForReview.asInstanceOf[js.Any], getReview = getReview.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommentsForRepo = listCommentsForRepo.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listFiles = listFiles.asInstanceOf[js.Any], listReviewRequests = listReviewRequests.asInstanceOf[js.Any], listReviews = listReviews.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], submitReview = submitReview.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranch = updateBranch.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any], updateReview = updateReview.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckIfMerged]
  }
  @scala.inline
  implicit class AnonCheckIfMergedOps[Self <: AnonCheckIfMerged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckIfMerged(value: AnonParamsAnonPullnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkIfMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: AnonParamsAnonBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateComment(value: AnonParamsAnonCommitid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateCommentReply(value: AnonMethodStringParamsAnonCommitid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCommentReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFromIssue(value: AnonParamsAnonDraft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromIssue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateReview(value: AnonParamsAnonComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateReviewCommentReply(value: AnonParamsAnonOwnerPullnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReviewCommentReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateReviewRequest(value: AnonParamsAnonReviewers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReviewRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteComment(value: AnonParamsAnonCommentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletePendingReview(value: AnonParamsAnonReviewid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePendingReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteReviewRequest(value: AnonParamsAnonReviewers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteReviewRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissReview(value: AnonParamsAnonMessageNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonParamsAnonPullnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetComment(value: AnonParamsAnonCommentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommentsForReview(value: AnonParamsAnonPerpagePullnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommentsForReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetReview(value: AnonParamsAnonReviewid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonParamsAnonHead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListComments(value: AnonParamsAnonDirectionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommentsForRepo(value: AnonParamsAnonSinceSort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommentsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommits(value: AnonParamsAnonPullnumberRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFiles(value: AnonParamsAnonPullnumberRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReviewRequests(value: AnonParamsAnonPullnumberRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReviewRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReviews(value: AnonParamsAnonPullnumberRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge(value: AnonParamsAnonCommitmessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitReview(value: AnonParamsAnonEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: AnonParamsAnonMaintainercanmodify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateBranch(value: AnonParamsAnonExpectedheadsha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateComment(value: AnonParamsAnonOwnerRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateReview(value: AnonParamsAnonBodyNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateReview")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


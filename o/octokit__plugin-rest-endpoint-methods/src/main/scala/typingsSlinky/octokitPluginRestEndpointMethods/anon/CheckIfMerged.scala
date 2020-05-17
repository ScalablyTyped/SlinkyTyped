package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIfMerged extends js.Object {
  var checkIfMerged: ParamsPullnumber = js.native
  var create: ParamsBase = js.native
  var createComment: ParamsCommitid = js.native
  var createCommentReply: MethodStringParamsCommitid = js.native
  var createFromIssue: ParamsDraft = js.native
  var createReview: ParamsComments = js.native
  var createReviewCommentReply: ParamsOwnerPullnumber = js.native
  var createReviewRequest: ParamsReviewers = js.native
  var deleteComment: ParamsCommentidOwner = js.native
  var deletePendingReview: ParamsReviewid = js.native
  var deleteReviewRequest: ParamsReviewers = js.native
  var dismissReview: ParamsMessageNumber = js.native
  var get: ParamsPullnumber = js.native
  var getComment: ParamsCommentidOwner = js.native
  var getCommentsForReview: ParamsPerpagePullnumber = js.native
  var getReview: ParamsReviewid = js.native
  var list: ParamsHead = js.native
  var listComments: ParamsDirectionNumber = js.native
  var listCommentsForRepo: ParamsSinceSort = js.native
  var listCommits: ParamsPullnumberRepo = js.native
  var listFiles: ParamsPullnumberRepo = js.native
  var listReviewRequests: ParamsPullnumberRepo = js.native
  var listReviews: ParamsPullnumberRepo = js.native
  var merge: ParamsCommitmessage = js.native
  var submitReview: ParamsEvent = js.native
  var update: ParamsMaintainercanmodify = js.native
  var updateBranch: ParamsExpectedheadsha = js.native
  var updateComment: ParamsOwnerRepo = js.native
  var updateReview: ParamsBodyNumber = js.native
}

object CheckIfMerged {
  @scala.inline
  def apply(
    checkIfMerged: ParamsPullnumber,
    create: ParamsBase,
    createComment: ParamsCommitid,
    createCommentReply: MethodStringParamsCommitid,
    createFromIssue: ParamsDraft,
    createReview: ParamsComments,
    createReviewCommentReply: ParamsOwnerPullnumber,
    createReviewRequest: ParamsReviewers,
    deleteComment: ParamsCommentidOwner,
    deletePendingReview: ParamsReviewid,
    deleteReviewRequest: ParamsReviewers,
    dismissReview: ParamsMessageNumber,
    get: ParamsPullnumber,
    getComment: ParamsCommentidOwner,
    getCommentsForReview: ParamsPerpagePullnumber,
    getReview: ParamsReviewid,
    list: ParamsHead,
    listComments: ParamsDirectionNumber,
    listCommentsForRepo: ParamsSinceSort,
    listCommits: ParamsPullnumberRepo,
    listFiles: ParamsPullnumberRepo,
    listReviewRequests: ParamsPullnumberRepo,
    listReviews: ParamsPullnumberRepo,
    merge: ParamsCommitmessage,
    submitReview: ParamsEvent,
    update: ParamsMaintainercanmodify,
    updateBranch: ParamsExpectedheadsha,
    updateComment: ParamsOwnerRepo,
    updateReview: ParamsBodyNumber
  ): CheckIfMerged = {
    val __obj = js.Dynamic.literal(checkIfMerged = checkIfMerged.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], createCommentReply = createCommentReply.asInstanceOf[js.Any], createFromIssue = createFromIssue.asInstanceOf[js.Any], createReview = createReview.asInstanceOf[js.Any], createReviewCommentReply = createReviewCommentReply.asInstanceOf[js.Any], createReviewRequest = createReviewRequest.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], deletePendingReview = deletePendingReview.asInstanceOf[js.Any], deleteReviewRequest = deleteReviewRequest.asInstanceOf[js.Any], dismissReview = dismissReview.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getCommentsForReview = getCommentsForReview.asInstanceOf[js.Any], getReview = getReview.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommentsForRepo = listCommentsForRepo.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listFiles = listFiles.asInstanceOf[js.Any], listReviewRequests = listReviewRequests.asInstanceOf[js.Any], listReviews = listReviews.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], submitReview = submitReview.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranch = updateBranch.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any], updateReview = updateReview.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIfMerged]
  }
  @scala.inline
  implicit class CheckIfMergedOps[Self <: CheckIfMerged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckIfMerged(value: ParamsPullnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkIfMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: ParamsBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateComment(value: ParamsCommitid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateCommentReply(value: MethodStringParamsCommitid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCommentReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFromIssue(value: ParamsDraft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromIssue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateReview(value: ParamsComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateReviewCommentReply(value: ParamsOwnerPullnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReviewCommentReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateReviewRequest(value: ParamsReviewers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReviewRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteComment(value: ParamsCommentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletePendingReview(value: ParamsReviewid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePendingReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteReviewRequest(value: ParamsReviewers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteReviewRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissReview(value: ParamsMessageNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: ParamsPullnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetComment(value: ParamsCommentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommentsForReview(value: ParamsPerpagePullnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommentsForReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetReview(value: ParamsReviewid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: ParamsHead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListComments(value: ParamsDirectionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommentsForRepo(value: ParamsSinceSort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommentsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommits(value: ParamsPullnumberRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFiles(value: ParamsPullnumberRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReviewRequests(value: ParamsPullnumberRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReviewRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReviews(value: ParamsPullnumberRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge(value: ParamsCommitmessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitReview(value: ParamsEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: ParamsMaintainercanmodify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateBranch(value: ParamsExpectedheadsha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateComment(value: ParamsOwnerRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateReview(value: ParamsBodyNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateReview")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIfMerged extends js.Object {
  var checkIfMerged: ParamsPullnumber
  var create: ParamsBase
  var createComment: ParamsCommitid
  var createCommentReply: MethodStringParamsCommitid
  var createFromIssue: ParamsDraft
  var createReview: ParamsComments
  var createReviewCommentReply: ParamsOwnerPullnumber
  var createReviewRequest: ParamsReviewers
  var deleteComment: ParamsCommentidOwner
  var deletePendingReview: ParamsReviewid
  var deleteReviewRequest: ParamsReviewers
  var dismissReview: ParamsMessageNumber
  var get: ParamsPullnumber
  var getComment: ParamsCommentidOwner
  var getCommentsForReview: ParamsPerpagePullnumber
  var getReview: ParamsReviewid
  var list: ParamsHead
  var listComments: ParamsDirectionNumber
  var listCommentsForRepo: ParamsSinceSort
  var listCommits: ParamsPullnumberRepo
  var listFiles: ParamsPullnumberRepo
  var listReviewRequests: ParamsPullnumberRepo
  var listReviews: ParamsPullnumberRepo
  var merge: ParamsCommitmessage
  var submitReview: ParamsEvent
  var update: ParamsMaintainercanmodify
  var updateBranch: ParamsExpectedheadsha
  var updateComment: ParamsOwnerRepo
  var updateReview: ParamsBodyNumber
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
}


package typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.deleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.deleteRepositoryExceptionsUnionMod.DeleteRepositoryExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getBranchExceptionsUnionMod.GetBranchExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getCommentsForComparedCommitExceptionsUnionMod.GetCommentsForComparedCommitExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getCommitExceptionsUnionMod.GetCommitExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getRepositoryExceptionsUnionMod.GetRepositoryExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getRepositoryTriggersExceptionsUnionMod.GetRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.listBranchesExceptionsUnionMod.ListBranchesExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updateDefaultBranchExceptionsUnionMod.UpdateDefaultBranchExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updateRepositoryDescriptionExceptionsUnionMod.UpdateRepositoryDescriptionExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updateRepositoryNameExceptionsUnionMod.UpdateRepositoryNameExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryNameRequiredException
  extends ServiceException[RepositoryNameRequiredExceptionDetails]
     with CreateBranchExceptionsUnion
     with CreatePullRequestExceptionsUnion
     with CreateRepositoryExceptionsUnion
     with DeleteBranchExceptionsUnion
     with DeleteFileExceptionsUnion
     with DeleteRepositoryExceptionsUnion
     with GetBlobExceptionsUnion
     with GetBranchExceptionsUnion
     with GetCommentsForComparedCommitExceptionsUnion
     with GetCommentsForPullRequestExceptionsUnion
     with GetCommitExceptionsUnion
     with GetDifferencesExceptionsUnion
     with GetFileExceptionsUnion
     with GetFolderExceptionsUnion
     with GetMergeConflictsExceptionsUnion
     with GetRepositoryExceptionsUnion
     with GetRepositoryTriggersExceptionsUnion
     with ListBranchesExceptionsUnion
     with ListPullRequestsExceptionsUnion
     with MergePullRequestByFastForwardExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with PutFileExceptionsUnion
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion
     with UpdateDefaultBranchExceptionsUnion
     with UpdateRepositoryDescriptionExceptionsUnion
     with UpdateRepositoryNameExceptionsUnion {
  @JSName("name")
  var name_RepositoryNameRequiredException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameRequiredException = js.native
}

object RepositoryNameRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RepositoryNameRequiredExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameRequiredException
  ): RepositoryNameRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryNameRequiredException]
  }
  @scala.inline
  implicit class RepositoryNameRequiredExceptionOps[Self <: RepositoryNameRequiredException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameRequiredException
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


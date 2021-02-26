package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FAST_FORWARD_MERGE
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryTriggerMod.RepositoryTrigger
import typingsSlinky.awsSdkClientCodecommitNode.typesTargetMod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentInputMod.GetCommentInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def BatchGetRepositoriesInput(repositoryNames: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput = {
      val __obj = js.Dynamic.literal(repositoryNames = repositoryNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput]
    }
    
    @scala.inline
    def CreateBranchInput(branchName: String, commitId: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput]
    }
    
    @scala.inline
    def CreatePullRequestInput(targets: js.Array[Target] | js.Iterable[Target], title: String): typingsSlinky.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput = {
      val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput]
    }
    
    @scala.inline
    def CreateRepositoryInput(repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput]
    }
    
    @scala.inline
    def DeleteBranchInput(branchName: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput]
    }
    
    @scala.inline
    def DeleteCommentContentInput(commentId: String): typingsSlinky.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput = {
      val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput]
    }
    
    @scala.inline
    def DeleteFileInput(branchName: String, filePath: String, parentCommitId: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], parentCommitId = parentCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput]
    }
    
    @scala.inline
    def DeleteRepositoryInput(repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput]
    }
    
    @scala.inline
    def DescribePullRequestEventsInput(pullRequestId: String): typingsSlinky.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput]
    }
    
    @scala.inline
    def GetBlobInput(blobId: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput = {
      val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput]
    }
    
    @scala.inline
    def GetBranchInput(): typingsSlinky.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput]
    }
    
    @scala.inline
    def GetCommentInput(commentId: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentInputMod.GetCommentInput = {
      val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentInputMod.GetCommentInput]
    }
    
    @scala.inline
    def GetCommentsForComparedCommitInput(afterCommitId: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput = {
      val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput]
    }
    
    @scala.inline
    def GetCommentsForPullRequestInput(pullRequestId: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput]
    }
    
    @scala.inline
    def GetCommitInput(commitId: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput = {
      val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput]
    }
    
    @scala.inline
    def GetDifferencesInput(afterCommitSpecifier: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput = {
      val __obj = js.Dynamic.literal(afterCommitSpecifier = afterCommitSpecifier.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput]
    }
    
    @scala.inline
    def GetFileInput(filePath: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput]
    }
    
    @scala.inline
    def GetFolderInput(folderPath: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput = {
      val __obj = js.Dynamic.literal(folderPath = folderPath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput]
    }
    
    @scala.inline
    def GetMergeConflictsInput(
      destinationCommitSpecifier: String,
      mergeOption: FAST_FORWARD_MERGE | String,
      repositoryName: String,
      sourceCommitSpecifier: String
    ): typingsSlinky.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput = {
      val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], mergeOption = mergeOption.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput]
    }
    
    @scala.inline
    def GetPullRequestInput(pullRequestId: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput]
    }
    
    @scala.inline
    def GetRepositoryInput(repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput]
    }
    
    @scala.inline
    def GetRepositoryTriggersInput(repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput]
    }
    
    @scala.inline
    def ListBranchesInput(repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput]
    }
    
    @scala.inline
    def ListPullRequestsInput(repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput]
    }
    
    @scala.inline
    def ListRepositoriesInput(): typingsSlinky.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput]
    }
    
    @scala.inline
    def MergePullRequestByFastForwardInput(pullRequestId: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput]
    }
    
    @scala.inline
    def PostCommentForComparedCommitInput(afterCommitId: String, content: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput = {
      val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput]
    }
    
    @scala.inline
    def PostCommentForPullRequestInput(
      afterCommitId: String,
      beforeCommitId: String,
      content: String,
      pullRequestId: String,
      repositoryName: String
    ): typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput = {
      val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], beforeCommitId = beforeCommitId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput]
    }
    
    @scala.inline
    def PostCommentReplyInput(content: String, inReplyTo: String): typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], inReplyTo = inReplyTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput]
    }
    
    @scala.inline
    def PutFileInput(
      branchName: String,
      fileContent: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      filePath: String,
      repositoryName: String
    ): typingsSlinky.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput]
    }
    
    @scala.inline
    def PutRepositoryTriggersInput(repositoryName: String, triggers: js.Array[RepositoryTrigger] | js.Iterable[RepositoryTrigger]): typingsSlinky.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput]
    }
    
    @scala.inline
    def TestRepositoryTriggersInput(repositoryName: String, triggers: js.Array[RepositoryTrigger] | js.Iterable[RepositoryTrigger]): typingsSlinky.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput]
    }
    
    @scala.inline
    def UpdateCommentInput(commentId: String, content: String): typingsSlinky.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput = {
      val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput]
    }
    
    @scala.inline
    def UpdateDefaultBranchInput(defaultBranchName: String, repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput = {
      val __obj = js.Dynamic.literal(defaultBranchName = defaultBranchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput]
    }
    
    @scala.inline
    def UpdatePullRequestDescriptionInput(description: String, pullRequestId: String): typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput]
    }
    
    @scala.inline
    def UpdatePullRequestStatusInput(pullRequestId: String, pullRequestStatus: OPEN | CLOSED | String): typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], pullRequestStatus = pullRequestStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput]
    }
    
    @scala.inline
    def UpdatePullRequestTitleInput(pullRequestId: String, title: String): typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput]
    }
    
    @scala.inline
    def UpdateRepositoryDescriptionInput(repositoryName: String): typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput]
    }
    
    @scala.inline
    def UpdateRepositoryNameInput(newName: String, oldName: String): typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput = {
      val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput]
    }
  }
}

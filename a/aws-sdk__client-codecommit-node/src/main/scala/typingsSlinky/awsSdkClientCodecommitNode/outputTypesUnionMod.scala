package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import typingsSlinky.awsSdkClientCodecommitNode.typesCommitMod.UnmarshalledCommit
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestEventMod.UnmarshalledPullRequestEvent
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestMod.UnmarshalledPullRequest
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentOutputMod.GetCommentOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput
    - typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput
  */
  trait OutputTypesUnion extends StObject
  object OutputTypesUnion {
    
    @scala.inline
    def BatchGetRepositoriesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput]
    }
    
    @scala.inline
    def CreateBranchOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput]
    }
    
    @scala.inline
    def CreatePullRequestOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typingsSlinky.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput]
    }
    
    @scala.inline
    def CreateRepositoryOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput]
    }
    
    @scala.inline
    def DeleteBranchOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput]
    }
    
    @scala.inline
    def DeleteCommentContentOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput]
    }
    
    @scala.inline
    def DeleteFileOutput($metadata: ResponseMetadata, blobId: String, commitId: String, filePath: String, treeId: String): typingsSlinky.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput]
    }
    
    @scala.inline
    def DeleteRepositoryOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput]
    }
    
    @scala.inline
    def DescribePullRequestEventsOutput($metadata: ResponseMetadata, pullRequestEvents: js.Array[UnmarshalledPullRequestEvent]): typingsSlinky.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequestEvents = pullRequestEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput]
    }
    
    @scala.inline
    def GetBlobOutput($metadata: ResponseMetadata, content: js.typedarray.Uint8Array): typingsSlinky.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput]
    }
    
    @scala.inline
    def GetBranchOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput]
    }
    
    @scala.inline
    def GetCommentOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentOutputMod.GetCommentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentOutputMod.GetCommentOutput]
    }
    
    @scala.inline
    def GetCommentsForComparedCommitOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput]
    }
    
    @scala.inline
    def GetCommentsForPullRequestOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput]
    }
    
    @scala.inline
    def GetCommitOutput($metadata: ResponseMetadata, commit: UnmarshalledCommit): typingsSlinky.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput]
    }
    
    @scala.inline
    def GetDifferencesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput]
    }
    
    @scala.inline
    def GetFileOutput(
      $metadata: ResponseMetadata,
      blobId: String,
      commitId: String,
      fileContent: js.typedarray.Uint8Array,
      fileMode: EXECUTABLE | NORMAL | SYMLINK | String,
      filePath: String,
      fileSize: Double
    ): typingsSlinky.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput]
    }
    
    @scala.inline
    def GetFolderOutput($metadata: ResponseMetadata, commitId: String, folderPath: String): typingsSlinky.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput]
    }
    
    @scala.inline
    def GetMergeConflictsOutput(
      $metadata: ResponseMetadata,
      destinationCommitId: String,
      mergeable: Boolean,
      sourceCommitId: String
    ): typingsSlinky.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput]
    }
    
    @scala.inline
    def GetPullRequestOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typingsSlinky.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput]
    }
    
    @scala.inline
    def GetRepositoryOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput]
    }
    
    @scala.inline
    def GetRepositoryTriggersOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput]
    }
    
    @scala.inline
    def ListBranchesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput]
    }
    
    @scala.inline
    def ListPullRequestsOutput($metadata: ResponseMetadata, pullRequestIds: js.Array[String]): typingsSlinky.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequestIds = pullRequestIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput]
    }
    
    @scala.inline
    def ListRepositoriesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput]
    }
    
    @scala.inline
    def MergePullRequestByFastForwardOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput]
    }
    
    @scala.inline
    def PostCommentForComparedCommitOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput]
    }
    
    @scala.inline
    def PostCommentForPullRequestOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput]
    }
    
    @scala.inline
    def PostCommentReplyOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput]
    }
    
    @scala.inline
    def PutFileOutput($metadata: ResponseMetadata, blobId: String, commitId: String, treeId: String): typingsSlinky.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput]
    }
    
    @scala.inline
    def PutRepositoryTriggersOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput]
    }
    
    @scala.inline
    def TestRepositoryTriggersOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput]
    }
    
    @scala.inline
    def UpdateCommentOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput]
    }
    
    @scala.inline
    def UpdateDefaultBranchOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput]
    }
    
    @scala.inline
    def UpdatePullRequestDescriptionOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput]
    }
    
    @scala.inline
    def UpdatePullRequestStatusOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput]
    }
    
    @scala.inline
    def UpdatePullRequestTitleOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput]
    }
    
    @scala.inline
    def UpdateRepositoryDescriptionOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput]
    }
    
    @scala.inline
    def UpdateRepositoryNameOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput]
    }
  }
}

package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object codecommitMod {
  
  type AccountId = java.lang.String
  
  type AdditionalData = java.lang.String
  
  type ApprovalList = js.Array[typingsSlinky.awsSdk.codecommitMod.Approval]
  
  type ApprovalRuleContent = java.lang.String
  
  type ApprovalRuleId = java.lang.String
  
  type ApprovalRuleName = java.lang.String
  
  type ApprovalRuleTemplateContent = java.lang.String
  
  type ApprovalRuleTemplateDescription = java.lang.String
  
  type ApprovalRuleTemplateId = java.lang.String
  
  type ApprovalRuleTemplateName = java.lang.String
  
  type ApprovalRuleTemplateNameList = js.Array[typingsSlinky.awsSdk.codecommitMod.ApprovalRuleTemplateName]
  
  type ApprovalRulesList = js.Array[typingsSlinky.awsSdk.codecommitMod.ApprovalRule]
  
  type ApprovalRulesNotSatisfiedList = js.Array[typingsSlinky.awsSdk.codecommitMod.ApprovalRuleName]
  
  type ApprovalRulesSatisfiedList = js.Array[typingsSlinky.awsSdk.codecommitMod.ApprovalRuleName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.APPROVE
    - typingsSlinky.awsSdk.awsSdkStrings.REVOKE
    - java.lang.String
  */
  type ApprovalState = typingsSlinky.awsSdk.codecommitMod._ApprovalState | java.lang.String
  
  type Approved = scala.Boolean
  
  type Arn = java.lang.String
  
  type BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList = js.Array[
    typingsSlinky.awsSdk.codecommitMod.BatchAssociateApprovalRuleTemplateWithRepositoriesError
  ]
  
  type BatchDescribeMergeConflictsErrors = js.Array[typingsSlinky.awsSdk.codecommitMod.BatchDescribeMergeConflictsError]
  
  type BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList = js.Array[
    typingsSlinky.awsSdk.codecommitMod.BatchDisassociateApprovalRuleTemplateFromRepositoriesError
  ]
  
  type BatchGetCommitsErrorsList = js.Array[typingsSlinky.awsSdk.codecommitMod.BatchGetCommitsError]
  
  type BranchName = java.lang.String
  
  type BranchNameList = js.Array[typingsSlinky.awsSdk.codecommitMod.BranchName]
  
  type CallerReactions = js.Array[typingsSlinky.awsSdk.codecommitMod.ReactionValue]
  
  type CapitalBoolean = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.A
    - typingsSlinky.awsSdk.awsSdkStrings.M
    - typingsSlinky.awsSdk.awsSdkStrings.D
    - java.lang.String
  */
  type ChangeTypeEnum = typingsSlinky.awsSdk.codecommitMod._ChangeTypeEnum | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.codecommitMod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type CloneUrlHttp = java.lang.String
  
  type CloneUrlSsh = java.lang.String
  
  type CommentId = java.lang.String
  
  type Comments = js.Array[typingsSlinky.awsSdk.codecommitMod.Comment]
  
  type CommentsForComparedCommitData = js.Array[typingsSlinky.awsSdk.codecommitMod.CommentsForComparedCommit]
  
  type CommentsForPullRequestData = js.Array[typingsSlinky.awsSdk.codecommitMod.CommentsForPullRequest]
  
  type CommitId = java.lang.String
  
  type CommitIdsInputList = js.Array[typingsSlinky.awsSdk.codecommitMod.ObjectId]
  
  type CommitName = java.lang.String
  
  type CommitObjectsList = js.Array[typingsSlinky.awsSdk.codecommitMod.Commit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FILE_LEVEL
    - typingsSlinky.awsSdk.awsSdkStrings.LINE_LEVEL
    - java.lang.String
  */
  type ConflictDetailLevelTypeEnum = typingsSlinky.awsSdk.codecommitMod._ConflictDetailLevelTypeEnum | java.lang.String
  
  type ConflictMetadataList = js.Array[typingsSlinky.awsSdk.codecommitMod.ConflictMetadata]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.ACCEPT_SOURCE
    - typingsSlinky.awsSdk.awsSdkStrings.ACCEPT_DESTINATION
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOMERGE
    - java.lang.String
  */
  type ConflictResolutionStrategyTypeEnum = typingsSlinky.awsSdk.codecommitMod._ConflictResolutionStrategyTypeEnum | java.lang.String
  
  type Conflicts = js.Array[typingsSlinky.awsSdk.codecommitMod.Conflict]
  
  type Content = java.lang.String
  
  type Count = scala.Double
  
  type CreationDate = js.Date
  
  type Date = java.lang.String
  
  type DeleteFileEntries = js.Array[typingsSlinky.awsSdk.codecommitMod.DeleteFileEntry]
  
  type Description = java.lang.String
  
  type DifferenceList = js.Array[typingsSlinky.awsSdk.codecommitMod.Difference]
  
  type Email = java.lang.String
  
  type ErrorCode = java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type EventDate = js.Date
  
  type ExceptionName = java.lang.String
  
  type FileContent = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.codecommitMod.Blob_ | java.lang.String
  
  type FileList = js.Array[typingsSlinky.awsSdk.codecommitMod.File]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTABLE
    - typingsSlinky.awsSdk.awsSdkStrings.NORMAL
    - typingsSlinky.awsSdk.awsSdkStrings.SYMLINK
    - java.lang.String
  */
  type FileModeTypeEnum = typingsSlinky.awsSdk.codecommitMod._FileModeTypeEnum | java.lang.String
  
  type FilePaths = js.Array[typingsSlinky.awsSdk.codecommitMod.Path]
  
  type FileSize = scala.Double
  
  type FilesMetadata = js.Array[typingsSlinky.awsSdk.codecommitMod.FileMetadata]
  
  type FolderList = js.Array[typingsSlinky.awsSdk.codecommitMod.Folder]
  
  type HunkContent = java.lang.String
  
  type IsCommentDeleted = scala.Boolean
  
  type IsContentConflict = scala.Boolean
  
  type IsFileModeConflict = scala.Boolean
  
  type IsHunkConflict = scala.Boolean
  
  type IsMergeable = scala.Boolean
  
  type IsMerged = scala.Boolean
  
  type IsMove = scala.Boolean
  
  type IsObjectTypeConflict = scala.Boolean
  
  type KeepEmptyFolders = scala.Boolean
  
  type LastModifiedDate = js.Date
  
  type Limit = scala.Double
  
  type LineNumber = scala.Double
  
  type MaxResults = scala.Double
  
  type MergeHunks = js.Array[typingsSlinky.awsSdk.codecommitMod.MergeHunk]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FAST_FORWARD_MERGE
    - typingsSlinky.awsSdk.awsSdkStrings.SQUASH_MERGE
    - typingsSlinky.awsSdk.awsSdkStrings.THREE_WAY_MERGE
    - java.lang.String
  */
  type MergeOptionTypeEnum = typingsSlinky.awsSdk.codecommitMod._MergeOptionTypeEnum | java.lang.String
  
  type MergeOptions = js.Array[typingsSlinky.awsSdk.codecommitMod.MergeOptionTypeEnum]
  
  type Message = java.lang.String
  
  type Mode = java.lang.String
  
  type Name = java.lang.String
  
  type NextToken = java.lang.String
  
  type NumberOfConflicts = scala.Double
  
  type ObjectId = java.lang.String
  
  type ObjectSize = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FILE
    - typingsSlinky.awsSdk.awsSdkStrings.DIRECTORY
    - typingsSlinky.awsSdk.awsSdkStrings.GIT_LINK
    - typingsSlinky.awsSdk.awsSdkStrings.SYMBOLIC_LINK
    - java.lang.String
  */
  type ObjectTypeEnum = typingsSlinky.awsSdk.codecommitMod._ObjectTypeEnum | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ascending__
    - typingsSlinky.awsSdk.awsSdkStrings.descending__
    - java.lang.String
  */
  type OrderEnum = typingsSlinky.awsSdk.codecommitMod._OrderEnum | java.lang.String
  
  type Overridden = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OVERRIDE
    - typingsSlinky.awsSdk.awsSdkStrings.REVOKE
    - java.lang.String
  */
  type OverrideStatus = typingsSlinky.awsSdk.codecommitMod._OverrideStatus | java.lang.String
  
  type ParentList = js.Array[typingsSlinky.awsSdk.codecommitMod.ObjectId]
  
  type Path = java.lang.String
  
  type Position = scala.Double
  
  type PullRequestEventList = js.Array[typingsSlinky.awsSdk.codecommitMod.PullRequestEvent]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PULL_REQUEST_CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.PULL_REQUEST_STATUS_CHANGED
    - typingsSlinky.awsSdk.awsSdkStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
    - typingsSlinky.awsSdk.awsSdkStrings.PULL_REQUEST_MERGE_STATE_CHANGED
    - typingsSlinky.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_UPDATED
    - typingsSlinky.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN
    - typingsSlinky.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_STATE_CHANGED
    - java.lang.String
  */
  type PullRequestEventType = typingsSlinky.awsSdk.codecommitMod._PullRequestEventType | java.lang.String
  
  type PullRequestId = java.lang.String
  
  type PullRequestIdList = js.Array[typingsSlinky.awsSdk.codecommitMod.PullRequestId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OPEN
    - typingsSlinky.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type PullRequestStatusEnum = typingsSlinky.awsSdk.codecommitMod._PullRequestStatusEnum | java.lang.String
  
  type PullRequestTargetList = js.Array[typingsSlinky.awsSdk.codecommitMod.PullRequestTarget]
  
  type PutFileEntries = js.Array[typingsSlinky.awsSdk.codecommitMod.PutFileEntry]
  
  type ReactionCountsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codecommitMod.Count]
  
  type ReactionEmoji = java.lang.String
  
  type ReactionShortCode = java.lang.String
  
  type ReactionUnicode = java.lang.String
  
  type ReactionUsersList = js.Array[typingsSlinky.awsSdk.codecommitMod.Arn]
  
  type ReactionValue = java.lang.String
  
  type ReactionsForCommentList = js.Array[typingsSlinky.awsSdk.codecommitMod.ReactionForComment]
  
  type ReferenceName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BEFORE
    - typingsSlinky.awsSdk.awsSdkStrings.AFTER
    - java.lang.String
  */
  type RelativeFileVersionEnum = typingsSlinky.awsSdk.codecommitMod._RelativeFileVersionEnum | java.lang.String
  
  type ReplaceContentEntries = js.Array[typingsSlinky.awsSdk.codecommitMod.ReplaceContentEntry]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.KEEP_BASE
    - typingsSlinky.awsSdk.awsSdkStrings.KEEP_SOURCE
    - typingsSlinky.awsSdk.awsSdkStrings.KEEP_DESTINATION
    - typingsSlinky.awsSdk.awsSdkStrings.USE_NEW_CONTENT
    - java.lang.String
  */
  type ReplacementTypeEnum = typingsSlinky.awsSdk.codecommitMod._ReplacementTypeEnum | java.lang.String
  
  type RepositoryDescription = java.lang.String
  
  type RepositoryId = java.lang.String
  
  type RepositoryMetadataList = js.Array[typingsSlinky.awsSdk.codecommitMod.RepositoryMetadata]
  
  type RepositoryName = java.lang.String
  
  type RepositoryNameIdPairList = js.Array[typingsSlinky.awsSdk.codecommitMod.RepositoryNameIdPair]
  
  type RepositoryNameList = js.Array[typingsSlinky.awsSdk.codecommitMod.RepositoryName]
  
  type RepositoryNotFoundList = js.Array[typingsSlinky.awsSdk.codecommitMod.RepositoryName]
  
  type RepositoryTriggerCustomData = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.all__
    - typingsSlinky.awsSdk.awsSdkStrings.updateReference
    - typingsSlinky.awsSdk.awsSdkStrings.createReference
    - typingsSlinky.awsSdk.awsSdkStrings.deleteReference
    - java.lang.String
  */
  type RepositoryTriggerEventEnum = typingsSlinky.awsSdk.codecommitMod._RepositoryTriggerEventEnum | java.lang.String
  
  type RepositoryTriggerEventList = js.Array[typingsSlinky.awsSdk.codecommitMod.RepositoryTriggerEventEnum]
  
  type RepositoryTriggerExecutionFailureList = js.Array[typingsSlinky.awsSdk.codecommitMod.RepositoryTriggerExecutionFailure]
  
  type RepositoryTriggerExecutionFailureMessage = java.lang.String
  
  type RepositoryTriggerName = java.lang.String
  
  type RepositoryTriggerNameList = js.Array[typingsSlinky.awsSdk.codecommitMod.RepositoryTriggerName]
  
  type RepositoryTriggersConfigurationId = java.lang.String
  
  type RepositoryTriggersList = js.Array[typingsSlinky.awsSdk.codecommitMod.RepositoryTrigger]
  
  type ResourceArn = java.lang.String
  
  type RevisionId = java.lang.String
  
  type RuleContentSha256 = java.lang.String
  
  type SetFileModeEntries = js.Array[typingsSlinky.awsSdk.codecommitMod.SetFileModeEntry]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.repositoryName
    - typingsSlinky.awsSdk.awsSdkStrings.lastModifiedDate_
    - java.lang.String
  */
  type SortByEnum = typingsSlinky.awsSdk.codecommitMod._SortByEnum | java.lang.String
  
  type SubModuleList = js.Array[typingsSlinky.awsSdk.codecommitMod.SubModule]
  
  type SymbolicLinkList = js.Array[typingsSlinky.awsSdk.codecommitMod.SymbolicLink]
  
  type TagKey = java.lang.String
  
  type TagKeysList = js.Array[typingsSlinky.awsSdk.codecommitMod.TagKey]
  
  type TagValue = java.lang.String
  
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codecommitMod.TagValue]
  
  type TargetList = js.Array[typingsSlinky.awsSdk.codecommitMod.Target]
  
  type Title = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-04-13`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.codecommitMod._apiVersion | java.lang.String
  
  type blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.codecommitMod.Blob_ | java.lang.String
}

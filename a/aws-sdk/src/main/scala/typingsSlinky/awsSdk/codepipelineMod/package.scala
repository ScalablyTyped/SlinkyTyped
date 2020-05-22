package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codepipelineMod {
  type AWSRegionName = java.lang.String
  type AccessKeyId = java.lang.String
  type AccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Source
    - typingsSlinky.awsSdk.awsSdkStrings.Build_
    - typingsSlinky.awsSdk.awsSdkStrings.Deploy
    - typingsSlinky.awsSdk.awsSdkStrings.Test_
    - typingsSlinky.awsSdk.awsSdkStrings.Invoke
    - typingsSlinky.awsSdk.awsSdkStrings.Approval
    - java.lang.String
  */
  type ActionCategory = typingsSlinky.awsSdk.codepipelineMod._ActionCategory | java.lang.String
  type ActionConfigurationKey = java.lang.String
  type ActionConfigurationMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codepipelineMod.ActionConfigurationValue]
  type ActionConfigurationPropertyList = js.Array[typingsSlinky.awsSdk.codepipelineMod.ActionConfigurationProperty]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.String_
    - typingsSlinky.awsSdk.awsSdkStrings.Number_
    - typingsSlinky.awsSdk.awsSdkStrings.Boolean_
    - java.lang.String
  */
  type ActionConfigurationPropertyType = typingsSlinky.awsSdk.codepipelineMod._ActionConfigurationPropertyType | java.lang.String
  type ActionConfigurationQueryableValue = java.lang.String
  type ActionConfigurationValue = java.lang.String
  type ActionExecutionDetailList = js.Array[typingsSlinky.awsSdk.codepipelineMod.ActionExecutionDetail]
  type ActionExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Abandoned
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ActionExecutionStatus = typingsSlinky.awsSdk.codepipelineMod._ActionExecutionStatus | java.lang.String
  type ActionExecutionToken = java.lang.String
  type ActionName = java.lang.String
  type ActionNamespace = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWS
    - typingsSlinky.awsSdk.awsSdkStrings.ThirdParty
    - typingsSlinky.awsSdk.awsSdkStrings.Custom_
    - java.lang.String
  */
  type ActionOwner = typingsSlinky.awsSdk.codepipelineMod._ActionOwner | java.lang.String
  type ActionProvider = java.lang.String
  type ActionRunOrder = scala.Double
  type ActionStateList = js.Array[typingsSlinky.awsSdk.codepipelineMod.ActionState]
  type ActionTypeList = js.Array[typingsSlinky.awsSdk.codepipelineMod.ActionType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Approved_
    - typingsSlinky.awsSdk.awsSdkStrings.Rejected_
    - java.lang.String
  */
  type ApprovalStatus = typingsSlinky.awsSdk.codepipelineMod._ApprovalStatus | java.lang.String
  type ApprovalSummary = java.lang.String
  type ApprovalToken = java.lang.String
  type ArtifactDetailList = js.Array[typingsSlinky.awsSdk.codepipelineMod.ArtifactDetail]
  type ArtifactList = js.Array[typingsSlinky.awsSdk.codepipelineMod.Artifact]
  type ArtifactLocationType = typingsSlinky.awsSdk.awsSdkStrings.S3 | java.lang.String
  type ArtifactName = java.lang.String
  type ArtifactRevisionList = js.Array[typingsSlinky.awsSdk.codepipelineMod.ArtifactRevision]
  type ArtifactStoreLocation = java.lang.String
  type ArtifactStoreMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codepipelineMod.ArtifactStore]
  type ArtifactStoreType = typingsSlinky.awsSdk.awsSdkStrings.S3 | java.lang.String
  type BlockerName = java.lang.String
  type BlockerType = typingsSlinky.awsSdk.awsSdkStrings.Schedule | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.codepipelineMod.ClientApiVersions
  type ClientId = java.lang.String
  type ClientRequestToken = java.lang.String
  type ClientToken = java.lang.String
  type Code = java.lang.String
  type ContinuationToken = java.lang.String
  type Description = java.lang.String
  type DisabledReason = java.lang.String
  type Enabled = scala.Boolean
  type EncryptionKeyId = java.lang.String
  type EncryptionKeyType = typingsSlinky.awsSdk.awsSdkStrings.KMS | java.lang.String
  type ExecutionId = java.lang.String
  type ExecutionSummary = java.lang.String
  type ExternalExecutionId = java.lang.String
  type ExternalExecutionSummary = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.JobFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ConfigurationError
    - typingsSlinky.awsSdk.awsSdkStrings.PermissionError
    - typingsSlinky.awsSdk.awsSdkStrings.RevisionOutOfSync
    - typingsSlinky.awsSdk.awsSdkStrings.RevisionUnavailable
    - typingsSlinky.awsSdk.awsSdkStrings.SystemUnavailable
    - java.lang.String
  */
  type FailureType = typingsSlinky.awsSdk.codepipelineMod._FailureType | java.lang.String
  type InputArtifactList = js.Array[typingsSlinky.awsSdk.codepipelineMod.InputArtifact]
  type JobId = java.lang.String
  type JobList = js.Array[typingsSlinky.awsSdk.codepipelineMod.Job]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Created_
    - typingsSlinky.awsSdk.awsSdkStrings.Queued_
    - typingsSlinky.awsSdk.awsSdkStrings.Dispatched
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.TimedOut_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.codepipelineMod._JobStatus | java.lang.String
  type JsonPath = java.lang.String
  type LastChangedAt = js.Date
  type LastChangedBy = java.lang.String
  type LastUpdatedBy = java.lang.String
  type MatchEquals = java.lang.String
  type MaxBatchSize = scala.Double
  type MaxResults = scala.Double
  type MaximumArtifactCount = scala.Double
  type Message = java.lang.String
  type MinimumArtifactCount = scala.Double
  type NextToken = java.lang.String
  type Nonce = java.lang.String
  type OutputArtifactList = js.Array[typingsSlinky.awsSdk.codepipelineMod.OutputArtifact]
  type OutputVariablesKey = java.lang.String
  type OutputVariablesMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codepipelineMod.OutputVariablesValue]
  type OutputVariablesValue = java.lang.String
  type Percentage = scala.Double
  type PipelineArn = java.lang.String
  type PipelineExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Superseded_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type PipelineExecutionStatus = typingsSlinky.awsSdk.codepipelineMod._PipelineExecutionStatus | java.lang.String
  type PipelineExecutionSummaryList = js.Array[typingsSlinky.awsSdk.codepipelineMod.PipelineExecutionSummary]
  type PipelineList = js.Array[typingsSlinky.awsSdk.codepipelineMod.PipelineSummary]
  type PipelineName = java.lang.String
  type PipelineStageDeclarationList = js.Array[typingsSlinky.awsSdk.codepipelineMod.StageDeclaration]
  type PipelineVersion = scala.Double
  type QueryParamMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codepipelineMod.ActionConfigurationQueryableValue]
  type ResolvedActionConfigurationMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codepipelineMod.String]
  type ResourceArn = java.lang.String
  type Revision = java.lang.String
  type RevisionChangeIdentifier = java.lang.String
  type RevisionSummary = java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3BucketName = java.lang.String
  type S3Key = java.lang.String
  type S3ObjectKey = java.lang.String
  type SecretAccessKey = java.lang.String
  type SessionToken = java.lang.String
  type SourceRevisionList = js.Array[typingsSlinky.awsSdk.codepipelineMod.SourceRevision]
  type StageActionDeclarationList = js.Array[typingsSlinky.awsSdk.codepipelineMod.ActionDeclaration]
  type StageBlockerDeclarationList = js.Array[typingsSlinky.awsSdk.codepipelineMod.BlockerDeclaration]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type StageExecutionStatus = typingsSlinky.awsSdk.codepipelineMod._StageExecutionStatus | java.lang.String
  type StageName = java.lang.String
  type StageRetryMode = typingsSlinky.awsSdk.awsSdkStrings.FAILED_ACTIONS | java.lang.String
  type StageStateList = js.Array[typingsSlinky.awsSdk.codepipelineMod.StageState]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Inbound_
    - typingsSlinky.awsSdk.awsSdkStrings.Outbound_
    - java.lang.String
  */
  type StageTransitionType = typingsSlinky.awsSdk.codepipelineMod._StageTransitionType | java.lang.String
  type StopPipelineExecutionReason = java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.codepipelineMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.codepipelineMod.Tag]
  type TagValue = java.lang.String
  type ThirdPartyJobId = java.lang.String
  type ThirdPartyJobList = js.Array[typingsSlinky.awsSdk.codepipelineMod.ThirdPartyJob]
  type Time = js.Date
  type Timestamp = js.Date
  type TriggerDetail = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CreatePipeline
    - typingsSlinky.awsSdk.awsSdkStrings.StartPipelineExecution
    - typingsSlinky.awsSdk.awsSdkStrings.PollForSourceChanges
    - typingsSlinky.awsSdk.awsSdkStrings.Webhook
    - typingsSlinky.awsSdk.awsSdkStrings.CloudWatchEvent
    - typingsSlinky.awsSdk.awsSdkStrings.PutActionRevision
    - java.lang.String
  */
  type TriggerType = typingsSlinky.awsSdk.codepipelineMod._TriggerType | java.lang.String
  type Url = java.lang.String
  type UrlTemplate = java.lang.String
  type Version = java.lang.String
  type WebhookArn = java.lang.String
  type WebhookAuthConfigurationAllowedIPRange = java.lang.String
  type WebhookAuthConfigurationSecretToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GITHUB_HMAC
    - typingsSlinky.awsSdk.awsSdkStrings.IP
    - typingsSlinky.awsSdk.awsSdkStrings.UNAUTHENTICATED
    - java.lang.String
  */
  type WebhookAuthenticationType = typingsSlinky.awsSdk.codepipelineMod._WebhookAuthenticationType | java.lang.String
  type WebhookErrorCode = java.lang.String
  type WebhookErrorMessage = java.lang.String
  type WebhookFilters = js.Array[typingsSlinky.awsSdk.codepipelineMod.WebhookFilterRule]
  type WebhookLastTriggered = js.Date
  type WebhookList = js.Array[typingsSlinky.awsSdk.codepipelineMod.ListWebhookItem]
  type WebhookName = java.lang.String
  type WebhookUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-07-09`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.codepipelineMod._apiVersion | java.lang.String
}

package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ssmMod {
  
  type Account = java.lang.String
  
  type AccountId = java.lang.String
  
  type AccountIdList = js.Array[typingsSlinky.awsSdk.ssmMod.AccountId]
  
  type AccountSharingInfoList = js.Array[typingsSlinky.awsSdk.ssmMod.AccountSharingInfo]
  
  type Accounts = js.Array[typingsSlinky.awsSdk.ssmMod.Account]
  
  type ActivationCode = java.lang.String
  
  type ActivationDescription = java.lang.String
  
  type ActivationId = java.lang.String
  
  type ActivationList = js.Array[typingsSlinky.awsSdk.ssmMod.Activation]
  
  type AgentErrorCode = java.lang.String
  
  type AggregatorSchemaOnly = scala.Boolean
  
  type AllowedPattern = java.lang.String
  
  type ApplyOnlyAtCronInterval = scala.Boolean
  
  type ApproveAfterDays = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CRITICAL
    - typingsSlinky.awsSdk.awsSdkStrings.HIGH
    - typingsSlinky.awsSdk.awsSdkStrings.MEDIUM
    - typingsSlinky.awsSdk.awsSdkStrings.LOW
    - typingsSlinky.awsSdk.awsSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type AssociationComplianceSeverity = typingsSlinky.awsSdk.ssmMod._AssociationComplianceSeverity | java.lang.String
  
  type AssociationDescriptionList = js.Array[typingsSlinky.awsSdk.ssmMod.AssociationDescription]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutionId
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.CreatedTime
    - java.lang.String
  */
  type AssociationExecutionFilterKey = typingsSlinky.awsSdk.ssmMod._AssociationExecutionFilterKey | java.lang.String
  
  type AssociationExecutionFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.AssociationExecutionFilter]
  
  type AssociationExecutionFilterValue = java.lang.String
  
  type AssociationExecutionId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceId
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceType
    - java.lang.String
  */
  type AssociationExecutionTargetsFilterKey = typingsSlinky.awsSdk.ssmMod._AssociationExecutionTargetsFilterKey | java.lang.String
  
  type AssociationExecutionTargetsFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.AssociationExecutionTargetsFilter]
  
  type AssociationExecutionTargetsFilterValue = java.lang.String
  
  type AssociationExecutionTargetsList = js.Array[typingsSlinky.awsSdk.ssmMod.AssociationExecutionTarget]
  
  type AssociationExecutionsList = js.Array[typingsSlinky.awsSdk.ssmMod.AssociationExecution]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceId
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.AssociationId
    - typingsSlinky.awsSdk.awsSdkStrings.AssociationStatusName
    - typingsSlinky.awsSdk.awsSdkStrings.LastExecutedBefore
    - typingsSlinky.awsSdk.awsSdkStrings.LastExecutedAfter
    - typingsSlinky.awsSdk.awsSdkStrings.AssociationName
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceGroupName
    - java.lang.String
  */
  type AssociationFilterKey = typingsSlinky.awsSdk.ssmMod._AssociationFilterKey | java.lang.String
  
  type AssociationFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.AssociationFilter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQUAL
    - typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN
    - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN
    - java.lang.String
  */
  type AssociationFilterOperatorType = typingsSlinky.awsSdk.ssmMod._AssociationFilterOperatorType | java.lang.String
  
  type AssociationFilterValue = java.lang.String
  
  type AssociationId = java.lang.String
  
  type AssociationIdList = js.Array[typingsSlinky.awsSdk.ssmMod.AssociationId]
  
  type AssociationList = js.Array[typingsSlinky.awsSdk.ssmMod.Association]
  
  type AssociationName = java.lang.String
  
  type AssociationResourceId = java.lang.String
  
  type AssociationResourceType = java.lang.String
  
  type AssociationStatusAggregatedCount = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.InstanceCount]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type AssociationStatusName = typingsSlinky.awsSdk.ssmMod._AssociationStatusName | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AUTO
    - typingsSlinky.awsSdk.awsSdkStrings.MANUAL
    - java.lang.String
  */
  type AssociationSyncCompliance = typingsSlinky.awsSdk.ssmMod._AssociationSyncCompliance | java.lang.String
  
  type AssociationVersion = java.lang.String
  
  type AssociationVersionList = js.Array[typingsSlinky.awsSdk.ssmMod.AssociationVersionInfo]
  
  type AttachmentContentList = js.Array[typingsSlinky.awsSdk.ssmMod.AttachmentContent]
  
  type AttachmentHash = java.lang.String
  
  type AttachmentHashType = typingsSlinky.awsSdk.awsSdkStrings.Sha256_ | java.lang.String
  
  type AttachmentIdentifier = java.lang.String
  
  type AttachmentInformationList = js.Array[typingsSlinky.awsSdk.ssmMod.AttachmentInformation]
  
  type AttachmentName = java.lang.String
  
  type AttachmentUrl = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SourceUrl
    - typingsSlinky.awsSdk.awsSdkStrings.S3FileUrl
    - typingsSlinky.awsSdk.awsSdkStrings.AttachmentReference
    - java.lang.String
  */
  type AttachmentsSourceKey = typingsSlinky.awsSdk.ssmMod._AttachmentsSourceKey | java.lang.String
  
  type AttachmentsSourceList = js.Array[typingsSlinky.awsSdk.ssmMod.AttachmentsSource]
  
  type AttachmentsSourceValue = java.lang.String
  
  type AttachmentsSourceValues = js.Array[typingsSlinky.awsSdk.ssmMod.AttachmentsSourceValue]
  
  type AttributeName = java.lang.String
  
  type AttributeValue = java.lang.String
  
  type AutomationActionName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DocumentNamePrefix
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutionStatus
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutionId
    - typingsSlinky.awsSdk.awsSdkStrings.ParentExecutionId
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentAction
    - typingsSlinky.awsSdk.awsSdkStrings.StartTimeBefore
    - typingsSlinky.awsSdk.awsSdkStrings.StartTimeAfter
    - typingsSlinky.awsSdk.awsSdkStrings.AutomationType
    - typingsSlinky.awsSdk.awsSdkStrings.TagKey
    - typingsSlinky.awsSdk.awsSdkStrings.TargetResourceGroup
    - java.lang.String
  */
  type AutomationExecutionFilterKey = typingsSlinky.awsSdk.ssmMod._AutomationExecutionFilterKey | java.lang.String
  
  type AutomationExecutionFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.AutomationExecutionFilter]
  
  type AutomationExecutionFilterValue = java.lang.String
  
  type AutomationExecutionFilterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.AutomationExecutionFilterValue]
  
  type AutomationExecutionId = java.lang.String
  
  type AutomationExecutionMetadataList = js.Array[typingsSlinky.awsSdk.ssmMod.AutomationExecutionMetadata]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Waiting_
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.TimedOut_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelling_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type AutomationExecutionStatus = typingsSlinky.awsSdk.ssmMod._AutomationExecutionStatus | java.lang.String
  
  type AutomationParameterKey = java.lang.String
  
  type AutomationParameterMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.AutomationParameterValueList]
  
  type AutomationParameterValue = java.lang.String
  
  type AutomationParameterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.AutomationParameterValue]
  
  type AutomationTargetParameterName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CrossAccount
    - typingsSlinky.awsSdk.awsSdkStrings.Local_
    - java.lang.String
  */
  type AutomationType = typingsSlinky.awsSdk.ssmMod._AutomationType | java.lang.String
  
  type BaselineDescription = java.lang.String
  
  type BaselineId = java.lang.String
  
  type BaselineName = java.lang.String
  
  type BatchErrorMessage = java.lang.String
  
  type Boolean = scala.Boolean
  
  type CalendarNameOrARN = java.lang.String
  
  type CalendarNameOrARNList = js.Array[typingsSlinky.awsSdk.ssmMod.CalendarNameOrARN]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OPEN
    - typingsSlinky.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type CalendarState = typingsSlinky.awsSdk.ssmMod._CalendarState | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ssmMod.ClientApiVersions
  
  type ClientToken = java.lang.String
  
  type CloudWatchLogGroupName = java.lang.String
  
  type CloudWatchOutputEnabled = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InvokedAfter
    - typingsSlinky.awsSdk.awsSdkStrings.InvokedBefore
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutionStage
    - typingsSlinky.awsSdk.awsSdkStrings.DocumentName
    - java.lang.String
  */
  type CommandFilterKey = typingsSlinky.awsSdk.ssmMod._CommandFilterKey | java.lang.String
  
  type CommandFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.CommandFilter]
  
  type CommandFilterValue = java.lang.String
  
  type CommandId = java.lang.String
  
  type CommandInvocationList = js.Array[typingsSlinky.awsSdk.ssmMod.CommandInvocation]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Delayed
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - typingsSlinky.awsSdk.awsSdkStrings.TimedOut_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelling_
    - java.lang.String
  */
  type CommandInvocationStatus = typingsSlinky.awsSdk.ssmMod._CommandInvocationStatus | java.lang.String
  
  type CommandList = js.Array[typingsSlinky.awsSdk.ssmMod.Command]
  
  type CommandMaxResults = scala.Double
  
  type CommandPluginList = js.Array[typingsSlinky.awsSdk.ssmMod.CommandPlugin]
  
  type CommandPluginName = java.lang.String
  
  type CommandPluginOutput = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.TimedOut_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type CommandPluginStatus = typingsSlinky.awsSdk.ssmMod._CommandPluginStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.TimedOut_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelling_
    - java.lang.String
  */
  type CommandStatus = typingsSlinky.awsSdk.ssmMod._CommandStatus | java.lang.String
  
  type Comment = java.lang.String
  
  type CompletedCount = scala.Double
  
  type ComplianceExecutionId = java.lang.String
  
  type ComplianceExecutionType = java.lang.String
  
  type ComplianceFilterValue = java.lang.String
  
  type ComplianceItemContentHash = java.lang.String
  
  type ComplianceItemDetails = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.AttributeValue]
  
  type ComplianceItemEntryList = js.Array[typingsSlinky.awsSdk.ssmMod.ComplianceItemEntry]
  
  type ComplianceItemId = java.lang.String
  
  type ComplianceItemList = js.Array[typingsSlinky.awsSdk.ssmMod.ComplianceItem]
  
  type ComplianceItemTitle = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQUAL
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_EQUAL
    - typingsSlinky.awsSdk.awsSdkStrings.BEGIN_WITH
    - typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN
    - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN
    - java.lang.String
  */
  type ComplianceQueryOperatorType = typingsSlinky.awsSdk.ssmMod._ComplianceQueryOperatorType | java.lang.String
  
  type ComplianceResourceId = java.lang.String
  
  type ComplianceResourceIdList = js.Array[typingsSlinky.awsSdk.ssmMod.ComplianceResourceId]
  
  type ComplianceResourceType = java.lang.String
  
  type ComplianceResourceTypeList = js.Array[typingsSlinky.awsSdk.ssmMod.ComplianceResourceType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CRITICAL
    - typingsSlinky.awsSdk.awsSdkStrings.HIGH
    - typingsSlinky.awsSdk.awsSdkStrings.MEDIUM
    - typingsSlinky.awsSdk.awsSdkStrings.LOW
    - typingsSlinky.awsSdk.awsSdkStrings.INFORMATIONAL
    - typingsSlinky.awsSdk.awsSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type ComplianceSeverity = typingsSlinky.awsSdk.ssmMod._ComplianceSeverity | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANT
    - typingsSlinky.awsSdk.awsSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type ComplianceStatus = typingsSlinky.awsSdk.ssmMod._ComplianceStatus | java.lang.String
  
  type ComplianceStringFilterKey = java.lang.String
  
  type ComplianceStringFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.ComplianceStringFilter]
  
  type ComplianceStringFilterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.ComplianceFilterValue]
  
  type ComplianceSummaryCount = scala.Double
  
  type ComplianceSummaryItemList = js.Array[typingsSlinky.awsSdk.ssmMod.ComplianceSummaryItem]
  
  type ComplianceTypeName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.PARTIAL
    - java.lang.String
  */
  type ComplianceUploadType = typingsSlinky.awsSdk.ssmMod._ComplianceUploadType | java.lang.String
  
  type ComputerName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Connected_
    - typingsSlinky.awsSdk.awsSdkStrings.NotConnected
    - java.lang.String
  */
  type ConnectionStatus = typingsSlinky.awsSdk.ssmMod._ConnectionStatus | java.lang.String
  
  type ContentLength = scala.Double
  
  type CreateAssociationBatchRequestEntries = js.Array[typingsSlinky.awsSdk.ssmMod.CreateAssociationBatchRequestEntry]
  
  type CreatedDate = js.Date
  
  type DateTime = js.Date
  
  type DefaultBaseline = scala.Boolean
  
  type DefaultInstanceName = java.lang.String
  
  type DeliveryTimedOutCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ActivationIds
    - typingsSlinky.awsSdk.awsSdkStrings.DefaultInstanceName
    - typingsSlinky.awsSdk.awsSdkStrings.IamRole
    - java.lang.String
  */
  type DescribeActivationsFilterKeys = typingsSlinky.awsSdk.ssmMod._DescribeActivationsFilterKeys | java.lang.String
  
  type DescribeActivationsFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.DescribeActivationsFilter]
  
  type DescriptionInDocument = java.lang.String
  
  type DocumentARN = java.lang.String
  
  type DocumentContent = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.Owner_
    - typingsSlinky.awsSdk.awsSdkStrings.PlatformTypes
    - typingsSlinky.awsSdk.awsSdkStrings.DocumentType
    - java.lang.String
  */
  type DocumentFilterKey = typingsSlinky.awsSdk.ssmMod._DocumentFilterKey | java.lang.String
  
  type DocumentFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.DocumentFilter]
  
  type DocumentFilterValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.YAML
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - typingsSlinky.awsSdk.awsSdkStrings.TEXT
    - java.lang.String
  */
  type DocumentFormat = typingsSlinky.awsSdk.ssmMod._DocumentFormat | java.lang.String
  
  type DocumentHash = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Sha256_
    - typingsSlinky.awsSdk.awsSdkStrings.Sha1_
    - java.lang.String
  */
  type DocumentHashType = typingsSlinky.awsSdk.ssmMod._DocumentHashType | java.lang.String
  
  type DocumentIdentifierList = js.Array[typingsSlinky.awsSdk.ssmMod.DocumentIdentifier]
  
  type DocumentKeyValuesFilterKey = java.lang.String
  
  type DocumentKeyValuesFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.DocumentKeyValuesFilter]
  
  type DocumentKeyValuesFilterValue = java.lang.String
  
  type DocumentKeyValuesFilterValues = js.Array[typingsSlinky.awsSdk.ssmMod.DocumentKeyValuesFilterValue]
  
  type DocumentName = java.lang.String
  
  type DocumentOwner = java.lang.String
  
  type DocumentParameterDefaultValue = java.lang.String
  
  type DocumentParameterDescrption = java.lang.String
  
  type DocumentParameterList = js.Array[typingsSlinky.awsSdk.ssmMod.DocumentParameter]
  
  type DocumentParameterName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.String_
    - typingsSlinky.awsSdk.awsSdkStrings.StringList
    - java.lang.String
  */
  type DocumentParameterType = typingsSlinky.awsSdk.ssmMod._DocumentParameterType | java.lang.String
  
  type DocumentPermissionType = typingsSlinky.awsSdk.awsSdkStrings.Share | java.lang.String
  
  type DocumentRequiresList = js.Array[typingsSlinky.awsSdk.ssmMod.DocumentRequires]
  
  type DocumentSchemaVersion = java.lang.String
  
  type DocumentSha1 = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Creating_
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Updating_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DocumentStatus = typingsSlinky.awsSdk.ssmMod._DocumentStatus | java.lang.String
  
  type DocumentStatusInformation = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Command
    - typingsSlinky.awsSdk.awsSdkStrings.Policy_
    - typingsSlinky.awsSdk.awsSdkStrings.Automation_
    - typingsSlinky.awsSdk.awsSdkStrings.Session
    - typingsSlinky.awsSdk.awsSdkStrings.Package
    - typingsSlinky.awsSdk.awsSdkStrings.ApplicationConfiguration
    - typingsSlinky.awsSdk.awsSdkStrings.ApplicationConfigurationSchema
    - typingsSlinky.awsSdk.awsSdkStrings.DeploymentStrategy
    - typingsSlinky.awsSdk.awsSdkStrings.ChangeCalendar
    - java.lang.String
  */
  type DocumentType = typingsSlinky.awsSdk.ssmMod._DocumentType | java.lang.String
  
  type DocumentVersion = java.lang.String
  
  type DocumentVersionList = js.Array[typingsSlinky.awsSdk.ssmMod.DocumentVersionInfo]
  
  type DocumentVersionName = java.lang.String
  
  type DocumentVersionNumber = java.lang.String
  
  type DryRun = scala.Boolean
  
  type EffectiveInstanceAssociationMaxResults = scala.Double
  
  type EffectivePatchList = js.Array[typingsSlinky.awsSdk.ssmMod.EffectivePatch]
  
  type ErrorCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Auto_
    - typingsSlinky.awsSdk.awsSdkStrings.Interactive_
    - java.lang.String
  */
  type ExecutionMode = typingsSlinky.awsSdk.ssmMod._ExecutionMode | java.lang.String
  
  type ExecutionRoleName = java.lang.String
  
  type ExpirationDate = js.Date
  
  type FailedCreateAssociationList = js.Array[typingsSlinky.awsSdk.ssmMod.FailedCreateAssociation]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Client
    - typingsSlinky.awsSdk.awsSdkStrings.Server_
    - typingsSlinky.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type Fault = typingsSlinky.awsSdk.ssmMod._Fault | java.lang.String
  
  type GetInventorySchemaMaxResults = scala.Double
  
  type GetParametersByPathMaxResults = scala.Double
  
  type IPAddress = java.lang.String
  
  type ISO8601String = java.lang.String
  
  type IamRole = java.lang.String
  
  type IdempotencyToken = java.lang.String
  
  type InstallOverrideList = java.lang.String
  
  type InstanceAssociationExecutionSummary = java.lang.String
  
  type InstanceAssociationList = js.Array[typingsSlinky.awsSdk.ssmMod.InstanceAssociation]
  
  type InstanceAssociationStatusAggregatedCount = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.InstanceCount]
  
  type InstanceAssociationStatusInfos = js.Array[typingsSlinky.awsSdk.ssmMod.InstanceAssociationStatusInfo]
  
  type InstanceCount = scala.Double
  
  type InstanceId = java.lang.String
  
  type InstanceIdList = js.Array[typingsSlinky.awsSdk.ssmMod.InstanceId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceIds
    - typingsSlinky.awsSdk.awsSdkStrings.AgentVersion
    - typingsSlinky.awsSdk.awsSdkStrings.PingStatus
    - typingsSlinky.awsSdk.awsSdkStrings.PlatformTypes
    - typingsSlinky.awsSdk.awsSdkStrings.ActivationIds
    - typingsSlinky.awsSdk.awsSdkStrings.IamRole
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceType
    - typingsSlinky.awsSdk.awsSdkStrings.AssociationStatus
    - java.lang.String
  */
  type InstanceInformationFilterKey = typingsSlinky.awsSdk.ssmMod._InstanceInformationFilterKey | java.lang.String
  
  type InstanceInformationFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.InstanceInformationFilter]
  
  type InstanceInformationFilterValue = java.lang.String
  
  type InstanceInformationFilterValueSet = js.Array[typingsSlinky.awsSdk.ssmMod.InstanceInformationFilterValue]
  
  type InstanceInformationList = js.Array[typingsSlinky.awsSdk.ssmMod.InstanceInformation]
  
  type InstanceInformationStringFilterKey = java.lang.String
  
  type InstanceInformationStringFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.InstanceInformationStringFilter]
  
  type InstancePatchStateFilterKey = java.lang.String
  
  type InstancePatchStateFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.InstancePatchStateFilter]
  
  type InstancePatchStateFilterValue = java.lang.String
  
  type InstancePatchStateFilterValues = js.Array[typingsSlinky.awsSdk.ssmMod.InstancePatchStateFilterValue]
  
  type InstancePatchStateList = js.Array[typingsSlinky.awsSdk.ssmMod.InstancePatchState]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Equal_
    - typingsSlinky.awsSdk.awsSdkStrings.NotEqual
    - typingsSlinky.awsSdk.awsSdkStrings.LessThan
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThan
    - java.lang.String
  */
  type InstancePatchStateOperatorType = typingsSlinky.awsSdk.ssmMod._InstancePatchStateOperatorType | java.lang.String
  
  type InstancePatchStatesList = js.Array[typingsSlinky.awsSdk.ssmMod.InstancePatchState]
  
  type InstanceTagName = java.lang.String
  
  type InstancesCount = scala.Double
  
  type Integer = scala.Double
  
  type InventoryAggregatorExpression = java.lang.String
  
  type InventoryAggregatorList = js.Array[typingsSlinky.awsSdk.ssmMod.InventoryAggregator]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.string__
    - typingsSlinky.awsSdk.awsSdkStrings.number__
    - java.lang.String
  */
  type InventoryAttributeDataType = typingsSlinky.awsSdk.ssmMod._InventoryAttributeDataType | java.lang.String
  
  type InventoryDeletionLastStatusMessage = java.lang.String
  
  type InventoryDeletionLastStatusUpdateTime = js.Date
  
  type InventoryDeletionStartTime = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Complete_
    - java.lang.String
  */
  type InventoryDeletionStatus = typingsSlinky.awsSdk.ssmMod._InventoryDeletionStatus | java.lang.String
  
  type InventoryDeletionSummaryItems = js.Array[typingsSlinky.awsSdk.ssmMod.InventoryDeletionSummaryItem]
  
  type InventoryDeletionsList = js.Array[typingsSlinky.awsSdk.ssmMod.InventoryDeletionStatusItem]
  
  type InventoryFilterKey = java.lang.String
  
  type InventoryFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.InventoryFilter]
  
  type InventoryFilterValue = java.lang.String
  
  type InventoryFilterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.InventoryFilterValue]
  
  type InventoryGroupList = js.Array[typingsSlinky.awsSdk.ssmMod.InventoryGroup]
  
  type InventoryGroupName = java.lang.String
  
  type InventoryItemAttributeList = js.Array[typingsSlinky.awsSdk.ssmMod.InventoryItemAttribute]
  
  type InventoryItemAttributeName = java.lang.String
  
  type InventoryItemCaptureTime = java.lang.String
  
  type InventoryItemContentContext = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.AttributeValue]
  
  type InventoryItemContentHash = java.lang.String
  
  type InventoryItemEntry = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.AttributeValue]
  
  type InventoryItemEntryList = js.Array[typingsSlinky.awsSdk.ssmMod.InventoryItemEntry]
  
  type InventoryItemList = js.Array[typingsSlinky.awsSdk.ssmMod.InventoryItem]
  
  type InventoryItemSchemaResultList = js.Array[typingsSlinky.awsSdk.ssmMod.InventoryItemSchema]
  
  type InventoryItemSchemaVersion = java.lang.String
  
  type InventoryItemTypeName = java.lang.String
  
  type InventoryItemTypeNameFilter = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Equal_
    - typingsSlinky.awsSdk.awsSdkStrings.NotEqual
    - typingsSlinky.awsSdk.awsSdkStrings.BeginWith
    - typingsSlinky.awsSdk.awsSdkStrings.LessThan
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThan
    - typingsSlinky.awsSdk.awsSdkStrings.Exists
    - java.lang.String
  */
  type InventoryQueryOperatorType = typingsSlinky.awsSdk.ssmMod._InventoryQueryOperatorType | java.lang.String
  
  type InventoryResultEntityId = java.lang.String
  
  type InventoryResultEntityList = js.Array[typingsSlinky.awsSdk.ssmMod.InventoryResultEntity]
  
  type InventoryResultItemKey = java.lang.String
  
  type InventoryResultItemMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.InventoryResultItem]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DisableSchema
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteSchema
    - java.lang.String
  */
  type InventorySchemaDeleteOption = typingsSlinky.awsSdk.ssmMod._InventorySchemaDeleteOption | java.lang.String
  
  type InventoryTypeDisplayName = java.lang.String
  
  type InvocationTraceOutput = java.lang.String
  
  type IsSubTypeSchema = scala.Boolean
  
  type KeyList = js.Array[typingsSlinky.awsSdk.ssmMod.TagKey]
  
  type LastResourceDataSyncMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Successful_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - java.lang.String
  */
  type LastResourceDataSyncStatus = typingsSlinky.awsSdk.ssmMod._LastResourceDataSyncStatus | java.lang.String
  
  type LastResourceDataSyncTime = js.Date
  
  type LastSuccessfulResourceDataSyncTime = js.Date
  
  type Long = scala.Double
  
  type MaintenanceWindowAllowUnassociatedTargets = scala.Boolean
  
  type MaintenanceWindowCutoff = scala.Double
  
  type MaintenanceWindowDescription = java.lang.String
  
  type MaintenanceWindowDurationHours = scala.Double
  
  type MaintenanceWindowEnabled = scala.Boolean
  
  type MaintenanceWindowExecutionId = java.lang.String
  
  type MaintenanceWindowExecutionList = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowExecution]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLING
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.SKIPPED_OVERLAPPING
    - java.lang.String
  */
  type MaintenanceWindowExecutionStatus = typingsSlinky.awsSdk.ssmMod._MaintenanceWindowExecutionStatus | java.lang.String
  
  type MaintenanceWindowExecutionStatusDetails = java.lang.String
  
  type MaintenanceWindowExecutionTaskExecutionId = java.lang.String
  
  type MaintenanceWindowExecutionTaskId = java.lang.String
  
  type MaintenanceWindowExecutionTaskIdList = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowExecutionTaskId]
  
  type MaintenanceWindowExecutionTaskIdentityList = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowExecutionTaskIdentity]
  
  type MaintenanceWindowExecutionTaskInvocationId = java.lang.String
  
  type MaintenanceWindowExecutionTaskInvocationIdentityList = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowExecutionTaskInvocationIdentity]
  
  type MaintenanceWindowExecutionTaskInvocationParameters = java.lang.String
  
  type MaintenanceWindowFilterKey = java.lang.String
  
  type MaintenanceWindowFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowFilter]
  
  type MaintenanceWindowFilterValue = java.lang.String
  
  type MaintenanceWindowFilterValues = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowFilterValue]
  
  type MaintenanceWindowId = java.lang.String
  
  type MaintenanceWindowIdentityList = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowIdentity]
  
  type MaintenanceWindowLambdaClientContext = java.lang.String
  
  type MaintenanceWindowLambdaPayload = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.ssmMod.Blob | java.lang.String
  
  type MaintenanceWindowLambdaQualifier = java.lang.String
  
  type MaintenanceWindowMaxResults = scala.Double
  
  type MaintenanceWindowName = java.lang.String
  
  type MaintenanceWindowOffset = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_GROUP
    - java.lang.String
  */
  type MaintenanceWindowResourceType = typingsSlinky.awsSdk.ssmMod._MaintenanceWindowResourceType | java.lang.String
  
  type MaintenanceWindowSchedule = java.lang.String
  
  type MaintenanceWindowSearchMaxResults = scala.Double
  
  type MaintenanceWindowStepFunctionsInput = java.lang.String
  
  type MaintenanceWindowStepFunctionsName = java.lang.String
  
  type MaintenanceWindowStringDateTime = java.lang.String
  
  type MaintenanceWindowTargetId = java.lang.String
  
  type MaintenanceWindowTargetList = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowTarget]
  
  type MaintenanceWindowTaskArn = java.lang.String
  
  type MaintenanceWindowTaskId = java.lang.String
  
  type MaintenanceWindowTaskList = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowTask]
  
  type MaintenanceWindowTaskParameterName = java.lang.String
  
  type MaintenanceWindowTaskParameterValue = java.lang.String
  
  type MaintenanceWindowTaskParameterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowTaskParameterValue]
  
  type MaintenanceWindowTaskParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowTaskParameterValueExpression]
  
  type MaintenanceWindowTaskParametersList = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowTaskParameters]
  
  type MaintenanceWindowTaskPriority = scala.Double
  
  type MaintenanceWindowTaskTargetId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RUN_COMMAND
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOMATION
    - typingsSlinky.awsSdk.awsSdkStrings.STEP_FUNCTIONS
    - typingsSlinky.awsSdk.awsSdkStrings.LAMBDA
    - java.lang.String
  */
  type MaintenanceWindowTaskType = typingsSlinky.awsSdk.ssmMod._MaintenanceWindowTaskType | java.lang.String
  
  type MaintenanceWindowTimezone = java.lang.String
  
  type MaintenanceWindowsForTargetList = js.Array[typingsSlinky.awsSdk.ssmMod.MaintenanceWindowIdentityForTarget]
  
  type ManagedInstanceId = java.lang.String
  
  type MaxConcurrency = java.lang.String
  
  type MaxErrors = java.lang.String
  
  type MaxResults = scala.Double
  
  type MaxResultsEC2Compatible = scala.Double
  
  type NextToken = java.lang.String
  
  type NormalStringMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.String]
  
  type NotificationArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.All_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.TimedOut_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type NotificationEvent = typingsSlinky.awsSdk.ssmMod._NotificationEvent | java.lang.String
  
  type NotificationEventList = js.Array[typingsSlinky.awsSdk.ssmMod.NotificationEvent]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Command
    - typingsSlinky.awsSdk.awsSdkStrings.Invocation
    - java.lang.String
  */
  type NotificationType = typingsSlinky.awsSdk.ssmMod._NotificationType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS
    - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_LINUX
    - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_LINUX_2
    - typingsSlinky.awsSdk.awsSdkStrings.UBUNTU
    - typingsSlinky.awsSdk.awsSdkStrings.REDHAT_ENTERPRISE_LINUX
    - typingsSlinky.awsSdk.awsSdkStrings.SUSE
    - typingsSlinky.awsSdk.awsSdkStrings.CENTOS
    - typingsSlinky.awsSdk.awsSdkStrings.ORACLE_LINUX
    - typingsSlinky.awsSdk.awsSdkStrings.DEBIAN
    - java.lang.String
  */
  type OperatingSystem = typingsSlinky.awsSdk.ssmMod._OperatingSystem | java.lang.String
  
  type OpsAggregatorList = js.Array[typingsSlinky.awsSdk.ssmMod.OpsAggregator]
  
  type OpsAggregatorType = java.lang.String
  
  type OpsAggregatorValue = java.lang.String
  
  type OpsAggregatorValueKey = java.lang.String
  
  type OpsAggregatorValueMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.OpsAggregatorValue]
  
  type OpsDataAttributeName = java.lang.String
  
  type OpsDataTypeName = java.lang.String
  
  type OpsEntityId = java.lang.String
  
  type OpsEntityItemCaptureTime = java.lang.String
  
  type OpsEntityItemEntry = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.AttributeValue]
  
  type OpsEntityItemEntryList = js.Array[typingsSlinky.awsSdk.ssmMod.OpsEntityItemEntry]
  
  type OpsEntityItemKey = java.lang.String
  
  type OpsEntityItemMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.OpsEntityItem]
  
  type OpsEntityList = js.Array[typingsSlinky.awsSdk.ssmMod.OpsEntity]
  
  type OpsFilterKey = java.lang.String
  
  type OpsFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.OpsFilter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Equal_
    - typingsSlinky.awsSdk.awsSdkStrings.NotEqual
    - typingsSlinky.awsSdk.awsSdkStrings.BeginWith
    - typingsSlinky.awsSdk.awsSdkStrings.LessThan
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThan
    - typingsSlinky.awsSdk.awsSdkStrings.Exists
    - java.lang.String
  */
  type OpsFilterOperatorType = typingsSlinky.awsSdk.ssmMod._OpsFilterOperatorType | java.lang.String
  
  type OpsFilterValue = java.lang.String
  
  type OpsFilterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.OpsFilterValue]
  
  type OpsItemCategory = java.lang.String
  
  type OpsItemDataKey = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SearchableString
    - typingsSlinky.awsSdk.awsSdkStrings.String_
    - java.lang.String
  */
  type OpsItemDataType = typingsSlinky.awsSdk.ssmMod._OpsItemDataType | java.lang.String
  
  type OpsItemDataValueString = java.lang.String
  
  type OpsItemDescription = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.CreatedBy
    - typingsSlinky.awsSdk.awsSdkStrings.Source
    - typingsSlinky.awsSdk.awsSdkStrings.Priority_
    - typingsSlinky.awsSdk.awsSdkStrings.Title_
    - typingsSlinky.awsSdk.awsSdkStrings.OpsItemId
    - typingsSlinky.awsSdk.awsSdkStrings.CreatedTime
    - typingsSlinky.awsSdk.awsSdkStrings.LastModifiedTime
    - typingsSlinky.awsSdk.awsSdkStrings.OperationalData
    - typingsSlinky.awsSdk.awsSdkStrings.OperationalDataKey
    - typingsSlinky.awsSdk.awsSdkStrings.OperationalDataValue
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceId
    - typingsSlinky.awsSdk.awsSdkStrings.AutomationId
    - typingsSlinky.awsSdk.awsSdkStrings.Category
    - typingsSlinky.awsSdk.awsSdkStrings.Severity_
    - java.lang.String
  */
  type OpsItemFilterKey = typingsSlinky.awsSdk.ssmMod._OpsItemFilterKey | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Equal_
    - typingsSlinky.awsSdk.awsSdkStrings.Contains_
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThan
    - typingsSlinky.awsSdk.awsSdkStrings.LessThan
    - java.lang.String
  */
  type OpsItemFilterOperator = typingsSlinky.awsSdk.ssmMod._OpsItemFilterOperator | java.lang.String
  
  type OpsItemFilterValue = java.lang.String
  
  type OpsItemFilterValues = js.Array[typingsSlinky.awsSdk.ssmMod.OpsItemFilterValue]
  
  type OpsItemFilters = js.Array[typingsSlinky.awsSdk.ssmMod.OpsItemFilter]
  
  type OpsItemId = java.lang.String
  
  type OpsItemMaxResults = scala.Double
  
  type OpsItemNotifications = js.Array[typingsSlinky.awsSdk.ssmMod.OpsItemNotification]
  
  type OpsItemOperationalData = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.OpsItemDataValue]
  
  type OpsItemOpsDataKeysList = js.Array[typingsSlinky.awsSdk.ssmMod.String]
  
  type OpsItemPriority = scala.Double
  
  type OpsItemSeverity = java.lang.String
  
  type OpsItemSource = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Open_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Resolved_
    - java.lang.String
  */
  type OpsItemStatus = typingsSlinky.awsSdk.ssmMod._OpsItemStatus | java.lang.String
  
  type OpsItemSummaries = js.Array[typingsSlinky.awsSdk.ssmMod.OpsItemSummary]
  
  type OpsItemTitle = java.lang.String
  
  type OpsResultAttributeList = js.Array[typingsSlinky.awsSdk.ssmMod.OpsResultAttribute]
  
  type OutputSourceId = java.lang.String
  
  type OutputSourceType = java.lang.String
  
  type OwnerInformation = java.lang.String
  
  type PSParameterName = java.lang.String
  
  type PSParameterSelector = java.lang.String
  
  type PSParameterValue = java.lang.String
  
  type PSParameterVersion = scala.Double
  
  type ParameterDataType = java.lang.String
  
  type ParameterDescription = java.lang.String
  
  type ParameterHistoryList = js.Array[typingsSlinky.awsSdk.ssmMod.ParameterHistory]
  
  type ParameterKeyId = java.lang.String
  
  type ParameterLabel = java.lang.String
  
  type ParameterLabelList = js.Array[typingsSlinky.awsSdk.ssmMod.ParameterLabel]
  
  type ParameterList = js.Array[typingsSlinky.awsSdk.ssmMod.Parameter]
  
  type ParameterMetadataList = js.Array[typingsSlinky.awsSdk.ssmMod.ParameterMetadata]
  
  type ParameterName = java.lang.String
  
  type ParameterNameList = js.Array[typingsSlinky.awsSdk.ssmMod.PSParameterName]
  
  type ParameterPolicies = java.lang.String
  
  type ParameterPolicyList = js.Array[typingsSlinky.awsSdk.ssmMod.ParameterInlinePolicy]
  
  type ParameterStringFilterKey = java.lang.String
  
  type ParameterStringFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.ParameterStringFilter]
  
  type ParameterStringFilterValue = java.lang.String
  
  type ParameterStringFilterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.ParameterStringFilterValue]
  
  type ParameterStringQueryOption = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Standard_
    - typingsSlinky.awsSdk.awsSdkStrings.Advanced
    - typingsSlinky.awsSdk.awsSdkStrings.`Intelligent-Tiering`
    - java.lang.String
  */
  type ParameterTier = typingsSlinky.awsSdk.ssmMod._ParameterTier | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.String_
    - typingsSlinky.awsSdk.awsSdkStrings.StringList
    - typingsSlinky.awsSdk.awsSdkStrings.SecureString
    - java.lang.String
  */
  type ParameterType = typingsSlinky.awsSdk.ssmMod._ParameterType | java.lang.String
  
  type ParameterValue = java.lang.String
  
  type ParameterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.ParameterValue]
  
  type Parameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.ParameterValueList]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.Type_
    - typingsSlinky.awsSdk.awsSdkStrings.KeyId
    - java.lang.String
  */
  type ParametersFilterKey = typingsSlinky.awsSdk.ssmMod._ParametersFilterKey | java.lang.String
  
  type ParametersFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.ParametersFilter]
  
  type ParametersFilterValue = java.lang.String
  
  type ParametersFilterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.ParametersFilterValue]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW_AS_DEPENDENCY
    - typingsSlinky.awsSdk.awsSdkStrings.BLOCK
    - java.lang.String
  */
  type PatchAction = typingsSlinky.awsSdk.ssmMod._PatchAction | java.lang.String
  
  type PatchAdvisoryId = java.lang.String
  
  type PatchAdvisoryIdList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchAdvisoryId]
  
  type PatchArch = java.lang.String
  
  type PatchBaselineIdentityList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchBaselineIdentity]
  
  type PatchBaselineMaxResults = scala.Double
  
  type PatchBugzillaId = java.lang.String
  
  type PatchBugzillaIdList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchBugzillaId]
  
  type PatchCVEId = java.lang.String
  
  type PatchCVEIdList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchCVEId]
  
  type PatchCVEIds = java.lang.String
  
  type PatchClassification = java.lang.String
  
  type PatchComplianceDataList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchComplianceData]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INSTALLED
    - typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_OTHER
    - typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_PENDING_REBOOT
    - typingsSlinky.awsSdk.awsSdkStrings.INSTALLED_REJECTED
    - typingsSlinky.awsSdk.awsSdkStrings.MISSING
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_APPLICABLE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type PatchComplianceDataState = typingsSlinky.awsSdk.ssmMod._PatchComplianceDataState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CRITICAL
    - typingsSlinky.awsSdk.awsSdkStrings.HIGH
    - typingsSlinky.awsSdk.awsSdkStrings.MEDIUM
    - typingsSlinky.awsSdk.awsSdkStrings.LOW
    - typingsSlinky.awsSdk.awsSdkStrings.INFORMATIONAL
    - typingsSlinky.awsSdk.awsSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type PatchComplianceLevel = typingsSlinky.awsSdk.ssmMod._PatchComplianceLevel | java.lang.String
  
  type PatchComplianceMaxResults = scala.Double
  
  type PatchContentUrl = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.APPROVED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_APPROVAL
    - typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_APPROVED
    - typingsSlinky.awsSdk.awsSdkStrings.EXPLICIT_REJECTED
    - java.lang.String
  */
  type PatchDeploymentStatus = typingsSlinky.awsSdk.ssmMod._PatchDeploymentStatus | java.lang.String
  
  type PatchDescription = java.lang.String
  
  type PatchEpoch = scala.Double
  
  type PatchFailedCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ARCH
    - typingsSlinky.awsSdk.awsSdkStrings.ADVISORY_ID
    - typingsSlinky.awsSdk.awsSdkStrings.BUGZILLA_ID
    - typingsSlinky.awsSdk.awsSdkStrings.PATCH_SET
    - typingsSlinky.awsSdk.awsSdkStrings.PRODUCT
    - typingsSlinky.awsSdk.awsSdkStrings.PRODUCT_FAMILY
    - typingsSlinky.awsSdk.awsSdkStrings.CLASSIFICATION
    - typingsSlinky.awsSdk.awsSdkStrings.CVE_ID
    - typingsSlinky.awsSdk.awsSdkStrings.EPOCH
    - typingsSlinky.awsSdk.awsSdkStrings.MSRC_SEVERITY
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - typingsSlinky.awsSdk.awsSdkStrings.PATCH_ID
    - typingsSlinky.awsSdk.awsSdkStrings.SECTION
    - typingsSlinky.awsSdk.awsSdkStrings.PRIORITY
    - typingsSlinky.awsSdk.awsSdkStrings.REPOSITORY
    - typingsSlinky.awsSdk.awsSdkStrings.RELEASE
    - typingsSlinky.awsSdk.awsSdkStrings.SEVERITY
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY
    - typingsSlinky.awsSdk.awsSdkStrings.VERSION
    - java.lang.String
  */
  type PatchFilterKey = typingsSlinky.awsSdk.ssmMod._PatchFilterKey | java.lang.String
  
  type PatchFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchFilter]
  
  type PatchFilterValue = java.lang.String
  
  type PatchFilterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchFilterValue]
  
  type PatchGroup = java.lang.String
  
  type PatchGroupList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchGroup]
  
  type PatchGroupPatchBaselineMappingList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchGroupPatchBaselineMapping]
  
  type PatchId = java.lang.String
  
  type PatchIdList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchId]
  
  type PatchInstalledCount = scala.Double
  
  type PatchInstalledOtherCount = scala.Double
  
  type PatchInstalledPendingRebootCount = scala.Double
  
  type PatchInstalledRejectedCount = scala.Double
  
  type PatchKbNumber = java.lang.String
  
  type PatchLanguage = java.lang.String
  
  type PatchList = js.Array[typingsSlinky.awsSdk.ssmMod.Patch]
  
  type PatchMissingCount = scala.Double
  
  type PatchMsrcNumber = java.lang.String
  
  type PatchMsrcSeverity = java.lang.String
  
  type PatchName = java.lang.String
  
  type PatchNotApplicableCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Scan
    - typingsSlinky.awsSdk.awsSdkStrings.Install_
    - java.lang.String
  */
  type PatchOperationType = typingsSlinky.awsSdk.ssmMod._PatchOperationType | java.lang.String
  
  type PatchOrchestratorFilterKey = java.lang.String
  
  type PatchOrchestratorFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchOrchestratorFilter]
  
  type PatchOrchestratorFilterValue = java.lang.String
  
  type PatchOrchestratorFilterValues = js.Array[typingsSlinky.awsSdk.ssmMod.PatchOrchestratorFilterValue]
  
  type PatchProduct = java.lang.String
  
  type PatchProductFamily = java.lang.String
  
  type PatchPropertiesList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchPropertyEntry]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PRODUCT
    - typingsSlinky.awsSdk.awsSdkStrings.PRODUCT_FAMILY
    - typingsSlinky.awsSdk.awsSdkStrings.CLASSIFICATION
    - typingsSlinky.awsSdk.awsSdkStrings.MSRC_SEVERITY
    - typingsSlinky.awsSdk.awsSdkStrings.PRIORITY
    - typingsSlinky.awsSdk.awsSdkStrings.SEVERITY
    - java.lang.String
  */
  type PatchProperty = typingsSlinky.awsSdk.ssmMod._PatchProperty | java.lang.String
  
  type PatchPropertyEntry = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.AttributeValue]
  
  type PatchRelease = java.lang.String
  
  type PatchRepository = java.lang.String
  
  type PatchRuleList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchRule]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OS
    - typingsSlinky.awsSdk.awsSdkStrings.APPLICATION
    - java.lang.String
  */
  type PatchSet = typingsSlinky.awsSdk.ssmMod._PatchSet | java.lang.String
  
  type PatchSeverity = java.lang.String
  
  type PatchSourceConfiguration = java.lang.String
  
  type PatchSourceList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchSource]
  
  type PatchSourceName = java.lang.String
  
  type PatchSourceProduct = java.lang.String
  
  type PatchSourceProductList = js.Array[typingsSlinky.awsSdk.ssmMod.PatchSourceProduct]
  
  type PatchStringDateTime = java.lang.String
  
  type PatchTitle = java.lang.String
  
  type PatchUnreportedNotApplicableCount = scala.Double
  
  type PatchVendor = java.lang.String
  
  type PatchVersion = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Online_
    - typingsSlinky.awsSdk.awsSdkStrings.ConnectionLost
    - typingsSlinky.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type PingStatus = typingsSlinky.awsSdk.ssmMod._PingStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Windows_
    - typingsSlinky.awsSdk.awsSdkStrings.Linux_
    - java.lang.String
  */
  type PlatformType = typingsSlinky.awsSdk.ssmMod._PlatformType | java.lang.String
  
  type PlatformTypeList = js.Array[typingsSlinky.awsSdk.ssmMod.PlatformType]
  
  type Product = java.lang.String
  
  type PutInventoryMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RebootIfNeeded
    - typingsSlinky.awsSdk.awsSdkStrings.NoReboot
    - java.lang.String
  */
  type RebootOption = typingsSlinky.awsSdk.ssmMod._RebootOption | java.lang.String
  
  type Region = java.lang.String
  
  type Regions = js.Array[typingsSlinky.awsSdk.ssmMod.Region]
  
  type RegistrationLimit = scala.Double
  
  type RegistrationsCount = scala.Double
  
  type RelatedOpsItems = js.Array[typingsSlinky.awsSdk.ssmMod.RelatedOpsItem]
  
  type RemainingCount = scala.Double
  
  type ResourceComplianceSummaryItemList = js.Array[typingsSlinky.awsSdk.ssmMod.ResourceComplianceSummaryItem]
  
  type ResourceCount = scala.Double
  
  type ResourceCountByStatus = java.lang.String
  
  type ResourceDataSyncAWSKMSKeyARN = java.lang.String
  
  type ResourceDataSyncCreatedTime = js.Date
  
  type ResourceDataSyncDestinationDataSharingType = java.lang.String
  
  type ResourceDataSyncIncludeFutureRegions = scala.Boolean
  
  type ResourceDataSyncItemList = js.Array[typingsSlinky.awsSdk.ssmMod.ResourceDataSyncItem]
  
  type ResourceDataSyncLastModifiedTime = js.Date
  
  type ResourceDataSyncName = java.lang.String
  
  type ResourceDataSyncOrganizationSourceType = java.lang.String
  
  type ResourceDataSyncOrganizationalUnitId = java.lang.String
  
  type ResourceDataSyncOrganizationalUnitList = js.Array[typingsSlinky.awsSdk.ssmMod.ResourceDataSyncOrganizationalUnit]
  
  type ResourceDataSyncS3BucketName = java.lang.String
  
  type ResourceDataSyncS3Format = typingsSlinky.awsSdk.awsSdkStrings.JsonSerDe | java.lang.String
  
  type ResourceDataSyncS3Prefix = java.lang.String
  
  type ResourceDataSyncS3Region = java.lang.String
  
  type ResourceDataSyncSourceRegion = java.lang.String
  
  type ResourceDataSyncSourceRegionList = js.Array[typingsSlinky.awsSdk.ssmMod.ResourceDataSyncSourceRegion]
  
  type ResourceDataSyncSourceType = java.lang.String
  
  type ResourceDataSyncState = java.lang.String
  
  type ResourceDataSyncType = java.lang.String
  
  type ResourceId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ManagedInstance
    - typingsSlinky.awsSdk.awsSdkStrings.Document_
    - typingsSlinky.awsSdk.awsSdkStrings.EC2Instance
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.ssmMod._ResourceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Document_
    - typingsSlinky.awsSdk.awsSdkStrings.ManagedInstance
    - typingsSlinky.awsSdk.awsSdkStrings.MaintenanceWindow
    - typingsSlinky.awsSdk.awsSdkStrings.Parameter
    - typingsSlinky.awsSdk.awsSdkStrings.PatchBaseline
    - typingsSlinky.awsSdk.awsSdkStrings.OpsItem
    - java.lang.String
  */
  type ResourceTypeForTagging = typingsSlinky.awsSdk.ssmMod._ResourceTypeForTagging | java.lang.String
  
  type ResponseCode = scala.Double
  
  type ResultAttributeList = js.Array[typingsSlinky.awsSdk.ssmMod.ResultAttribute]
  
  type S3BucketName = java.lang.String
  
  type S3KeyPrefix = java.lang.String
  
  type S3Region = java.lang.String
  
  type ScheduleExpression = java.lang.String
  
  type ScheduledWindowExecutionList = js.Array[typingsSlinky.awsSdk.ssmMod.ScheduledWindowExecution]
  
  type ServiceRole = java.lang.String
  
  type ServiceSettingId = java.lang.String
  
  type ServiceSettingValue = java.lang.String
  
  type SessionDetails = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InvokedAfter
    - typingsSlinky.awsSdk.awsSdkStrings.InvokedBefore
    - typingsSlinky.awsSdk.awsSdkStrings.Target
    - typingsSlinky.awsSdk.awsSdkStrings.Owner_
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.SessionId
    - java.lang.String
  */
  type SessionFilterKey = typingsSlinky.awsSdk.ssmMod._SessionFilterKey | java.lang.String
  
  type SessionFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.SessionFilter]
  
  type SessionFilterValue = java.lang.String
  
  type SessionId = java.lang.String
  
  type SessionList = js.Array[typingsSlinky.awsSdk.ssmMod.Session]
  
  type SessionManagerCloudWatchOutputUrl = java.lang.String
  
  type SessionManagerParameterName = java.lang.String
  
  type SessionManagerParameterValue = java.lang.String
  
  type SessionManagerParameterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.SessionManagerParameterValue]
  
  type SessionManagerParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.SessionManagerParameterValueList]
  
  type SessionManagerS3OutputUrl = java.lang.String
  
  type SessionMaxResults = scala.Double
  
  type SessionOwner = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.History
    - java.lang.String
  */
  type SessionState = typingsSlinky.awsSdk.ssmMod._SessionState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Connected_
    - typingsSlinky.awsSdk.awsSdkStrings.Connecting_
    - typingsSlinky.awsSdk.awsSdkStrings.Disconnected_
    - typingsSlinky.awsSdk.awsSdkStrings.Terminated_
    - typingsSlinky.awsSdk.awsSdkStrings.Terminating_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type SessionStatus = typingsSlinky.awsSdk.ssmMod._SessionStatus | java.lang.String
  
  type SessionTarget = java.lang.String
  
  type SharedDocumentVersion = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Approve_
    - typingsSlinky.awsSdk.awsSdkStrings.Reject_
    - typingsSlinky.awsSdk.awsSdkStrings.StartStep
    - typingsSlinky.awsSdk.awsSdkStrings.StopStep
    - typingsSlinky.awsSdk.awsSdkStrings.Resume
    - java.lang.String
  */
  type SignalType = typingsSlinky.awsSdk.ssmMod._SignalType | java.lang.String
  
  type SnapshotDownloadUrl = java.lang.String
  
  type SnapshotId = java.lang.String
  
  type StandardErrorContent = java.lang.String
  
  type StandardOutputContent = java.lang.String
  
  type StatusAdditionalInfo = java.lang.String
  
  type StatusDetails = java.lang.String
  
  type StatusMessage = java.lang.String
  
  type StatusName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.StartTimeBefore
    - typingsSlinky.awsSdk.awsSdkStrings.StartTimeAfter
    - typingsSlinky.awsSdk.awsSdkStrings.StepExecutionStatus
    - typingsSlinky.awsSdk.awsSdkStrings.StepExecutionId
    - typingsSlinky.awsSdk.awsSdkStrings.StepName
    - typingsSlinky.awsSdk.awsSdkStrings.Action_
    - java.lang.String
  */
  type StepExecutionFilterKey = typingsSlinky.awsSdk.ssmMod._StepExecutionFilterKey | java.lang.String
  
  type StepExecutionFilterList = js.Array[typingsSlinky.awsSdk.ssmMod.StepExecutionFilter]
  
  type StepExecutionFilterValue = java.lang.String
  
  type StepExecutionFilterValueList = js.Array[typingsSlinky.awsSdk.ssmMod.StepExecutionFilterValue]
  
  type StepExecutionList = js.Array[typingsSlinky.awsSdk.ssmMod.StepExecution]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Complete_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancel_
    - java.lang.String
  */
  type StopType = typingsSlinky.awsSdk.ssmMod._StopType | java.lang.String
  
  type StreamUrl = java.lang.String
  
  type String = java.lang.String
  
  type StringDateTime = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.ssmMod.String]
  
  type TagKey = java.lang.String
  
  type TagList = js.Array[typingsSlinky.awsSdk.ssmMod.Tag]
  
  type TagValue = java.lang.String
  
  type TargetCount = scala.Double
  
  type TargetKey = java.lang.String
  
  type TargetLocations = js.Array[typingsSlinky.awsSdk.ssmMod.TargetLocation]
  
  type TargetMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ssmMod.TargetMapValueList]
  
  type TargetMapKey = java.lang.String
  
  type TargetMapValue = java.lang.String
  
  type TargetMapValueList = js.Array[typingsSlinky.awsSdk.ssmMod.TargetMapValue]
  
  type TargetMaps = js.Array[typingsSlinky.awsSdk.ssmMod.TargetMap]
  
  type TargetParameterList = js.Array[typingsSlinky.awsSdk.ssmMod.ParameterValue]
  
  type TargetType = java.lang.String
  
  type TargetValue = java.lang.String
  
  type TargetValues = js.Array[typingsSlinky.awsSdk.ssmMod.TargetValue]
  
  type Targets = js.Array[typingsSlinky.awsSdk.ssmMod.Target]
  
  type TimeoutSeconds = scala.Double
  
  type TokenValue = java.lang.String
  
  type TotalCount = scala.Double
  
  type UUID = java.lang.String
  
  type Url = java.lang.String
  
  type ValidNextStep = java.lang.String
  
  type ValidNextStepList = js.Array[typingsSlinky.awsSdk.ssmMod.ValidNextStep]
  
  type Version = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-11-06`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ssmMod._apiVersion | java.lang.String
}

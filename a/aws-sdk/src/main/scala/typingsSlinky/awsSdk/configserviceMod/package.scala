package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object configserviceMod {
  
  type ARN = java.lang.String
  
  type AccountAggregationSourceAccountList = js.Array[typingsSlinky.awsSdk.configserviceMod.AccountId]
  
  type AccountAggregationSourceList = js.Array[typingsSlinky.awsSdk.configserviceMod.AccountAggregationSource]
  
  type AccountId = java.lang.String
  
  type AggregateComplianceByConfigRuleList = js.Array[typingsSlinky.awsSdk.configserviceMod.AggregateComplianceByConfigRule]
  
  type AggregateComplianceCountList = js.Array[typingsSlinky.awsSdk.configserviceMod.AggregateComplianceCount]
  
  type AggregateEvaluationResultList = js.Array[typingsSlinky.awsSdk.configserviceMod.AggregateEvaluationResult]
  
  type AggregatedSourceStatusList = js.Array[typingsSlinky.awsSdk.configserviceMod.AggregatedSourceStatus]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.OUTDATED
    - java.lang.String
  */
  type AggregatedSourceStatusType = typingsSlinky.awsSdk.configserviceMod._AggregatedSourceStatusType | java.lang.String
  
  type AggregatedSourceStatusTypeList = js.Array[typingsSlinky.awsSdk.configserviceMod.AggregatedSourceStatusType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION
    - java.lang.String
  */
  type AggregatedSourceType = typingsSlinky.awsSdk.configserviceMod._AggregatedSourceType | java.lang.String
  
  type AggregationAuthorizationList = js.Array[typingsSlinky.awsSdk.configserviceMod.AggregationAuthorization]
  
  type AggregatorRegionList = js.Array[typingsSlinky.awsSdk.configserviceMod.String]
  
  type AllSupported = scala.Boolean
  
  type AmazonResourceName = java.lang.String
  
  type Annotation = java.lang.String
  
  type AutoRemediationAttemptSeconds = scala.Double
  
  type AutoRemediationAttempts = scala.Double
  
  type AvailabilityZone = java.lang.String
  
  type AwsRegion = java.lang.String
  
  type BaseConfigurationItems = js.Array[typingsSlinky.awsSdk.configserviceMod.BaseConfigurationItem]
  
  type BaseResourceId = java.lang.String
  
  type Boolean = scala.Boolean
  
  type ChannelName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Reverse
    - typingsSlinky.awsSdk.awsSdkStrings.Forward_
    - java.lang.String
  */
  type ChronologicalOrder = typingsSlinky.awsSdk.configserviceMod._ChronologicalOrder | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.configserviceMod.ClientApiVersions
  
  type ComplianceByConfigRules = js.Array[typingsSlinky.awsSdk.configserviceMod.ComplianceByConfigRule]
  
  type ComplianceByResources = js.Array[typingsSlinky.awsSdk.configserviceMod.ComplianceByResource]
  
  type ComplianceResourceTypes = js.Array[typingsSlinky.awsSdk.configserviceMod.StringWithCharLimit256]
  
  type ComplianceSummariesByResourceType = js.Array[typingsSlinky.awsSdk.configserviceMod.ComplianceSummaryByResourceType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANT
    - typingsSlinky.awsSdk.awsSdkStrings.NON_COMPLIANT
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_APPLICABLE
    - typingsSlinky.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type ComplianceType = typingsSlinky.awsSdk.configserviceMod._ComplianceType | java.lang.String
  
  type ComplianceTypes = js.Array[typingsSlinky.awsSdk.configserviceMod.ComplianceType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT_ID
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_REGION
    - java.lang.String
  */
  type ConfigRuleComplianceSummaryGroupKey = typingsSlinky.awsSdk.configserviceMod._ConfigRuleComplianceSummaryGroupKey | java.lang.String
  
  type ConfigRuleEvaluationStatusList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConfigRuleEvaluationStatus]
  
  type ConfigRuleName = java.lang.String
  
  type ConfigRuleNames = js.Array[typingsSlinky.awsSdk.configserviceMod.ConfigRuleName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING_RESULTS
    - typingsSlinky.awsSdk.awsSdkStrings.EVALUATING
    - java.lang.String
  */
  type ConfigRuleState = typingsSlinky.awsSdk.configserviceMod._ConfigRuleState | java.lang.String
  
  type ConfigRules = js.Array[typingsSlinky.awsSdk.configserviceMod.ConfigRule]
  
  type Configuration = java.lang.String
  
  type ConfigurationAggregatorArn = java.lang.String
  
  type ConfigurationAggregatorList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregator]
  
  type ConfigurationAggregatorName = java.lang.String
  
  type ConfigurationAggregatorNameList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregatorName]
  
  type ConfigurationItemCaptureTime = js.Date
  
  type ConfigurationItemList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConfigurationItem]
  
  type ConfigurationItemMD5Hash = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OK
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceDiscovered
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceNotRecorded
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceDeleted
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceDeletedNotRecorded
    - java.lang.String
  */
  type ConfigurationItemStatus = typingsSlinky.awsSdk.configserviceMod._ConfigurationItemStatus | java.lang.String
  
  type ConfigurationRecorderList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConfigurationRecorder]
  
  type ConfigurationRecorderNameList = js.Array[typingsSlinky.awsSdk.configserviceMod.RecorderName]
  
  type ConfigurationRecorderStatusList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConfigurationRecorderStatus]
  
  type ConfigurationStateId = java.lang.String
  
  type ConformancePackArn = java.lang.String
  
  type ConformancePackComplianceResourceIds = js.Array[typingsSlinky.awsSdk.configserviceMod.StringWithCharLimit256]
  
  type ConformancePackComplianceSummaryList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConformancePackComplianceSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANT
    - typingsSlinky.awsSdk.awsSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type ConformancePackComplianceType = typingsSlinky.awsSdk.configserviceMod._ConformancePackComplianceType | java.lang.String
  
  type ConformancePackConfigRuleNames = js.Array[typingsSlinky.awsSdk.configserviceMod.StringWithCharLimit64]
  
  type ConformancePackDetailList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConformancePackDetail]
  
  type ConformancePackId = java.lang.String
  
  type ConformancePackInputParameters = js.Array[typingsSlinky.awsSdk.configserviceMod.ConformancePackInputParameter]
  
  type ConformancePackName = java.lang.String
  
  type ConformancePackNamesList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConformancePackName]
  
  type ConformancePackNamesToSummarizeList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConformancePackName]
  
  type ConformancePackRuleComplianceList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConformancePackRuleCompliance]
  
  type ConformancePackRuleEvaluationResultsList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConformancePackEvaluationResult]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type ConformancePackState = typingsSlinky.awsSdk.configserviceMod._ConformancePackState | java.lang.String
  
  type ConformancePackStatusDetailsList = js.Array[typingsSlinky.awsSdk.configserviceMod.ConformancePackStatusDetail]
  
  type ConformancePackStatusReason = java.lang.String
  
  type CosmosPageLimit = scala.Double
  
  type Date = js.Date
  
  type DeliveryChannelList = js.Array[typingsSlinky.awsSdk.configserviceMod.DeliveryChannel]
  
  type DeliveryChannelNameList = js.Array[typingsSlinky.awsSdk.configserviceMod.ChannelName]
  
  type DeliveryChannelStatusList = js.Array[typingsSlinky.awsSdk.configserviceMod.DeliveryChannelStatus]
  
  type DeliveryS3Bucket = java.lang.String
  
  type DeliveryS3KeyPrefix = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.Failure_
    - typingsSlinky.awsSdk.awsSdkStrings.Not_Applicable_
    - java.lang.String
  */
  type DeliveryStatus = typingsSlinky.awsSdk.configserviceMod._DeliveryStatus | java.lang.String
  
  type DescribeConformancePackComplianceLimit = scala.Double
  
  type DescribePendingAggregationRequestsLimit = scala.Double
  
  type DiscoveredResourceIdentifierList = js.Array[typingsSlinky.awsSdk.configserviceMod.AggregateResourceIdentifier]
  
  type EarlierTime = js.Date
  
  type EmptiableStringWithCharLimit256 = java.lang.String
  
  type EvaluationResults = js.Array[typingsSlinky.awsSdk.configserviceMod.EvaluationResult]
  
  type Evaluations = js.Array[typingsSlinky.awsSdk.configserviceMod.Evaluation]
  
  type EventSource = typingsSlinky.awsSdk.awsSdkStrings.awsDotconfig | java.lang.String
  
  type ExcludedAccounts = js.Array[typingsSlinky.awsSdk.configserviceMod.AccountId]
  
  type Expression = java.lang.String
  
  type FailedDeleteRemediationExceptionsBatches = js.Array[typingsSlinky.awsSdk.configserviceMod.FailedDeleteRemediationExceptionsBatch]
  
  type FailedRemediationBatches = js.Array[typingsSlinky.awsSdk.configserviceMod.FailedRemediationBatch]
  
  type FailedRemediationExceptionBatches = js.Array[typingsSlinky.awsSdk.configserviceMod.FailedRemediationExceptionBatch]
  
  type FieldInfoList = js.Array[typingsSlinky.awsSdk.configserviceMod.FieldInfo]
  
  type FieldName = java.lang.String
  
  type GetConformancePackComplianceDetailsLimit = scala.Double
  
  type GroupByAPILimit = scala.Double
  
  type GroupedResourceCountList = js.Array[typingsSlinky.awsSdk.configserviceMod.GroupedResourceCount]
  
  type IncludeGlobalResourceTypes = scala.Boolean
  
  type Integer = scala.Double
  
  type LaterTime = js.Date
  
  type Limit = scala.Double
  
  type Long = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.One_Hour_
    - typingsSlinky.awsSdk.awsSdkStrings.Three_Hours
    - typingsSlinky.awsSdk.awsSdkStrings.Six_Hours_
    - typingsSlinky.awsSdk.awsSdkStrings.Twelve_Hours
    - typingsSlinky.awsSdk.awsSdkStrings.TwentyFour_Hours
    - java.lang.String
  */
  type MaximumExecutionFrequency = typingsSlinky.awsSdk.configserviceMod._MaximumExecutionFrequency | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type MemberAccountRuleStatus = typingsSlinky.awsSdk.configserviceMod._MemberAccountRuleStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
    - typingsSlinky.awsSdk.awsSdkStrings.ConfigurationSnapshotDeliveryCompleted
    - typingsSlinky.awsSdk.awsSdkStrings.ScheduledNotification
    - typingsSlinky.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
    - java.lang.String
  */
  type MessageType = typingsSlinky.awsSdk.configserviceMod._MessageType | java.lang.String
  
  type Name = java.lang.String
  
  type NextToken = java.lang.String
  
  type OrderingTimestamp = js.Date
  
  type OrganizationConfigRuleDetailedStatus = js.Array[typingsSlinky.awsSdk.configserviceMod.MemberAccountStatus]
  
  type OrganizationConfigRuleName = java.lang.String
  
  type OrganizationConfigRuleNames = js.Array[typingsSlinky.awsSdk.configserviceMod.StringWithCharLimit64]
  
  type OrganizationConfigRuleStatuses = js.Array[typingsSlinky.awsSdk.configserviceMod.OrganizationConfigRuleStatus]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
    - typingsSlinky.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
    - typingsSlinky.awsSdk.awsSdkStrings.ScheduledNotification
    - java.lang.String
  */
  type OrganizationConfigRuleTriggerType = typingsSlinky.awsSdk.configserviceMod._OrganizationConfigRuleTriggerType | java.lang.String
  
  type OrganizationConfigRuleTriggerTypes = js.Array[typingsSlinky.awsSdk.configserviceMod.OrganizationConfigRuleTriggerType]
  
  type OrganizationConfigRules = js.Array[typingsSlinky.awsSdk.configserviceMod.OrganizationConfigRule]
  
  type OrganizationConformancePackDetailedStatuses = js.Array[typingsSlinky.awsSdk.configserviceMod.OrganizationConformancePackDetailedStatus]
  
  type OrganizationConformancePackName = java.lang.String
  
  type OrganizationConformancePackNames = js.Array[typingsSlinky.awsSdk.configserviceMod.OrganizationConformancePackName]
  
  type OrganizationConformancePackStatuses = js.Array[typingsSlinky.awsSdk.configserviceMod.OrganizationConformancePackStatus]
  
  type OrganizationConformancePacks = js.Array[typingsSlinky.awsSdk.configserviceMod.OrganizationConformancePack]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationResourceDetailedStatus = typingsSlinky.awsSdk.configserviceMod._OrganizationResourceDetailedStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationResourceStatus = typingsSlinky.awsSdk.configserviceMod._OrganizationResourceStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationRuleStatus = typingsSlinky.awsSdk.configserviceMod._OrganizationRuleStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM_LAMBDA
    - typingsSlinky.awsSdk.awsSdkStrings.AWS
    - java.lang.String
  */
  type Owner = typingsSlinky.awsSdk.configserviceMod._Owner | java.lang.String
  
  type PageSizeLimit = scala.Double
  
  type ParameterName = java.lang.String
  
  type ParameterValue = java.lang.String
  
  type PendingAggregationRequestList = js.Array[typingsSlinky.awsSdk.configserviceMod.PendingAggregationRequest]
  
  type Percentage = scala.Double
  
  type RecorderName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.Failure_
    - java.lang.String
  */
  type RecorderStatus = typingsSlinky.awsSdk.configserviceMod._RecorderStatus | java.lang.String
  
  type ReevaluateConfigRuleNames = js.Array[typingsSlinky.awsSdk.configserviceMod.ConfigRuleName]
  
  type RelatedEvent = java.lang.String
  
  type RelatedEventList = js.Array[typingsSlinky.awsSdk.configserviceMod.RelatedEvent]
  
  type RelationshipList = js.Array[typingsSlinky.awsSdk.configserviceMod.Relationship]
  
  type RelationshipName = java.lang.String
  
  type RemediationConfigurations = js.Array[typingsSlinky.awsSdk.configserviceMod.RemediationConfiguration]
  
  type RemediationExceptionResourceKeys = js.Array[typingsSlinky.awsSdk.configserviceMod.RemediationExceptionResourceKey]
  
  type RemediationExceptions = js.Array[typingsSlinky.awsSdk.configserviceMod.RemediationException]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RemediationExecutionState = typingsSlinky.awsSdk.configserviceMod._RemediationExecutionState | java.lang.String
  
  type RemediationExecutionStatuses = js.Array[typingsSlinky.awsSdk.configserviceMod.RemediationExecutionStatus]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RemediationExecutionStepState = typingsSlinky.awsSdk.configserviceMod._RemediationExecutionStepState | java.lang.String
  
  type RemediationExecutionSteps = js.Array[typingsSlinky.awsSdk.configserviceMod.RemediationExecutionStep]
  
  type RemediationParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.configserviceMod.RemediationParameterValue]
  
  type RemediationTargetType = typingsSlinky.awsSdk.awsSdkStrings.SSM_DOCUMENT | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT_ID
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_REGION
    - java.lang.String
  */
  type ResourceCountGroupKey = typingsSlinky.awsSdk.configserviceMod._ResourceCountGroupKey | java.lang.String
  
  type ResourceCounts = js.Array[typingsSlinky.awsSdk.configserviceMod.ResourceCount]
  
  type ResourceCreationTime = js.Date
  
  type ResourceDeletionTime = js.Date
  
  type ResourceId = java.lang.String
  
  type ResourceIdList = js.Array[typingsSlinky.awsSdk.configserviceMod.ResourceId]
  
  type ResourceIdentifierList = js.Array[typingsSlinky.awsSdk.configserviceMod.ResourceIdentifier]
  
  type ResourceIdentifiersList = js.Array[typingsSlinky.awsSdk.configserviceMod.AggregateResourceIdentifier]
  
  type ResourceKeys = js.Array[typingsSlinky.awsSdk.configserviceMod.ResourceKey]
  
  type ResourceName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonCustomerGateway
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonEIP
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonHost
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonInstance
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonInternetGateway
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNetworkAcl
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNetworkInterface
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonRouteTable
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonSecurityGroup
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonSubnet
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonCloudTrailColonColonTrail
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVolume
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPC
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPNConnection
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPNGateway
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonRegisteredHAInstance
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNatGateway
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonEgressOnlyInternetGateway
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCEndpoint
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCEndpointService
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonFlowLog
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCPeeringConnection
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonElasticsearchColonColonDomain
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonGroup
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonPolicy
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonUser
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonElasticLoadBalancingV2ColonColonLoadBalancer
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonACMColonColonCertificate
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBInstance
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSubnetGroup
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSecurityGroup
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBCluster
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBClusterSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonEventSubscription
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonAccountPublicAccessBlock
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonCluster
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterParameterGroup
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSecurityGroup
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSubnetGroup
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonEventSubscription
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonManagedInstanceInventory
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonCloudWatchColonColonAlarm
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonCloudFormationColonColonStack
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonElasticLoadBalancingColonColonLoadBalancer
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonAutoScalingGroup
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonLaunchConfiguration
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonScalingPolicy
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonScheduledAction
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonDynamoDBColonColonTable
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonCodeBuildColonColonProject
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRateBasedRule
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRule
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRuleGroup
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonWebACL
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRateBasedRule
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRule
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRuleGroup
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonWebACL
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonCloudFrontColonColonDistribution
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonCloudFrontColonColonStreamingDistribution
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonApplication
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonApplicationVersion
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonEnvironment
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonWebACL
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonRuleGroup
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonIPSet
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonRegexPatternSet
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonManagedRuleSet
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonXRayColonColonEncryptionConfig
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonAssociationCompliance
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonPatchCompliance
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonShieldColonColonProtection
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonShieldRegionalColonColonProtection
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonConfigColonColonResourceCompliance
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonStage
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonRestApi
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonApiGatewayV2ColonColonStage
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonApiGatewayV2ColonColonApi
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonCodePipelineColonColonPipeline
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProvisionedProduct
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProduct
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonPortfolio
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonQLDBColonColonLedger
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSecretsManagerColonColonSecret
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSNSColonColonTopic
    - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonFileData
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.configserviceMod._ResourceType | java.lang.String
  
  type ResourceTypeList = js.Array[typingsSlinky.awsSdk.configserviceMod.ResourceType]
  
  type ResourceTypeString = java.lang.String
  
  type ResourceTypes = js.Array[typingsSlinky.awsSdk.configserviceMod.StringWithCharLimit256]
  
  type ResourceTypesScope = js.Array[typingsSlinky.awsSdk.configserviceMod.StringWithCharLimit256]
  
  type ResourceValueType = typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_ID | java.lang.String
  
  type Results = js.Array[typingsSlinky.awsSdk.configserviceMod.String]
  
  type RetentionConfigurationList = js.Array[typingsSlinky.awsSdk.configserviceMod.RetentionConfiguration]
  
  type RetentionConfigurationName = java.lang.String
  
  type RetentionConfigurationNameList = js.Array[typingsSlinky.awsSdk.configserviceMod.RetentionConfigurationName]
  
  type RetentionPeriodInDays = scala.Double
  
  type RuleLimit = scala.Double
  
  type SchemaVersionId = java.lang.String
  
  type SourceDetails = js.Array[typingsSlinky.awsSdk.configserviceMod.SourceDetail]
  
  type StackArn = java.lang.String
  
  type StaticParameterValues = js.Array[typingsSlinky.awsSdk.configserviceMod.StringWithCharLimit256]
  
  type String = java.lang.String
  
  type StringWithCharLimit1024 = java.lang.String
  
  type StringWithCharLimit128 = java.lang.String
  
  type StringWithCharLimit2048 = java.lang.String
  
  type StringWithCharLimit256 = java.lang.String
  
  type StringWithCharLimit256Min0 = java.lang.String
  
  type StringWithCharLimit64 = java.lang.String
  
  type StringWithCharLimit768 = java.lang.String
  
  type SupplementaryConfiguration = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.configserviceMod.SupplementaryConfigurationValue]
  
  type SupplementaryConfigurationName = java.lang.String
  
  type SupplementaryConfigurationValue = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.configserviceMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.configserviceMod.Tag]
  
  type TagValue = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.configserviceMod.Value]
  
  type TagsList = js.Array[typingsSlinky.awsSdk.configserviceMod.Tag]
  
  type TemplateBody = java.lang.String
  
  type TemplateS3Uri = java.lang.String
  
  type UnprocessedResourceIdentifierList = js.Array[typingsSlinky.awsSdk.configserviceMod.AggregateResourceIdentifier]
  
  type Value = java.lang.String
  
  type Version = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-11-12`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.configserviceMod._apiVersion | java.lang.String
}

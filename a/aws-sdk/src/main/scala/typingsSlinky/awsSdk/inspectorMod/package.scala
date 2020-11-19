package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object inspectorMod {
  
  type AddRemoveAttributesFindingArnList = js.Array[typingsSlinky.awsSdk.inspectorMod.Arn]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type AgentHealth = typingsSlinky.awsSdk.inspectorMod._AgentHealth | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IDLE
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.SHUTDOWN
    - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.THROTTLED
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type AgentHealthCode = typingsSlinky.awsSdk.inspectorMod._AgentHealthCode | java.lang.String
  
  type AgentHealthCodeList = js.Array[typingsSlinky.awsSdk.inspectorMod.AgentHealthCode]
  
  type AgentHealthList = js.Array[typingsSlinky.awsSdk.inspectorMod.AgentHealth]
  
  type AgentId = java.lang.String
  
  type AgentIdList = js.Array[typingsSlinky.awsSdk.inspectorMod.AgentId]
  
  type AgentPreviewList = js.Array[typingsSlinky.awsSdk.inspectorMod.AgentPreview]
  
  type AgentVersion = java.lang.String
  
  type AmiId = java.lang.String
  
  type Arn = java.lang.String
  
  type ArnCount = scala.Double
  
  type AssessmentRulesPackageArnList = js.Array[typingsSlinky.awsSdk.inspectorMod.Arn]
  
  type AssessmentRunAgentList = js.Array[typingsSlinky.awsSdk.inspectorMod.AssessmentRunAgent]
  
  type AssessmentRunDuration = scala.Double
  
  type AssessmentRunFindingCounts = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.inspectorMod.FindingCount]
  
  type AssessmentRunList = js.Array[typingsSlinky.awsSdk.inspectorMod.AssessmentRun]
  
  type AssessmentRunName = java.lang.String
  
  type AssessmentRunNotificationList = js.Array[typingsSlinky.awsSdk.inspectorMod.AssessmentRunNotification]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.TOPIC_DOES_NOT_EXIST
    - typingsSlinky.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type AssessmentRunNotificationSnsStatusCode = typingsSlinky.awsSdk.inspectorMod._AssessmentRunNotificationSnsStatusCode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.START_DATA_COLLECTION_PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.START_DATA_COLLECTION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COLLECTING_DATA
    - typingsSlinky.awsSdk.awsSdkStrings.STOP_DATA_COLLECTION_PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DATA_COLLECTED
    - typingsSlinky.awsSdk.awsSdkStrings.START_EVALUATING_RULES_PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.EVALUATING_RULES
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_WITH_ERRORS
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type AssessmentRunState = typingsSlinky.awsSdk.inspectorMod._AssessmentRunState | java.lang.String
  
  type AssessmentRunStateChangeList = js.Array[typingsSlinky.awsSdk.inspectorMod.AssessmentRunStateChange]
  
  type AssessmentRunStateList = js.Array[typingsSlinky.awsSdk.inspectorMod.AssessmentRunState]
  
  type AssessmentTargetList = js.Array[typingsSlinky.awsSdk.inspectorMod.AssessmentTarget]
  
  type AssessmentTargetName = java.lang.String
  
  type AssessmentTemplateList = js.Array[typingsSlinky.awsSdk.inspectorMod.AssessmentTemplate]
  
  type AssessmentTemplateName = java.lang.String
  
  type AssessmentTemplateRulesPackageArnList = js.Array[typingsSlinky.awsSdk.inspectorMod.Arn]
  
  type AssetType = typingsSlinky.awsSdk.awsSdkStrings.`ec2-instance` | java.lang.String
  
  type AttributeKey = java.lang.String
  
  type AttributeList = js.Array[typingsSlinky.awsSdk.inspectorMod.Attribute]
  
  type AttributeValue = java.lang.String
  
  type AutoScalingGroup = java.lang.String
  
  type AutoScalingGroupList = js.Array[typingsSlinky.awsSdk.inspectorMod.AutoScalingGroup]
  
  type BatchDescribeArnList = js.Array[typingsSlinky.awsSdk.inspectorMod.Arn]
  
  type BatchDescribeExclusionsArnList = js.Array[typingsSlinky.awsSdk.inspectorMod.Arn]
  
  type Bool = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.inspectorMod.ClientApiVersions
  
  type EventSubscriptionList = js.Array[typingsSlinky.awsSdk.inspectorMod.EventSubscription]
  
  type ExclusionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.inspectorMod.Exclusion]
  
  type ExclusionPreviewList = js.Array[typingsSlinky.awsSdk.inspectorMod.ExclusionPreview]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_ARN
    - typingsSlinky.awsSdk.awsSdkStrings.DUPLICATE_ARN
    - typingsSlinky.awsSdk.awsSdkStrings.ITEM_DOES_NOT_EXIST
    - typingsSlinky.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type FailedItemErrorCode = typingsSlinky.awsSdk.inspectorMod._FailedItemErrorCode | java.lang.String
  
  type FailedItems = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.inspectorMod.FailedItemDetails]
  
  type FilterRulesPackageArnList = js.Array[typingsSlinky.awsSdk.inspectorMod.Arn]
  
  type FindingCount = scala.Double
  
  type FindingId = java.lang.String
  
  type FindingList = js.Array[typingsSlinky.awsSdk.inspectorMod.Finding]
  
  type Hostname = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STATE_CHANGED
    - typingsSlinky.awsSdk.awsSdkStrings.FINDING_REPORTED
    - typingsSlinky.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type InspectorEvent = typingsSlinky.awsSdk.inspectorMod._InspectorEvent | java.lang.String
  
  type IocConfidence = scala.Double
  
  type Ipv4Address = java.lang.String
  
  type Ipv4AddressList = js.Array[typingsSlinky.awsSdk.inspectorMod.Ipv4Address]
  
  type Ipv6Addresses = js.Array[typingsSlinky.awsSdk.inspectorMod.Text]
  
  type KernelVersion = java.lang.String
  
  type ListEventSubscriptionsMaxResults = scala.Double
  
  type ListMaxResults = scala.Double
  
  type ListParentArnList = js.Array[typingsSlinky.awsSdk.inspectorMod.Arn]
  
  type ListReturnedArnList = js.Array[typingsSlinky.awsSdk.inspectorMod.Arn]
  
  type Locale = typingsSlinky.awsSdk.awsSdkStrings.EN_US | java.lang.String
  
  type Long = scala.Double
  
  type Message = java.lang.String
  
  type MessageType = java.lang.String
  
  type NamePattern = java.lang.String
  
  type NetworkInterfaces = js.Array[typingsSlinky.awsSdk.inspectorMod.NetworkInterface]
  
  type NumericSeverity = scala.Double
  
  type NumericVersion = scala.Double
  
  type OperatingSystem = java.lang.String
  
  type PaginationToken = java.lang.String
  
  type PreviewAgentsMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WORK_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type PreviewStatus = typingsSlinky.awsSdk.inspectorMod._PreviewStatus | java.lang.String
  
  type PrivateIpAddresses = js.Array[typingsSlinky.awsSdk.inspectorMod.PrivateIp]
  
  type ProviderName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HTML
    - typingsSlinky.awsSdk.awsSdkStrings.PDF
    - java.lang.String
  */
  type ReportFileFormat = typingsSlinky.awsSdk.inspectorMod._ReportFileFormat | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WORK_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type ReportStatus = typingsSlinky.awsSdk.inspectorMod._ReportStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FINDING
    - typingsSlinky.awsSdk.awsSdkStrings.FULL
    - java.lang.String
  */
  type ReportType = typingsSlinky.awsSdk.inspectorMod._ReportType | java.lang.String
  
  type ResourceGroupList = js.Array[typingsSlinky.awsSdk.inspectorMod.ResourceGroup]
  
  type ResourceGroupTags = js.Array[typingsSlinky.awsSdk.inspectorMod.ResourceGroupTag]
  
  type RuleName = java.lang.String
  
  type RuleNameList = js.Array[typingsSlinky.awsSdk.inspectorMod.RuleName]
  
  type RulesPackageList = js.Array[typingsSlinky.awsSdk.inspectorMod.RulesPackage]
  
  type RulesPackageName = java.lang.String
  
  type ScopeList = js.Array[typingsSlinky.awsSdk.inspectorMod.Scope]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_ID
    - typingsSlinky.awsSdk.awsSdkStrings.RULES_PACKAGE_ARN
    - java.lang.String
  */
  type ScopeType = typingsSlinky.awsSdk.inspectorMod._ScopeType | java.lang.String
  
  type ScopeValue = java.lang.String
  
  type SecurityGroups = js.Array[typingsSlinky.awsSdk.inspectorMod.SecurityGroup]
  
  type ServiceName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Low_
    - typingsSlinky.awsSdk.awsSdkStrings.Medium_
    - typingsSlinky.awsSdk.awsSdkStrings.High_
    - typingsSlinky.awsSdk.awsSdkStrings.Informational_
    - typingsSlinky.awsSdk.awsSdkStrings.Undefined_
    - java.lang.String
  */
  type Severity = typingsSlinky.awsSdk.inspectorMod._Severity | java.lang.String
  
  type SeverityList = js.Array[typingsSlinky.awsSdk.inspectorMod.Severity]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.START_EVALUATION
    - typingsSlinky.awsSdk.awsSdkStrings.SKIP_EVALUATION
    - java.lang.String
  */
  type StopAction = typingsSlinky.awsSdk.inspectorMod._StopAction | java.lang.String
  
  type SubscriptionList = js.Array[typingsSlinky.awsSdk.inspectorMod.Subscription]
  
  type TagKey = java.lang.String
  
  type TagList = js.Array[typingsSlinky.awsSdk.inspectorMod.Tag]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.inspectorMod.Tag]
  
  type TelemetryMetadataList = js.Array[typingsSlinky.awsSdk.inspectorMod.TelemetryMetadata]
  
  type Text = java.lang.String
  
  type Timestamp = js.Date
  
  type UUID = java.lang.String
  
  type Url = java.lang.String
  
  type UserAttributeKeyList = js.Array[typingsSlinky.awsSdk.inspectorMod.AttributeKey]
  
  type UserAttributeList = js.Array[typingsSlinky.awsSdk.inspectorMod.Attribute]
  
  type Version = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-08-18`
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-02-16`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.inspectorMod._apiVersion | java.lang.String
}

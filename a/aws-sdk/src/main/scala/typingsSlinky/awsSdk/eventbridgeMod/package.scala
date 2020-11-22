package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object eventbridgeMod {
  
  type AccountId = java.lang.String
  
  type Action = java.lang.String
  
  type ArchiveArn = java.lang.String
  
  type ArchiveDescription = java.lang.String
  
  type ArchiveName = java.lang.String
  
  type ArchiveResponseList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.Archive]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type ArchiveState = typingsSlinky.awsSdk.eventbridgeMod._ArchiveState | java.lang.String
  
  type ArchiveStateReason = java.lang.String
  
  type Arn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AssignPublicIp = typingsSlinky.awsSdk.eventbridgeMod._AssignPublicIp | java.lang.String
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.eventbridgeMod.ClientApiVersions
  
  type CreatedBy = java.lang.String
  
  type Database = java.lang.String
  
  type DbUser = java.lang.String
  
  type ErrorCode = java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type EventBusList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.EventBus]
  
  type EventBusName = java.lang.String
  
  type EventBusNameOrArn = java.lang.String
  
  type EventId = java.lang.String
  
  type EventPattern = java.lang.String
  
  type EventResource = java.lang.String
  
  type EventResourceList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.EventResource]
  
  type EventSourceList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.EventSource]
  
  type EventSourceName = java.lang.String
  
  type EventSourceNamePrefix = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type EventSourceState = typingsSlinky.awsSdk.eventbridgeMod._EventSourceState | java.lang.String
  
  type EventTime = js.Date
  
  type HeaderKey = java.lang.String
  
  type HeaderParametersMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.eventbridgeMod.HeaderValue]
  
  type HeaderValue = java.lang.String
  
  type InputTransformerPathKey = java.lang.String
  
  type Integer = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EC2
    - typingsSlinky.awsSdk.awsSdkStrings.FARGATE
    - java.lang.String
  */
  type LaunchType = typingsSlinky.awsSdk.eventbridgeMod._LaunchType | java.lang.String
  
  type LimitMax100 = scala.Double
  
  type LimitMin1 = scala.Double
  
  type Long = scala.Double
  
  type ManagedBy = java.lang.String
  
  type MaximumEventAgeInSeconds = scala.Double
  
  type MaximumRetryAttempts = scala.Double
  
  type MessageGroupId = java.lang.String
  
  type NextToken = java.lang.String
  
  type NonPartnerEventBusName = java.lang.String
  
  type NonPartnerEventBusNameOrArn = java.lang.String
  
  type PartnerEventSourceAccountList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.PartnerEventSourceAccount]
  
  type PartnerEventSourceList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.PartnerEventSource]
  
  type PartnerEventSourceNamePrefix = java.lang.String
  
  type PathParameter = java.lang.String
  
  type PathParameterList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.PathParameter]
  
  type Principal = java.lang.String
  
  type PutEventsRequestEntryList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.PutEventsRequestEntry]
  
  type PutEventsResultEntryList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.PutEventsResultEntry]
  
  type PutPartnerEventsRequestEntryList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.PutPartnerEventsRequestEntry]
  
  type PutPartnerEventsResultEntryList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.PutPartnerEventsResultEntry]
  
  type PutTargetsResultEntryList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.PutTargetsResultEntry]
  
  type QueryStringKey = java.lang.String
  
  type QueryStringParametersMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.eventbridgeMod.QueryStringValue]
  
  type QueryStringValue = java.lang.String
  
  type RedshiftSecretManagerArn = java.lang.String
  
  type RemoveTargetsResultEntryList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.RemoveTargetsResultEntry]
  
  type ReplayArn = java.lang.String
  
  type ReplayDescription = java.lang.String
  
  type ReplayDestinationFilters = js.Array[typingsSlinky.awsSdk.eventbridgeMod.Arn]
  
  type ReplayList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.Replay]
  
  type ReplayName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ReplayState = typingsSlinky.awsSdk.eventbridgeMod._ReplayState | java.lang.String
  
  type ReplayStateReason = java.lang.String
  
  type ResourceArn = java.lang.String
  
  type RetentionDays = scala.Double
  
  type RoleArn = java.lang.String
  
  type RuleArn = java.lang.String
  
  type RuleDescription = java.lang.String
  
  type RuleName = java.lang.String
  
  type RuleNameList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.RuleName]
  
  type RuleResponseList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.Rule]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type RuleState = typingsSlinky.awsSdk.eventbridgeMod._RuleState | java.lang.String
  
  type RunCommandTargetKey = java.lang.String
  
  type RunCommandTargetValue = java.lang.String
  
  type RunCommandTargetValues = js.Array[typingsSlinky.awsSdk.eventbridgeMod.RunCommandTargetValue]
  
  type RunCommandTargets = js.Array[typingsSlinky.awsSdk.eventbridgeMod.RunCommandTarget]
  
  type ScheduleExpression = java.lang.String
  
  type Sql = java.lang.String
  
  type StatementId = java.lang.String
  
  type StatementName = java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.String]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.Tag]
  
  type TagValue = java.lang.String
  
  type TargetArn = java.lang.String
  
  type TargetId = java.lang.String
  
  type TargetIdList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.TargetId]
  
  type TargetInput = java.lang.String
  
  type TargetInputPath = java.lang.String
  
  type TargetList = js.Array[typingsSlinky.awsSdk.eventbridgeMod.Target]
  
  type TargetPartitionKeyPath = java.lang.String
  
  type Timestamp = js.Date
  
  type TransformerInput = java.lang.String
  
  type TransformerPaths = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.eventbridgeMod.TargetInputPath]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-10-07`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.eventbridgeMod._apiVersion | java.lang.String
}

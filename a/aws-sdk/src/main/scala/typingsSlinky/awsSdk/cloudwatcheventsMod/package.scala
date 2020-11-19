package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudwatcheventsMod {
  
  type AccountId = java.lang.String
  
  type Action = java.lang.String
  
  type Arn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AssignPublicIp = typingsSlinky.awsSdk.cloudwatcheventsMod._AssignPublicIp | java.lang.String
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cloudwatcheventsMod.ClientApiVersions
  
  type ErrorCode = java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type EventBusList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.EventBus]
  
  type EventBusName = java.lang.String
  
  type EventId = java.lang.String
  
  type EventPattern = java.lang.String
  
  type EventResource = java.lang.String
  
  type EventResourceList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.EventResource]
  
  type EventSourceList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.EventSource]
  
  type EventSourceName = java.lang.String
  
  type EventSourceNamePrefix = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type EventSourceState = typingsSlinky.awsSdk.cloudwatcheventsMod._EventSourceState | java.lang.String
  
  type EventTime = js.Date
  
  type HeaderKey = java.lang.String
  
  type HeaderParametersMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cloudwatcheventsMod.HeaderValue]
  
  type HeaderValue = java.lang.String
  
  type InputTransformerPathKey = java.lang.String
  
  type Integer = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EC2
    - typingsSlinky.awsSdk.awsSdkStrings.FARGATE
    - java.lang.String
  */
  type LaunchType = typingsSlinky.awsSdk.cloudwatcheventsMod._LaunchType | java.lang.String
  
  type LimitMax100 = scala.Double
  
  type LimitMin1 = scala.Double
  
  type ManagedBy = java.lang.String
  
  type MessageGroupId = java.lang.String
  
  type NextToken = java.lang.String
  
  type NonPartnerEventBusName = java.lang.String
  
  type PartnerEventSourceAccountList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.PartnerEventSourceAccount]
  
  type PartnerEventSourceList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.PartnerEventSource]
  
  type PartnerEventSourceNamePrefix = java.lang.String
  
  type PathParameter = java.lang.String
  
  type PathParameterList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.PathParameter]
  
  type Principal = java.lang.String
  
  type PutEventsRequestEntryList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.PutEventsRequestEntry]
  
  type PutEventsResultEntryList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.PutEventsResultEntry]
  
  type PutPartnerEventsRequestEntryList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.PutPartnerEventsRequestEntry]
  
  type PutPartnerEventsResultEntryList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.PutPartnerEventsResultEntry]
  
  type PutTargetsResultEntryList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.PutTargetsResultEntry]
  
  type QueryStringKey = java.lang.String
  
  type QueryStringParametersMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cloudwatcheventsMod.QueryStringValue]
  
  type QueryStringValue = java.lang.String
  
  type RemoveTargetsResultEntryList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.RemoveTargetsResultEntry]
  
  type RoleArn = java.lang.String
  
  type RuleArn = java.lang.String
  
  type RuleDescription = java.lang.String
  
  type RuleName = java.lang.String
  
  type RuleNameList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.RuleName]
  
  type RuleResponseList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.Rule]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type RuleState = typingsSlinky.awsSdk.cloudwatcheventsMod._RuleState | java.lang.String
  
  type RunCommandTargetKey = java.lang.String
  
  type RunCommandTargetValue = java.lang.String
  
  type RunCommandTargetValues = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.RunCommandTargetValue]
  
  type RunCommandTargets = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.RunCommandTarget]
  
  type ScheduleExpression = java.lang.String
  
  type StatementId = java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.String]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.Tag]
  
  type TagValue = java.lang.String
  
  type TargetArn = java.lang.String
  
  type TargetId = java.lang.String
  
  type TargetIdList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.TargetId]
  
  type TargetInput = java.lang.String
  
  type TargetInputPath = java.lang.String
  
  type TargetList = js.Array[typingsSlinky.awsSdk.cloudwatcheventsMod.Target]
  
  type TargetPartitionKeyPath = java.lang.String
  
  type Timestamp = js.Date
  
  type TransformerInput = java.lang.String
  
  type TransformerPaths = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cloudwatcheventsMod.TargetInputPath]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-02-03`
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-10-07`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cloudwatcheventsMod._apiVersion | java.lang.String
}

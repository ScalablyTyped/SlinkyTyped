package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudwatchlogsMod {
  
  type AccessPolicy = java.lang.String
  
  type Arn = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cloudwatchlogsMod.ClientApiVersions
  
  type Days = scala.Double
  
  type DefaultValue = scala.Double
  
  type Descending = scala.Boolean
  
  type DescribeLimit = scala.Double
  
  type DescribeQueriesMaxResults = scala.Double
  
  type DestinationArn = java.lang.String
  
  type DestinationName = java.lang.String
  
  type Destinations = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.Destination]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Random
    - typingsSlinky.awsSdk.awsSdkStrings.ByLogStream
    - java.lang.String
  */
  type Distribution = typingsSlinky.awsSdk.cloudwatchlogsMod._Distribution | java.lang.String
  
  type EventId = java.lang.String
  
  type EventMessage = java.lang.String
  
  type EventNumber = scala.Double
  
  type EventsLimit = scala.Double
  
  type ExportDestinationBucket = java.lang.String
  
  type ExportDestinationPrefix = java.lang.String
  
  type ExportTaskId = java.lang.String
  
  type ExportTaskName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_CANCEL
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - java.lang.String
  */
  type ExportTaskStatusCode = typingsSlinky.awsSdk.cloudwatchlogsMod._ExportTaskStatusCode | java.lang.String
  
  type ExportTaskStatusMessage = java.lang.String
  
  type ExportTasks = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.ExportTask]
  
  type ExtractedValues = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cloudwatchlogsMod.Value]
  
  type Field = java.lang.String
  
  type FilterCount = scala.Double
  
  type FilterName = java.lang.String
  
  type FilterPattern = java.lang.String
  
  type FilteredLogEvents = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.FilteredLogEvent]
  
  type InputLogEvents = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.InputLogEvent]
  
  type InputLogStreamNames = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.LogStreamName]
  
  type Interleaved = scala.Boolean
  
  type KmsKeyId = java.lang.String
  
  type LogEventIndex = scala.Double
  
  type LogGroupFieldList = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.LogGroupField]
  
  type LogGroupName = java.lang.String
  
  type LogGroupNames = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.LogGroupName]
  
  type LogGroups = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.LogGroup]
  
  type LogRecord = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cloudwatchlogsMod.Value]
  
  type LogRecordPointer = java.lang.String
  
  type LogStreamName = java.lang.String
  
  type LogStreamSearchedCompletely = scala.Boolean
  
  type LogStreams = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.LogStream]
  
  type MetricFilterMatches = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.MetricFilterMatchRecord]
  
  type MetricFilters = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.MetricFilter]
  
  type MetricName = java.lang.String
  
  type MetricNamespace = java.lang.String
  
  type MetricTransformations = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.MetricTransformation]
  
  type MetricValue = java.lang.String
  
  type NextToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LogStreamName
    - typingsSlinky.awsSdk.awsSdkStrings.LastEventTime
    - java.lang.String
  */
  type OrderBy = typingsSlinky.awsSdk.cloudwatchlogsMod._OrderBy | java.lang.String
  
  type OutputLogEvents = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.OutputLogEvent]
  
  type Percentage = scala.Double
  
  type PolicyDocument = java.lang.String
  
  type PolicyName = java.lang.String
  
  type QueryDefinitionList = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.QueryDefinition]
  
  type QueryDefinitionName = java.lang.String
  
  type QueryDefinitionString = java.lang.String
  
  type QueryId = java.lang.String
  
  type QueryInfoList = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.QueryInfo]
  
  type QueryListMaxResults = scala.Double
  
  type QueryResults = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.ResultRows]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Scheduled_
    - typingsSlinky.awsSdk.awsSdkStrings.Running_
    - typingsSlinky.awsSdk.awsSdkStrings.Complete_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type QueryStatus = typingsSlinky.awsSdk.cloudwatchlogsMod._QueryStatus | java.lang.String
  
  type QueryString = java.lang.String
  
  type ResourcePolicies = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.ResourcePolicy]
  
  type ResultRows = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.ResultField]
  
  type RoleArn = java.lang.String
  
  type SearchedLogStreams = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.SearchedLogStream]
  
  type SequenceToken = java.lang.String
  
  type StartFromHead = scala.Boolean
  
  type StatsValue = scala.Double
  
  type StoredBytes = scala.Double
  
  type SubscriptionFilters = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.SubscriptionFilter]
  
  type Success = scala.Boolean
  
  type TagKey = java.lang.String
  
  type TagList = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cloudwatchlogsMod.TagValue]
  
  type TargetArn = java.lang.String
  
  type TestEventMessages = js.Array[typingsSlinky.awsSdk.cloudwatchlogsMod.EventMessage]
  
  type Timestamp = scala.Double
  
  type Token = java.lang.String
  
  type Value = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-03-28`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cloudwatchlogsMod._apiVersion | java.lang.String
}

package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object applicationinsightsMod {
  type AffectedResource = java.lang.String
  type AmazonResourceName = java.lang.String
  type ApplicationComponentList = js.Array[typingsSlinky.awsSdk.applicationinsightsMod.ApplicationComponent]
  type ApplicationInfoList = js.Array[typingsSlinky.awsSdk.applicationinsightsMod.ApplicationInfo]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.applicationinsightsMod.ClientApiVersions
  type ComponentConfiguration = java.lang.String
  type ComponentName = java.lang.String
  type ConfigurationEventDetail = java.lang.String
  type ConfigurationEventList = js.Array[typingsSlinky.awsSdk.applicationinsightsMod.ConfigurationEvent]
  type ConfigurationEventMonitoredResourceARN = java.lang.String
  type ConfigurationEventResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUDWATCH_ALARM
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUDFORMATION
    - typingsSlinky.awsSdk.awsSdkStrings.SSM_ASSOCIATION
    - java.lang.String
  */
  type ConfigurationEventResourceType = typingsSlinky.awsSdk.applicationinsightsMod._ConfigurationEventResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INFO
    - typingsSlinky.awsSdk.awsSdkStrings.WARN
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ConfigurationEventStatus = typingsSlinky.awsSdk.applicationinsightsMod._ConfigurationEventStatus | java.lang.String
  type ConfigurationEventTime = js.Date
  type EndTime = js.Date
  type Feedback = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.applicationinsightsMod.FeedbackValue]
  type FeedbackKey = typingsSlinky.awsSdk.awsSdkStrings.INSIGHTS_FEEDBACK | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_SPECIFIED
    - typingsSlinky.awsSdk.awsSdkStrings.USEFUL
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_USEFUL
    - java.lang.String
  */
  type FeedbackValue = typingsSlinky.awsSdk.applicationinsightsMod._FeedbackValue | java.lang.String
  type Insights = java.lang.String
  type LifeCycle = java.lang.String
  type LineTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.WARN
    - typingsSlinky.awsSdk.awsSdkStrings.INFO
    - java.lang.String
  */
  type LogFilter = typingsSlinky.awsSdk.applicationinsightsMod._LogFilter | java.lang.String
  type LogGroup = java.lang.String
  type LogPatternList = js.Array[typingsSlinky.awsSdk.applicationinsightsMod.LogPattern]
  type LogPatternName = java.lang.String
  type LogPatternRank = scala.Double
  type LogPatternRegex = java.lang.String
  type LogPatternSetList = js.Array[typingsSlinky.awsSdk.applicationinsightsMod.LogPatternSetName]
  type LogPatternSetName = java.lang.String
  type LogText = java.lang.String
  type MaxEntities = scala.Double
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type Monitor = scala.Boolean
  type NewComponentName = java.lang.String
  type ObservationId = java.lang.String
  type ObservationList = js.Array[typingsSlinky.awsSdk.applicationinsightsMod.Observation]
  type OpsCenterEnabled = scala.Boolean
  type OpsItemSNSTopicArn = java.lang.String
  type PaginationToken = java.lang.String
  type ProblemId = java.lang.String
  type ProblemList = js.Array[typingsSlinky.awsSdk.applicationinsightsMod.Problem]
  type Remarks = java.lang.String
  type RemoveSNSTopic = scala.Boolean
  type ResourceARN = java.lang.String
  type ResourceGroupName = java.lang.String
  type ResourceList = js.Array[typingsSlinky.awsSdk.applicationinsightsMod.ResourceARN]
  type ResourceType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Low_
    - typingsSlinky.awsSdk.awsSdkStrings.Medium_
    - typingsSlinky.awsSdk.awsSdkStrings.High_
    - java.lang.String
  */
  type SeverityLevel = typingsSlinky.awsSdk.applicationinsightsMod._SeverityLevel | java.lang.String
  type SourceARN = java.lang.String
  type SourceType = java.lang.String
  type StartTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IGNORE
    - typingsSlinky.awsSdk.awsSdkStrings.RESOLVED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.applicationinsightsMod._Status | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.applicationinsightsMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.applicationinsightsMod.Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.DOT_NET_CORE
    - typingsSlinky.awsSdk.awsSdkStrings.DOT_NET_WORKER
    - typingsSlinky.awsSdk.awsSdkStrings.DOT_NET_WEB
    - typingsSlinky.awsSdk.awsSdkStrings.SQL_SERVER
    - java.lang.String
  */
  type Tier = typingsSlinky.awsSdk.applicationinsightsMod._Tier | java.lang.String
  type Title = java.lang.String
  type Unit = java.lang.String
  type Value = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-11-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.applicationinsightsMod._apiVersion | java.lang.String
}

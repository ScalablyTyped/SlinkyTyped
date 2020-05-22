package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudwatchMod {
  type ActionPrefix = java.lang.String
  type ActionsEnabled = scala.Boolean
  type AlarmArn = java.lang.String
  type AlarmDescription = java.lang.String
  type AlarmHistoryItems = js.Array[typingsSlinky.awsSdk.cloudwatchMod.AlarmHistoryItem]
  type AlarmName = java.lang.String
  type AlarmNamePrefix = java.lang.String
  type AlarmNames = js.Array[typingsSlinky.awsSdk.cloudwatchMod.AlarmName]
  type AlarmRule = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CompositeAlarm
    - typingsSlinky.awsSdk.awsSdkStrings.MetricAlarm
    - java.lang.String
  */
  type AlarmType = typingsSlinky.awsSdk.cloudwatchMod._AlarmType | java.lang.String
  type AlarmTypes = js.Array[typingsSlinky.awsSdk.cloudwatchMod.AlarmType]
  type AmazonResourceName = java.lang.String
  type AnomalyDetectorExcludedTimeRanges = js.Array[typingsSlinky.awsSdk.cloudwatchMod.Range]
  type AnomalyDetectorMetricStat = java.lang.String
  type AnomalyDetectorMetricTimezone = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_TRAINING
    - typingsSlinky.awsSdk.awsSdkStrings.TRAINED_INSUFFICIENT_DATA
    - typingsSlinky.awsSdk.awsSdkStrings.TRAINED
    - java.lang.String
  */
  type AnomalyDetectorStateValue = typingsSlinky.awsSdk.cloudwatchMod._AnomalyDetectorStateValue | java.lang.String
  type AnomalyDetectors = js.Array[typingsSlinky.awsSdk.cloudwatchMod.AnomalyDetector]
  type BatchFailures = js.Array[typingsSlinky.awsSdk.cloudwatchMod.PartialFailure]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cloudwatchMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThanThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanLowerOrGreaterThanUpperThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanLowerThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThanUpperThreshold
    - java.lang.String
  */
  type ComparisonOperator = typingsSlinky.awsSdk.cloudwatchMod._ComparisonOperator | java.lang.String
  type CompositeAlarms = js.Array[typingsSlinky.awsSdk.cloudwatchMod.CompositeAlarm]
  type Counts = js.Array[typingsSlinky.awsSdk.cloudwatchMod.DatapointValue]
  type DashboardArn = java.lang.String
  type DashboardBody = java.lang.String
  type DashboardEntries = js.Array[typingsSlinky.awsSdk.cloudwatchMod.DashboardEntry]
  type DashboardName = java.lang.String
  type DashboardNamePrefix = java.lang.String
  type DashboardNames = js.Array[typingsSlinky.awsSdk.cloudwatchMod.DashboardName]
  type DashboardValidationMessages = js.Array[typingsSlinky.awsSdk.cloudwatchMod.DashboardValidationMessage]
  type DataPath = java.lang.String
  type DatapointValue = scala.Double
  type DatapointValueMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cloudwatchMod.DatapointValue]
  type DatapointValues = js.Array[typingsSlinky.awsSdk.cloudwatchMod.DatapointValue]
  type Datapoints = js.Array[typingsSlinky.awsSdk.cloudwatchMod.Datapoint]
  type DatapointsToAlarm = scala.Double
  type DimensionFilters = js.Array[typingsSlinky.awsSdk.cloudwatchMod.DimensionFilter]
  type DimensionName = java.lang.String
  type DimensionValue = java.lang.String
  type Dimensions = js.Array[typingsSlinky.awsSdk.cloudwatchMod.Dimension]
  type EvaluateLowSampleCountPercentile = java.lang.String
  type EvaluationPeriods = scala.Double
  type ExceptionType = java.lang.String
  type ExtendedStatistic = java.lang.String
  type ExtendedStatistics = js.Array[typingsSlinky.awsSdk.cloudwatchMod.ExtendedStatistic]
  type FailureCode = java.lang.String
  type FailureDescription = java.lang.String
  type FailureResource = java.lang.String
  type GetMetricDataMaxDatapoints = scala.Double
  type HistoryData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ConfigurationUpdate
    - typingsSlinky.awsSdk.awsSdkStrings.StateUpdate
    - typingsSlinky.awsSdk.awsSdkStrings.Action_
    - java.lang.String
  */
  type HistoryItemType = typingsSlinky.awsSdk.cloudwatchMod._HistoryItemType | java.lang.String
  type HistorySummary = java.lang.String
  type InsightRuleAggregationStatistic = java.lang.String
  type InsightRuleContributorDatapoints = js.Array[typingsSlinky.awsSdk.cloudwatchMod.InsightRuleContributorDatapoint]
  type InsightRuleContributorKey = java.lang.String
  type InsightRuleContributorKeyLabel = java.lang.String
  type InsightRuleContributorKeyLabels = js.Array[typingsSlinky.awsSdk.cloudwatchMod.InsightRuleContributorKeyLabel]
  type InsightRuleContributorKeys = js.Array[typingsSlinky.awsSdk.cloudwatchMod.InsightRuleContributorKey]
  type InsightRuleContributors = js.Array[typingsSlinky.awsSdk.cloudwatchMod.InsightRuleContributor]
  type InsightRuleDefinition = java.lang.String
  type InsightRuleMaxResults = scala.Double
  type InsightRuleMetricDatapoints = js.Array[typingsSlinky.awsSdk.cloudwatchMod.InsightRuleMetricDatapoint]
  type InsightRuleMetricList = js.Array[typingsSlinky.awsSdk.cloudwatchMod.InsightRuleMetricName]
  type InsightRuleMetricName = java.lang.String
  type InsightRuleName = java.lang.String
  type InsightRuleNames = js.Array[typingsSlinky.awsSdk.cloudwatchMod.InsightRuleName]
  type InsightRuleOrderBy = java.lang.String
  type InsightRuleSchema = java.lang.String
  type InsightRuleState = java.lang.String
  type InsightRuleUnboundDouble = scala.Double
  type InsightRuleUnboundInteger = scala.Double
  type InsightRuleUnboundLong = scala.Double
  type InsightRules = js.Array[typingsSlinky.awsSdk.cloudwatchMod.InsightRule]
  type LastModified = js.Date
  type MaxRecords = scala.Double
  type MaxReturnedResultsCount = scala.Double
  type Message = java.lang.String
  type MessageDataCode = java.lang.String
  type MessageDataValue = java.lang.String
  type MetricAlarms = js.Array[typingsSlinky.awsSdk.cloudwatchMod.MetricAlarm]
  type MetricData = js.Array[typingsSlinky.awsSdk.cloudwatchMod.MetricDatum]
  type MetricDataQueries = js.Array[typingsSlinky.awsSdk.cloudwatchMod.MetricDataQuery]
  type MetricDataResultMessages = js.Array[typingsSlinky.awsSdk.cloudwatchMod.MessageData]
  type MetricDataResults = js.Array[typingsSlinky.awsSdk.cloudwatchMod.MetricDataResult]
  type MetricExpression = java.lang.String
  type MetricId = java.lang.String
  type MetricLabel = java.lang.String
  type MetricName = java.lang.String
  type MetricWidget = java.lang.String
  type MetricWidgetImage = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.cloudwatchMod.Blob | java.lang.String
  type Metrics = js.Array[typingsSlinky.awsSdk.cloudwatchMod.Metric]
  type Namespace = java.lang.String
  type NextToken = java.lang.String
  type OutputFormat = java.lang.String
  type Period = scala.Double
  type ResourceList = js.Array[typingsSlinky.awsSdk.cloudwatchMod.ResourceName]
  type ResourceName = java.lang.String
  type ReturnData = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TimestampDescending
    - typingsSlinky.awsSdk.awsSdkStrings.TimestampAscending
    - java.lang.String
  */
  type ScanBy = typingsSlinky.awsSdk.cloudwatchMod._ScanBy | java.lang.String
  type Size = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Seconds_
    - typingsSlinky.awsSdk.awsSdkStrings.Microseconds
    - typingsSlinky.awsSdk.awsSdkStrings.Milliseconds_
    - typingsSlinky.awsSdk.awsSdkStrings.Bytes_
    - typingsSlinky.awsSdk.awsSdkStrings.Kilobytes
    - typingsSlinky.awsSdk.awsSdkStrings.Megabytes
    - typingsSlinky.awsSdk.awsSdkStrings.Gigabytes
    - typingsSlinky.awsSdk.awsSdkStrings.Terabytes_
    - typingsSlinky.awsSdk.awsSdkStrings.Bits_
    - typingsSlinky.awsSdk.awsSdkStrings.Kilobits
    - typingsSlinky.awsSdk.awsSdkStrings.Megabits
    - typingsSlinky.awsSdk.awsSdkStrings.Gigabits
    - typingsSlinky.awsSdk.awsSdkStrings.Terabits
    - typingsSlinky.awsSdk.awsSdkStrings.Percent_
    - typingsSlinky.awsSdk.awsSdkStrings.Count_
    - typingsSlinky.awsSdk.awsSdkStrings.BytesSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.KilobytesSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.MegabytesSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.GigabytesSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.TerabytesSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.BitsSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.KilobitsSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.MegabitsSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.GigabitsSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.TerabitsSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.CountSlashSecond
    - typingsSlinky.awsSdk.awsSdkStrings.None_
    - java.lang.String
  */
  type StandardUnit = typingsSlinky.awsSdk.cloudwatchMod._StandardUnit | java.lang.String
  type Stat = java.lang.String
  type StateReason = java.lang.String
  type StateReasonData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OK
    - typingsSlinky.awsSdk.awsSdkStrings.ALARM
    - typingsSlinky.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type StateValue = typingsSlinky.awsSdk.cloudwatchMod._StateValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SampleCount
    - typingsSlinky.awsSdk.awsSdkStrings.Average_
    - typingsSlinky.awsSdk.awsSdkStrings.Sum_
    - typingsSlinky.awsSdk.awsSdkStrings.Minimum_
    - typingsSlinky.awsSdk.awsSdkStrings.Maximum_
    - java.lang.String
  */
  type Statistic = typingsSlinky.awsSdk.cloudwatchMod._Statistic | java.lang.String
  type Statistics = js.Array[typingsSlinky.awsSdk.cloudwatchMod.Statistic]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Complete_
    - typingsSlinky.awsSdk.awsSdkStrings.InternalError
    - typingsSlinky.awsSdk.awsSdkStrings.PartialData
    - java.lang.String
  */
  type StatusCode = typingsSlinky.awsSdk.cloudwatchMod._StatusCode | java.lang.String
  type StorageResolution = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.cloudwatchMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.cloudwatchMod.Tag]
  type TagValue = java.lang.String
  type Threshold = scala.Double
  type Timestamp = js.Date
  type Timestamps = js.Array[js.Date]
  type TreatMissingData = java.lang.String
  type Values = js.Array[typingsSlinky.awsSdk.cloudwatchMod.DatapointValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2010-08-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cloudwatchMod._apiVersion | java.lang.String
}

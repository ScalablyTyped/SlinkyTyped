package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object xrayMod {
  
  type AliasList = js.Array[typingsSlinky.awsSdk.xrayMod.Alias]
  
  type AliasNames = js.Array[typingsSlinky.awsSdk.xrayMod.String]
  
  type AmazonResourceName = java.lang.String
  
  type AnnotationKey = java.lang.String
  
  type Annotations = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.xrayMod.ValuesWithServiceIds]
  
  type AnomalousServiceList = js.Array[typingsSlinky.awsSdk.xrayMod.AnomalousService]
  
  type AttributeKey = java.lang.String
  
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.xrayMod.AttributeValue]
  
  type AttributeValue = java.lang.String
  
  type Boolean = scala.Boolean
  
  type BorrowCount = scala.Double
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.xrayMod.ClientApiVersions
  
  type ClientID = java.lang.String
  
  type Double = scala.Double
  
  type EC2InstanceId = java.lang.String
  
  type EdgeList = js.Array[typingsSlinky.awsSdk.xrayMod.Edge]
  
  type EncryptionKeyId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type EncryptionStatus = typingsSlinky.awsSdk.xrayMod._EncryptionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type EncryptionType = typingsSlinky.awsSdk.xrayMod._EncryptionType | java.lang.String
  
  type EntitySelectorExpression = java.lang.String
  
  type ErrorRootCauseEntityPath = js.Array[typingsSlinky.awsSdk.xrayMod.ErrorRootCauseEntity]
  
  type ErrorRootCauseServices = js.Array[typingsSlinky.awsSdk.xrayMod.ErrorRootCauseService]
  
  type ErrorRootCauses = js.Array[typingsSlinky.awsSdk.xrayMod.ErrorRootCause]
  
  type EventSummaryText = java.lang.String
  
  type FaultRootCauseEntityPath = js.Array[typingsSlinky.awsSdk.xrayMod.FaultRootCauseEntity]
  
  type FaultRootCauseServices = js.Array[typingsSlinky.awsSdk.xrayMod.FaultRootCauseService]
  
  type FaultRootCauses = js.Array[typingsSlinky.awsSdk.xrayMod.FaultRootCause]
  
  type FilterExpression = java.lang.String
  
  type FixedRate = scala.Double
  
  type GetGroupsNextToken = java.lang.String
  
  type GetInsightEventsMaxResults = scala.Double
  
  type GetInsightSummariesMaxResults = scala.Double
  
  type GroupARN = java.lang.String
  
  type GroupName = java.lang.String
  
  type GroupSummaryList = js.Array[typingsSlinky.awsSdk.xrayMod.GroupSummary]
  
  type HTTPMethod = java.lang.String
  
  type Histogram = js.Array[typingsSlinky.awsSdk.xrayMod.HistogramEntry]
  
  type Host = java.lang.String
  
  type Hostname = java.lang.String
  
  type InsightCategory = typingsSlinky.awsSdk.awsSdkStrings.FAULT | java.lang.String
  
  type InsightCategoryList = js.Array[typingsSlinky.awsSdk.xrayMod.InsightCategory]
  
  type InsightEventList = js.Array[typingsSlinky.awsSdk.xrayMod.InsightEvent]
  
  type InsightId = java.lang.String
  
  type InsightImpactGraphEdgeList = js.Array[typingsSlinky.awsSdk.xrayMod.InsightImpactGraphEdge]
  
  type InsightImpactGraphServiceList = js.Array[typingsSlinky.awsSdk.xrayMod.InsightImpactGraphService]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type InsightState = typingsSlinky.awsSdk.xrayMod._InsightState | java.lang.String
  
  type InsightStateList = js.Array[typingsSlinky.awsSdk.xrayMod.InsightState]
  
  type InsightSummaryList = js.Array[typingsSlinky.awsSdk.xrayMod.InsightSummary]
  
  type InsightSummaryText = java.lang.String
  
  type Integer = scala.Double
  
  type NullableBoolean = scala.Boolean
  
  type NullableDouble = scala.Double
  
  type NullableInteger = scala.Double
  
  type NullableLong = scala.Double
  
  type Priority = scala.Double
  
  type RequestCount = scala.Double
  
  type ReservoirSize = scala.Double
  
  type ResourceARN = java.lang.String
  
  type ResponseTimeRootCauseEntityPath = js.Array[typingsSlinky.awsSdk.xrayMod.ResponseTimeRootCauseEntity]
  
  type ResponseTimeRootCauseServices = js.Array[typingsSlinky.awsSdk.xrayMod.ResponseTimeRootCauseService]
  
  type ResponseTimeRootCauses = js.Array[typingsSlinky.awsSdk.xrayMod.ResponseTimeRootCause]
  
  type RootCauseExceptions = js.Array[typingsSlinky.awsSdk.xrayMod.RootCauseException]
  
  type RuleName = java.lang.String
  
  type SampledCount = scala.Double
  
  type SamplingRuleRecordList = js.Array[typingsSlinky.awsSdk.xrayMod.SamplingRuleRecord]
  
  type SamplingStatisticSummaryList = js.Array[typingsSlinky.awsSdk.xrayMod.SamplingStatisticSummary]
  
  type SamplingStatisticsDocumentList = js.Array[typingsSlinky.awsSdk.xrayMod.SamplingStatisticsDocument]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PartialScan
    - typingsSlinky.awsSdk.awsSdkStrings.FixedRate
    - java.lang.String
  */
  type SamplingStrategyName = typingsSlinky.awsSdk.xrayMod._SamplingStrategyName | java.lang.String
  
  type SamplingTargetDocumentList = js.Array[typingsSlinky.awsSdk.xrayMod.SamplingTargetDocument]
  
  type SegmentDocument = java.lang.String
  
  type SegmentId = java.lang.String
  
  type SegmentList = js.Array[typingsSlinky.awsSdk.xrayMod.Segment]
  
  type ServiceIds = js.Array[typingsSlinky.awsSdk.xrayMod.ServiceId]
  
  type ServiceList = js.Array[typingsSlinky.awsSdk.xrayMod.Service]
  
  type ServiceName = java.lang.String
  
  type ServiceNames = js.Array[typingsSlinky.awsSdk.xrayMod.String]
  
  type ServiceType = java.lang.String
  
  type String = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.xrayMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.xrayMod.Tag]
  
  type TagValue = java.lang.String
  
  type TelemetryRecordList = js.Array[typingsSlinky.awsSdk.xrayMod.TelemetryRecord]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TraceId
    - typingsSlinky.awsSdk.awsSdkStrings.Event_
    - java.lang.String
  */
  type TimeRangeType = typingsSlinky.awsSdk.xrayMod._TimeRangeType | java.lang.String
  
  type TimeSeriesServiceStatisticsList = js.Array[typingsSlinky.awsSdk.xrayMod.TimeSeriesServiceStatistics]
  
  type Timestamp = js.Date
  
  type Token = java.lang.String
  
  type TraceAvailabilityZones = js.Array[typingsSlinky.awsSdk.xrayMod.AvailabilityZoneDetail]
  
  type TraceId = java.lang.String
  
  type TraceIdList = js.Array[typingsSlinky.awsSdk.xrayMod.TraceId]
  
  type TraceInstanceIds = js.Array[typingsSlinky.awsSdk.xrayMod.InstanceIdDetail]
  
  type TraceList = js.Array[typingsSlinky.awsSdk.xrayMod.Trace]
  
  type TraceResourceARNs = js.Array[typingsSlinky.awsSdk.xrayMod.ResourceARNDetail]
  
  type TraceSegmentDocument = java.lang.String
  
  type TraceSegmentDocumentList = js.Array[typingsSlinky.awsSdk.xrayMod.TraceSegmentDocument]
  
  type TraceSummaryList = js.Array[typingsSlinky.awsSdk.xrayMod.TraceSummary]
  
  type TraceUsers = js.Array[typingsSlinky.awsSdk.xrayMod.TraceUser]
  
  type URLPath = java.lang.String
  
  type UnprocessedStatisticsList = js.Array[typingsSlinky.awsSdk.xrayMod.UnprocessedStatistics]
  
  type UnprocessedTraceIdList = js.Array[typingsSlinky.awsSdk.xrayMod.TraceId]
  
  type UnprocessedTraceSegmentList = js.Array[typingsSlinky.awsSdk.xrayMod.UnprocessedTraceSegment]
  
  type ValuesWithServiceIds = js.Array[typingsSlinky.awsSdk.xrayMod.ValueWithServiceIds]
  
  type Version = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-04-12`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.xrayMod._apiVersion | java.lang.String
}

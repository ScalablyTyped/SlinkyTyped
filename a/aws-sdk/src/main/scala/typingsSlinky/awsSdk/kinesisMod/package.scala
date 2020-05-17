package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisMod {
  type BooleanObject = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.kinesisMod.ClientApiVersions
  type ConsumerARN = java.lang.String
  type ConsumerCountObject = scala.Double
  type ConsumerList = js.Array[typingsSlinky.awsSdk.kinesisMod.Consumer]
  type ConsumerName = java.lang.String
  type DescribeStreamInputLimit = scala.Double
  type EnhancedMonitoringList = js.Array[typingsSlinky.awsSdk.kinesisMod.EnhancedMetrics]
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type GetRecordsInputLimit = scala.Double
  type HashKey = java.lang.String
  type KeyId = java.lang.String
  type ListShardsInputLimit = scala.Double
  type ListStreamConsumersInputLimit = scala.Double
  type ListStreamsInputLimit = scala.Double
  type ListTagsForStreamInputLimit = scala.Double
  type MetricsNameList = js.Array[typingsSlinky.awsSdk.kinesisMod.MetricsName]
  type MillisBehindLatest = scala.Double
  type NextToken = java.lang.String
  type PartitionKey = java.lang.String
  type PositiveIntegerObject = scala.Double
  type PutRecordsRequestEntryList = js.Array[typingsSlinky.awsSdk.kinesisMod.PutRecordsRequestEntry]
  type PutRecordsResultEntryList = js.Array[typingsSlinky.awsSdk.kinesisMod.PutRecordsResultEntry]
  type RecordList = js.Array[typingsSlinky.awsSdk.kinesisMod.Record]
  type RetentionPeriodHours = scala.Double
  type SequenceNumber = java.lang.String
  type ShardCountObject = scala.Double
  type ShardId = java.lang.String
  type ShardIterator = java.lang.String
  type ShardList = js.Array[typingsSlinky.awsSdk.kinesisMod.Shard]
  type StreamARN = java.lang.String
  type StreamName = java.lang.String
  type StreamNameList = js.Array[typingsSlinky.awsSdk.kinesisMod.StreamName]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.kinesisMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.kinesisMod.Tag]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.kinesisMod.TagValue]
  type TagValue = java.lang.String
  type Timestamp = js.Date
}

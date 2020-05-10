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
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type ConsumerStatus = typingsSlinky.awsSdk.kinesisMod._ConsumerStatus | java.lang.String
  type Data = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.kinesisMod.Blob | java.lang.String
  type DescribeStreamInputLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type EncryptionType = typingsSlinky.awsSdk.kinesisMod._EncryptionType | java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IncomingBytes
    - typingsSlinky.awsSdk.awsSdkStrings.IncomingRecords
    - typingsSlinky.awsSdk.awsSdkStrings.OutgoingBytes
    - typingsSlinky.awsSdk.awsSdkStrings.OutgoingRecords
    - typingsSlinky.awsSdk.awsSdkStrings.WriteProvisionedThroughputExceeded
    - typingsSlinky.awsSdk.awsSdkStrings.ReadProvisionedThroughputExceeded
    - typingsSlinky.awsSdk.awsSdkStrings.IteratorAgeMilliseconds
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type MetricsName = typingsSlinky.awsSdk.kinesisMod._MetricsName | java.lang.String
  type MetricsNameList = js.Array[typingsSlinky.awsSdk.kinesisMod.MetricsName]
  type MillisBehindLatest = scala.Double
  type NextToken = java.lang.String
  type PartitionKey = java.lang.String
  type PositiveIntegerObject = scala.Double
  type PutRecordsRequestEntryList = js.Array[typingsSlinky.awsSdk.kinesisMod.PutRecordsRequestEntry]
  type PutRecordsResultEntryList = js.Array[typingsSlinky.awsSdk.kinesisMod.PutRecordsResultEntry]
  type RecordList = js.Array[typingsSlinky.awsSdk.kinesisMod.Record]
  type RetentionPeriodHours = scala.Double
  type ScalingType = typingsSlinky.awsSdk.awsSdkStrings.UNIFORM_SCALING | java.lang.String
  type SequenceNumber = java.lang.String
  type ShardCountObject = scala.Double
  type ShardId = java.lang.String
  type ShardIterator = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AT_SEQUENCE_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.AFTER_SEQUENCE_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typingsSlinky.awsSdk.awsSdkStrings.LATEST
    - typingsSlinky.awsSdk.awsSdkStrings.AT_TIMESTAMP
    - java.lang.String
  */
  type ShardIteratorType = typingsSlinky.awsSdk.kinesisMod._ShardIteratorType | java.lang.String
  type ShardList = js.Array[typingsSlinky.awsSdk.kinesisMod.Shard]
  type StreamARN = java.lang.String
  type StreamName = java.lang.String
  type StreamNameList = js.Array[typingsSlinky.awsSdk.kinesisMod.StreamName]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type StreamStatus = typingsSlinky.awsSdk.kinesisMod._StreamStatus | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.kinesisMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.kinesisMod.Tag]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.kinesisMod.TagValue]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-12-02`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.kinesisMod._apiVersion | java.lang.String
}

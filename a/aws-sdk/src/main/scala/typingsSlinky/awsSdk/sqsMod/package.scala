package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqsMod {
  type AWSAccountIdList = js.Array[typingsSlinky.awsSdk.sqsMod.String]
  type ActionNameList = js.Array[typingsSlinky.awsSdk.sqsMod.String]
  type AttributeNameList = js.Array[typingsSlinky.awsSdk.sqsMod.QueueAttributeName]
  type BatchResultErrorEntryList = js.Array[typingsSlinky.awsSdk.sqsMod.BatchResultErrorEntry]
  type Binary = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.sqsMod.Blob | java.lang.String
  type BinaryList = js.Array[typingsSlinky.awsSdk.sqsMod.Binary]
  type Boolean = scala.Boolean
  type ChangeMessageVisibilityBatchRequestEntryList = js.Array[typingsSlinky.awsSdk.sqsMod.ChangeMessageVisibilityBatchRequestEntry]
  type ChangeMessageVisibilityBatchResultEntryList = js.Array[typingsSlinky.awsSdk.sqsMod.ChangeMessageVisibilityBatchResultEntry]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.sqsMod.ClientApiVersions
  type DeleteMessageBatchRequestEntryList = js.Array[typingsSlinky.awsSdk.sqsMod.DeleteMessageBatchRequestEntry]
  type DeleteMessageBatchResultEntryList = js.Array[typingsSlinky.awsSdk.sqsMod.DeleteMessageBatchResultEntry]
  type Integer = scala.Double
  type MessageAttributeName = java.lang.String
  type MessageAttributeNameList = js.Array[typingsSlinky.awsSdk.sqsMod.MessageAttributeName]
  type MessageBodyAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sqsMod.MessageAttributeValue]
  type MessageBodySystemAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sqsMod.MessageSystemAttributeValue]
  type MessageList = js.Array[typingsSlinky.awsSdk.sqsMod.Message]
  type MessageSystemAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sqsMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SenderId
    - typingsSlinky.awsSdk.awsSdkStrings.SentTimestamp
    - typingsSlinky.awsSdk.awsSdkStrings.ApproximateReceiveCount
    - typingsSlinky.awsSdk.awsSdkStrings.ApproximateFirstReceiveTimestamp
    - typingsSlinky.awsSdk.awsSdkStrings.SequenceNumber
    - typingsSlinky.awsSdk.awsSdkStrings.MessageDeduplicationId
    - typingsSlinky.awsSdk.awsSdkStrings.MessageGroupId
    - typingsSlinky.awsSdk.awsSdkStrings.AWSTraceHeader
    - java.lang.String
  */
  type MessageSystemAttributeName = typingsSlinky.awsSdk.sqsMod._MessageSystemAttributeName | java.lang.String
  type MessageSystemAttributeNameForSends = typingsSlinky.awsSdk.awsSdkStrings.AWSTraceHeader | java.lang.String
  type QueueAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sqsMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.All_
    - typingsSlinky.awsSdk.awsSdkStrings.Policy_
    - typingsSlinky.awsSdk.awsSdkStrings.VisibilityTimeout
    - typingsSlinky.awsSdk.awsSdkStrings.MaximumMessageSize
    - typingsSlinky.awsSdk.awsSdkStrings.MessageRetentionPeriod
    - typingsSlinky.awsSdk.awsSdkStrings.ApproximateNumberOfMessages
    - typingsSlinky.awsSdk.awsSdkStrings.ApproximateNumberOfMessagesNotVisible
    - typingsSlinky.awsSdk.awsSdkStrings.CreatedTimestamp
    - typingsSlinky.awsSdk.awsSdkStrings.LastModifiedTimestamp
    - typingsSlinky.awsSdk.awsSdkStrings.QueueArn
    - typingsSlinky.awsSdk.awsSdkStrings.ApproximateNumberOfMessagesDelayed
    - typingsSlinky.awsSdk.awsSdkStrings.DelaySeconds
    - typingsSlinky.awsSdk.awsSdkStrings.ReceiveMessageWaitTimeSeconds
    - typingsSlinky.awsSdk.awsSdkStrings.RedrivePolicy
    - typingsSlinky.awsSdk.awsSdkStrings.FifoQueue
    - typingsSlinky.awsSdk.awsSdkStrings.ContentBasedDeduplication
    - typingsSlinky.awsSdk.awsSdkStrings.KmsMasterKeyId
    - typingsSlinky.awsSdk.awsSdkStrings.KmsDataKeyReusePeriodSeconds
    - java.lang.String
  */
  type QueueAttributeName = typingsSlinky.awsSdk.sqsMod._QueueAttributeName | java.lang.String
  type QueueUrlList = js.Array[typingsSlinky.awsSdk.sqsMod.String]
  type SendMessageBatchRequestEntryList = js.Array[typingsSlinky.awsSdk.sqsMod.SendMessageBatchRequestEntry]
  type SendMessageBatchResultEntryList = js.Array[typingsSlinky.awsSdk.sqsMod.SendMessageBatchResultEntry]
  type String = java.lang.String
  type StringList = js.Array[typingsSlinky.awsSdk.sqsMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.sqsMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sqsMod.TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2012-11-05`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.sqsMod._apiVersion | java.lang.String
}

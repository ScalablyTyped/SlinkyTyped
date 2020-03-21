package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynamodbstreamsMod {
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbstreamsMod.AttributeValue]
  type AttributeName = java.lang.String
  type BinaryAttributeValue = typingsSlinky.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.awsSdk.dynamodbstreamsMod.Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[typingsSlinky.awsSdk.dynamodbstreamsMod.BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.dynamodbstreamsMod.ClientApiVersions
  type Date = js.Date
  type KeySchema = js.Array[typingsSlinky.awsSdk.dynamodbstreamsMod.KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HASH
    - typingsSlinky.awsSdk.awsSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = typingsSlinky.awsSdk.dynamodbstreamsMod._KeyType | java.lang.String
  type ListAttributeValue = js.Array[typingsSlinky.awsSdk.dynamodbstreamsMod.AttributeValue]
  type MapAttributeValue = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbstreamsMod.AttributeValue]
  type NullAttributeValue = scala.Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[typingsSlinky.awsSdk.dynamodbstreamsMod.NumberAttributeValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INSERT
    - typingsSlinky.awsSdk.awsSdkStrings.MODIFY
    - typingsSlinky.awsSdk.awsSdkStrings.REMOVE
    - java.lang.String
  */
  type OperationType = typingsSlinky.awsSdk.dynamodbstreamsMod._OperationType | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type RecordList = js.Array[typingsSlinky.awsSdk.dynamodbstreamsMod.Record]
  type SequenceNumber = java.lang.String
  type ShardDescriptionList = js.Array[typingsSlinky.awsSdk.dynamodbstreamsMod.Shard]
  type ShardId = java.lang.String
  type ShardIterator = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typingsSlinky.awsSdk.awsSdkStrings.LATEST
    - typingsSlinky.awsSdk.awsSdkStrings.AT_SEQUENCE_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.AFTER_SEQUENCE_NUMBER
    - java.lang.String
  */
  type ShardIteratorType = typingsSlinky.awsSdk.dynamodbstreamsMod._ShardIteratorType | java.lang.String
  type StreamArn = java.lang.String
  type StreamList = js.Array[typingsSlinky.awsSdk.dynamodbstreamsMod.Stream]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLING
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLING
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type StreamStatus = typingsSlinky.awsSdk.dynamodbstreamsMod._StreamStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NEW_IMAGE
    - typingsSlinky.awsSdk.awsSdkStrings.OLD_IMAGE
    - typingsSlinky.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
    - typingsSlinky.awsSdk.awsSdkStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = typingsSlinky.awsSdk.dynamodbstreamsMod._StreamViewType | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[typingsSlinky.awsSdk.dynamodbstreamsMod.StringAttributeValue]
  type TableName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2012-08-10`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.dynamodbstreamsMod._apiVersion | java.lang.String
}

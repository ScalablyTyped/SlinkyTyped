package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ioteventsMod {
  
  type Actions = js.Array[typingsSlinky.awsSdk.ioteventsMod.Action]
  
  type AmazonResourceName = java.lang.String
  
  type AssetId = java.lang.String
  
  type AssetPropertyAlias = java.lang.String
  
  type AssetPropertyBooleanValue = java.lang.String
  
  type AssetPropertyDoubleValue = java.lang.String
  
  type AssetPropertyEntryId = java.lang.String
  
  type AssetPropertyId = java.lang.String
  
  type AssetPropertyIntegerValue = java.lang.String
  
  type AssetPropertyOffsetInNanos = java.lang.String
  
  type AssetPropertyQuality = java.lang.String
  
  type AssetPropertyStringValue = java.lang.String
  
  type AssetPropertyTimeInSeconds = java.lang.String
  
  type AttributeJsonPath = java.lang.String
  
  type Attributes = js.Array[typingsSlinky.awsSdk.ioteventsMod.Attribute]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ioteventsMod.ClientApiVersions
  
  type Condition = java.lang.String
  
  type ContentExpression = java.lang.String
  
  type DeliveryStreamName = java.lang.String
  
  type DetectorDebugOptions = js.Array[typingsSlinky.awsSdk.ioteventsMod.DetectorDebugOption]
  
  type DetectorModelArn = java.lang.String
  
  type DetectorModelDescription = java.lang.String
  
  type DetectorModelName = java.lang.String
  
  type DetectorModelSummaries = js.Array[typingsSlinky.awsSdk.ioteventsMod.DetectorModelSummary]
  
  type DetectorModelVersion = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVATING
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DEPRECATED
    - typingsSlinky.awsSdk.awsSdkStrings.DRAFT
    - typingsSlinky.awsSdk.awsSdkStrings.PAUSED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DetectorModelVersionStatus = typingsSlinky.awsSdk.ioteventsMod._DetectorModelVersionStatus | java.lang.String
  
  type DetectorModelVersionSummaries = js.Array[typingsSlinky.awsSdk.ioteventsMod.DetectorModelVersionSummary]
  
  type DynamoKeyField = java.lang.String
  
  type DynamoKeyType = java.lang.String
  
  type DynamoKeyValue = java.lang.String
  
  type DynamoOperation = java.lang.String
  
  type DynamoTableName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BATCH
    - typingsSlinky.awsSdk.awsSdkStrings.SERIAL
    - java.lang.String
  */
  type EvaluationMethod = typingsSlinky.awsSdk.ioteventsMod._EvaluationMethod | java.lang.String
  
  type EventName = java.lang.String
  
  type Events = js.Array[typingsSlinky.awsSdk.ioteventsMod.Event]
  
  type FirehoseSeparator = java.lang.String
  
  type InputArn = java.lang.String
  
  type InputDescription = java.lang.String
  
  type InputName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type InputStatus = typingsSlinky.awsSdk.ioteventsMod._InputStatus | java.lang.String
  
  type InputSummaries = js.Array[typingsSlinky.awsSdk.ioteventsMod.InputSummary]
  
  type KeyValue = java.lang.String
  
  type LoggingEnabled = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INFO
    - typingsSlinky.awsSdk.awsSdkStrings.DEBUG
    - java.lang.String
  */
  type LoggingLevel = typingsSlinky.awsSdk.ioteventsMod._LoggingLevel | java.lang.String
  
  type MQTTTopic = java.lang.String
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STRING
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type PayloadType = typingsSlinky.awsSdk.ioteventsMod._PayloadType | java.lang.String
  
  type QueueUrl = java.lang.String
  
  type Seconds = scala.Double
  
  type StateName = java.lang.String
  
  type States = js.Array[typingsSlinky.awsSdk.ioteventsMod.State]
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.ioteventsMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.ioteventsMod.Tag]
  
  type TimerName = java.lang.String
  
  type Timestamp = js.Date
  
  type TransitionEvents = js.Array[typingsSlinky.awsSdk.ioteventsMod.TransitionEvent]
  
  type UseBase64 = scala.Boolean
  
  type VariableName = java.lang.String
  
  type VariableValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-07-27`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ioteventsMod._apiVersion | java.lang.String
}

package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lexmodelbuildingserviceMod {
  type AliasName = java.lang.String
  type AliasNameOrListAll = java.lang.String
  type AmazonResourceName = java.lang.String
  type Boolean = scala.Boolean
  type BotAliasMetadataList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.BotAliasMetadata]
  type BotChannelAssociationList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.BotChannelAssociation]
  type BotChannelName = java.lang.String
  type BotMetadataList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.BotMetadata]
  type BotName = java.lang.String
  type BotVersions = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.Version]
  type BuiltinIntentMetadataList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.BuiltinIntentMetadata]
  type BuiltinIntentSignature = java.lang.String
  type BuiltinIntentSlotList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.BuiltinIntentSlot]
  type BuiltinSlotTypeMetadataList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.BuiltinSlotTypeMetadata]
  type BuiltinSlotTypeSignature = java.lang.String
  type ChannelConfigurationMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ChannelStatus = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._ChannelStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Facebook
    - typingsSlinky.awsSdk.awsSdkStrings.Slack
    - typingsSlinky.awsSdk.awsSdkStrings.`Twilio-Sms`
    - typingsSlinky.awsSdk.awsSdkStrings.Kik_
    - java.lang.String
  */
  type ChannelType = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._ChannelType | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.lexmodelbuildingserviceMod.ClientApiVersions
  type ContentString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PlainText_
    - typingsSlinky.awsSdk.awsSdkStrings.SSML
    - typingsSlinky.awsSdk.awsSdkStrings.CustomPayload
    - java.lang.String
  */
  type ContentType = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._ContentType | java.lang.String
  type Count = scala.Double
  type CustomOrBuiltinSlotTypeName = java.lang.String
  type Description = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUDWATCH_LOGS
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - java.lang.String
  */
  type Destination = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._Destination | java.lang.String
  type EnumerationValues = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.EnumerationValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ExportStatus = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._ExportStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALEXA_SKILLS_KIT
    - typingsSlinky.awsSdk.awsSdkStrings.LEX
    - java.lang.String
  */
  type ExportType = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._ExportType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ReturnIntent
    - typingsSlinky.awsSdk.awsSdkStrings.CodeHook
    - java.lang.String
  */
  type FulfillmentActivityType = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._FulfillmentActivityType | java.lang.String
  type GroupNumber = scala.Double
  type IamRoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ImportStatus = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._ImportStatus | java.lang.String
  type IntentList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.Intent]
  type IntentMetadataList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.IntentMetadata]
  type IntentName = java.lang.String
  type IntentUtteranceList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.Utterance]
  type KendraIndexArn = java.lang.String
  type KmsKeyArn = java.lang.String
  type LambdaARN = java.lang.String
  type ListOfUtterance = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.UtteranceData]
  type ListsOfUtterances = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.UtteranceList]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`en-US`
    - typingsSlinky.awsSdk.awsSdkStrings.`en-GB`
    - typingsSlinky.awsSdk.awsSdkStrings.`de-DE`
    - java.lang.String
  */
  type Locale = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._Locale | java.lang.String
  type LocaleList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.Locale]
  type LogSettingsRequestList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.LogSettingsRequest]
  type LogSettingsResponseList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.LogSettingsResponse]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AUDIO
    - typingsSlinky.awsSdk.awsSdkStrings.TEXT
    - java.lang.String
  */
  type LogType = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._LogType | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OVERWRITE_LATEST
    - typingsSlinky.awsSdk.awsSdkStrings.FAIL_ON_CONFLICT
    - java.lang.String
  */
  type MergeStrategy = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._MergeStrategy | java.lang.String
  type MessageList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.Message]
  type MessageVersion = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type NumericalVersion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_OBFUSCATION
    - java.lang.String
  */
  type ObfuscationSetting = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._ObfuscationSetting | java.lang.String
  type Priority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SAVE
    - typingsSlinky.awsSdk.awsSdkStrings.BUILD
    - java.lang.String
  */
  type ProcessBehavior = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._ProcessBehavior | java.lang.String
  type PromptMaxAttempts = scala.Double
  type QueryFilterString = java.lang.String
  type RegexPattern = java.lang.String
  type ResourceArn = java.lang.String
  type ResourcePrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BOT
    - typingsSlinky.awsSdk.awsSdkStrings.INTENT
    - typingsSlinky.awsSdk.awsSdkStrings.SLOT_TYPE
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._ResourceType | java.lang.String
  type ResponseCard = java.lang.String
  type SessionTTL = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Required_
    - typingsSlinky.awsSdk.awsSdkStrings.Optional_
    - java.lang.String
  */
  type SlotConstraint = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._SlotConstraint | java.lang.String
  type SlotList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.Slot]
  type SlotName = java.lang.String
  type SlotTypeConfigurations = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.SlotTypeConfiguration]
  type SlotTypeMetadataList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.SlotTypeMetadata]
  type SlotTypeName = java.lang.String
  type SlotUtteranceList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.Utterance]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ORIGINAL_VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.TOP_RESOLUTION
    - java.lang.String
  */
  type SlotValueSelectionStrategy = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._SlotValueSelectionStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BUILDING
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.READY_BASIC_TESTING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_BUILT
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._Status | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Detected
    - typingsSlinky.awsSdk.awsSdkStrings.Missed_
    - java.lang.String
  */
  type StatusType = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._StatusType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.String]
  type SynonymList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.Value]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.lexmodelbuildingserviceMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  type UserId = java.lang.String
  type Utterance = java.lang.String
  type UtteranceString = java.lang.String
  type Value = java.lang.String
  type Version = java.lang.String
  type _Blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.lexmodelbuildingserviceMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-04-19`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.lexmodelbuildingserviceMod._apiVersion | java.lang.String
  type roleArn = java.lang.String
}

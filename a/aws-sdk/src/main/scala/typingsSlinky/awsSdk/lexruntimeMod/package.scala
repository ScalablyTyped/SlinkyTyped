package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lexruntimeMod {
  type Accept = java.lang.String
  type AttributesString = java.lang.String
  type BlobStream = typingsSlinky.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.awsSdk.lexruntimeMod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  type BotAlias = java.lang.String
  type BotName = java.lang.String
  type ButtonTextStringWithLength = java.lang.String
  type ButtonValueStringWithLength = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.lexruntimeMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.None_
    - typingsSlinky.awsSdk.awsSdkStrings.Confirmed_
    - typingsSlinky.awsSdk.awsSdkStrings.Denied_
    - java.lang.String
  */
  type ConfirmationStatus = typingsSlinky.awsSdk.lexruntimeMod._ConfirmationStatus | java.lang.String
  type ContentType = typingsSlinky.awsSdk.awsSdkStrings.applicationSlashvndDotamazonawsDotcardDotgeneric | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ElicitIntent
    - typingsSlinky.awsSdk.awsSdkStrings.ConfirmIntent
    - typingsSlinky.awsSdk.awsSdkStrings.ElicitSlot
    - typingsSlinky.awsSdk.awsSdkStrings.Close
    - typingsSlinky.awsSdk.awsSdkStrings.Delegate
    - java.lang.String
  */
  type DialogActionType = typingsSlinky.awsSdk.lexruntimeMod._DialogActionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ElicitIntent
    - typingsSlinky.awsSdk.awsSdkStrings.ConfirmIntent
    - typingsSlinky.awsSdk.awsSdkStrings.ElicitSlot
    - typingsSlinky.awsSdk.awsSdkStrings.Fulfilled_
    - typingsSlinky.awsSdk.awsSdkStrings.ReadyForFulfillment
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DialogState = typingsSlinky.awsSdk.lexruntimeMod._DialogState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Fulfilled_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.ReadyForFulfillment
    - java.lang.String
  */
  type FulfillmentState = typingsSlinky.awsSdk.lexruntimeMod._FulfillmentState | java.lang.String
  type HttpContentType = java.lang.String
  type IntentName = java.lang.String
  type IntentSummaryCheckpointLabel = java.lang.String
  type IntentSummaryList = js.Array[typingsSlinky.awsSdk.lexruntimeMod.IntentSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PlainText_
    - typingsSlinky.awsSdk.awsSdkStrings.CustomPayload
    - typingsSlinky.awsSdk.awsSdkStrings.SSML
    - typingsSlinky.awsSdk.awsSdkStrings.Composite
    - java.lang.String
  */
  type MessageFormatType = typingsSlinky.awsSdk.lexruntimeMod._MessageFormatType | java.lang.String
  type SentimentLabel = java.lang.String
  type SentimentScore = java.lang.String
  type String = java.lang.String
  type StringMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.lexruntimeMod.String]
  type StringUrlWithLength = java.lang.String
  type StringWithLength = java.lang.String
  type Text = java.lang.String
  type UserId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-11-28`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.lexruntimeMod._apiVersion | java.lang.String
  type genericAttachmentList = js.Array[typingsSlinky.awsSdk.lexruntimeMod.GenericAttachment]
  type listOfButtons = js.Array[typingsSlinky.awsSdk.lexruntimeMod.Button]
}

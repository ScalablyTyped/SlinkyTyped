package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dialogflow.dialogflowStrings.basicCard
import typingsSlinky.dialogflow.dialogflowStrings.browseCarouselCard
import typingsSlinky.dialogflow.dialogflowStrings.card
import typingsSlinky.dialogflow.dialogflowStrings.carouselSelect
import typingsSlinky.dialogflow.dialogflowStrings.image
import typingsSlinky.dialogflow.dialogflowStrings.linkOutSuggestion
import typingsSlinky.dialogflow.dialogflowStrings.listSelect
import typingsSlinky.dialogflow.dialogflowStrings.mediaContent
import typingsSlinky.dialogflow.dialogflowStrings.payload
import typingsSlinky.dialogflow.dialogflowStrings.quickReplies
import typingsSlinky.dialogflow.dialogflowStrings.rbmCarouselRichCard
import typingsSlinky.dialogflow.dialogflowStrings.rbmStandaloneRichCard
import typingsSlinky.dialogflow.dialogflowStrings.rbmText
import typingsSlinky.dialogflow.dialogflowStrings.simpleResponses
import typingsSlinky.dialogflow.dialogflowStrings.suggestions
import typingsSlinky.dialogflow.dialogflowStrings.tableCard
import typingsSlinky.dialogflow.dialogflowStrings.telephonyPlayAudio
import typingsSlinky.dialogflow.dialogflowStrings.telephonySynthesizeSpeech
import typingsSlinky.dialogflow.dialogflowStrings.telephonyTransferCall
import typingsSlinky.dialogflow.dialogflowStrings.text
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Message. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message")
@js.native
/**
  * Constructs a new Message.
  * @param [properties] Properties to set
  */
class Message_ () extends IMessage {
  def this(properties: IMessage) = this()
  /** Message message. */
  var message: js.UndefOr[
    text | image | quickReplies | card | payload | simpleResponses | basicCard | suggestions | linkOutSuggestion | listSelect | carouselSelect | telephonyPlayAudio | telephonySynthesizeSpeech | telephonyTransferCall | rbmText | rbmStandaloneRichCard | rbmCarouselRichCard | browseCarouselCard | tableCard | mediaContent
  ] = js.native
  /** Message platform. */
  @JSName("platform")
  var platform_Message_ : Platform = js.native
  /**
    * Converts this Message to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}


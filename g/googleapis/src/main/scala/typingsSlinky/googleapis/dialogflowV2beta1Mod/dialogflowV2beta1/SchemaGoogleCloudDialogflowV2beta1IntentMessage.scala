package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corresponds to the `Response` field in the Dialogflow console.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessage extends js.Object {
  /**
    * Displays a basic card for Actions on Google.
    */
  var basicCard: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCard] = js.native
  /**
    * Displays a card.
    */
  var card: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageCard] = js.native
  /**
    * Displays a carousel card for Actions on Google.
    */
  var carouselSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect] = js.native
  /**
    * Displays an image.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageImage] = js.native
  /**
    * Displays a link out suggestion chip for Actions on Google.
    */
  var linkOutSuggestion: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion] = js.native
  /**
    * Displays a list card for Actions on Google.
    */
  var listSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect] = js.native
  /**
    * Returns a response containing a custom, platform-specific payload. See
    * the Intent.Message.Platform type for a description of the structure that
    * may be required for your platform.
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Optional. The platform that this message is intended for.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Displays quick replies.
    */
  var quickReplies: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageQuickReplies] = js.native
  /**
    * Returns a voice or text-only response for Actions on Google.
    */
  var simpleResponses: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses] = js.native
  /**
    * Displays suggestion chips for Actions on Google.
    */
  var suggestions: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions] = js.native
  /**
    * Plays audio from a file in Telephony Gateway.
    */
  var telephonyPlayAudio: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio] = js.native
  /**
    * Synthesizes speech in Telephony Gateway.
    */
  var telephonySynthesizeSpeech: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech] = js.native
  /**
    * Transfers the call in Telephony Gateway.
    */
  var telephonyTransferCall: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall] = js.native
  /**
    * Returns a text response.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageText] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessage {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessage]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasicCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasicCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicCard")(js.undefined)
        ret
    }
    @scala.inline
    def withCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(js.undefined)
        ret
    }
    @scala.inline
    def withCarouselSelect(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarouselSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkOutSuggestion(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkOutSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkOutSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkOutSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withListSelect(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickReplies(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageQuickReplies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickReplies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickReplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickReplies")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleResponses(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponses")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestions(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withTelephonyPlayAudio(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonyPlayAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelephonyPlayAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonyPlayAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withTelephonySynthesizeSpeech(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonySynthesizeSpeech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelephonySynthesizeSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonySynthesizeSpeech")(js.undefined)
        ret
    }
    @scala.inline
    def withTelephonyTransferCall(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonyTransferCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelephonyTransferCall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonyTransferCall")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}


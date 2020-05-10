package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corresponds to the `Response` field in the Dialogflow console.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessage extends js.Object {
  /**
    * The basic card response for Actions on Google.
    */
  var basicCard: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageBasicCard] = js.native
  /**
    * The card response.
    */
  var card: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageCard] = js.native
  /**
    * The carousel card response for Actions on Google.
    */
  var carouselSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect] = js.native
  /**
    * The image response.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageImage] = js.native
  /**
    * The link out suggestion chip for Actions on Google.
    */
  var linkOutSuggestion: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] = js.native
  /**
    * The list card response for Actions on Google.
    */
  var listSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageListSelect] = js.native
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
    * The quick replies response.
    */
  var quickReplies: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies] = js.native
  /**
    * The voice and text-only responses for Actions on Google.
    */
  var simpleResponses: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses] = js.native
  /**
    * The suggestion chips for Actions on Google.
    */
  var suggestions: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageSuggestions] = js.native
  /**
    * The text response.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageText] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessage {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessage]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasicCard(value: SchemaGoogleCloudDialogflowV2IntentMessageBasicCard): Self = {
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
    def withCard(value: SchemaGoogleCloudDialogflowV2IntentMessageCard): Self = {
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
    def withCarouselSelect(value: SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect): Self = {
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
    def withImage(value: SchemaGoogleCloudDialogflowV2IntentMessageImage): Self = {
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
    def withLinkOutSuggestion(value: SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion): Self = {
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
    def withListSelect(value: SchemaGoogleCloudDialogflowV2IntentMessageListSelect): Self = {
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
    def withQuickReplies(value: SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies): Self = {
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
    def withSimpleResponses(value: SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses): Self = {
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
    def withSuggestions(value: SchemaGoogleCloudDialogflowV2IntentMessageSuggestions): Self = {
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
    def withText(value: SchemaGoogleCloudDialogflowV2IntentMessageText): Self = {
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


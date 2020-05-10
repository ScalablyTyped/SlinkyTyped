package typingsSlinky.actionsOnGoogle.apiV2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentMessage extends js.Object {
  var basicCard: js.UndefOr[GoogleCloudDialogflowV2IntentMessageBasicCard] = js.native
  var card: js.UndefOr[GoogleCloudDialogflowV2IntentMessageCard] = js.native
  var carouselSelect: js.UndefOr[GoogleCloudDialogflowV2IntentMessageCarouselSelect] = js.native
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.native
  var linkOutSuggestion: js.UndefOr[GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] = js.native
  var listSelect: js.UndefOr[GoogleCloudDialogflowV2IntentMessageListSelect] = js.native
  var payload: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var platform: js.UndefOr[GoogleCloudDialogflowV2IntentMessagePlatform] = js.native
  var quickReplies: js.UndefOr[GoogleCloudDialogflowV2IntentMessageQuickReplies] = js.native
  var simpleResponses: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSimpleResponses] = js.native
  var suggestions: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSuggestions] = js.native
  var text: js.UndefOr[GoogleCloudDialogflowV2IntentMessageText] = js.native
}

object GoogleCloudDialogflowV2IntentMessage {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessage]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageOps[Self <: GoogleCloudDialogflowV2IntentMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasicCard(value: GoogleCloudDialogflowV2IntentMessageBasicCard): Self = {
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
    def withCard(value: GoogleCloudDialogflowV2IntentMessageCard): Self = {
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
    def withCarouselSelect(value: GoogleCloudDialogflowV2IntentMessageCarouselSelect): Self = {
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
    def withImage(value: GoogleCloudDialogflowV2IntentMessageImage): Self = {
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
    def withLinkOutSuggestion(value: GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion): Self = {
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
    def withListSelect(value: GoogleCloudDialogflowV2IntentMessageListSelect): Self = {
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
    def withPayload(value: ApiClientObjectMap[_]): Self = {
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
    def withPlatform(value: GoogleCloudDialogflowV2IntentMessagePlatform): Self = {
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
    def withQuickReplies(value: GoogleCloudDialogflowV2IntentMessageQuickReplies): Self = {
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
    def withSimpleResponses(value: GoogleCloudDialogflowV2IntentMessageSimpleResponses): Self = {
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
    def withSuggestions(value: GoogleCloudDialogflowV2IntentMessageSuggestions): Self = {
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
    def withText(value: GoogleCloudDialogflowV2IntentMessageText): Self = {
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


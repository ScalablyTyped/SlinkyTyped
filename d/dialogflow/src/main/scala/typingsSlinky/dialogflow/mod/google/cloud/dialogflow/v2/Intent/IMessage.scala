package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IBasicCard
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ICard
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ICarouselSelect
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IImage
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ILinkOutSuggestion
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IListSelect
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IQuickReplies
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ISimpleResponses
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ISuggestions
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IText
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform
import typingsSlinky.dialogflow.mod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Message. */
@js.native
trait IMessage extends js.Object {
  /** Message basicCard */
  var basicCard: js.UndefOr[IBasicCard | Null] = js.native
  /** Message card */
  var card: js.UndefOr[ICard | Null] = js.native
  /** Message carouselSelect */
  var carouselSelect: js.UndefOr[ICarouselSelect | Null] = js.native
  /** Message image */
  var image: js.UndefOr[IImage | Null] = js.native
  /** Message linkOutSuggestion */
  var linkOutSuggestion: js.UndefOr[ILinkOutSuggestion | Null] = js.native
  /** Message listSelect */
  var listSelect: js.UndefOr[IListSelect | Null] = js.native
  /** Message payload */
  var payload: js.UndefOr[IStruct | Null] = js.native
  /** Message platform */
  var platform: js.UndefOr[Platform | Null] = js.native
  /** Message quickReplies */
  var quickReplies: js.UndefOr[IQuickReplies | Null] = js.native
  /** Message simpleResponses */
  var simpleResponses: js.UndefOr[ISimpleResponses | Null] = js.native
  /** Message suggestions */
  var suggestions: js.UndefOr[ISuggestions | Null] = js.native
  /** Message text */
  var text: js.UndefOr[IText | Null] = js.native
}

object IMessage {
  @scala.inline
  def apply(): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessage]
  }
  @scala.inline
  implicit class IMessageOps[Self <: IMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasicCard(value: IBasicCard): Self = {
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
    def withBasicCardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicCard")(null)
        ret
    }
    @scala.inline
    def withCard(value: ICard): Self = {
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
    def withCardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(null)
        ret
    }
    @scala.inline
    def withCarouselSelect(value: ICarouselSelect): Self = {
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
    def withCarouselSelectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselSelect")(null)
        ret
    }
    @scala.inline
    def withImage(value: IImage): Self = {
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
    def withImageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(null)
        ret
    }
    @scala.inline
    def withLinkOutSuggestion(value: ILinkOutSuggestion): Self = {
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
    def withLinkOutSuggestionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkOutSuggestion")(null)
        ret
    }
    @scala.inline
    def withListSelect(value: IListSelect): Self = {
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
    def withListSelectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSelect")(null)
        ret
    }
    @scala.inline
    def withPayload(value: IStruct): Self = {
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
    def withPayloadNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(null)
        ret
    }
    @scala.inline
    def withPlatform(value: Platform): Self = {
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
    def withPlatformNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(null)
        ret
    }
    @scala.inline
    def withQuickReplies(value: IQuickReplies): Self = {
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
    def withQuickRepliesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickReplies")(null)
        ret
    }
    @scala.inline
    def withSimpleResponses(value: ISimpleResponses): Self = {
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
    def withSimpleResponsesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponses")(null)
        ret
    }
    @scala.inline
    def withSuggestions(value: ISuggestions): Self = {
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
    def withSuggestionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(null)
        ret
    }
    @scala.inline
    def withText(value: IText): Self = {
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
    @scala.inline
    def withTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(null)
        ret
    }
  }
  
}


package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IBasicCard
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IBrowseCarouselCard
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ICard
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ICarouselSelect
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IImage
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ILinkOutSuggestion
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IListSelect
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IMediaContent
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IQuickReplies
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IRbmCarouselCard
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IRbmStandaloneCard
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IRbmText
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ISimpleResponses
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ISuggestions
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITableCard
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITelephonyPlayAudio
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITelephonySynthesizeSpeech
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITelephonyTransferCall
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IText
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform
import typingsSlinky.dialogflow.mod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Message. */
@js.native
trait IMessage extends js.Object {
  /** Message basicCard */
  var basicCard: js.UndefOr[IBasicCard | Null] = js.native
  /** Message browseCarouselCard */
  var browseCarouselCard: js.UndefOr[IBrowseCarouselCard | Null] = js.native
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
  /** Message mediaContent */
  var mediaContent: js.UndefOr[IMediaContent | Null] = js.native
  /** Message payload */
  var payload: js.UndefOr[IStruct | Null] = js.native
  /** Message platform */
  var platform: js.UndefOr[Platform | Null] = js.native
  /** Message quickReplies */
  var quickReplies: js.UndefOr[IQuickReplies | Null] = js.native
  /** Message rbmCarouselRichCard */
  var rbmCarouselRichCard: js.UndefOr[IRbmCarouselCard | Null] = js.native
  /** Message rbmStandaloneRichCard */
  var rbmStandaloneRichCard: js.UndefOr[IRbmStandaloneCard | Null] = js.native
  /** Message rbmText */
  var rbmText: js.UndefOr[IRbmText | Null] = js.native
  /** Message simpleResponses */
  var simpleResponses: js.UndefOr[ISimpleResponses | Null] = js.native
  /** Message suggestions */
  var suggestions: js.UndefOr[ISuggestions | Null] = js.native
  /** Message tableCard */
  var tableCard: js.UndefOr[ITableCard | Null] = js.native
  /** Message telephonyPlayAudio */
  var telephonyPlayAudio: js.UndefOr[ITelephonyPlayAudio | Null] = js.native
  /** Message telephonySynthesizeSpeech */
  var telephonySynthesizeSpeech: js.UndefOr[ITelephonySynthesizeSpeech | Null] = js.native
  /** Message telephonyTransferCall */
  var telephonyTransferCall: js.UndefOr[ITelephonyTransferCall | Null] = js.native
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
    def withBrowseCarouselCard(value: IBrowseCarouselCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browseCarouselCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowseCarouselCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browseCarouselCard")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowseCarouselCardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browseCarouselCard")(null)
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
    def withMediaContent(value: IMediaContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContent")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContent")(null)
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
    def withRbmCarouselRichCard(value: IRbmCarouselCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmCarouselRichCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRbmCarouselRichCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmCarouselRichCard")(js.undefined)
        ret
    }
    @scala.inline
    def withRbmCarouselRichCardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmCarouselRichCard")(null)
        ret
    }
    @scala.inline
    def withRbmStandaloneRichCard(value: IRbmStandaloneCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmStandaloneRichCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRbmStandaloneRichCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmStandaloneRichCard")(js.undefined)
        ret
    }
    @scala.inline
    def withRbmStandaloneRichCardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmStandaloneRichCard")(null)
        ret
    }
    @scala.inline
    def withRbmText(value: IRbmText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRbmText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmText")(js.undefined)
        ret
    }
    @scala.inline
    def withRbmTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmText")(null)
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
    def withTableCard(value: ITableCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCard")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCard")(null)
        ret
    }
    @scala.inline
    def withTelephonyPlayAudio(value: ITelephonyPlayAudio): Self = {
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
    def withTelephonyPlayAudioNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonyPlayAudio")(null)
        ret
    }
    @scala.inline
    def withTelephonySynthesizeSpeech(value: ITelephonySynthesizeSpeech): Self = {
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
    def withTelephonySynthesizeSpeechNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonySynthesizeSpeech")(null)
        ret
    }
    @scala.inline
    def withTelephonyTransferCall(value: ITelephonyTransferCall): Self = {
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
    def withTelephonyTransferCallNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonyTransferCall")(null)
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


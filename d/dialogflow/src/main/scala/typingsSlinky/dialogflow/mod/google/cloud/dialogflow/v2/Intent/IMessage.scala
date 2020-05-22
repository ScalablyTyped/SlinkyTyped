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
trait IMessage extends js.Object {
  /** Message basicCard */
  var basicCard: js.UndefOr[IBasicCard | Null] = js.undefined
  /** Message card */
  var card: js.UndefOr[ICard | Null] = js.undefined
  /** Message carouselSelect */
  var carouselSelect: js.UndefOr[ICarouselSelect | Null] = js.undefined
  /** Message image */
  var image: js.UndefOr[IImage | Null] = js.undefined
  /** Message linkOutSuggestion */
  var linkOutSuggestion: js.UndefOr[ILinkOutSuggestion | Null] = js.undefined
  /** Message listSelect */
  var listSelect: js.UndefOr[IListSelect | Null] = js.undefined
  /** Message payload */
  var payload: js.UndefOr[IStruct | Null] = js.undefined
  /** Message platform */
  var platform: js.UndefOr[Platform | Null] = js.undefined
  /** Message quickReplies */
  var quickReplies: js.UndefOr[IQuickReplies | Null] = js.undefined
  /** Message simpleResponses */
  var simpleResponses: js.UndefOr[ISimpleResponses | Null] = js.undefined
  /** Message suggestions */
  var suggestions: js.UndefOr[ISuggestions | Null] = js.undefined
  /** Message text */
  var text: js.UndefOr[IText | Null] = js.undefined
}

object IMessage {
  @scala.inline
  def apply(
    basicCard: js.UndefOr[Null | IBasicCard] = js.undefined,
    card: js.UndefOr[Null | ICard] = js.undefined,
    carouselSelect: js.UndefOr[Null | ICarouselSelect] = js.undefined,
    image: js.UndefOr[Null | IImage] = js.undefined,
    linkOutSuggestion: js.UndefOr[Null | ILinkOutSuggestion] = js.undefined,
    listSelect: js.UndefOr[Null | IListSelect] = js.undefined,
    payload: js.UndefOr[Null | IStruct] = js.undefined,
    platform: js.UndefOr[Null | Platform] = js.undefined,
    quickReplies: js.UndefOr[Null | IQuickReplies] = js.undefined,
    simpleResponses: js.UndefOr[Null | ISimpleResponses] = js.undefined,
    suggestions: js.UndefOr[Null | ISuggestions] = js.undefined,
    text: js.UndefOr[Null | IText] = js.undefined
  ): IMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basicCard)) __obj.updateDynamic("basicCard")(basicCard.asInstanceOf[js.Any])
    if (!js.isUndefined(card)) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (!js.isUndefined(carouselSelect)) __obj.updateDynamic("carouselSelect")(carouselSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(linkOutSuggestion)) __obj.updateDynamic("linkOutSuggestion")(linkOutSuggestion.asInstanceOf[js.Any])
    if (!js.isUndefined(listSelect)) __obj.updateDynamic("listSelect")(listSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(platform)) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(quickReplies)) __obj.updateDynamic("quickReplies")(quickReplies.asInstanceOf[js.Any])
    if (!js.isUndefined(simpleResponses)) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestions)) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
}


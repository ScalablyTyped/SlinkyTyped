package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.IResponseMediaObject
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MediaContent. */
trait IMediaContent extends js.Object {
  /** MediaContent mediaObjects */
  var mediaObjects: js.UndefOr[js.Array[IResponseMediaObject] | Null] = js.undefined
  /** MediaContent mediaType */
  var mediaType: js.UndefOr[ResponseMediaType | Null] = js.undefined
}

object IMediaContent {
  @scala.inline
  def apply(
    mediaObjects: js.UndefOr[Null | js.Array[IResponseMediaObject]] = js.undefined,
    mediaType: js.UndefOr[Null | ResponseMediaType] = js.undefined
  ): IMediaContent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mediaObjects)) __obj.updateDynamic("mediaObjects")(mediaObjects.asInstanceOf[js.Any])
    if (!js.isUndefined(mediaType)) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaContent]
  }
}


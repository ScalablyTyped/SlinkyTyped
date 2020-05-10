package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.IResponseMediaObject
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MediaContent. */
@js.native
trait IMediaContent extends js.Object {
  /** MediaContent mediaObjects */
  var mediaObjects: js.UndefOr[js.Array[IResponseMediaObject] | Null] = js.native
  /** MediaContent mediaType */
  var mediaType: js.UndefOr[ResponseMediaType | Null] = js.native
}

object IMediaContent {
  @scala.inline
  def apply(): IMediaContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMediaContent]
  }
  @scala.inline
  implicit class IMediaContentOps[Self <: IMediaContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaObjects(value: js.Array[IResponseMediaObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaObjectsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaObjects")(null)
        ret
    }
    @scala.inline
    def withMediaType(value: ResponseMediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(null)
        ret
    }
  }
  
}


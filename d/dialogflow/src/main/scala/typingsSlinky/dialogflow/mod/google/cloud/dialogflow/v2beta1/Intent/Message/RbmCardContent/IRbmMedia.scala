package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmMedia. */
@js.native
trait IRbmMedia extends js.Object {
  /** RbmMedia fileUri */
  var fileUri: js.UndefOr[String | Null] = js.native
  /** RbmMedia height */
  var height: js.UndefOr[Height | Null] = js.native
  /** RbmMedia thumbnailUri */
  var thumbnailUri: js.UndefOr[String | Null] = js.native
}

object IRbmMedia {
  @scala.inline
  def apply(): IRbmMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRbmMedia]
  }
  @scala.inline
  implicit class IRbmMediaOps[Self <: IRbmMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUri")(js.undefined)
        ret
    }
    @scala.inline
    def withFileUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUri")(null)
        ret
    }
    @scala.inline
    def withHeight(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(null)
        ret
    }
    @scala.inline
    def withThumbnailUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUri")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUri")(null)
        ret
    }
  }
  
}


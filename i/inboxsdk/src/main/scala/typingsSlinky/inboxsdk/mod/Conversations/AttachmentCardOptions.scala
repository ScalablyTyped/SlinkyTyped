package typingsSlinky.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ConversationsDescriptors
@js.native
trait AttachmentCardOptions extends js.Object {
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor] = js.native
  var description: String = js.native
  var failoverPreviewIconUrl: String = js.native
  var fileIconImageUrl: String = js.native
  var foldColor: js.UndefOr[String] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var previewThumbnailUrl: String = js.native
  var previewUrl: String = js.native
  var title: String = js.native
  def previewOnClick(event: PreviewClickEvent): Unit = js.native
}

object AttachmentCardOptions {
  @scala.inline
  def apply(
    buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor],
    description: String,
    failoverPreviewIconUrl: String,
    fileIconImageUrl: String,
    previewOnClick: PreviewClickEvent => Unit,
    previewThumbnailUrl: String,
    previewUrl: String,
    title: String
  ): AttachmentCardOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], failoverPreviewIconUrl = failoverPreviewIconUrl.asInstanceOf[js.Any], fileIconImageUrl = fileIconImageUrl.asInstanceOf[js.Any], previewOnClick = js.Any.fromFunction1(previewOnClick), previewThumbnailUrl = previewThumbnailUrl.asInstanceOf[js.Any], previewUrl = previewUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCardOptions]
  }
  @scala.inline
  implicit class AttachmentCardOptionsOps[Self <: AttachmentCardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailoverPreviewIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverPreviewIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileIconImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileIconImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewOnClick(value: PreviewClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewOnClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreviewThumbnailUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewThumbnailUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFoldColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoldColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
  }
  
}


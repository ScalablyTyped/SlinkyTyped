package typingsSlinky.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentCardNoPreviewOptions extends js.Object {
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor] = js.native
  var description: String = js.native
  var fileIconImageUrl: String = js.native
  var foldColor: js.UndefOr[String] = js.native
  var iconThumbnailUrl: String = js.native
  var previewUrl: String = js.native
  var title: String = js.native
  def previewOnClick(event: PreviewClickEvent): Unit = js.native
}

object AttachmentCardNoPreviewOptions {
  @scala.inline
  def apply(
    buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor],
    description: String,
    fileIconImageUrl: String,
    iconThumbnailUrl: String,
    previewOnClick: PreviewClickEvent => Unit,
    previewUrl: String,
    title: String
  ): AttachmentCardNoPreviewOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fileIconImageUrl = fileIconImageUrl.asInstanceOf[js.Any], iconThumbnailUrl = iconThumbnailUrl.asInstanceOf[js.Any], previewOnClick = js.Any.fromFunction1(previewOnClick), previewUrl = previewUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCardNoPreviewOptions]
  }
  @scala.inline
  implicit class AttachmentCardNoPreviewOptionsOps[Self <: AttachmentCardNoPreviewOptions] (val x: Self) extends AnyVal {
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
    def withFileIconImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileIconImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconThumbnailUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconThumbnailUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewOnClick(value: PreviewClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewOnClick")(js.Any.fromFunction1(value))
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
  }
  
}


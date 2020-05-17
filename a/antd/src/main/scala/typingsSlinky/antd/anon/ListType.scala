package typingsSlinky.antd.anon

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsSlinky.antd.uploadInterfaceMod.UploadListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListType extends js.Object {
  var listType: UploadListType = js.native
  var previewFile: js.Function1[/* file */ File | Blob, js.Promise[String]] = js.native
  var progressAttr: ShowInfo = js.native
  var showDownloadIcon: Boolean = js.native
  var showPreviewIcon: Boolean = js.native
  var showRemoveIcon: Boolean = js.native
}

object ListType {
  @scala.inline
  def apply(
    listType: UploadListType,
    previewFile: /* file */ File | Blob => js.Promise[String],
    progressAttr: ShowInfo,
    showDownloadIcon: Boolean,
    showPreviewIcon: Boolean,
    showRemoveIcon: Boolean
  ): ListType = {
    val __obj = js.Dynamic.literal(listType = listType.asInstanceOf[js.Any], previewFile = js.Any.fromFunction1(previewFile), progressAttr = progressAttr.asInstanceOf[js.Any], showDownloadIcon = showDownloadIcon.asInstanceOf[js.Any], showPreviewIcon = showPreviewIcon.asInstanceOf[js.Any], showRemoveIcon = showRemoveIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListType]
  }
  @scala.inline
  implicit class ListTypeOps[Self <: ListType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListType(value: UploadListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewFile(value: /* file */ File | Blob => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProgressAttr(value: ShowInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDownloadIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDownloadIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPreviewIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreviewIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRemoveIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRemoveIcon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


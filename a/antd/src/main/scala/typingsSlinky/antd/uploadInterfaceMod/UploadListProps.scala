package typingsSlinky.antd.uploadInterfaceMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadListProps[T] extends js.Object {
  var downloadIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var iconRender: js.UndefOr[
    js.Function2[/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType], TagMod[Any]]
  ] = js.undefined
  var isImageUrl: js.UndefOr[js.Function1[/* file */ UploadFile[_], Boolean]] = js.undefined
  var items: js.UndefOr[js.Array[UploadFile[T]]] = js.undefined
  var listType: js.UndefOr[UploadListType] = js.undefined
  var locale: UploadLocale
  var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.undefined
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit | Boolean]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var previewFile: js.UndefOr[PreviewFileHandler] = js.undefined
  var progressAttr: js.UndefOr[js.Object] = js.undefined
  var removeIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var showDownloadIcon: js.UndefOr[Boolean] = js.undefined
  var showPreviewIcon: js.UndefOr[Boolean] = js.undefined
  var showRemoveIcon: js.UndefOr[Boolean] = js.undefined
}

object UploadListProps {
  @scala.inline
  def apply[T](locale: UploadLocale): UploadListProps[T] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadListProps[T]]
  }
  @scala.inline
  implicit class UploadListPropsOps[Self <: UploadListProps[_], T] (val x: Self with UploadListProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocale(value: UploadLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadIconReactElement(value: ReactElement): Self = this.set("downloadIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadIcon(value: TagMod[Any]): Self = this.set("downloadIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadIcon: Self = this.set("downloadIcon", js.undefined)
    @scala.inline
    def setIconRender(value: (/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType]) => TagMod[Any]): Self = this.set("iconRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIconRender: Self = this.set("iconRender", js.undefined)
    @scala.inline
    def setIsImageUrl(value: /* file */ UploadFile[_] => Boolean): Self = this.set("isImageUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsImageUrl: Self = this.set("isImageUrl", js.undefined)
    @scala.inline
    def setItems(value: js.Array[UploadFile[T]]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setListType(value: UploadListType): Self = this.set("listType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListType: Self = this.set("listType", js.undefined)
    @scala.inline
    def setOnDownload(value: /* file */ UploadFile[T] => Unit): Self = this.set("onDownload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDownload: Self = this.set("onDownload", js.undefined)
    @scala.inline
    def setOnPreview(value: /* file */ UploadFile[T] => Unit): Self = this.set("onPreview", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPreview: Self = this.set("onPreview", js.undefined)
    @scala.inline
    def setOnRemove(value: /* file */ UploadFile[T] => Unit | Boolean): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setPreviewFile(value: /* file */ File | Blob => js.Thenable[String]): Self = this.set("previewFile", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreviewFile: Self = this.set("previewFile", js.undefined)
    @scala.inline
    def setProgressAttr(value: js.Object): Self = this.set("progressAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressAttr: Self = this.set("progressAttr", js.undefined)
    @scala.inline
    def setRemoveIconReactElement(value: ReactElement): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveIcon(value: TagMod[Any]): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    @scala.inline
    def setShowDownloadIcon(value: Boolean): Self = this.set("showDownloadIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDownloadIcon: Self = this.set("showDownloadIcon", js.undefined)
    @scala.inline
    def setShowPreviewIcon(value: Boolean): Self = this.set("showPreviewIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPreviewIcon: Self = this.set("showPreviewIcon", js.undefined)
    @scala.inline
    def setShowRemoveIcon(value: Boolean): Self = this.set("showRemoveIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRemoveIcon: Self = this.set("showRemoveIcon", js.undefined)
  }
  
}


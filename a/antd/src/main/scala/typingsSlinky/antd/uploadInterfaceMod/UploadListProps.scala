package typingsSlinky.antd.uploadInterfaceMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadListProps extends js.Object {
  var downloadIcon: js.UndefOr[TagMod[Any]] = js.native
  var iconRender: js.UndefOr[
    js.Function2[/* file */ UploadFile[_], /* listType */ js.UndefOr[UploadListType], TagMod[Any]]
  ] = js.native
  var items: js.UndefOr[js.Array[UploadFile[_]]] = js.native
  var listType: js.UndefOr[UploadListType] = js.native
  var locale: UploadLocale = js.native
  var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[_], Unit]] = js.native
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[_], Unit]] = js.native
  var onRemove: js.UndefOr[js.Function1[/* file */ UploadFile[_], Unit | Boolean]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var previewFile: js.UndefOr[PreviewFileHandler] = js.native
  var progressAttr: js.UndefOr[js.Object] = js.native
  var removeIcon: js.UndefOr[TagMod[Any]] = js.native
  var showDownloadIcon: js.UndefOr[Boolean] = js.native
  var showPreviewIcon: js.UndefOr[Boolean] = js.native
  var showRemoveIcon: js.UndefOr[Boolean] = js.native
}

object UploadListProps {
  @scala.inline
  def apply(locale: UploadLocale): UploadListProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadListProps]
  }
  @scala.inline
  implicit class UploadListPropsOps[Self <: UploadListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: UploadLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconRender(value: (/* file */ UploadFile[_], /* listType */ js.UndefOr[UploadListType]) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIconRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRender")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[UploadFile[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withListType(value: UploadListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDownload(value: /* file */ UploadFile[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreview(value: /* file */ UploadFile[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemove(value: /* file */ UploadFile[_] => Unit | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewFile(value: /* file */ File | Blob => js.Thenable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviewFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewFile")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressAttr(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDownloadIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDownloadIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDownloadIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDownloadIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPreviewIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreviewIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPreviewIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreviewIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRemoveIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRemoveIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRemoveIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRemoveIcon")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.antd.components

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.uploadInterfaceMod.UploadFile
import typingsSlinky.antd.uploadInterfaceMod.UploadListProps
import typingsSlinky.antd.uploadInterfaceMod.UploadListType
import typingsSlinky.antd.uploadInterfaceMod.UploadLocale
import typingsSlinky.antd.uploadListMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UploadList {
  @JSImport("antd/lib/upload/UploadList", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def downloadIconReactElement(value: ReactElement): this.type = set("downloadIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def downloadIcon(value: TagMod[Any]): this.type = set("downloadIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconRender(value: (/* file */ UploadFile[_], /* listType */ js.UndefOr[UploadListType]) => TagMod[Any]): this.type = set("iconRender", js.Any.fromFunction2(value))
    @scala.inline
    def items(value: js.Array[UploadFile[_]]): this.type = set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def listType(value: UploadListType): this.type = set("listType", value.asInstanceOf[js.Any])
    @scala.inline
    def onDownload(value: /* file */ UploadFile[_] => Unit): this.type = set("onDownload", js.Any.fromFunction1(value))
    @scala.inline
    def onPreview(value: /* file */ UploadFile[_] => Unit): this.type = set("onPreview", js.Any.fromFunction1(value))
    @scala.inline
    def onRemove(value: /* file */ UploadFile[_] => Unit | Boolean): this.type = set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def previewFile(value: /* file */ File | Blob => js.Thenable[String]): this.type = set("previewFile", js.Any.fromFunction1(value))
    @scala.inline
    def progressAttr(value: js.Object): this.type = set("progressAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def removeIconReactElement(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def removeIcon(value: TagMod[Any]): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def showDownloadIcon(value: Boolean): this.type = set("showDownloadIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def showPreviewIcon(value: Boolean): this.type = set("showPreviewIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def showRemoveIcon(value: Boolean): this.type = set("showRemoveIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: UploadListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(locale: UploadLocale): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[UploadListProps]))
  }
}


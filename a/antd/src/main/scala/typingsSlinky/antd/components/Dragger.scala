package typingsSlinky.antd.components

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.PATCH
import typingsSlinky.antd.antdStrings.POST
import typingsSlinky.antd.antdStrings.PUT
import typingsSlinky.antd.antdStrings.patch_
import typingsSlinky.antd.antdStrings.post_
import typingsSlinky.antd.antdStrings.put_
import typingsSlinky.antd.draggerMod.DraggerProps
import typingsSlinky.antd.draggerMod.default
import typingsSlinky.antd.uploadInterfaceMod.HttpRequestHeader
import typingsSlinky.antd.uploadInterfaceMod.RcCustomRequestOptions
import typingsSlinky.antd.uploadInterfaceMod.RcFile
import typingsSlinky.antd.uploadInterfaceMod.ShowUploadListInterface
import typingsSlinky.antd.uploadInterfaceMod.UploadChangeParam
import typingsSlinky.antd.uploadInterfaceMod.UploadFile
import typingsSlinky.antd.uploadInterfaceMod.UploadListProgressProps
import typingsSlinky.antd.uploadInterfaceMod.UploadListType
import typingsSlinky.antd.uploadInterfaceMod.UploadLocale
import typingsSlinky.antd.uploadInterfaceMod.UploadType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dragger {
  @JSImport("antd/lib/upload/Dragger", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def actionFunction1(value: /* file */ RcFile => String | js.Thenable[String]): this.type = set("action", js.Any.fromFunction1(value))
    @scala.inline
    def action(value: String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]])): this.type = set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def beforeUpload(value: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => Boolean | js.Thenable[Unit]): this.type = set("beforeUpload", js.Any.fromFunction2(value))
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def customRequest(value: /* options */ RcCustomRequestOptions => Unit): this.type = set("customRequest", js.Any.fromFunction1(value))
    @scala.inline
    def dataFunction1(value: /* file */ UploadFile[_] => js.Object): this.type = set("data", js.Any.fromFunction1(value))
    @scala.inline
    def data(value: js.Object | (js.Function1[/* file */ UploadFile[_], js.Object])): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultFileList(value: js.Array[UploadFile[_]]): this.type = set("defaultFileList", value.asInstanceOf[js.Any])
    @scala.inline
    def directory(value: Boolean): this.type = set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def fileList(value: js.Array[UploadFile[_]]): this.type = set("fileList", value.asInstanceOf[js.Any])
    @scala.inline
    def headers(value: HttpRequestHeader): this.type = set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def iconRender(value: (/* file */ UploadFile[_], /* listType */ js.UndefOr[UploadListType]) => ReactElement): this.type = set("iconRender", js.Any.fromFunction2(value))
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def isImageUrl(value: /* file */ UploadFile[_] => Boolean): this.type = set("isImageUrl", js.Any.fromFunction1(value))
    @scala.inline
    def listType(value: UploadListType): this.type = set("listType", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: UploadLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def method(value: POST | PUT | PATCH | post_ | put_ | patch_): this.type = set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* info */ UploadChangeParam[UploadFile[_]] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onDownload(value: /* file */ UploadFile[_] => Unit): this.type = set("onDownload", js.Any.fromFunction1(value))
    @scala.inline
    def onPreview(value: /* file */ UploadFile[_] => Unit): this.type = set("onPreview", js.Any.fromFunction1(value))
    @scala.inline
    def onRemove(value: /* file */ UploadFile[_] => Unit | Boolean | (js.Promise[Unit | Boolean])): this.type = set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def openFileDialogOnClick(value: Boolean): this.type = set("openFileDialogOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def previewFile(value: /* file */ File | Blob => js.Thenable[String]): this.type = set("previewFile", js.Any.fromFunction1(value))
    @scala.inline
    def progress(value: UploadListProgressProps): this.type = set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def showUploadList(value: Boolean | ShowUploadListInterface): this.type = set("showUploadList", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def supportServerRender(value: Boolean): this.type = set("supportServerRender", value.asInstanceOf[js.Any])
    @scala.inline
    def transformFile(value: /* file */ RcFile => String | Blob | File | (js.Thenable[String | Blob | File])): this.type = set("transformFile", js.Any.fromFunction1(value))
    @scala.inline
    def `type`(value: UploadType): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def withCredentials(value: Boolean): this.type = set("withCredentials", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DraggerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Dragger.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


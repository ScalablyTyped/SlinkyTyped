package typingsSlinky.antd.components

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.uploadInterfaceMod.UploadFile
import typingsSlinky.antd.uploadInterfaceMod.UploadListProgressProps
import typingsSlinky.antd.uploadInterfaceMod.UploadListProps
import typingsSlinky.antd.uploadInterfaceMod.UploadListType
import typingsSlinky.antd.uploadInterfaceMod.UploadLocale
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UploadList {
  
  @scala.inline
  def apply(locale: UploadLocale): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[UploadListProps[js.Any] with RefAttributes[js.Any]]))
  }
  
  @JSImport("antd/lib/upload/UploadList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Any with js.Object] {
    
    @scala.inline
    def appendAction(value: ReactElement): this.type = set("appendAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def appendActionReactElement(value: ReactElement): this.type = set("appendAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def downloadIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[_], ReactElement])): this.type = set("downloadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def downloadIconFunction1(value: /* file */ UploadFile[_] => ReactElement): this.type = set("downloadIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def downloadIconReactElement(value: ReactElement): this.type = set("downloadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconRender(value: (/* file */ UploadFile[js.Any], /* listType */ js.UndefOr[UploadListType]) => ReactElement): this.type = set("iconRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def isImageUrl(value: /* file */ UploadFile[_] => Boolean): this.type = set("isImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def itemRender(
      value: (/* originNode */ ReactElement, /* file */ UploadFile[js.Any], /* fileList */ js.UndefOr[js.Array[UploadFile[js.Any]]]) => ReactElement
    ): this.type = set("itemRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def items(value: js.Array[UploadFile[js.Any]]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: UploadFile[js.Any]*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def listType(value: UploadListType): this.type = set("listType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDownload(value: /* file */ UploadFile[js.Any] => Unit): this.type = set("onDownload", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPreview(value: /* file */ UploadFile[js.Any] => Unit): this.type = set("onPreview", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRemove(value: /* file */ UploadFile[js.Any] => Unit | Boolean): this.type = set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previewFile(value: /* file */ File | Blob => js.Thenable[String]): this.type = set("previewFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def progress(value: UploadListProgressProps): this.type = set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[_], ReactElement])): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIconFunction1(value: /* file */ UploadFile[_] => ReactElement): this.type = set("removeIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def removeIconReactElement(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showDownloadIcon(value: Boolean): this.type = set("showDownloadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showPreviewIcon(value: Boolean): this.type = set("showPreviewIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showRemoveIcon(value: Boolean): this.type = set("showRemoveIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: UploadListProps[js.Any] with RefAttributes[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

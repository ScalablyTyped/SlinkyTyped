package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.File
import typingsSlinky.primereact.anon.Files
import typingsSlinky.primereact.anon.FilesAny
import typingsSlinky.primereact.anon.FilesOriginalEvent
import typingsSlinky.primereact.anon.FormData
import typingsSlinky.primereact.anon.Progress
import typingsSlinky.primereact.fileUploadMod.FileUploadProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileUpload {
  
  @JSImport("primereact/fileupload", "FileUpload")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactFileuploadMod.FileUpload] {
    
    @scala.inline
    def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def auto(value: Boolean): this.type = set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelLabel(value: String): this.type = set("cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chooseLabel(value: String): this.type = set("chooseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customUpload(value: Boolean): this.type = set("customUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emptyTemplate(value: /* props */ js.Object => _): this.type = set("emptyTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def invalidFileSizeMessageDetail(value: String): this.type = set("invalidFileSizeMessageDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def invalidFileSizeMessageSummary(value: String): this.type = set("invalidFileSizeMessageSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxFileSize(value: Double): this.type = set("maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: String): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBeforeSend(value: /* e */ FormData => Unit): this.type = set("onBeforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeUpload(value: /* e */ FormData => Unit): this.type = set("onBeforeUpload", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClear(value: () => Unit): this.type = set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def onError(value: /* e */ Files => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onProgress(value: /* e */ Progress => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRemove(value: /* e */ File => Unit): this.type = set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: /* e */ FilesOriginalEvent => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onUpload(value: /* e */ Files => Unit): this.type = set("onUpload", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValidationFail(value: /* file */ org.scalajs.dom.raw.File => Unit): this.type = set("onValidationFail", js.Any.fromFunction1(value))
    
    @scala.inline
    def previewWidth(value: Double): this.type = set("previewWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def uploadHandler(value: /* e */ FilesAny => Unit): this.type = set("uploadHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def uploadLabel(value: String): this.type = set("uploadLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def withCredentials(value: Boolean): this.type = set("withCredentials", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FileUpload.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FileUploadProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsSlinky.reactFileUtils.components

import org.scalajs.dom.raw.Blob
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileUtils.anon.Accepts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileUploadButton {
  
  @JSImport("react-file-utils", "FileUploadButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFileUtils.mod.FileUploadButton] {
    
    @scala.inline
    def acceptsVarargs(value: String*): this.type = set("accepts", js.Array(value :_*))
    
    @scala.inline
    def accepts(value: String | js.Array[String]): this.type = set("accepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleFiles(value: /* files */ js.Array[Blob] => Unit): this.type = set("handleFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Accepts): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FileUploadButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

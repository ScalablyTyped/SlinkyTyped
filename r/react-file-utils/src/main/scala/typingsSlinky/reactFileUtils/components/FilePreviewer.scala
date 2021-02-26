package typingsSlinky.reactFileUtils.components

import org.scalajs.dom.raw.File
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileUtils.anon.HandleFiles
import typingsSlinky.reactFileUtils.mod.FileUpload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilePreviewer {
  
  @JSImport("react-file-utils", "FilePreviewer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFileUtils.mod.FilePreviewer] {
    
    @scala.inline
    def handleFiles(value: /* files */ js.Array[File] => Unit): this.type = set("handleFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def handleRemove(value: /* id */ String => Unit): this.type = set("handleRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def handleRetry(value: /* id */ String => Unit): this.type = set("handleRetry", js.Any.fromFunction1(value))
    
    @scala.inline
    def uploads(value: js.Array[FileUpload]): this.type = set("uploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def uploadsVarargs(value: FileUpload*): this.type = set("uploads", js.Array(value :_*))
  }
  
  implicit def make(companion: FilePreviewer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HandleFiles): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsSlinky.reactFileUtils.components

import org.scalajs.dom.raw.File
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileUtils.anon.Disabled
import typingsSlinky.reactFileUtils.mod.ImageUpload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImagePreviewer {
  
  @JSImport("react-file-utils", "ImagePreviewer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFileUtils.mod.ImagePreviewer] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleFiles(value: /* files */ js.Array[File] => Unit): this.type = set("handleFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def handleRemove(value: /* id */ String => Unit): this.type = set("handleRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def handleRetry(value: /* id */ String => Unit): this.type = set("handleRetry", js.Any.fromFunction1(value))
    
    @scala.inline
    def imageUploads(value: js.Array[ImageUpload]): this.type = set("imageUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageUploadsVarargs(value: ImageUpload*): this.type = set("imageUploads", js.Array(value :_*))
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ImagePreviewer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Disabled): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

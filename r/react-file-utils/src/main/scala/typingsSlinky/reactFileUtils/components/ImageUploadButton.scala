package typingsSlinky.reactFileUtils.components

import org.scalajs.dom.raw.File
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileUtils.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageUploadButton {
  
  @JSImport("react-file-utils", "ImageUploadButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFileUtils.mod.ImageUploadButton] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleFiles(value: /* files */ js.Array[File] => Unit): this.type = set("handleFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ImageUploadButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

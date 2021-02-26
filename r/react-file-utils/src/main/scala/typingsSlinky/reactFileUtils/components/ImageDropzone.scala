package typingsSlinky.reactFileUtils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileUtils.anon.Accept
import typingsSlinky.reactFileUtils.mod.FileLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageDropzone {
  
  @JSImport("react-file-utils", "ImageDropzone")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFileUtils.mod.ImageDropzone] {
    
    @scala.inline
    def accept(value: String | js.Array[String]): this.type = set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def acceptVarargs(value: String*): this.type = set("accept", js.Array(value :_*))
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleFiles(value: /* files */ js.Array[FileLike] => Unit): this.type = set("handleFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ImageDropzone.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Accept): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsSlinky.reactFileUtils.components

import org.scalajs.dom.raw.File
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileUtils.anon.Multiple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThumbnailPlaceholder {
  
  @JSImport("react-file-utils", "ThumbnailPlaceholder")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFileUtils.mod.ThumbnailPlaceholder] {
    
    @scala.inline
    def handleFiles(value: /* files */ js.Array[File] => Unit): this.type = set("handleFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Multiple): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ThumbnailPlaceholder.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

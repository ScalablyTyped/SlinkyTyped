package typingsSlinky.reactFileUtils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileUtils.anon.BackgroundColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoadingIndicator {
  
  @JSImport("react-file-utils", "LoadingIndicator")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFileUtils.mod.LoadingIndicator] {
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BackgroundColor): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LoadingIndicator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

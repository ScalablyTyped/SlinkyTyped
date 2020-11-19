package typingsSlinky.inkLink.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.inkLink.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InkLink {
  
  @JSImport("ink-link", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def fallback(value: Boolean): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: InkLink.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

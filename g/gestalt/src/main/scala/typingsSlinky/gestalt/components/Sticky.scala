package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.ZIndex
import typingsSlinky.gestalt.mod.StickyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sticky {
  
  @JSImport("gestalt", "Sticky")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Sticky] {
    
    @scala.inline
    def bottom(value: Double | String): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerouslySetZIndex(value: ZIndex): this.type = set("dangerouslySetZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def left(value: Double | String): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def right(value: Double | String): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def top(value: Double | String): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StickyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Sticky.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

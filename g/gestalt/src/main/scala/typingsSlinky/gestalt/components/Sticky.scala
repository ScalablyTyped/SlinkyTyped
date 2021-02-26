package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.mod.Indexable
import typingsSlinky.gestalt.mod.StickyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sticky {
  
  @JSImport("gestalt", "Sticky")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Sticky] {
    
    @scala.inline
    def bottom(value: Double | String): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def left(value: Double | String): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def right(value: Double | String): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def top(value: Double | String): this.type = set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Indexable): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Sticky.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StickyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

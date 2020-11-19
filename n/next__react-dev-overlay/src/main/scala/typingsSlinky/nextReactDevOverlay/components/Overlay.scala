package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nextReactDevOverlay.overlayOverlayMod.OverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Overlay", "Overlay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Overlay.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

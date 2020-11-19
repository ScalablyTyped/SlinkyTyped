package typingsSlinky.reactToolbox.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactToolbox.overlayMod.default
import typingsSlinky.reactToolbox.overlayOverlayMod.OverlayProps
import typingsSlinky.reactToolbox.overlayOverlayMod.OverlayTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @JSImport("react-toolbox/components/overlay", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def invisible(value: Boolean): this.type = set("invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEscKeyDown(value: js.Function): this.type = set("onEscKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: OverlayTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Overlay.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

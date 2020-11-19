package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.circleRippleMod.CircleRippleProps
import typingsSlinky.materialUi.circleRippleMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircleRipple {
  
  @JSImport("material-ui/internal/CircleRipple", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def aborted(value: Boolean): this.type = set("aborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CircleRippleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CircleRipple.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

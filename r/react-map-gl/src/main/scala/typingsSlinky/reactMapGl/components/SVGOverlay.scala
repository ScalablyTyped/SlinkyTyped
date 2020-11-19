package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactMapGl.mod.SVGOverlayProps
import typingsSlinky.reactMapGl.mod.SVGRedrawOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SVGOverlay {
  
  @JSImport("react-map-gl", "SVGOverlay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.SVGOverlay] {
    
    @scala.inline
    def captureClick(value: Boolean): this.type = set("captureClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureDoubleClick(value: Boolean): this.type = set("captureDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureDrag(value: Boolean): this.type = set("captureDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureScroll(value: Boolean): this.type = set("captureScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SVGOverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(redraw: SVGRedrawOptions => Unit): Builder = {
    val __props = js.Dynamic.literal(redraw = js.Any.fromFunction1(redraw))
    new Builder(js.Array(this.component, __props.asInstanceOf[SVGOverlayProps]))
  }
}

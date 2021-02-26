package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactMapGl.mod.HTMLOverlayProps
import typingsSlinky.reactMapGl.mod.HTMLRedrawOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HTMLOverlay {
  
  @scala.inline
  def apply(redraw: HTMLRedrawOptions => Unit): Builder = {
    val __props = js.Dynamic.literal(redraw = js.Any.fromFunction1(redraw))
    new Builder(js.Array(this.component, __props.asInstanceOf[HTMLOverlayProps]))
  }
  
  @JSImport("react-map-gl", "HTMLOverlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.HTMLOverlay] {
    
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
  
  def withProps(p: HTMLOverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

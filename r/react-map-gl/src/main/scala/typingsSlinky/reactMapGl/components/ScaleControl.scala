package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMapGl.mod.ScaleControlProps
import typingsSlinky.reactMapGl.reactMapGlStrings.imperial
import typingsSlinky.reactMapGl.reactMapGlStrings.metric
import typingsSlinky.reactMapGl.reactMapGlStrings.nautical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScaleControl {
  
  @JSImport("react-map-gl", "ScaleControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.ScaleControl] {
    
    @scala.inline
    def captureClick(value: Boolean): this.type = set("captureClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureDoubleClick(value: Boolean): this.type = set("captureDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureDrag(value: Boolean): this.type = set("captureDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureScroll(value: Boolean): this.type = set("captureScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unit(value: imperial | metric | nautical): this.type = set("unit", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScaleControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScaleControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

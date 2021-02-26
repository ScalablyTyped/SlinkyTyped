package typingsSlinky.reactVis.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVis.mod.ContinuousSizeLegendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContinuousSizeLegend {
  
  @scala.inline
  def apply(endTitle: Double | String, startTitle: Double | String): Builder = {
    val __props = js.Dynamic.literal(endTitle = endTitle.asInstanceOf[js.Any], startTitle = startTitle.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ContinuousSizeLegendProps]))
  }
  
  @JSImport("react-vis", "ContinuousSizeLegend")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def circlesTotal(value: Double): this.type = set("circlesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endSize(value: Double): this.type = set("endSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startSize(value: Double): this.type = set("startSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ContinuousSizeLegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsSlinky.reactSvgRadarChart.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSvgRadarChart.mod.ChartData
import typingsSlinky.reactSvgRadarChart.mod.ChartOptionsProps
import typingsSlinky.reactSvgRadarChart.mod.ChartProps
import typingsSlinky.reactSvgRadarChart.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSvgRadarChart {
  
  @scala.inline
  def apply(data: js.Array[ChartData], size: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChartProps]))
  }
  
  @JSImport("react-svg-radar-chart", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def options(value: ChartOptionsProps): this.type = set("options", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

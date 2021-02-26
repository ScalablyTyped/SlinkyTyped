package typingsSlinky.reactEasyChart.components

import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactEasyChart.anon.Bottom
import typingsSlinky.reactEasyChart.anon.Y
import typingsSlinky.reactEasyChart.mod.LineChartProps
import typingsSlinky.reactEasyChart.mod.LineData
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`basis-closed`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`basis-open`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`cardinal-closed`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`cardinal-open`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`linear-closed`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`step-after`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.`step-before`
import typingsSlinky.reactEasyChart.reactEasyChartStrings.basis
import typingsSlinky.reactEasyChart.reactEasyChartStrings.bundle
import typingsSlinky.reactEasyChart.reactEasyChartStrings.cardinal
import typingsSlinky.reactEasyChart.reactEasyChartStrings.linear
import typingsSlinky.reactEasyChart.reactEasyChartStrings.monotone
import typingsSlinky.reactEasyChart.reactEasyChartStrings.step
import typingsSlinky.reactEasyChart.reactEasyChartStrings.text
import typingsSlinky.reactEasyChart.reactEasyChartStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineChart {
  
  @scala.inline
  def apply(data: js.Array[js.Array[LineData]]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineChartProps]))
  }
  
  @JSImport("react-easy-chart", "LineChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactEasyChart.mod.LineChart] {
    
    @scala.inline
    def axes(value: Boolean): this.type = set("axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def axisLabels(value: Y): this.type = set("axisLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clickHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): this.type = set("clickHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def dataPoints(value: Boolean): this.type = set("dataPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def grid(value: Boolean): this.type = set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def interpolate(
      value: linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
    ): this.type = set("interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineColors(value: js.Array[String]): this.type = set("lineColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineColorsVarargs(value: String*): this.type = set("lineColors", js.Array(value :_*))
    
    @scala.inline
    def margin(value: Bottom): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseMoveHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseMoveHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def mouseOutHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseOutHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def mouseOverHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseOverHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def tickTimeDisplayFormat(value: String): this.type = set("tickTimeDisplayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalGrid(value: Boolean): this.type = set("verticalGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xDomainRange(value: js.Array[js.Date | Double | String]): this.type = set("xDomainRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xDomainRangeVarargs(value: (js.Date | Double | String)*): this.type = set("xDomainRange", js.Array(value :_*))
    
    @scala.inline
    def xTicks(value: Double): this.type = set("xTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xType(value: time | text | linear): this.type = set("xType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yAxisOrientRight(value: Boolean): this.type = set("yAxisOrientRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yDomainRange(value: js.Array[Double | String]): this.type = set("yDomainRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yDomainRangeVarargs(value: (Double | String)*): this.type = set("yDomainRange", js.Array(value :_*))
    
    @scala.inline
    def yTicks(value: Double): this.type = set("yTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yType(value: time | text | linear): this.type = set("yType", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsSlinky.reactEasyChart.components

import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactEasyChart.anon.Bottom
import typingsSlinky.reactEasyChart.anon.X
import typingsSlinky.reactEasyChart.mod.BarChartProps
import typingsSlinky.reactEasyChart.mod.BarData
import typingsSlinky.reactEasyChart.mod.LineData
import typingsSlinky.reactEasyChart.reactEasyChartStrings.linear
import typingsSlinky.reactEasyChart.reactEasyChartStrings.text
import typingsSlinky.reactEasyChart.reactEasyChartStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BarChart {
  @JSImport("react-easy-chart", "BarChart")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactEasyChart.mod.BarChart] {
    @scala.inline
    def axes(value: Boolean): this.type = set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def axisLabels(value: X): this.type = set("axisLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def barWidth(value: Double): this.type = set("barWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def clickHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): this.type = set("clickHandler", js.Any.fromFunction2(value))
    @scala.inline
    def colorBars(value: Boolean): this.type = set("colorBars", value.asInstanceOf[js.Any])
    @scala.inline
    def datePattern(value: String): this.type = set("datePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def grid(value: Boolean): this.type = set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def interpolate(value: String): this.type = set("interpolate", value.asInstanceOf[js.Any])
    @scala.inline
    def lineDataVarargs(value: LineData*): this.type = set("lineData", js.Array(value :_*))
    @scala.inline
    def lineData(value: js.Array[LineData]): this.type = set("lineData", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Bottom): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def mouseMoveHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseMoveHandler", js.Any.fromFunction2(value))
    @scala.inline
    def mouseOutHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseOutHandler", js.Any.fromFunction2(value))
    @scala.inline
    def mouseOverHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseOverHandler", js.Any.fromFunction2(value))
    @scala.inline
    def tickTimeDisplayFormat(value: String): this.type = set("tickTimeDisplayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def xDomainRangeVarargs(value: (js.Date | Double | String)*): this.type = set("xDomainRange", js.Array(value :_*))
    @scala.inline
    def xDomainRange(value: js.Array[js.Date | Double | String]): this.type = set("xDomainRange", value.asInstanceOf[js.Any])
    @scala.inline
    def xTickNumber(value: Double): this.type = set("xTickNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def xType(value: time | text | linear): this.type = set("xType", value.asInstanceOf[js.Any])
    @scala.inline
    def y2Type(value: time | text | linear): this.type = set("y2Type", value.asInstanceOf[js.Any])
    @scala.inline
    def yAxisOrientRight(value: Boolean): this.type = set("yAxisOrientRight", value.asInstanceOf[js.Any])
    @scala.inline
    def yDomainRangeVarargs(value: Double*): this.type = set("yDomainRange", js.Array(value :_*))
    @scala.inline
    def yDomainRange(value: js.Array[Double]): this.type = set("yDomainRange", value.asInstanceOf[js.Any])
    @scala.inline
    def yTickNumber(value: Double): this.type = set("yTickNumber", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BarChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[BarData]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BarChartProps]))
  }
}


package typingsSlinky.reactEasyChart.components

import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactEasyChart.AnonBottom
import typingsSlinky.reactEasyChart.AnonStroke
import typingsSlinky.reactEasyChart.AnonY
import typingsSlinky.reactEasyChart.mod.ScatterplotChartProps
import typingsSlinky.reactEasyChart.mod.ScatterplotData
import typingsSlinky.reactEasyChart.reactEasyChartStrings.linear
import typingsSlinky.reactEasyChart.reactEasyChartStrings.text
import typingsSlinky.reactEasyChart.reactEasyChartStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScatterplotChart {
  @JSImport("react-easy-chart", "ScatterplotChart")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactEasyChart.mod.ScatterplotChart] {
    @scala.inline
    def axes(value: Boolean): this.type = set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def axisLabels(value: AnonY): this.type = set("axisLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def clickHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): this.type = set("clickHandler", js.Any.fromFunction2(value))
    @scala.inline
    def config(value: js.Array[AnonStroke]): this.type = set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def dotRadius(value: Double): this.type = set("dotRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def grid(value: Boolean): this.type = set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: AnonBottom): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def mouseMoveHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseMoveHandler", js.Any.fromFunction2(value))
    @scala.inline
    def mouseOutHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseOutHandler", js.Any.fromFunction2(value))
    @scala.inline
    def mouseOverHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseOverHandler", js.Any.fromFunction2(value))
    @scala.inline
    def verticalGrid(value: Boolean): this.type = set("verticalGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def xDomainRange(value: js.Array[js.Date | Double | String]): this.type = set("xDomainRange", value.asInstanceOf[js.Any])
    @scala.inline
    def xType(value: time | text | linear): this.type = set("xType", value.asInstanceOf[js.Any])
    @scala.inline
    def yAxisOrientRight(value: Boolean): this.type = set("yAxisOrientRight", value.asInstanceOf[js.Any])
    @scala.inline
    def yDomainRange(value: js.Array[js.Date | Double | String]): this.type = set("yDomainRange", value.asInstanceOf[js.Any])
    @scala.inline
    def yType(value: time | text | linear): this.type = set("yType", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScatterplotChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[ScatterplotData]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScatterplotChartProps]))
  }
}


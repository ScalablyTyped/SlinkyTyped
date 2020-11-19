package typingsSlinky.reactEasyChart.components

import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactEasyChart.anon.Color
import typingsSlinky.reactEasyChart.mod.PieChartProps
import typingsSlinky.reactEasyChart.mod.PieData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PieChart {
  
  @JSImport("react-easy-chart", "PieChart")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactEasyChart.mod.PieChart] {
    
    @scala.inline
    def clickHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): this.type = set("clickHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def innerHoleSize(value: Double): this.type = set("innerHoleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labels(value: Boolean): this.type = set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseMoveHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseMoveHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def mouseOutHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseOutHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def mouseOverHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _): this.type = set("mouseOverHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PieChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[Color]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PieChartProps]))
  }
}

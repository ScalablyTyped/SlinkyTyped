package typingsSlinky.nivoAxes.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoAxes.mod.GridProps
import typingsSlinky.nivoAxes.mod.GridValues
import typingsSlinky.nivoScales.mod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
  @JSImport("@nivo/axes", "Grid")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def xScale(value: Scale): this.type = set("xScale", value.asInstanceOf[js.Any])
    @scala.inline
    def xValuesVarargs(value: (js.Date | Double | String)*): this.type = set("xValues", js.Array(value :_*))
    @scala.inline
    def xValues(value: GridValues[Double | String | js.Date]): this.type = set("xValues", value.asInstanceOf[js.Any])
    @scala.inline
    def yScale(value: Scale): this.type = set("yScale", value.asInstanceOf[js.Any])
    @scala.inline
    def yValuesVarargs(value: (js.Date | Double | String)*): this.type = set("yValues", js.Array(value :_*))
    @scala.inline
    def yValues(value: GridValues[Double | String | js.Date]): this.type = set("yValues", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GridProps]))
  }
}


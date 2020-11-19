package typingsSlinky.nivoAxes.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoAxes.mod.AxesProps
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoScales.mod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Axes {
  
  @JSImport("@nivo/axes", "Axes")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def xScale(value: Scale): this.type = set("xScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yScale(value: Scale): this.type = set("yScale", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AxesProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    bottom: AxisProps,
    height: Double,
    left: AxisProps,
    right: AxisProps,
    top: AxisProps,
    width: Double
  ): Builder = {
    val __props = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AxesProps]))
  }
}

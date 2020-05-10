package typingsSlinky.reactSketchapp.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.radialGradientMod.RadialGradientProps
import typingsSlinky.reactSketchapp.radialGradientMod.default
import typingsSlinky.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typingsSlinky.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadialGradient {
  @JSImport("react-sketchapp/lib/components/Svg/RadialGradient", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def gradientUnits(value: objectBoundingBox | userSpaceOnUse): this.type = set("gradientUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def r(value: NumberProp): this.type = set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def rx(value: NumberProp): this.type = set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def ry(value: NumberProp): this.type = set("ry", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadialGradientProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(cx: NumberProp, cy: NumberProp, fx: NumberProp, fy: NumberProp, id: String): Builder = {
    val __props = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadialGradientProps]))
  }
}


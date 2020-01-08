package typingsSlinky.reactDashSketchapp.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSketchapp.libComponentsSvgPropsMod.NumberProp
import typingsSlinky.reactDashSketchapp.libComponentsSvgRadialGradientMod.RadialGradientProps
import typingsSlinky.reactDashSketchapp.libComponentsSvgRadialGradientMod.default
import typingsSlinky.reactDashSketchapp.reactDashSketchappStrings.objectBoundingBox
import typingsSlinky.reactDashSketchapp.reactDashSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadialGradient
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-sketchapp/lib/components/Svg/RadialGradient", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    cx: NumberProp,
    cy: NumberProp,
    fx: NumberProp,
    fy: NumberProp,
    id: String,
    gradientUnits: objectBoundingBox | userSpaceOnUse = null,
    r: NumberProp = null,
    rx: NumberProp = null,
    ry: NumberProp = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RadialGradientProps
}


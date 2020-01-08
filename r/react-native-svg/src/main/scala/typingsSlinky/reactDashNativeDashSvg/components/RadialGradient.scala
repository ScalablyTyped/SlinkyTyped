package typingsSlinky.reactDashNativeDashSvg.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.ColumnMajorTransformMatrix
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.NumberProp
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.RadialGradientProps
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadialGradient
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.RadialGradient
    ] {
  @JSImport("react-native-svg", "RadialGradient")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    cx: NumberProp = null,
    cy: NumberProp = null,
    fx: NumberProp = null,
    fy: NumberProp = null,
    gradientTransform: ColumnMajorTransformMatrix | String = null,
    gradientUnits: Units = null,
    r: NumberProp = null,
    rx: NumberProp = null,
    ry: NumberProp = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.RadialGradient
  ] = {
    val __obj = js.Dynamic.literal()
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (fy != null) __obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.RadialGradient
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.RadialGradient](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RadialGradientProps
}


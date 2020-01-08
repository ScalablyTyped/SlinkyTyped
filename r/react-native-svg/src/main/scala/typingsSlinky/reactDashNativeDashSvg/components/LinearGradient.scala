package typingsSlinky.reactDashNativeDashSvg.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.ColumnMajorTransformMatrix
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.LinearGradientProps
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.NumberProp
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinearGradient
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.LinearGradient
    ] {
  @JSImport("react-native-svg", "LinearGradient")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    gradientTransform: ColumnMajorTransformMatrix | String = null,
    gradientUnits: Units = null,
    x1: NumberProp = null,
    x2: NumberProp = null,
    y1: NumberProp = null,
    y2: NumberProp = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.LinearGradient
  ] = {
    val __obj = js.Dynamic.literal()
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.LinearGradient
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.LinearGradient](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LinearGradientProps
}


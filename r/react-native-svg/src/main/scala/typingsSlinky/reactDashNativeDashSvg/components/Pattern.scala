package typingsSlinky.reactDashNativeDashSvg.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.ColumnMajorTransformMatrix
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.NumberProp
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.PatternProps
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pattern
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Pattern] {
  @JSImport("react-native-svg", "Pattern")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: height, id, width */
  def apply(
    patternContentUnits: Units = null,
    patternTransform: ColumnMajorTransformMatrix | String = null,
    patternUnits: Units = null,
    preserveAspectRatio: String = null,
    viewBox: String = null,
    x: NumberProp = null,
    y: NumberProp = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Pattern] = {
    val __obj = js.Dynamic.literal()
    if (patternContentUnits != null) __obj.updateDynamic("patternContentUnits")(patternContentUnits.asInstanceOf[js.Any])
    if (patternTransform != null) __obj.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
    if (patternUnits != null) __obj.updateDynamic("patternUnits")(patternUnits.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Pattern] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Pattern](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PatternProps
}


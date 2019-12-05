package typingsSlinky.reactDashSketchapp.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSketchapp.libComponentsSvgLinearGradientMod.LinearGradientProps
import typingsSlinky.reactDashSketchapp.libComponentsSvgLinearGradientMod.default
import typingsSlinky.reactDashSketchapp.libComponentsSvgPropsMod.NumberProp
import typingsSlinky.reactDashSketchapp.reactDashSketchappStrings.objectBoundingBox
import typingsSlinky.reactDashSketchapp.reactDashSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinearGradient
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-sketchapp/lib/components/Svg/LinearGradient", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    x1: NumberProp,
    x2: NumberProp,
    y1: NumberProp,
    y2: NumberProp,
    gradientUnits: objectBoundingBox | userSpaceOnUse = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LinearGradientProps
}


package typingsSlinky.reactDashSketchapp.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSketchapp.libComponentsSvgImageMod.ImageProps
import typingsSlinky.reactDashSketchapp.libComponentsSvgImageMod.default
import typingsSlinky.reactDashSketchapp.libComponentsSvgPropsMod.NumberProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Image
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-sketchapp/lib/components/Svg/Image", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    height: NumberProp,
    href: String,
    width: NumberProp,
    preserveAspectRatio: String = null,
    x: NumberProp = null,
    y: NumberProp = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ImageProps
}


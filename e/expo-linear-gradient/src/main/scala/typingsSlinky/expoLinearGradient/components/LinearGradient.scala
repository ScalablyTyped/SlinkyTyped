package typingsSlinky.expoLinearGradient.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.expoLinearGradient.linearGradientMod.Point
import typingsSlinky.expoLinearGradient.linearGradientMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinearGradient
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("expo-linear-gradient/build/LinearGradient", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    colors: js.Array[String],
    end: Point = null,
    locations: js.Array[Double] = null,
    start: Point = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.expoLinearGradient.linearGradientMod.Props
}


package typingsSlinky.reactDashNativeDashSvg.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Color
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.NumberProp
import typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.StopProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stop
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Stop] {
  @JSImport("react-native-svg", "Stop")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    offset: NumberProp = null,
    stopColor: Color = null,
    stopOpacity: NumberProp = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Stop] = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Stop] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashSvg.reactDashNativeDashSvgMod.Stop](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StopProps
}


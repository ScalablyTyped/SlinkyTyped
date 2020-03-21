package typingsSlinky.reactNativeMaterialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeMaterialUi.AnonColor
import typingsSlinky.reactNativeMaterialUi.AnonStrokeContainer
import typingsSlinky.reactNativeMaterialUi.mod.BadgeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Badge] {
  @JSImport("react-native-material-ui", "Badge")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size */
  def apply(
    accent: js.UndefOr[Boolean] = js.undefined,
    icon: String | AnonColor = null,
    stroke: Int | Double = null,
    style: AnonStrokeContainer = null,
    text: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Badge] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accent)) __obj.updateDynamic("accent")(accent.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Badge] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeMaterialUi.mod.Badge](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BadgeProps
}


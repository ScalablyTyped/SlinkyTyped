package typingsSlinky.reactNativeMaterialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeMaterialUi.AnonItem
import typingsSlinky.reactNativeMaterialUi.mod.Drawer.Section
import typingsSlinky.reactNativeMaterialUi.mod.DrawerSectionItem
import typingsSlinky.reactNativeMaterialUi.mod.DrawerSectionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerSection
  extends ExternalComponentWithAttributesWithRefType[tag.type, Section] {
  @JSImport("react-native-material-ui", "Drawer.Section")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: title */
  def apply(
    items: js.Array[DrawerSectionItem],
    divider: js.UndefOr[Boolean] = js.undefined,
    style: AnonItem = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Section] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DrawerSectionProps
}


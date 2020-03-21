package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.AnonEventItem
import typingsSlinky.baseui.sideNavigationMod.Item
import typingsSlinky.baseui.sideNavigationMod.NavigationOverrides
import typingsSlinky.baseui.sideNavigationMod.NavigationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Navigation
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.sideNavigationMod.Navigation] {
  @JSImport("baseui/side-navigation", "Navigation")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    activeItemId: String,
    activePredicate: (/* item */ js.Any, /* activeItemId */ String) => Boolean = null,
    items: js.Array[Item] = null,
    mapItem: /* item */ Item => Item = null,
    onChange: /* args */ AnonEventItem => _ = null,
    overrides: NavigationOverrides = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.sideNavigationMod.Navigation] = {
    val __obj = js.Dynamic.literal(activeItemId = activeItemId.asInstanceOf[js.Any])
    if (activePredicate != null) __obj.updateDynamic("activePredicate")(js.Any.fromFunction2(activePredicate))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (mapItem != null) __obj.updateDynamic("mapItem")(js.Any.fromFunction1(mapItem))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NavigationProps
}


package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.sideDashNavigationMod.Item
import typingsSlinky.baseui.sideDashNavigationMod.NavigationOverrides
import typingsSlinky.baseui.sideDashNavigationMod.NavigationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Navigation
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.sideDashNavigationMod.Navigation] {
  @JSImport("baseui/side-navigation", "Navigation")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onChange */
  def apply(
    activeItemId: String,
    activePredicate: (/* item */ js.Any, /* activeItemId */ String) => Boolean = null,
    items: js.Array[Item] = null,
    mapItem: /* item */ Item => Item = null,
    overrides: NavigationOverrides = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.sideDashNavigationMod.Navigation] = {
    val __obj = js.Dynamic.literal(activeItemId = activeItemId.asInstanceOf[js.Any])
    if (activePredicate != null) __obj.updateDynamic("activePredicate")(js.Any.fromFunction2(activePredicate))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (mapItem != null) __obj.updateDynamic("mapItem")(js.Any.fromFunction1(mapItem))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NavigationProps
}


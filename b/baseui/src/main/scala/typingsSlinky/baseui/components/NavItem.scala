package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.AnonItemAny
import typingsSlinky.baseui.sideNavigationMod.Item
import typingsSlinky.baseui.sideNavigationMod.NavItemOverrides
import typingsSlinky.baseui.sideNavigationMod.NavItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.sideNavigationMod.NavItem] {
  @JSImport("baseui/side-navigation", "NavItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    item: Item,
    $active: js.UndefOr[Boolean] = js.undefined,
    $level: Int | Double = null,
    $selectable: js.UndefOr[Boolean] = js.undefined,
    onSelect: /* args */ AnonItemAny => _ = null,
    overrides: NavItemOverrides = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.sideNavigationMod.NavItem] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (!js.isUndefined($active)) __obj.updateDynamic("$active")($active.asInstanceOf[js.Any])
    if ($level != null) __obj.updateDynamic("$level")($level.asInstanceOf[js.Any])
    if (!js.isUndefined($selectable)) __obj.updateDynamic("$selectable")($selectable.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NavItemProps
}


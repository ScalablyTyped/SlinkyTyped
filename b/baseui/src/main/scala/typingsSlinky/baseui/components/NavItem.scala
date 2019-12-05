package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.sideDashNavigationMod.Item
import typingsSlinky.baseui.sideDashNavigationMod.NavItemOverrides
import typingsSlinky.baseui.sideDashNavigationMod.NavItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.sideDashNavigationMod.NavItem] {
  @JSImport("baseui/side-navigation", "NavItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onSelect */
  def apply(
    item: Item,
    $active: js.UndefOr[Boolean] = js.undefined,
    $level: Int | Double = null,
    $selectable: js.UndefOr[Boolean] = js.undefined,
    overrides: NavItemOverrides = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.sideDashNavigationMod.NavItem] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (!js.isUndefined($active)) __obj.updateDynamic("$active")($active.asInstanceOf[js.Any])
    if ($level != null) __obj.updateDynamic("$level")($level.asInstanceOf[js.Any])
    if (!js.isUndefined($selectable)) __obj.updateDynamic("$selectable")($selectable.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NavItemProps
}


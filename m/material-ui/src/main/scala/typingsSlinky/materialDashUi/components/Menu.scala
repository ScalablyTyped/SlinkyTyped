package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Menus.MenuProps
import typingsSlinky.materialDashUi.__MaterialUI.ReactLink
import typingsSlinky.materialDashUi.menuMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: multiple, onKeyDown, value, width */
object Menu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.menuMod.default].asInstanceOf[String | js.Object]
  def apply(
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    desktop: js.UndefOr[Boolean] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    onChange: (/* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object], /* itemValue */ js.Any | js.Array[_]) => Unit = null,
    onEscKeyDown: SyntheticKeyboardEvent[js.Object] => Unit = null,
    onItemClick: (/* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object], /* item */ typingsSlinky.materialDashUi.__MaterialUI.Menus.MenuItem) => Unit = null,
    selectedMenuItemStyle: CSSProperties = null,
    style: CSSProperties = null,
    valueLink: ReactLink[_ | js.Array[_]] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(initiallyKeyboardFocused)) __obj.updateDynamic("initiallyKeyboardFocused")(initiallyKeyboardFocused.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(js.Any.fromFunction1(onEscKeyDown))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MenuProps
}


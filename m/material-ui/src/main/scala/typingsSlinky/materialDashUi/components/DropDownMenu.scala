package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Menus.DropDownMenuProps
import typingsSlinky.materialDashUi.__MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialDashUi.__MaterialUI.propTypes.origin
import typingsSlinky.materialDashUi.dropDownMenuMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropDownMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/DropDownMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, multiple */
  def apply(
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ReactComponentClass[PopoverAnimationProps] = null,
    iconButton: TagMod[Any] = null,
    iconStyle: CSSProperties = null,
    labelStyle: CSSProperties = null,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    menuItemStyle: CSSProperties = null,
    menuStyle: CSSProperties = null,
    onChange: (/* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object], /* index */ Double, /* menuItemValue */ js.Any) => Unit = null,
    onClose: /* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit = null,
    openImmediately: js.UndefOr[Boolean] = js.undefined,
    selectedMenuItemStyle: CSSProperties = null,
    selectionRenderer: (/* value */ js.Any, /* menuItem */ js.Any) => Unit = null,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    underlineStyle: CSSProperties = null,
    value: js.Any = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (iconButton != null) __obj.updateDynamic("iconButton")(iconButton.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuItemStyle != null) __obj.updateDynamic("menuItemStyle")(menuItemStyle.asInstanceOf[js.Any])
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (!js.isUndefined(openImmediately)) __obj.updateDynamic("openImmediately")(openImmediately.asInstanceOf[js.Any])
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle.asInstanceOf[js.Any])
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction2(selectionRenderer))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DropDownMenuProps
}


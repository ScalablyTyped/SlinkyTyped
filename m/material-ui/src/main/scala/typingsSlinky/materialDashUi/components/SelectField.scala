package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Menus.DropDownMenuProps
import typingsSlinky.materialDashUi.__MaterialUI.SelectFieldProps
import typingsSlinky.materialDashUi.selectFieldMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, disabled, id, multiple, name, onBlur, onFocus */
object SelectField
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.selectFieldMod.default].asInstanceOf[String | js.Object]
  def apply(
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    dropDownMenuProps: DropDownMenuProps = null,
    errorStyle: CSSProperties = null,
    errorText: TagMod[Any] = null,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: TagMod[Any] = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: TagMod[Any] = null,
    iconStyle: CSSProperties = null,
    labelStyle: CSSProperties = null,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    menuItemStyle: CSSProperties = null,
    menuStyle: js.Any = null,
    onChange: (/* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object], /* index */ Double, /* menuItemValue */ js.Any) => Unit = null,
    openImmediately: js.UndefOr[Boolean] = js.undefined,
    selectFieldRoot: CSSProperties = null,
    selectedMenuItemStyle: CSSProperties = null,
    selectionRenderer: /* value */ js.Any => TagMod[Any] = null,
    style: CSSProperties = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineStyle: CSSProperties = null,
    value: js.Any = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (dropDownMenuProps != null) __obj.updateDynamic("dropDownMenuProps")(dropDownMenuProps.asInstanceOf[js.Any])
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle.asInstanceOf[js.Any])
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed.asInstanceOf[js.Any])
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle.asInstanceOf[js.Any])
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle.asInstanceOf[js.Any])
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuItemStyle != null) __obj.updateDynamic("menuItemStyle")(menuItemStyle.asInstanceOf[js.Any])
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (!js.isUndefined(openImmediately)) __obj.updateDynamic("openImmediately")(openImmediately.asInstanceOf[js.Any])
    if (selectFieldRoot != null) __obj.updateDynamic("selectFieldRoot")(selectFieldRoot.asInstanceOf[js.Any])
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle.asInstanceOf[js.Any])
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1(selectionRenderer))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle.asInstanceOf[js.Any])
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SelectFieldProps
}


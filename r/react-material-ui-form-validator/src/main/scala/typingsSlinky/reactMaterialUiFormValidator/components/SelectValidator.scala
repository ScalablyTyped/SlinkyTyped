package typingsSlinky.reactMaterialUiFormValidator.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.MaterialUI.Menus.DropDownMenuProps
import typingsSlinky.materialUi.MaterialUI.SelectFieldProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorComponentProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectValidator
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMaterialUiFormValidator.mod.SelectValidator] {
  @JSImport("react-material-ui-form-validator", "SelectValidator")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    name: String,
    value: js.Any,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    dropDownMenuProps: DropDownMenuProps = null,
    errorMessages: js.Array[_] | String = null,
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
    onBlur: SyntheticFocusEvent[js.Object] => Unit = null,
    onChange: (/* e */ SyntheticEvent[Event_, js.Object], /* index */ Double, /* menuItemValue */ js.Any) => Unit = null,
    onFocus: SyntheticFocusEvent[js.Object] => Unit = null,
    openImmediately: js.UndefOr[Boolean] = js.undefined,
    selectFieldRoot: CSSProperties = null,
    selectedMenuItemStyle: CSSProperties = null,
    selectionRenderer: /* value */ js.Any => TagMod[Any] = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineStyle: CSSProperties = null,
    validatorListener: /* isValid */ Boolean => Unit = null,
    validators: js.Array[_] = null,
    withRequiredValidator: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMaterialUiFormValidator.mod.SelectValidator] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (dropDownMenuProps != null) __obj.updateDynamic("dropDownMenuProps")(dropDownMenuProps.asInstanceOf[js.Any])
    if (errorMessages != null) __obj.updateDynamic("errorMessages")(errorMessages.asInstanceOf[js.Any])
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
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (!js.isUndefined(openImmediately)) __obj.updateDynamic("openImmediately")(openImmediately.asInstanceOf[js.Any])
    if (selectFieldRoot != null) __obj.updateDynamic("selectFieldRoot")(selectFieldRoot.asInstanceOf[js.Any])
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle.asInstanceOf[js.Any])
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1(selectionRenderer))
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle.asInstanceOf[js.Any])
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (validatorListener != null) __obj.updateDynamic("validatorListener")(js.Any.fromFunction1(validatorListener))
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (!js.isUndefined(withRequiredValidator)) __obj.updateDynamic("withRequiredValidator")(withRequiredValidator.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ValidatorComponentProps with SelectFieldProps
}


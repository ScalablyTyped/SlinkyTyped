package typingsSlinky.reactSelect.componentsMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactSelect.componentsInputMod.InputProps
import typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueProps
import typingsSlinky.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typingsSlinky.reactSelect.componentsSingleValueMod.SingleValueProps
import typingsSlinky.reactSelect.containersMod.ContainerProps
import typingsSlinky.reactSelect.containersMod.IndicatorContainerProps
import typingsSlinky.reactSelect.containersMod.ValueContainerProps
import typingsSlinky.reactSelect.controlMod.ControlProps
import typingsSlinky.reactSelect.groupMod.GroupProps
import typingsSlinky.reactSelect.indicatorsMod.LoadingIconProps
import typingsSlinky.reactSelect.menuMod.MenuListComponentProps
import typingsSlinky.reactSelect.menuMod.MenuPortalProps
import typingsSlinky.reactSelect.menuMod.MenuProps
import typingsSlinky.reactSelect.menuMod.NoticeProps
import typingsSlinky.reactSelect.optionMod.OptionProps
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-select.react-select/src/components.SelectComponents<OptionType>> */
trait SelectComponentsConfig[OptionType /* <: OptionTypeBase */] extends js.Object {
  var ClearIndicator: js.UndefOr[IndicatorComponentType[OptionType]] = js.undefined
  var Control: js.UndefOr[ReactComponentClass[ControlProps[OptionType]]] = js.undefined
  var CrossIcon: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var DownChevron: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var DropdownIndicator: js.UndefOr[IndicatorComponentType[OptionType]] = js.undefined
  var Group: js.UndefOr[ReactComponentClass[GroupProps[OptionType]]] = js.undefined
  var GroupHeading: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var IndicatorSeparator: js.UndefOr[IndicatorComponentType[OptionType]] = js.undefined
  var IndicatorsContainer: js.UndefOr[ReactComponentClass[IndicatorContainerProps[OptionType]]] = js.undefined
  var Input: js.UndefOr[ReactComponentClass[InputProps]] = js.undefined
  var LoadingIndicator: js.UndefOr[ReactComponentClass[LoadingIconProps[OptionType]]] = js.undefined
  var LoadingMessage: js.UndefOr[ReactComponentClass[NoticeProps[OptionType]]] = js.undefined
  var Menu: js.UndefOr[ReactComponentClass[MenuProps[OptionType]]] = js.undefined
  var MenuList: js.UndefOr[ReactComponentClass[MenuListComponentProps[OptionType]]] = js.undefined
  var MenuPortal: js.UndefOr[ReactComponentClass[MenuPortalProps[OptionType]]] = js.undefined
  var MultiValue: js.UndefOr[ReactComponentClass[MultiValueProps[OptionType]]] = js.undefined
  var MultiValueContainer: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var MultiValueLabel: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var MultiValueRemove: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var NoOptionsMessage: js.UndefOr[ReactComponentClass[NoticeProps[OptionType]]] = js.undefined
  var Option: js.UndefOr[ReactComponentClass[OptionProps[OptionType]]] = js.undefined
  var Placeholder: js.UndefOr[ReactComponentClass[PlaceholderProps[OptionType]]] = js.undefined
  var SelectContainer: js.UndefOr[ReactComponentClass[ContainerProps[OptionType]]] = js.undefined
  var SingleValue: js.UndefOr[ReactComponentClass[SingleValueProps[OptionType]]] = js.undefined
  var ValueContainer: js.UndefOr[ReactComponentClass[ValueContainerProps[OptionType]]] = js.undefined
}

object SelectComponentsConfig {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](
    ClearIndicator: IndicatorComponentType[OptionType] = null,
    Control: ReactComponentClass[ControlProps[OptionType]] = null,
    CrossIcon: ReactComponentClass[_] = null,
    DownChevron: ReactComponentClass[_] = null,
    DropdownIndicator: IndicatorComponentType[OptionType] = null,
    Group: ReactComponentClass[GroupProps[OptionType]] = null,
    GroupHeading: ReactComponentClass[_] = null,
    IndicatorSeparator: IndicatorComponentType[OptionType] = null,
    IndicatorsContainer: ReactComponentClass[IndicatorContainerProps[OptionType]] = null,
    Input: ReactComponentClass[InputProps] = null,
    LoadingIndicator: ReactComponentClass[LoadingIconProps[OptionType]] = null,
    LoadingMessage: ReactComponentClass[NoticeProps[OptionType]] = null,
    Menu: ReactComponentClass[MenuProps[OptionType]] = null,
    MenuList: ReactComponentClass[MenuListComponentProps[OptionType]] = null,
    MenuPortal: ReactComponentClass[MenuPortalProps[OptionType]] = null,
    MultiValue: ReactComponentClass[MultiValueProps[OptionType]] = null,
    MultiValueContainer: ReactComponentClass[_] = null,
    MultiValueLabel: ReactComponentClass[_] = null,
    MultiValueRemove: ReactComponentClass[_] = null,
    NoOptionsMessage: ReactComponentClass[NoticeProps[OptionType]] = null,
    Option: ReactComponentClass[OptionProps[OptionType]] = null,
    Placeholder: ReactComponentClass[PlaceholderProps[OptionType]] = null,
    SelectContainer: ReactComponentClass[ContainerProps[OptionType]] = null,
    SingleValue: ReactComponentClass[SingleValueProps[OptionType]] = null,
    ValueContainer: ReactComponentClass[ValueContainerProps[OptionType]] = null
  ): SelectComponentsConfig[OptionType] = {
    val __obj = js.Dynamic.literal()
    if (ClearIndicator != null) __obj.updateDynamic("ClearIndicator")(ClearIndicator.asInstanceOf[js.Any])
    if (Control != null) __obj.updateDynamic("Control")(Control.asInstanceOf[js.Any])
    if (CrossIcon != null) __obj.updateDynamic("CrossIcon")(CrossIcon.asInstanceOf[js.Any])
    if (DownChevron != null) __obj.updateDynamic("DownChevron")(DownChevron.asInstanceOf[js.Any])
    if (DropdownIndicator != null) __obj.updateDynamic("DropdownIndicator")(DropdownIndicator.asInstanceOf[js.Any])
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    if (GroupHeading != null) __obj.updateDynamic("GroupHeading")(GroupHeading.asInstanceOf[js.Any])
    if (IndicatorSeparator != null) __obj.updateDynamic("IndicatorSeparator")(IndicatorSeparator.asInstanceOf[js.Any])
    if (IndicatorsContainer != null) __obj.updateDynamic("IndicatorsContainer")(IndicatorsContainer.asInstanceOf[js.Any])
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    if (LoadingIndicator != null) __obj.updateDynamic("LoadingIndicator")(LoadingIndicator.asInstanceOf[js.Any])
    if (LoadingMessage != null) __obj.updateDynamic("LoadingMessage")(LoadingMessage.asInstanceOf[js.Any])
    if (Menu != null) __obj.updateDynamic("Menu")(Menu.asInstanceOf[js.Any])
    if (MenuList != null) __obj.updateDynamic("MenuList")(MenuList.asInstanceOf[js.Any])
    if (MenuPortal != null) __obj.updateDynamic("MenuPortal")(MenuPortal.asInstanceOf[js.Any])
    if (MultiValue != null) __obj.updateDynamic("MultiValue")(MultiValue.asInstanceOf[js.Any])
    if (MultiValueContainer != null) __obj.updateDynamic("MultiValueContainer")(MultiValueContainer.asInstanceOf[js.Any])
    if (MultiValueLabel != null) __obj.updateDynamic("MultiValueLabel")(MultiValueLabel.asInstanceOf[js.Any])
    if (MultiValueRemove != null) __obj.updateDynamic("MultiValueRemove")(MultiValueRemove.asInstanceOf[js.Any])
    if (NoOptionsMessage != null) __obj.updateDynamic("NoOptionsMessage")(NoOptionsMessage.asInstanceOf[js.Any])
    if (Option != null) __obj.updateDynamic("Option")(Option.asInstanceOf[js.Any])
    if (Placeholder != null) __obj.updateDynamic("Placeholder")(Placeholder.asInstanceOf[js.Any])
    if (SelectContainer != null) __obj.updateDynamic("SelectContainer")(SelectContainer.asInstanceOf[js.Any])
    if (SingleValue != null) __obj.updateDynamic("SingleValue")(SingleValue.asInstanceOf[js.Any])
    if (ValueContainer != null) __obj.updateDynamic("ValueContainer")(ValueContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectComponentsConfig[OptionType]]
  }
}


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
import typingsSlinky.reactSelect.indicatorsMod.IndicatorProps
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
@js.native
trait SelectComponentsConfig[OptionType /* <: OptionTypeBase */] extends js.Object {
  var ClearIndicator: js.UndefOr[IndicatorComponentType[OptionType]] = js.native
  var Control: js.UndefOr[ReactComponentClass[ControlProps[OptionType]]] = js.native
  var CrossIcon: js.UndefOr[ReactComponentClass[_]] = js.native
  var DownChevron: js.UndefOr[ReactComponentClass[_]] = js.native
  var DropdownIndicator: js.UndefOr[IndicatorComponentType[OptionType]] = js.native
  var Group: js.UndefOr[ReactComponentClass[GroupProps[OptionType]]] = js.native
  var GroupHeading: js.UndefOr[ReactComponentClass[_]] = js.native
  var IndicatorSeparator: js.UndefOr[IndicatorComponentType[OptionType]] = js.native
  var IndicatorsContainer: js.UndefOr[ReactComponentClass[IndicatorContainerProps[OptionType]]] = js.native
  var Input: js.UndefOr[ReactComponentClass[InputProps]] = js.native
  var LoadingIndicator: js.UndefOr[ReactComponentClass[LoadingIconProps[OptionType]]] = js.native
  var LoadingMessage: js.UndefOr[ReactComponentClass[NoticeProps[OptionType]]] = js.native
  var Menu: js.UndefOr[ReactComponentClass[MenuProps[OptionType]]] = js.native
  var MenuList: js.UndefOr[ReactComponentClass[MenuListComponentProps[OptionType]]] = js.native
  var MenuPortal: js.UndefOr[ReactComponentClass[MenuPortalProps[OptionType]]] = js.native
  var MultiValue: js.UndefOr[ReactComponentClass[MultiValueProps[OptionType]]] = js.native
  var MultiValueContainer: js.UndefOr[ReactComponentClass[_]] = js.native
  var MultiValueLabel: js.UndefOr[ReactComponentClass[_]] = js.native
  var MultiValueRemove: js.UndefOr[ReactComponentClass[_]] = js.native
  var NoOptionsMessage: js.UndefOr[ReactComponentClass[NoticeProps[OptionType]]] = js.native
  var Option: js.UndefOr[ReactComponentClass[OptionProps[OptionType]]] = js.native
  var Placeholder: js.UndefOr[ReactComponentClass[PlaceholderProps[OptionType]]] = js.native
  var SelectContainer: js.UndefOr[ReactComponentClass[ContainerProps[OptionType]]] = js.native
  var SingleValue: js.UndefOr[ReactComponentClass[SingleValueProps[OptionType]]] = js.native
  var ValueContainer: js.UndefOr[ReactComponentClass[ValueContainerProps[OptionType]]] = js.native
}

object SelectComponentsConfig {
  @scala.inline
  def apply[OptionType](): SelectComponentsConfig[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectComponentsConfig[OptionType]]
  }
  @scala.inline
  implicit class SelectComponentsConfigOps[Self[optiontype] <: SelectComponentsConfig[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withClearIndicatorFunctionComponent(value: ReactComponentClass[IndicatorProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearIndicatorComponentClass(value: ReactComponentClass[IndicatorProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearIndicator(value: IndicatorComponentType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearIndicator: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withControlFunctionComponent(value: ReactComponentClass[ControlProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlComponentClass(value: ReactComponentClass[ControlProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControl(value: ReactComponentClass[ControlProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Control")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossIconFunctionComponent(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossIconComponentClass(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossIcon(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossIcon: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withDownChevronFunctionComponent(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownChevron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownChevronComponentClass(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownChevron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownChevron(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownChevron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownChevron: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownChevron")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownIndicatorFunctionComponent(value: ReactComponentClass[IndicatorProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropdownIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdownIndicatorComponentClass(value: ReactComponentClass[IndicatorProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropdownIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdownIndicator(value: IndicatorComponentType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropdownIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownIndicator: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropdownIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupFunctionComponent(value: ReactComponentClass[GroupProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupComponentClass(value: ReactComponentClass[GroupProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: ReactComponentClass[GroupProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupHeadingFunctionComponent(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupHeadingComponentClass(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupHeading(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupHeading: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorSeparatorFunctionComponent(value: ReactComponentClass[IndicatorProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndicatorSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorSeparatorComponentClass(value: ReactComponentClass[IndicatorProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndicatorSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorSeparator(value: IndicatorComponentType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndicatorSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorSeparator: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndicatorSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorsContainerFunctionComponent(value: ReactComponentClass[IndicatorContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndicatorsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorsContainerComponentClass(value: ReactComponentClass[IndicatorContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndicatorsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorsContainer(value: ReactComponentClass[IndicatorContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndicatorsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorsContainer: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndicatorsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFunctionComponent(value: ReactComponentClass[InputProps]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputComponentClass(value: ReactComponentClass[InputProps]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: ReactComponentClass[InputProps]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIndicatorFunctionComponent(value: ReactComponentClass[LoadingIconProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingIndicatorComponentClass(value: ReactComponentClass[LoadingIconProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingIndicator(value: ReactComponentClass[LoadingIconProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIndicator: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingMessageFunctionComponent(value: ReactComponentClass[NoticeProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingMessageComponentClass(value: ReactComponentClass[NoticeProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingMessage(value: ReactComponentClass[NoticeProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingMessage: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuFunctionComponent(value: ReactComponentClass[MenuProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuComponentClass(value: ReactComponentClass[MenuProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: ReactComponentClass[MenuProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Menu")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuListFunctionComponent(value: ReactComponentClass[MenuListComponentProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuListComponentClass(value: ReactComponentClass[MenuListComponentProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuList(value: ReactComponentClass[MenuListComponentProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuList: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuList")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuPortalFunctionComponent(value: ReactComponentClass[MenuPortalProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuPortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuPortalComponentClass(value: ReactComponentClass[MenuPortalProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuPortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuPortal(value: ReactComponentClass[MenuPortalProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuPortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuPortal: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuPortal")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueFunctionComponent(value: ReactComponentClass[MultiValueProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueComponentClass(value: ReactComponentClass[MultiValueProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValue(value: ReactComponentClass[MultiValueProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueContainerFunctionComponent(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueContainerComponentClass(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueContainer(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueContainer: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueLabelFunctionComponent(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueLabelComponentClass(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueLabel(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueLabel: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueRemoveFunctionComponent(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueRemoveComponentClass(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueRemove(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueRemove: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withNoOptionsMessageFunctionComponent(value: ReactComponentClass[NoticeProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoOptionsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoOptionsMessageComponentClass(value: ReactComponentClass[NoticeProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoOptionsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoOptionsMessage(value: ReactComponentClass[NoticeProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoOptionsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoOptionsMessage: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoOptionsMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionFunctionComponent(value: ReactComponentClass[OptionProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionComponentClass(value: ReactComponentClass[OptionProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: ReactComponentClass[OptionProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOption: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Option")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderFunctionComponent(value: ReactComponentClass[PlaceholderProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholderComponentClass(value: ReactComponentClass[PlaceholderProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: ReactComponentClass[PlaceholderProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectContainerFunctionComponent(value: ReactComponentClass[ContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectContainerComponentClass(value: ReactComponentClass[ContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectContainer(value: ReactComponentClass[ContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectContainer: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleValueFunctionComponent(value: ReactComponentClass[SingleValueProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleValueComponentClass(value: ReactComponentClass[SingleValueProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleValue(value: ReactComponentClass[SingleValueProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValueContainerFunctionComponent(value: ReactComponentClass[ValueContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueContainerComponentClass(value: ReactComponentClass[ValueContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueContainer(value: ReactComponentClass[ValueContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueContainer: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueContainer")(js.undefined)
        ret
    }
  }
  
}


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

@js.native
trait SelectComponents[OptionType /* <: OptionTypeBase */] extends js.Object {
  var ClearIndicator: IndicatorComponentType[OptionType] | Null = js.native
  var Control: ReactComponentClass[ControlProps[OptionType]] = js.native
  var CrossIcon: ReactComponentClass[_] = js.native
  var DownChevron: ReactComponentClass[_] = js.native
  var DropdownIndicator: IndicatorComponentType[OptionType] | Null = js.native
  var Group: ReactComponentClass[GroupProps[OptionType]] = js.native
  var GroupHeading: ReactComponentClass[_] = js.native
  var IndicatorSeparator: IndicatorComponentType[OptionType] | Null = js.native
  var IndicatorsContainer: ReactComponentClass[IndicatorContainerProps[OptionType]] = js.native
  var Input: ReactComponentClass[InputProps] = js.native
  var LoadingIndicator: ReactComponentClass[LoadingIconProps[OptionType]] | Null = js.native
  var LoadingMessage: ReactComponentClass[NoticeProps[OptionType]] = js.native
  var Menu: ReactComponentClass[MenuProps[OptionType]] = js.native
  var MenuList: ReactComponentClass[MenuListComponentProps[OptionType]] = js.native
  var MenuPortal: ReactComponentClass[MenuPortalProps[OptionType]] = js.native
  var MultiValue: ReactComponentClass[MultiValueProps[OptionType]] = js.native
  var MultiValueContainer: ReactComponentClass[_] = js.native
  var MultiValueLabel: ReactComponentClass[_] = js.native
  var MultiValueRemove: ReactComponentClass[_] = js.native
  var NoOptionsMessage: ReactComponentClass[NoticeProps[OptionType]] = js.native
  var Option: ReactComponentClass[OptionProps[OptionType]] = js.native
  var Placeholder: ReactComponentClass[PlaceholderProps[OptionType]] = js.native
  var SelectContainer: ReactComponentClass[ContainerProps[OptionType]] = js.native
  var SingleValue: ReactComponentClass[SingleValueProps[OptionType]] = js.native
  var ValueContainer: ReactComponentClass[ValueContainerProps[OptionType]] = js.native
}

object SelectComponents {
  @scala.inline
  def apply[OptionType](
    Control: ReactComponentClass[ControlProps[OptionType]],
    CrossIcon: ReactComponentClass[_],
    DownChevron: ReactComponentClass[_],
    Group: ReactComponentClass[GroupProps[OptionType]],
    GroupHeading: ReactComponentClass[_],
    IndicatorsContainer: ReactComponentClass[IndicatorContainerProps[OptionType]],
    Input: ReactComponentClass[InputProps],
    LoadingMessage: ReactComponentClass[NoticeProps[OptionType]],
    Menu: ReactComponentClass[MenuProps[OptionType]],
    MenuList: ReactComponentClass[MenuListComponentProps[OptionType]],
    MenuPortal: ReactComponentClass[MenuPortalProps[OptionType]],
    MultiValue: ReactComponentClass[MultiValueProps[OptionType]],
    MultiValueContainer: ReactComponentClass[_],
    MultiValueLabel: ReactComponentClass[_],
    MultiValueRemove: ReactComponentClass[_],
    NoOptionsMessage: ReactComponentClass[NoticeProps[OptionType]],
    Option: ReactComponentClass[OptionProps[OptionType]],
    Placeholder: ReactComponentClass[PlaceholderProps[OptionType]],
    SelectContainer: ReactComponentClass[ContainerProps[OptionType]],
    SingleValue: ReactComponentClass[SingleValueProps[OptionType]],
    ValueContainer: ReactComponentClass[ValueContainerProps[OptionType]]
  ): SelectComponents[OptionType] = {
    val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any], CrossIcon = CrossIcon.asInstanceOf[js.Any], DownChevron = DownChevron.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupHeading = GroupHeading.asInstanceOf[js.Any], IndicatorsContainer = IndicatorsContainer.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], LoadingMessage = LoadingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuList = MenuList.asInstanceOf[js.Any], MenuPortal = MenuPortal.asInstanceOf[js.Any], MultiValue = MultiValue.asInstanceOf[js.Any], MultiValueContainer = MultiValueContainer.asInstanceOf[js.Any], MultiValueLabel = MultiValueLabel.asInstanceOf[js.Any], MultiValueRemove = MultiValueRemove.asInstanceOf[js.Any], NoOptionsMessage = NoOptionsMessage.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], Placeholder = Placeholder.asInstanceOf[js.Any], SelectContainer = SelectContainer.asInstanceOf[js.Any], SingleValue = SingleValue.asInstanceOf[js.Any], ValueContainer = ValueContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectComponents[OptionType]]
  }
  @scala.inline
  implicit class SelectComponentsOps[Self[optiontype] <: SelectComponents[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withControl(value: ReactComponentClass[ControlProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossIcon(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownChevron(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownChevron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: ReactComponentClass[GroupProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupHeading(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorsContainer(value: ReactComponentClass[IndicatorContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndicatorsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: ReactComponentClass[InputProps]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingMessage(value: ReactComponentClass[NoticeProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: ReactComponentClass[MenuProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuList(value: ReactComponentClass[MenuListComponentProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuPortal(value: ReactComponentClass[MenuPortalProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuPortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValue(value: ReactComponentClass[MultiValueProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueContainer(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueLabel(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueRemove(value: ReactComponentClass[_]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoOptionsMessage(value: ReactComponentClass[NoticeProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoOptionsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: ReactComponentClass[OptionProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: ReactComponentClass[PlaceholderProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectContainer(value: ReactComponentClass[ContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleValue(value: ReactComponentClass[SingleValueProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueContainer(value: ReactComponentClass[ValueContainerProps[OptionType]]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueContainer")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withClearIndicatorNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearIndicator")(null)
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
    def withDropdownIndicatorNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropdownIndicator")(null)
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
    def withIndicatorSeparatorNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndicatorSeparator")(null)
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
    def withLoadingIndicatorNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingIndicator")(null)
        ret
    }
  }
  
}


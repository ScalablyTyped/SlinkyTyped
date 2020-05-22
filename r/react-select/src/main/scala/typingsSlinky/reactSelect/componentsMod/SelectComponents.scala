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

trait SelectComponents[OptionType /* <: OptionTypeBase */] extends js.Object {
  var ClearIndicator: IndicatorComponentType[OptionType] | Null
  var Control: ReactComponentClass[ControlProps[OptionType]]
  var CrossIcon: ReactComponentClass[_]
  var DownChevron: ReactComponentClass[_]
  var DropdownIndicator: IndicatorComponentType[OptionType] | Null
  var Group: ReactComponentClass[GroupProps[OptionType]]
  var GroupHeading: ReactComponentClass[_]
  var IndicatorSeparator: IndicatorComponentType[OptionType] | Null
  var IndicatorsContainer: ReactComponentClass[IndicatorContainerProps[OptionType]]
  var Input: ReactComponentClass[InputProps]
  var LoadingIndicator: ReactComponentClass[LoadingIconProps[OptionType]] | Null
  var LoadingMessage: ReactComponentClass[NoticeProps[OptionType]]
  var Menu: ReactComponentClass[MenuProps[OptionType]]
  var MenuList: ReactComponentClass[MenuListComponentProps[OptionType]]
  var MenuPortal: ReactComponentClass[MenuPortalProps[OptionType]]
  var MultiValue: ReactComponentClass[MultiValueProps[OptionType]]
  var MultiValueContainer: ReactComponentClass[_]
  var MultiValueLabel: ReactComponentClass[_]
  var MultiValueRemove: ReactComponentClass[_]
  var NoOptionsMessage: ReactComponentClass[NoticeProps[OptionType]]
  var Option: ReactComponentClass[OptionProps[OptionType]]
  var Placeholder: ReactComponentClass[PlaceholderProps[OptionType]]
  var SelectContainer: ReactComponentClass[ContainerProps[OptionType]]
  var SingleValue: ReactComponentClass[SingleValueProps[OptionType]]
  var ValueContainer: ReactComponentClass[ValueContainerProps[OptionType]]
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
    ValueContainer: ReactComponentClass[ValueContainerProps[OptionType]],
    ClearIndicator: IndicatorComponentType[OptionType] = null,
    DropdownIndicator: IndicatorComponentType[OptionType] = null,
    IndicatorSeparator: IndicatorComponentType[OptionType] = null,
    LoadingIndicator: ReactComponentClass[LoadingIconProps[OptionType]] = null
  ): SelectComponents[OptionType] = {
    val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any], CrossIcon = CrossIcon.asInstanceOf[js.Any], DownChevron = DownChevron.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupHeading = GroupHeading.asInstanceOf[js.Any], IndicatorsContainer = IndicatorsContainer.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], LoadingMessage = LoadingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuList = MenuList.asInstanceOf[js.Any], MenuPortal = MenuPortal.asInstanceOf[js.Any], MultiValue = MultiValue.asInstanceOf[js.Any], MultiValueContainer = MultiValueContainer.asInstanceOf[js.Any], MultiValueLabel = MultiValueLabel.asInstanceOf[js.Any], MultiValueRemove = MultiValueRemove.asInstanceOf[js.Any], NoOptionsMessage = NoOptionsMessage.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], Placeholder = Placeholder.asInstanceOf[js.Any], SelectContainer = SelectContainer.asInstanceOf[js.Any], SingleValue = SingleValue.asInstanceOf[js.Any], ValueContainer = ValueContainer.asInstanceOf[js.Any], ClearIndicator = ClearIndicator.asInstanceOf[js.Any], DropdownIndicator = DropdownIndicator.asInstanceOf[js.Any], IndicatorSeparator = IndicatorSeparator.asInstanceOf[js.Any], LoadingIndicator = LoadingIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectComponents[OptionType]]
  }
}


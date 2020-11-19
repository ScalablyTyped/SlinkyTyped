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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply[OptionType /* <: OptionTypeBase */](
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
  implicit class SelectComponentsOps[Self <: SelectComponents[_], OptionType /* <: OptionTypeBase */] (val x: Self with SelectComponents[OptionType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setControl(value: ReactComponentClass[ControlProps[OptionType]]): Self = this.set("Control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossIcon(value: ReactComponentClass[_]): Self = this.set("CrossIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownChevron(value: ReactComponentClass[_]): Self = this.set("DownChevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: ReactComponentClass[GroupProps[OptionType]]): Self = this.set("Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupHeading(value: ReactComponentClass[_]): Self = this.set("GroupHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorsContainer(value: ReactComponentClass[IndicatorContainerProps[OptionType]]): Self = this.set("IndicatorsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: ReactComponentClass[InputProps]): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingMessage(value: ReactComponentClass[NoticeProps[OptionType]]): Self = this.set("LoadingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: ReactComponentClass[MenuProps[OptionType]]): Self = this.set("Menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuList(value: ReactComponentClass[MenuListComponentProps[OptionType]]): Self = this.set("MenuList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuPortal(value: ReactComponentClass[MenuPortalProps[OptionType]]): Self = this.set("MenuPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValue(value: ReactComponentClass[MultiValueProps[OptionType]]): Self = this.set("MultiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueContainer(value: ReactComponentClass[_]): Self = this.set("MultiValueContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueLabel(value: ReactComponentClass[_]): Self = this.set("MultiValueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueRemove(value: ReactComponentClass[_]): Self = this.set("MultiValueRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoOptionsMessage(value: ReactComponentClass[NoticeProps[OptionType]]): Self = this.set("NoOptionsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOption(value: ReactComponentClass[OptionProps[OptionType]]): Self = this.set("Option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: ReactComponentClass[PlaceholderProps[OptionType]]): Self = this.set("Placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectContainer(value: ReactComponentClass[ContainerProps[OptionType]]): Self = this.set("SelectContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValue(value: ReactComponentClass[SingleValueProps[OptionType]]): Self = this.set("SingleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueContainer(value: ReactComponentClass[ValueContainerProps[OptionType]]): Self = this.set("ValueContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIndicatorFunctionComponent(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("ClearIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIndicatorComponentClass(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("ClearIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIndicator(value: IndicatorComponentType[OptionType]): Self = this.set("ClearIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIndicatorNull: Self = this.set("ClearIndicator", null)
    
    @scala.inline
    def setDropdownIndicatorFunctionComponent(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("DropdownIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownIndicatorComponentClass(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("DropdownIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownIndicator(value: IndicatorComponentType[OptionType]): Self = this.set("DropdownIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownIndicatorNull: Self = this.set("DropdownIndicator", null)
    
    @scala.inline
    def setIndicatorSeparatorFunctionComponent(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("IndicatorSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorSeparatorComponentClass(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("IndicatorSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorSeparator(value: IndicatorComponentType[OptionType]): Self = this.set("IndicatorSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorSeparatorNull: Self = this.set("IndicatorSeparator", null)
    
    @scala.inline
    def setLoadingIndicatorFunctionComponent(value: ReactComponentClass[LoadingIconProps[OptionType]]): Self = this.set("LoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingIndicatorComponentClass(value: ReactComponentClass[LoadingIconProps[OptionType]]): Self = this.set("LoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingIndicator(value: ReactComponentClass[LoadingIconProps[OptionType]]): Self = this.set("LoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingIndicatorNull: Self = this.set("LoadingIndicator", null)
  }
}

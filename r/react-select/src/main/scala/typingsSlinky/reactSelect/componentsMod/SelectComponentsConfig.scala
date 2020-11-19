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

/* Inlined std.Partial<react-select.react-select/src/components.SelectComponents<OptionType>> */
@js.native
trait SelectComponentsConfig[OptionType /* <: OptionTypeBase */] extends js.Object {
  
  var ClearIndicator: js.UndefOr[IndicatorComponentType[OptionType] | Null] = js.native
  
  var Control: js.UndefOr[ReactComponentClass[ControlProps[OptionType]]] = js.native
  
  var CrossIcon: js.UndefOr[ReactComponentClass[_]] = js.native
  
  var DownChevron: js.UndefOr[ReactComponentClass[_]] = js.native
  
  var DropdownIndicator: js.UndefOr[IndicatorComponentType[OptionType] | Null] = js.native
  
  var Group: js.UndefOr[ReactComponentClass[GroupProps[OptionType]]] = js.native
  
  var GroupHeading: js.UndefOr[ReactComponentClass[_]] = js.native
  
  var IndicatorSeparator: js.UndefOr[IndicatorComponentType[OptionType] | Null] = js.native
  
  var IndicatorsContainer: js.UndefOr[ReactComponentClass[IndicatorContainerProps[OptionType]]] = js.native
  
  var Input: js.UndefOr[ReactComponentClass[InputProps]] = js.native
  
  var LoadingIndicator: js.UndefOr[ReactComponentClass[LoadingIconProps[OptionType]] | Null] = js.native
  
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
  def apply[OptionType /* <: OptionTypeBase */](): SelectComponentsConfig[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectComponentsConfig[OptionType]]
  }
  
  @scala.inline
  implicit class SelectComponentsConfigOps[Self <: SelectComponentsConfig[_], OptionType /* <: OptionTypeBase */] (val x: Self with SelectComponentsConfig[OptionType]) extends AnyVal {
    
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
    def setClearIndicatorFunctionComponent(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("ClearIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIndicatorComponentClass(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("ClearIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIndicator(value: IndicatorComponentType[OptionType]): Self = this.set("ClearIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIndicator: Self = this.set("ClearIndicator", js.undefined)
    
    @scala.inline
    def setClearIndicatorNull: Self = this.set("ClearIndicator", null)
    
    @scala.inline
    def setControlFunctionComponent(value: ReactComponentClass[ControlProps[OptionType]]): Self = this.set("Control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlComponentClass(value: ReactComponentClass[ControlProps[OptionType]]): Self = this.set("Control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: ReactComponentClass[ControlProps[OptionType]]): Self = this.set("Control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControl: Self = this.set("Control", js.undefined)
    
    @scala.inline
    def setCrossIconFunctionComponent(value: ReactComponentClass[_]): Self = this.set("CrossIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossIconComponentClass(value: ReactComponentClass[_]): Self = this.set("CrossIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossIcon(value: ReactComponentClass[_]): Self = this.set("CrossIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossIcon: Self = this.set("CrossIcon", js.undefined)
    
    @scala.inline
    def setDownChevronFunctionComponent(value: ReactComponentClass[_]): Self = this.set("DownChevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownChevronComponentClass(value: ReactComponentClass[_]): Self = this.set("DownChevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownChevron(value: ReactComponentClass[_]): Self = this.set("DownChevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownChevron: Self = this.set("DownChevron", js.undefined)
    
    @scala.inline
    def setDropdownIndicatorFunctionComponent(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("DropdownIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownIndicatorComponentClass(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("DropdownIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownIndicator(value: IndicatorComponentType[OptionType]): Self = this.set("DropdownIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownIndicator: Self = this.set("DropdownIndicator", js.undefined)
    
    @scala.inline
    def setDropdownIndicatorNull: Self = this.set("DropdownIndicator", null)
    
    @scala.inline
    def setGroupFunctionComponent(value: ReactComponentClass[GroupProps[OptionType]]): Self = this.set("Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupComponentClass(value: ReactComponentClass[GroupProps[OptionType]]): Self = this.set("Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: ReactComponentClass[GroupProps[OptionType]]): Self = this.set("Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("Group", js.undefined)
    
    @scala.inline
    def setGroupHeadingFunctionComponent(value: ReactComponentClass[_]): Self = this.set("GroupHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupHeadingComponentClass(value: ReactComponentClass[_]): Self = this.set("GroupHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupHeading(value: ReactComponentClass[_]): Self = this.set("GroupHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeading: Self = this.set("GroupHeading", js.undefined)
    
    @scala.inline
    def setIndicatorSeparatorFunctionComponent(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("IndicatorSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorSeparatorComponentClass(value: ReactComponentClass[IndicatorProps[OptionType]]): Self = this.set("IndicatorSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorSeparator(value: IndicatorComponentType[OptionType]): Self = this.set("IndicatorSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorSeparator: Self = this.set("IndicatorSeparator", js.undefined)
    
    @scala.inline
    def setIndicatorSeparatorNull: Self = this.set("IndicatorSeparator", null)
    
    @scala.inline
    def setIndicatorsContainerFunctionComponent(value: ReactComponentClass[IndicatorContainerProps[OptionType]]): Self = this.set("IndicatorsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorsContainerComponentClass(value: ReactComponentClass[IndicatorContainerProps[OptionType]]): Self = this.set("IndicatorsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorsContainer(value: ReactComponentClass[IndicatorContainerProps[OptionType]]): Self = this.set("IndicatorsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorsContainer: Self = this.set("IndicatorsContainer", js.undefined)
    
    @scala.inline
    def setInputFunctionComponent(value: ReactComponentClass[InputProps]): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputComponentClass(value: ReactComponentClass[InputProps]): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: ReactComponentClass[InputProps]): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
    
    @scala.inline
    def setLoadingIndicatorFunctionComponent(value: ReactComponentClass[LoadingIconProps[OptionType]]): Self = this.set("LoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingIndicatorComponentClass(value: ReactComponentClass[LoadingIconProps[OptionType]]): Self = this.set("LoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingIndicator(value: ReactComponentClass[LoadingIconProps[OptionType]]): Self = this.set("LoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingIndicator: Self = this.set("LoadingIndicator", js.undefined)
    
    @scala.inline
    def setLoadingIndicatorNull: Self = this.set("LoadingIndicator", null)
    
    @scala.inline
    def setLoadingMessageFunctionComponent(value: ReactComponentClass[NoticeProps[OptionType]]): Self = this.set("LoadingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingMessageComponentClass(value: ReactComponentClass[NoticeProps[OptionType]]): Self = this.set("LoadingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingMessage(value: ReactComponentClass[NoticeProps[OptionType]]): Self = this.set("LoadingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingMessage: Self = this.set("LoadingMessage", js.undefined)
    
    @scala.inline
    def setMenuFunctionComponent(value: ReactComponentClass[MenuProps[OptionType]]): Self = this.set("Menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuComponentClass(value: ReactComponentClass[MenuProps[OptionType]]): Self = this.set("Menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: ReactComponentClass[MenuProps[OptionType]]): Self = this.set("Menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("Menu", js.undefined)
    
    @scala.inline
    def setMenuListFunctionComponent(value: ReactComponentClass[MenuListComponentProps[OptionType]]): Self = this.set("MenuList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuListComponentClass(value: ReactComponentClass[MenuListComponentProps[OptionType]]): Self = this.set("MenuList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuList(value: ReactComponentClass[MenuListComponentProps[OptionType]]): Self = this.set("MenuList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuList: Self = this.set("MenuList", js.undefined)
    
    @scala.inline
    def setMenuPortalFunctionComponent(value: ReactComponentClass[MenuPortalProps[OptionType]]): Self = this.set("MenuPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuPortalComponentClass(value: ReactComponentClass[MenuPortalProps[OptionType]]): Self = this.set("MenuPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuPortal(value: ReactComponentClass[MenuPortalProps[OptionType]]): Self = this.set("MenuPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuPortal: Self = this.set("MenuPortal", js.undefined)
    
    @scala.inline
    def setMultiValueFunctionComponent(value: ReactComponentClass[MultiValueProps[OptionType]]): Self = this.set("MultiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueComponentClass(value: ReactComponentClass[MultiValueProps[OptionType]]): Self = this.set("MultiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValue(value: ReactComponentClass[MultiValueProps[OptionType]]): Self = this.set("MultiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValue: Self = this.set("MultiValue", js.undefined)
    
    @scala.inline
    def setMultiValueContainerFunctionComponent(value: ReactComponentClass[_]): Self = this.set("MultiValueContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueContainerComponentClass(value: ReactComponentClass[_]): Self = this.set("MultiValueContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueContainer(value: ReactComponentClass[_]): Self = this.set("MultiValueContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueContainer: Self = this.set("MultiValueContainer", js.undefined)
    
    @scala.inline
    def setMultiValueLabelFunctionComponent(value: ReactComponentClass[_]): Self = this.set("MultiValueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueLabelComponentClass(value: ReactComponentClass[_]): Self = this.set("MultiValueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueLabel(value: ReactComponentClass[_]): Self = this.set("MultiValueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueLabel: Self = this.set("MultiValueLabel", js.undefined)
    
    @scala.inline
    def setMultiValueRemoveFunctionComponent(value: ReactComponentClass[_]): Self = this.set("MultiValueRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueRemoveComponentClass(value: ReactComponentClass[_]): Self = this.set("MultiValueRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueRemove(value: ReactComponentClass[_]): Self = this.set("MultiValueRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueRemove: Self = this.set("MultiValueRemove", js.undefined)
    
    @scala.inline
    def setNoOptionsMessageFunctionComponent(value: ReactComponentClass[NoticeProps[OptionType]]): Self = this.set("NoOptionsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoOptionsMessageComponentClass(value: ReactComponentClass[NoticeProps[OptionType]]): Self = this.set("NoOptionsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoOptionsMessage(value: ReactComponentClass[NoticeProps[OptionType]]): Self = this.set("NoOptionsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoOptionsMessage: Self = this.set("NoOptionsMessage", js.undefined)
    
    @scala.inline
    def setOptionFunctionComponent(value: ReactComponentClass[OptionProps[OptionType]]): Self = this.set("Option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionComponentClass(value: ReactComponentClass[OptionProps[OptionType]]): Self = this.set("Option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOption(value: ReactComponentClass[OptionProps[OptionType]]): Self = this.set("Option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOption: Self = this.set("Option", js.undefined)
    
    @scala.inline
    def setPlaceholderFunctionComponent(value: ReactComponentClass[PlaceholderProps[OptionType]]): Self = this.set("Placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderComponentClass(value: ReactComponentClass[PlaceholderProps[OptionType]]): Self = this.set("Placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: ReactComponentClass[PlaceholderProps[OptionType]]): Self = this.set("Placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("Placeholder", js.undefined)
    
    @scala.inline
    def setSelectContainerFunctionComponent(value: ReactComponentClass[ContainerProps[OptionType]]): Self = this.set("SelectContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectContainerComponentClass(value: ReactComponentClass[ContainerProps[OptionType]]): Self = this.set("SelectContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectContainer(value: ReactComponentClass[ContainerProps[OptionType]]): Self = this.set("SelectContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectContainer: Self = this.set("SelectContainer", js.undefined)
    
    @scala.inline
    def setSingleValueFunctionComponent(value: ReactComponentClass[SingleValueProps[OptionType]]): Self = this.set("SingleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValueComponentClass(value: ReactComponentClass[SingleValueProps[OptionType]]): Self = this.set("SingleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValue(value: ReactComponentClass[SingleValueProps[OptionType]]): Self = this.set("SingleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleValue: Self = this.set("SingleValue", js.undefined)
    
    @scala.inline
    def setValueContainerFunctionComponent(value: ReactComponentClass[ValueContainerProps[OptionType]]): Self = this.set("ValueContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueContainerComponentClass(value: ReactComponentClass[ValueContainerProps[OptionType]]): Self = this.set("ValueContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueContainer(value: ReactComponentClass[ValueContainerProps[OptionType]]): Self = this.set("ValueContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueContainer: Self = this.set("ValueContainer", js.undefined)
  }
}

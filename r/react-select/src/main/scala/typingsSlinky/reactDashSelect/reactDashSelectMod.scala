package typingsSlinky.reactDashSelect

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashSelect.reactDashSelectStrings.option
import typingsSlinky.reactDashSelect.srcComponentsContainersMod.ContainerProps
import typingsSlinky.reactDashSelect.srcComponentsContainersMod.IndicatorContainerProps
import typingsSlinky.reactDashSelect.srcComponentsContainersMod.ValueContainerProps
import typingsSlinky.reactDashSelect.srcComponentsControlMod.ControlProps
import typingsSlinky.reactDashSelect.srcComponentsGroupMod.GroupProps
import typingsSlinky.reactDashSelect.srcComponentsIndicatorsMod.LoadingIconProps
import typingsSlinky.reactDashSelect.srcComponentsInputMod.InputProps
import typingsSlinky.reactDashSelect.srcComponentsMenuMod.MenuListComponentProps
import typingsSlinky.reactDashSelect.srcComponentsMenuMod.MenuPortalProps
import typingsSlinky.reactDashSelect.srcComponentsMenuMod.MenuProps
import typingsSlinky.reactDashSelect.srcComponentsMenuMod.NoticeProps
import typingsSlinky.reactDashSelect.srcComponentsMod.IndicatorComponentType
import typingsSlinky.reactDashSelect.srcComponentsMultiValueMod.MultiValueProps
import typingsSlinky.reactDashSelect.srcComponentsOptionMod.InnerProps
import typingsSlinky.reactDashSelect.srcComponentsPlaceholderMod.PlaceholderProps
import typingsSlinky.reactDashSelect.srcComponentsSingleValueMod.SingleValueProps
import typingsSlinky.reactDashSelect.srcFiltersMod.Config
import typingsSlinky.reactDashSelect.srcFiltersMod.Option
import typingsSlinky.reactDashSelect.srcSelectMod.Props
import typingsSlinky.reactDashSelect.srcStateManagerMod.DefaultProps
import typingsSlinky.reactDashSelect.srcStateManagerMod.StateManager
import typingsSlinky.reactDashSelect.srcStylesMod.StylesConfig
import typingsSlinky.reactDashSelect.srcTypesMod.ActionTypes
import typingsSlinky.reactDashSelect.srcTypesMod.ClassNamesState
import typingsSlinky.reactDashSelect.srcTypesMod.InnerRef
import typingsSlinky.reactDashSelect.srcTypesMod.MouseEventHandler
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import typingsSlinky.reactDashSelect.srcTypesMod.OptionsType
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select", JSImport.Namespace)
@js.native
object reactDashSelectMod extends js.Object {
  @js.native
  trait OptionProps[OptionType /* <: OptionTypeBase */] extends js.Object {
    /** The children to be rendered. */
    var children: TagMod[Any] = js.native
    var className: js.UndefOr[String] = js.native
    /* The data of the selected option. */
    var data: js.Any = js.native
    var hasValue: Boolean = js.native
    var id: Double = js.native
    var index: Double = js.native
    /** props passed to the wrapping element for the group. */
    var innerProps: InnerProps = js.native
    /** The inner reference. */
    /** Inner ref to DOM Node */
    var innerRef: Ref[_] with InnerRef = js.native
    /** Whether the option is disabled. */
    var isDisabled: Boolean = js.native
    /** Whether the option is focused. */
    var isFocused: Boolean = js.native
    var isMulti: Boolean = js.native
    /** Whether the option is selected. */
    var isSelected: Boolean = js.native
    /* Text to be displayed representing the option. */
    var label: String = js.native
    var onClick: MouseEventHandler = js.native
    var onMouseOver: MouseEventHandler = js.native
    var options: OptionsType[OptionType] = js.native
    var selectProps: Props[OptionType] = js.native
    /* Type is used by the menu to determine whether this is an option or a group.
      In the case of option this is always `option`. */
    var `type`: option = js.native
    var value: js.Any = js.native
    def clearValue(): Unit = js.native
    def cx(): String | Unit = js.native
    def cx(a: String): String | Unit = js.native
    def cx(a: String, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
    def cx(a: String, b: ClassNamesState): String | Unit = js.native
    def cx(a: Null, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
    def cx(a: Null, b: ClassNamesState): String | Unit = js.native
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    def getValue(): ValueType[OptionType] = js.native
    def selectOption(option: OptionType): Unit = js.native
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */, T /* <: typingsSlinky.reactDashSelect.srcSelectMod.default[OptionType] */] () extends StateManager[OptionType, T]
  
  def createFilter(): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  def createFilter(config: Config): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  def mergeStyles(source: StylesConfig, target: StylesConfig): StylesConfig = js.native
  @js.native
  object components extends js.Object {
    var ClearIndicator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    var Control: NonNullable[ReactComponentClass[ControlProps[_]]] = js.native
    var CrossIcon: NonNullable[ReactComponentClass[_]] = js.native
    var DownChevron: NonNullable[ReactComponentClass[_]] = js.native
    var DropdownIndicator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    var Group: NonNullable[ReactComponentClass[GroupProps[_]]] = js.native
    var GroupHeading: NonNullable[ReactComponentClass[_]] = js.native
    var IndicatorSeparator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    var IndicatorsContainer: NonNullable[ReactComponentClass[IndicatorContainerProps[_]]] = js.native
    var Input: NonNullable[ReactComponentClass[InputProps]] = js.native
    var LoadingIndicator: NonNullable[ReactComponentClass[LoadingIconProps[_]] | Null] = js.native
    var LoadingMessage: NonNullable[ReactComponentClass[NoticeProps[_]]] = js.native
    var Menu: NonNullable[ReactComponentClass[MenuProps[_]]] = js.native
    var MenuList: NonNullable[ReactComponentClass[MenuListComponentProps[_]]] = js.native
    var MenuPortal: NonNullable[ReactComponentClass[MenuPortalProps[_]]] = js.native
    var MultiValue: NonNullable[ReactComponentClass[MultiValueProps[_]]] = js.native
    var MultiValueContainer: NonNullable[ReactComponentClass[_]] = js.native
    var MultiValueLabel: NonNullable[ReactComponentClass[_]] = js.native
    var MultiValueRemove: NonNullable[ReactComponentClass[_]] = js.native
    var NoOptionsMessage: NonNullable[ReactComponentClass[NoticeProps[_]]] = js.native
    var Option: NonNullable[
        ReactComponentClass[typingsSlinky.reactDashSelect.srcComponentsOptionMod.OptionProps[_]]
      ] = js.native
    var Placeholder: NonNullable[ReactComponentClass[PlaceholderProps[_]]] = js.native
    var SelectContainer: NonNullable[ReactComponentClass[ContainerProps[_]]] = js.native
    var SingleValue: NonNullable[ReactComponentClass[SingleValueProps[_]]] = js.native
    var ValueContainer: NonNullable[ReactComponentClass[ValueContainerProps[_]]] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: DefaultProps[_] = js.native
  }
  
}


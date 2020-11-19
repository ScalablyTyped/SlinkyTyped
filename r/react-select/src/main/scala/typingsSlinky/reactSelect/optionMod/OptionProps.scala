package typingsSlinky.reactSelect.optionMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactSelect.reactSelectStrings.option
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.InnerRef
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-select.react-select/src/types.PropsWithStyles & react-select.react-select/src/types.CommonProps<OptionType> & react-select.react-select/src/components/Option.State & {  children :react.react.ReactNode,   innerRef :react-select.react-select/src/types.InnerRef,   innerProps :react-select.react-select/src/components/Option.InnerProps,   label :string,   type :'option',   data :any} */
@js.native
trait OptionProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  
  /** The children to be rendered. */
  var children: ReactElement = js.native
  
  var className: js.UndefOr[String] = js.native
  
  def clearValue(): Unit = js.native
  
  def cx(): String = js.native
  def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
  def cx(state: ClassNamesState): String = js.native
  
  /* The data of the selected option. */
  var data: js.Any = js.native
  
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: String, props: js.Any): js.Object = js.native
  
  def getValue(): ValueType[OptionType] = js.native
  
  var hasValue: Boolean = js.native
  
  /** props passed to the wrapping element for the group. */
  var innerProps: InnerProps = js.native
  
  /** Inner ref to DOM Node */
  var innerRef: InnerRef = js.native
  
  /** Whether the option is disabled. */
  var isDisabled: Boolean = js.native
  
  /** Whether the option is focused. */
  var isFocused: Boolean = js.native
  
  var isMulti: Boolean = js.native
  
  /** Whether the option is selected. */
  var isSelected: Boolean = js.native
  
  /* Text to be displayed representing the option. */
  var label: String = js.native
  
  var options: OptionsType[OptionType] = js.native
  
  def selectOption(option: OptionType): Unit = js.native
  
  var selectProps: Props[OptionType] = js.native
  
  def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  
  /* Type is used by the menu to determine whether this is an option or a group.
    In the case of option this is always `option`. */
  var `type`: option = js.native
}

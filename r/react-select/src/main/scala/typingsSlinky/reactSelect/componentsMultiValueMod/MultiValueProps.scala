package typingsSlinky.reactSelect.componentsMultiValueMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactSelect.anon.OnClick
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  children :react.react.ReactNode,   components :any,   cropWithEllipsis :boolean,   data :OptionType,   innerProps :any,   isFocused :boolean,   isDisabled :boolean,   removeProps :{onTouchEnd (event : any): void, onClick (event : any): void, onMouseDown (event : any): void}} */
@js.native
trait MultiValueProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  
  var children: ReactElement = js.native
  
  var className: js.UndefOr[String] = js.native
  
  def clearValue(): Unit = js.native
  
  var components: js.Any = js.native
  
  var cropWithEllipsis: Boolean = js.native
  
  def cx(): String = js.native
  def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
  def cx(state: ClassNamesState): String = js.native
  
  var data: OptionType = js.native
  
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: String, props: js.Any): js.Object = js.native
  
  def getValue(): ValueType[OptionType] = js.native
  
  var hasValue: Boolean = js.native
  
  var innerProps: js.Any = js.native
  
  var isDisabled: Boolean = js.native
  
  var isFocused: Boolean = js.native
  
  var isMulti: Boolean = js.native
  
  var options: OptionsType[OptionType] = js.native
  
  var removeProps: OnClick = js.native
  
  def selectOption(option: OptionType): Unit = js.native
  
  var selectProps: Props[OptionType] = js.native
  
  def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
}

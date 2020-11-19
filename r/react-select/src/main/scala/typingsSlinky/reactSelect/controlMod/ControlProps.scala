package typingsSlinky.reactSelect.controlMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.anon.OnMouseDown
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-select.react-select/src/types.CommonProps<OptionType> & react-select.react-select/src/types.PropsWithStyles & react-select.react-select/src/components/Control.State & {  children :react.react.ReactNode,   innerRef :react.react.Ref<any>,   innerProps :{onMouseDown (event : react.react.MouseEvent<std.HTMLElement, react.react.NativeMouseEvent>): void}} */
@js.native
trait ControlProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  
  /** Children to render. */
  var children: ReactElement = js.native
  
  var className: js.UndefOr[String] = js.native
  
  def clearValue(): Unit = js.native
  
  def cx(): String = js.native
  def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
  def cx(state: ClassNamesState): String = js.native
  
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: String, props: js.Any): js.Object = js.native
  
  def getValue(): ValueType[OptionType] = js.native
  
  var hasValue: Boolean = js.native
  
  /** The mouse down event and the innerRef to pass down to the controller element. */
  var innerProps: OnMouseDown = js.native
  
  var innerRef: Ref[_] = js.native
  
  /** Whether the select is disabled. */
  var isDisabled: Boolean = js.native
  
  /** Whether the select is focused. */
  var isFocused: Boolean = js.native
  
  var isMulti: Boolean = js.native
  
  var options: OptionsType[OptionType] = js.native
  
  def selectOption(option: OptionType): Unit = js.native
  
  var selectProps: Props[OptionType] = js.native
  
  def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
}

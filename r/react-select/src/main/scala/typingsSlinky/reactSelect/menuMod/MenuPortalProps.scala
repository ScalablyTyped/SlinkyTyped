package typingsSlinky.reactSelect.menuMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.MenuPlacement
import typingsSlinky.reactSelect.typesMod.MenuPosition
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  appendTo :std.HTMLElement,   children :react.react.ReactNode,   controlElement :std.HTMLElement,   menuPlacement :react-select.react-select/src/types.MenuPlacement,   menuPosition :react-select.react-select/src/types.MenuPosition} */
@js.native
trait MenuPortalProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  
  var appendTo: HTMLElement = js.native
  
  var children: ReactElement = js.native
  
  var className: js.UndefOr[String] = js.native
  
  def clearValue(): Unit = js.native
  
   // ideally Menu<MenuProps>
  var controlElement: HTMLElement = js.native
  
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
  
  var isMulti: Boolean = js.native
  
  var menuPlacement: MenuPlacement = js.native
  
  var menuPosition: MenuPosition = js.native
  
  var options: OptionsType[OptionType] = js.native
  
  def selectOption(option: OptionType): Unit = js.native
  
  var selectProps: Props[OptionType] = js.native
  
  def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
}

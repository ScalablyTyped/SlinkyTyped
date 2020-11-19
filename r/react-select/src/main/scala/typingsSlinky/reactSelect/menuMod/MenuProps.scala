package typingsSlinky.reactSelect.menuMod

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

/* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  children :react.react.ReactElement, getPortalPlacement (state : react-select.react-select/src/components/Menu.MenuState): void,   innerProps :object,   maxMenuHeight :number,   menuPlacement :react-select.react-select/src/types.MenuPlacement,   menuPosition :react-select.react-select/src/types.MenuPosition,   minMenuHeight :number,   menuShouldScrollIntoView :boolean} */
@js.native
trait MenuProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  
  /** The children to be rendered. */
  var children: ReactElement = js.native
  
  var className: js.UndefOr[String] = js.native
  
  def clearValue(): Unit = js.native
  
  def cx(): String = js.native
  def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
  def cx(state: ClassNamesState): String = js.native
  
  /** Callback to update the portal after possible flip. */
  def getPortalPlacement(state: MenuState): Unit = js.native
  
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: String, props: js.Any): js.Object = js.native
  
  def getValue(): ValueType[OptionType] = js.native
  
  var hasValue: Boolean = js.native
  
  /** Props to be passed to the menu wrapper. */
  var innerProps: js.Object = js.native
  
  var isMulti: Boolean = js.native
  
  /** Set the maximum height of the menu. */
  var maxMenuHeight: Double = js.native
  
  /** Set whether the menu should be at the top, at the bottom. The auto options sets it to bottom. */
  var menuPlacement: MenuPlacement = js.native
  
  /* The CSS position value of the menu, when "fixed" extra layout management is required */
  var menuPosition: MenuPosition = js.native
  
  /** Set whether the page should scroll to show the menu. */
  var menuShouldScrollIntoView: Boolean = js.native
  
  /** Set the minimum height of the menu. */
  var minMenuHeight: Double = js.native
  
  var options: OptionsType[OptionType] = js.native
  
  def selectOption(option: OptionType): Unit = js.native
  
  var selectProps: Props[OptionType] = js.native
  
  def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
}

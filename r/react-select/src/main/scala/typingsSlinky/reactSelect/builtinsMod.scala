package typingsSlinky.reactSelect

import slinky.core.facade.ReactElement
import typingsSlinky.reactSelect.typesMod.GroupType
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtinsMod {
  
  @JSImport("react-select/src/builtins", "formatGroupLabel")
  @js.native
  def formatGroupLabel(group: GroupType[_]): ReactElement = js.native
  type formatGroupLabel[OptionType /* <: OptionTypeBase */] = js.Function1[/* group */ GroupType[OptionType], ReactElement]
  
  @JSImport("react-select/src/builtins", "getOptionLabel")
  @js.native
  def getOptionLabel(option: js.Any): String = js.native
  type getOptionLabel[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, String]
  
  @JSImport("react-select/src/builtins", "getOptionValue")
  @js.native
  def getOptionValue(option: js.Any): String = js.native
  type getOptionValue[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, String]
  
  @JSImport("react-select/src/builtins", "isOptionDisabled")
  @js.native
  def isOptionDisabled(option: js.Any): Boolean = js.native
  type isOptionDisabled[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, Boolean]
}

package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
import typingsSlinky.reactSelect.componentsSingleValueMod.SingleValueProps
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleValueMod {
  
  @JSImport("react-select/src/animated/SingleValue", JSImport.Default)
  @js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[SingleValueProps[OptionType]]): ReactComponentClass[AnimatedSingleValueProps[OptionType]] = js.native
  
  @JSImport("react-select/src/animated/SingleValue", "AnimatedSingleValue")
  @js.native
  def AnimatedSingleValue[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[SingleValueProps[OptionType]]): ReactComponentClass[AnimatedSingleValueProps[OptionType]] = js.native
  
  type AnimatedSingleValueProps[OptionType /* <: OptionTypeBase */] = SingleValueProps[OptionType]
}

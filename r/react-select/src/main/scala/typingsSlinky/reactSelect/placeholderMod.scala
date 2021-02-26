package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
import typingsSlinky.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderMod {
  
  @JSImport("react-select/src/animated/Placeholder", JSImport.Default)
  @js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[PlaceholderProps[OptionType]]): ReactComponentClass[AnimatedPlaceholderProps[OptionType]] = js.native
  
  @JSImport("react-select/src/animated/Placeholder", "AnimatedPlaceholder")
  @js.native
  def AnimatedPlaceholder[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[PlaceholderProps[OptionType]]): ReactComponentClass[AnimatedPlaceholderProps[OptionType]] = js.native
  
  type AnimatedPlaceholderProps[OptionType /* <: OptionTypeBase */] = PlaceholderProps[OptionType]
}

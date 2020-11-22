package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
import typingsSlinky.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/animated/Placeholder", JSImport.Namespace)
@js.native
object placeholderMod extends js.Object {
  
  def AnimatedPlaceholder[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[PlaceholderProps[OptionType]]): ReactComponentClass[AnimatedPlaceholderProps[OptionType]] = js.native
  
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[PlaceholderProps[OptionType]]): ReactComponentClass[AnimatedPlaceholderProps[OptionType]] = js.native
  
  type AnimatedPlaceholderProps[OptionType /* <: OptionTypeBase */] = PlaceholderProps[OptionType]
}

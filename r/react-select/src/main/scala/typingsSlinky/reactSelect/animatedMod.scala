package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
import typingsSlinky.reactSelect.componentsMod.SelectComponents
import typingsSlinky.reactSelect.componentsMod.SelectComponentsConfig
import typingsSlinky.reactSelect.inputMod.AnimatedInputProps
import typingsSlinky.reactSelect.multiValueMod.AnimatedMultiValueProps
import typingsSlinky.reactSelect.placeholderMod.AnimatedPlaceholderProps
import typingsSlinky.reactSelect.singleValueMod.AnimatedSingleValueProps
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.valueContainerMod.AnimatedValueContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/animated", JSImport.Namespace)
@js.native
object animatedMod extends js.Object {
  
  val Input: ReactComponentClass[AnimatedInputProps] = js.native
  
  val MultiValue: ReactComponentClass[AnimatedMultiValueProps[js.Any]] = js.native
  
  val Placeholder: ReactComponentClass[AnimatedPlaceholderProps[js.Any]] = js.native
  
  val SingleValue: ReactComponentClass[AnimatedSingleValueProps[js.Any]] = js.native
  
  val ValueContainer: ReactComponentClass[AnimatedValueContainerProps[js.Any]] = js.native
  
  def default[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  def default[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
  
  def makeAnimated[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
}

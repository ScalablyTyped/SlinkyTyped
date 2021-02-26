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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedMod {
  
  @JSImport("react-select/animated", JSImport.Default)
  @js.native
  def default[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  @JSImport("react-select/animated", JSImport.Default)
  @js.native
  def default[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
  
  @JSImport("react-select/animated", "Input")
  @js.native
  val Input: ReactComponentClass[AnimatedInputProps] = js.native
  
  @JSImport("react-select/animated", "MultiValue")
  @js.native
  val MultiValue: ReactComponentClass[AnimatedMultiValueProps[js.Any]] = js.native
  
  @JSImport("react-select/animated", "Placeholder")
  @js.native
  val Placeholder: ReactComponentClass[AnimatedPlaceholderProps[js.Any]] = js.native
  
  @JSImport("react-select/animated", "SingleValue")
  @js.native
  val SingleValue: ReactComponentClass[AnimatedSingleValueProps[js.Any]] = js.native
  
  @JSImport("react-select/animated", "ValueContainer")
  @js.native
  val ValueContainer: ReactComponentClass[AnimatedValueContainerProps[js.Any]] = js.native
  
  @JSImport("react-select/animated", "makeAnimated")
  @js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  @JSImport("react-select/animated", "makeAnimated")
  @js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
}

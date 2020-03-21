package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
import typingsSlinky.reactSelect.componentsSingleValueMod.SingleValueProps
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/SingleValue", JSImport.Namespace)
@js.native
object singleValueMod extends js.Object {
  def AnimatedSingleValue[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[SingleValueProps[OptionType]]): ReactComponentClass[AnimatedSingleValueProps[OptionType]] = js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[SingleValueProps[OptionType]]): ReactComponentClass[AnimatedSingleValueProps[OptionType]] = js.native
  type AnimatedSingleValueProps[OptionType /* <: OptionTypeBase */] = SingleValueProps[OptionType]
}


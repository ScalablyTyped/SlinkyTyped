package typingsSlinky.reactSelect.utilsMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/utils", "cleanValue")
@js.native
object cleanValue extends js.Object {
  def apply[OptionType /* <: OptionTypeBase */](value: ValueType[OptionType]): OptionsType[OptionType] = js.native
}


package typingsSlinky.reactSelect.componentsMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactElement
  - js.Array[typingsSlinky.react.mod.ReactElement]
*/
trait PlaceholderOrValue[OptionType /* <: OptionTypeBase */] extends js.Object

object PlaceholderOrValue {
  @scala.inline
  implicit def apply[OptionType](value: js.Array[ReactElement]): PlaceholderOrValue[OptionType] = value.asInstanceOf[PlaceholderOrValue[OptionType]]
  @scala.inline
  implicit def apply[OptionType](value: ReactElement): PlaceholderOrValue[OptionType] = value.asInstanceOf[PlaceholderOrValue[OptionType]]
}


package typingsSlinky.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCreatableMod {
  import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase

  type Props[OptionType /* <: OptionTypeBase */] = typingsSlinky.reactDashSelect.srcSelectMod.Props[OptionType] with CreatableProps[OptionType]
}

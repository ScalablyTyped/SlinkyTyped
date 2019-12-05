package typingsSlinky.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcAsyncMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase

  type AsyncComponentProps[T /* <: ReactComponentClass[_] */] = SelectComponentProps[T] with AsyncProps[_]
  type ClassProps[T] = js.Any
  type FunctionProps[T] = js.Any
  type Props[OptionType /* <: OptionTypeBase */] = typingsSlinky.reactDashSelect.srcSelectMod.Props[OptionType] with AsyncProps[OptionType]
  type SelectComponentProps[T] = ClassProps[T] | FunctionProps[T]
}

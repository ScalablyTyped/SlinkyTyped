package typingsSlinky.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcAsyncMod {
  type AsyncComponentProps[T /* <: slinky.core.ReactComponentClass[_] */] = typingsSlinky.reactSelect.srcAsyncMod.SelectComponentProps[T] with typingsSlinky.reactSelect.srcAsyncMod.AsyncProps[_]
  type ClassProps[T] = js.Any
  type FunctionProps[T] = js.Any
  type Props[OptionType /* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */] = typingsSlinky.reactSelect.selectMod.Props[OptionType] with typingsSlinky.reactSelect.srcAsyncMod.AsyncProps[OptionType]
  type SelectComponentProps[T] = typingsSlinky.reactSelect.srcAsyncMod.ClassProps[T] | typingsSlinky.reactSelect.srcAsyncMod.FunctionProps[T]
}

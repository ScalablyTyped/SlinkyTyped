package typingsSlinky.reduxSagaCore.effectsMod

import typingsSlinky.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Parameters[Fn]
  - typingsSlinky.reduxSagaCore.effectsMod.AllButLast[typingsSlinky.std.Parameters[Fn]]
*/
trait HelperWorkerParameters[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object

object HelperWorkerParameters {
  @scala.inline
  implicit def apply[T, Fn](value: AllButLast[Parameters[Fn]] | Parameters[Fn]): HelperWorkerParameters[T, Fn] = value.asInstanceOf[HelperWorkerParameters[T, Fn]]
}


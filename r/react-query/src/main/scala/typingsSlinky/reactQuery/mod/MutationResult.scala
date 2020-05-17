package typingsSlinky.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactQuery.mod.IdleMutationResult[TResult]
  - typingsSlinky.reactQuery.mod.LoadingMutationResult[TResult]
  - typingsSlinky.reactQuery.mod.ErrorMutationResult[TResult]
  - typingsSlinky.reactQuery.mod.SuccessMutationResult[TResult]
*/
trait MutationResult[TResult] extends js.Object

object MutationResult {
  @scala.inline
  implicit def apply[TResult](value: ErrorMutationResult[TResult]): MutationResult[TResult] = value.asInstanceOf[MutationResult[TResult]]
  @scala.inline
  implicit def apply[TResult](value: IdleMutationResult[TResult]): MutationResult[TResult] = value.asInstanceOf[MutationResult[TResult]]
  @scala.inline
  implicit def apply[TResult](value: LoadingMutationResult[TResult]): MutationResult[TResult] = value.asInstanceOf[MutationResult[TResult]]
  @scala.inline
  implicit def apply[TResult](value: SuccessMutationResult[TResult]): MutationResult[TResult] = value.asInstanceOf[MutationResult[TResult]]
}


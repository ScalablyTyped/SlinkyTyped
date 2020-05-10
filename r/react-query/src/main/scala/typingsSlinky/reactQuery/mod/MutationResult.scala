package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryStrings.error
import typingsSlinky.reactQuery.reactQueryStrings.idle
import typingsSlinky.reactQuery.reactQueryStrings.loading
import typingsSlinky.reactQuery.reactQueryStrings.success
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
  def IdleMutationResult[TResult](error: Null, promise: js.Promise[TResult], reset: () => Unit, status: idle): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
  @scala.inline
  def LoadingMutationResult[TResult](promise: js.Promise[TResult], reset: () => Unit, status: loading): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
  @scala.inline
  def ErrorMutationResult[TResult](promise: js.Promise[TResult], reset: () => Unit, status: error): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
  @scala.inline
  def SuccessMutationResult[TResult](data: TResult, promise: js.Promise[TResult], reset: () => Unit, status: success): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
}


package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.AnonDisableThrow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult[TResult, TVariables] extends js.Object {
  var data: Null | TResult = js.native
  var error: Null | js.Error = js.native
  var failureCount: Double = js.native
  var isCached: Boolean = js.native
  var isFetching: Boolean = js.native
  var isLoading: Boolean = js.native
  def refetch(): js.Promise[Unit] = js.native
  def refetch(arg: AnonDisableThrow[TVariables]): js.Promise[Unit] = js.native
}


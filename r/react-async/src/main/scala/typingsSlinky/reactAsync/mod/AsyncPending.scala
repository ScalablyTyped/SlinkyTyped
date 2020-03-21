package typingsSlinky.reactAsync.mod

import typingsSlinky.reactAsync.reactAsyncBooleans.`false`
import typingsSlinky.reactAsync.reactAsyncBooleans.`true`
import typingsSlinky.reactAsync.reactAsyncStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractState<T> & {  data  :T | undefined,   error  :std.Error | undefined,   value  :T | std.Error | undefined,   startedAt  :std.Date,   finishedAt  :undefined,   status  :'pending',   isInitial  :false,   isPending  :true,   isLoading  :true,   isFulfilled  :false,   isResolved  :false,   isRejected  :false,   isSettled  :false} */
@js.native
trait AsyncPending[T] extends AsyncState[T] {
  var counter: Double = js.native
  var data: js.UndefOr[T] = js.native
  var error: js.UndefOr[js.Error] = js.native
  var finishedAt: js.UndefOr[scala.Nothing] = js.native
  var initialValue: js.UndefOr[T | js.Error] = js.native
  var isFulfilled: `false` = js.native
  var isInitial: `false` = js.native
  var isLoading: `true` = js.native
  var isPending: `true` = js.native
  var isRejected: `false` = js.native
  var isResolved: `false` = js.native
  var isSettled: `false` = js.native
  var promise: js.Promise[T] = js.native
  var startedAt: js.Date = js.native
  var status: pending = js.native
  var value: js.UndefOr[T | js.Error] = js.native
  def cancel(): Unit = js.native
  def reload(): Unit = js.native
  def run(args: js.Any*): Unit = js.native
  def setData(data: T): T = js.native
  def setData(data: T, callback: js.Function0[Unit]): T = js.native
  def setError(error: js.Error): js.Error = js.native
  def setError(error: js.Error, callback: js.Function0[Unit]): js.Error = js.native
}


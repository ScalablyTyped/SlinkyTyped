package typingsSlinky.reactAsync.mod

import typingsSlinky.reactAsync.reactAsyncBooleans.`false`
import typingsSlinky.reactAsync.reactAsyncBooleans.`true`
import typingsSlinky.reactAsync.reactAsyncStrings.fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractState<T> & {  data  :T,   error  :undefined,   value  :T,   startedAt  :std.Date,   finishedAt  :std.Date,   status  :'fulfilled',   isInitial  :false,   isPending  :false,   isLoading  :false,   isFulfilled  :true,   isResolved  :true,   isRejected  :false,   isSettled  :true} */
@js.native
trait AsyncFulfilled[T] extends AsyncState[T] {
  var counter: Double = js.native
  var data: T = js.native
  var error: js.UndefOr[scala.Nothing] = js.native
  var finishedAt: js.Date = js.native
  var initialValue: js.UndefOr[T | js.Error] = js.native
  var isFulfilled: `true` = js.native
  var isInitial: `false` = js.native
  var isLoading: `false` = js.native
  var isPending: `false` = js.native
  var isRejected: `false` = js.native
  var isResolved: `true` = js.native
  var isSettled: `true` = js.native
  var promise: js.Promise[T] = js.native
  var startedAt: js.Date = js.native
  var status: fulfilled = js.native
  var value: T = js.native
  def cancel(): Unit = js.native
  def reload(): Unit = js.native
  def run(args: js.Any*): Unit = js.native
  def setData(data: T): T = js.native
  def setData(data: T, callback: js.Function0[Unit]): T = js.native
  def setError(error: js.Error): js.Error = js.native
  def setError(error: js.Error, callback: js.Function0[Unit]): js.Error = js.native
}


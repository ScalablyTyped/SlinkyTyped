package typingsSlinky.reactAsync.mod

import typingsSlinky.reactAsync.reactAsyncBooleans.`false`
import typingsSlinky.reactAsync.reactAsyncBooleans.`true`
import typingsSlinky.reactAsync.reactAsyncStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractState<T> & {  data  :T | undefined,   error  :std.Error,   value  :std.Error,   startedAt  :std.Date,   finishedAt  :std.Date,   status  :'rejected',   isInitial  :false,   isPending  :false,   isLoading  :false,   isFulfilled  :false,   isResolved  :false,   isRejected  :true,   isSettled  :true} */
@js.native
trait AsyncRejected[T] extends AsyncState[T] {
  var counter: Double = js.native
  var data: js.UndefOr[T] = js.native
  var error: js.Error = js.native
  var finishedAt: js.Date = js.native
  var initialValue: js.UndefOr[T | js.Error] = js.native
  var isFulfilled: `false` = js.native
  var isInitial: `false` = js.native
  var isLoading: `false` = js.native
  var isPending: `false` = js.native
  var isRejected: `true` = js.native
  var isResolved: `false` = js.native
  var isSettled: `true` = js.native
  var promise: js.Promise[T] = js.native
  var startedAt: js.Date = js.native
  var status: rejected = js.native
  var value: js.Error = js.native
  def cancel(): Unit = js.native
  def reload(): Unit = js.native
  def run(args: js.Any*): Unit = js.native
  def setData(data: T): T = js.native
  def setData(data: T, callback: js.Function0[Unit]): T = js.native
  def setError(error: js.Error): js.Error = js.native
  def setError(error: js.Error, callback: js.Function0[Unit]): js.Error = js.native
}


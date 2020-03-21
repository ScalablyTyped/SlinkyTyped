package typingsSlinky.reactAsync.mod

import typingsSlinky.reactAsync.reactAsyncBooleans.`false`
import typingsSlinky.reactAsync.reactAsyncStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractState<T> & {  initialValue ? :undefined,   data  :undefined,   error  :undefined,   value  :undefined,   startedAt  :undefined,   finishedAt  :undefined,   status  :'initial',   isInitial  :false,   isPending  :false,   isLoading  :false,   isFulfilled  :false,   isResolved  :false,   isRejected  :false,   isSettled  :false} */
@js.native
trait AsyncInitial[T] extends AsyncState[T] {
  var counter: Double = js.native
  var data: js.UndefOr[scala.Nothing] = js.native
  var error: js.UndefOr[scala.Nothing] = js.native
  var finishedAt: js.UndefOr[scala.Nothing] = js.native
  var initialValue: js.UndefOr[(T | js.Error) with js.UndefOr[scala.Nothing]] = js.native
  var isFulfilled: `false` = js.native
  var isInitial: `false` = js.native
  var isLoading: `false` = js.native
  var isPending: `false` = js.native
  var isRejected: `false` = js.native
  var isResolved: `false` = js.native
  var isSettled: `false` = js.native
  var promise: js.Promise[T] = js.native
  var startedAt: js.UndefOr[scala.Nothing] = js.native
  var status: initial = js.native
  var value: js.UndefOr[scala.Nothing] = js.native
  def cancel(): Unit = js.native
  def reload(): Unit = js.native
  def run(args: js.Any*): Unit = js.native
  def setData(data: T): T = js.native
  def setData(data: T, callback: js.Function0[Unit]): T = js.native
  def setError(error: js.Error): js.Error = js.native
  def setError(error: js.Error, callback: js.Function0[Unit]): js.Error = js.native
}


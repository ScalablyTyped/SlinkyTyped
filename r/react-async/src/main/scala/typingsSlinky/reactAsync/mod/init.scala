package typingsSlinky.reactAsync.mod

import typingsSlinky.reactAsync.anon.InitialValue
import typingsSlinky.reactAsync.reactAsyncStrings.counter
import typingsSlinky.reactAsync.reactAsyncStrings.initialValue
import typingsSlinky.reactAsync.reactAsyncStrings.promise
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", "init")
@js.native
object init extends js.Object {
  def apply[T](hasInitialValuePromisePromiseFn: InitialValue[T]): (AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]]) = js.native
}


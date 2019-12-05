package typingsSlinky.reactDashAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAsyncMod {
  import org.scalajs.dom.experimental.AbortController
  import slinky.core.TagMod
  import typingsSlinky.reactDashAsync.Anon_Cancel
  import typingsSlinky.reactDashAsync.Anon_Data
  import typingsSlinky.reactDashAsync.Anon_DataError
  import typingsSlinky.reactDashAsync.Anon_DataErrorFalse
  import typingsSlinky.reactDashAsync.Anon_DataErrorFalseFinishedAt
  import typingsSlinky.reactDashAsync.Anon_Error
  import typingsSlinky.reactDashAsync.Anon_Fulfill
  import typingsSlinky.reactDashAsync.Anon_Payload
  import typingsSlinky.std.Omit

  type AsyncAction[T] = Start | Cancel | Fulfill[T] | Reject
  type AsyncChildren[T] = (js.Function1[/* state */ AsyncState[T], TagMod[Any]]) | TagMod[Any]
  type AsyncFulfilled[T] = AbstractState[T] with Anon_DataErrorFalse[T]
  type AsyncInitial[T] = AbstractState[T] with Anon_Data
  // unfortunately, we cannot just omit K from AsyncInitial as that would unbox the Discriminated Union
  type AsyncInitialWithout[K /* <: String */, T] = Omit[AsyncFulfilled[T] | AsyncInitial[T] | AsyncPending[T] | AsyncRejected[T], K]
  type AsyncPending[T] = AbstractState[T] with Anon_DataError[T]
  type AsyncRejected[T] = AbstractState[T] with Anon_DataErrorFalseFinishedAt[T]
  type AsyncState[T] = AsyncInitial[T] | AsyncPending[T] | AsyncFulfilled[T] | AsyncRejected[T]
  type Cancel = AbstractAction with Anon_Cancel
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ AsyncProps[T], 
    /* controller */ AbortController, 
    js.Promise[T]
  ]
  type Fulfill[T] = AbstractAction with Anon_Fulfill[T]
  type FulfilledChildren[T] = (js.Function2[/* data */ T, /* state */ AsyncFulfilled[T], TagMod[Any]]) | TagMod[Any]
  type InitialChildren[T] = (js.Function1[/* state */ AsyncInitial[T], TagMod[Any]]) | TagMod[Any]
  type PendingChildren[T] = (js.Function1[/* state */ AsyncPending[T], TagMod[Any]]) | TagMod[Any]
  type PromiseFn[T] = js.Function2[/* props */ AsyncProps[T], /* controller */ AbortController, js.Promise[T]]
  type Reject = AbstractAction with Anon_Error
  type RejectedChildren[T] = (js.Function2[/* error */ js.Error, /* state */ AsyncRejected[T], TagMod[Any]]) | TagMod[Any]
  type SettledChildren[T] = (js.Function1[/* state */ AsyncFulfilled[T] | AsyncRejected[T], TagMod[Any]]) | TagMod[Any]
  type Start = AbstractAction with Anon_Payload
}

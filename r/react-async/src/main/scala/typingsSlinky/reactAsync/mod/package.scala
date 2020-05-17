package typingsSlinky.reactAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // unfortunately, we cannot just omit K from AsyncInitial as that would unbox the Discriminated Union
  type AsyncInitialWithout[K /* <: /* keyof react-async.react-async.AsyncInitial<T> */ typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise | typingsSlinky.reactAsync.reactAsyncStrings.run | typingsSlinky.reactAsync.reactAsyncStrings.reload | typingsSlinky.reactAsync.reactAsyncStrings.cancel | typingsSlinky.reactAsync.reactAsyncStrings.setData | typingsSlinky.reactAsync.reactAsyncStrings.setError | typingsSlinky.reactAsync.reactAsyncStrings.data | typingsSlinky.reactAsync.reactAsyncStrings.error | typingsSlinky.reactAsync.reactAsyncStrings.value | typingsSlinky.reactAsync.reactAsyncStrings.startedAt | typingsSlinky.reactAsync.reactAsyncStrings.finishedAt | typingsSlinky.reactAsync.reactAsyncStrings.status | typingsSlinky.reactAsync.reactAsyncStrings.isInitial | typingsSlinky.reactAsync.reactAsyncStrings.isPending | typingsSlinky.reactAsync.reactAsyncStrings.isLoading | typingsSlinky.reactAsync.reactAsyncStrings.isFulfilled | typingsSlinky.reactAsync.reactAsyncStrings.isResolved | typingsSlinky.reactAsync.reactAsyncStrings.isRejected | typingsSlinky.reactAsync.reactAsyncStrings.isSettled */, T] = typingsSlinky.std.Omit[
    typingsSlinky.reactAsync.mod.AsyncFulfilled[T] | typingsSlinky.reactAsync.mod.AsyncInitial[T] | typingsSlinky.reactAsync.mod.AsyncPending[T] | typingsSlinky.reactAsync.mod.AsyncRejected[T], 
    K
  ]
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ typingsSlinky.reactAsync.mod.AsyncProps[T], 
    /* controller */ org.scalajs.dom.experimental.AbortController, 
    js.Promise[T]
  ]
  type PromiseFn[T] = js.Function2[
    /* props */ typingsSlinky.reactAsync.mod.AsyncProps[T], 
    /* controller */ org.scalajs.dom.experimental.AbortController, 
    js.Promise[T]
  ]
}

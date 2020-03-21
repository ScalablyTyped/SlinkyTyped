package typingsSlinky.reactAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncChildren[T] = (js.Function1[
    /* state */ typingsSlinky.reactAsync.mod.AsyncState[T], 
    slinky.core.TagMod[scala.Any]
  ]) | slinky.core.TagMod[scala.Any]
  // unfortunately, we cannot just omit K from AsyncInitial as that would unbox the Discriminated Union
  type AsyncInitialWithout[K /* <: java.lang.String */, T] = typingsSlinky.std.Omit[
    typingsSlinky.reactAsync.mod.AsyncFulfilled[T] | typingsSlinky.reactAsync.mod.AsyncInitial[T] | typingsSlinky.reactAsync.mod.AsyncPending[T] | typingsSlinky.reactAsync.mod.AsyncRejected[T], 
    K
  ]
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ typingsSlinky.reactAsync.mod.AsyncProps[T], 
    /* controller */ org.scalajs.dom.experimental.AbortController, 
    js.Promise[T]
  ]
  type FulfilledChildren[T] = (js.Function2[
    /* data */ T, 
    /* state */ typingsSlinky.reactAsync.mod.AsyncFulfilled[T], 
    slinky.core.TagMod[scala.Any]
  ]) | slinky.core.TagMod[scala.Any]
  type InitialChildren[T] = (js.Function1[
    /* state */ typingsSlinky.reactAsync.mod.AsyncInitial[T], 
    slinky.core.TagMod[scala.Any]
  ]) | slinky.core.TagMod[scala.Any]
  type PendingChildren[T] = (js.Function1[
    /* state */ typingsSlinky.reactAsync.mod.AsyncPending[T], 
    slinky.core.TagMod[scala.Any]
  ]) | slinky.core.TagMod[scala.Any]
  type PromiseFn[T] = js.Function2[
    /* props */ typingsSlinky.reactAsync.mod.AsyncProps[T], 
    /* controller */ org.scalajs.dom.experimental.AbortController, 
    js.Promise[T]
  ]
  type RejectedChildren[T] = (js.Function2[
    /* error */ js.Error, 
    /* state */ typingsSlinky.reactAsync.mod.AsyncRejected[T], 
    slinky.core.TagMod[scala.Any]
  ]) | slinky.core.TagMod[scala.Any]
  type SettledChildren[T] = (js.Function1[
    /* state */ typingsSlinky.reactAsync.mod.AsyncFulfilled[T] | typingsSlinky.reactAsync.mod.AsyncRejected[T], 
    slinky.core.TagMod[scala.Any]
  ]) | slinky.core.TagMod[scala.Any]
}

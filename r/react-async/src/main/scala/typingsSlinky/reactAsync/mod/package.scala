package typingsSlinky.reactAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Async[T] = slinky.core.ReactComponentClass[typingsSlinky.reactAsync.mod.AsyncProps[T]]
  
  type AsyncChildren[T] = (js.Function1[
    /* state */ typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.AbstractState[T]], 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
  
  type AsyncFulfilled[T, S] = S with typingsSlinky.reactAsync.anon.Data[T]
  
  type AsyncInitial[T, S] = S with typingsSlinky.reactAsync.anon.Error
  
  type AsyncPending[T, S] = S with typingsSlinky.reactAsync.anon.FinishedAt[T]
  
  type AsyncRejected[T, S] = S with typingsSlinky.reactAsync.anon.IsFulfilled[T]
  
  type AsyncState[T, S /* <: typingsSlinky.reactAsync.mod.AbstractState[T] */] = typingsSlinky.reactAsync.mod.BaseAsyncState[T, S]
  
  type BaseAsyncState[T, S] = (typingsSlinky.reactAsync.mod.AsyncInitial[T, S]) | (typingsSlinky.reactAsync.mod.AsyncPending[T, S]) | (typingsSlinky.reactAsync.mod.AsyncFulfilled[T, S]) | (typingsSlinky.reactAsync.mod.AsyncRejected[T, S])
  
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ typingsSlinky.reactAsync.mod.AsyncProps[T], 
    /* controller */ org.scalajs.dom.experimental.AbortController, 
    js.Promise[T]
  ]
  
  type FulfilledChildren[T] = (js.Function2[
    /* data */ T, 
    /* state */ typingsSlinky.reactAsync.mod.AsyncFulfilled[T, typingsSlinky.reactAsync.mod.AbstractState[T]], 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
  
  type GenericAsync = (org.scalablytyped.runtime.Instantiable0[
    slinky.core.ReactComponentClass[typingsSlinky.reactAsync.mod.AsyncProps[js.Object]]
  ]) with typingsSlinky.reactAsync.anon.Fulfilled
  
  type InitialChildren[T] = (js.Function1[
    /* state */ typingsSlinky.reactAsync.mod.AsyncInitial[T, typingsSlinky.reactAsync.mod.AbstractState[T]], 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
  
  /* Inlined react-async.react-async.AbstractAction['meta'] */
  type Meta = typingsSlinky.reactAsync.reactAsyncStrings.counter
  
  type PendingChildren[T] = (js.Function1[
    /* state */ typingsSlinky.reactAsync.mod.AsyncPending[T, typingsSlinky.reactAsync.mod.AbstractState[T]], 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
  
  type PromiseFn[T] = js.Function2[
    /* props */ typingsSlinky.reactAsync.mod.AsyncProps[T], 
    /* controller */ org.scalajs.dom.experimental.AbortController, 
    js.Promise[T]
  ]
  
  type ReducerAsyncState[T] = typingsSlinky.reactAsync.mod.BaseAsyncState[T, typingsSlinky.reactAsync.mod.ReducerBaseState[T]]
  
  type RejectedChildren[T] = (js.Function2[
    /* error */ js.Error, 
    /* state */ typingsSlinky.reactAsync.mod.AsyncRejected[T, typingsSlinky.reactAsync.mod.AbstractState[T]], 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
  
  type SettledChildren[T] = (js.Function1[
    /* state */ (typingsSlinky.reactAsync.mod.AsyncFulfilled[T, typingsSlinky.reactAsync.mod.AbstractState[T]]) | (typingsSlinky.reactAsync.mod.AsyncRejected[T, typingsSlinky.reactAsync.mod.AbstractState[T]]), 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
}

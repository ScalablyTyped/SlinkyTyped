package typingsSlinky.reactAsync.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.AbortController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncOptions[T]
  extends /* prop */ StringDictionary[js.Any] {
  
  var debugLabel: js.UndefOr[String] = js.native
  
  var deferFn: js.UndefOr[DeferFn[T]] = js.native
  
  var dispatcher: js.UndefOr[
    js.Function3[
      /* action */ AsyncAction[T], 
      /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], 
      /* props */ AsyncProps[T], 
      Unit
    ]
  ] = js.native
  
  var initialValue: js.UndefOr[T] = js.native
  
  var onReject: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  
  var onResolve: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.native
  
  var promise: js.UndefOr[js.Promise[T]] = js.native
  
  var promiseFn: js.UndefOr[PromiseFn[T]] = js.native
  
  var reducer: js.UndefOr[
    js.Function3[
      /* state */ ReducerAsyncState[T], 
      /* action */ AsyncAction[T], 
      /* internalReducer */ js.Function2[/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], ReducerAsyncState[T]], 
      AsyncState[T, AbstractState[T]]
    ]
  ] = js.native
  
  var watch: js.UndefOr[js.Any] = js.native
  
  var watchFn: js.UndefOr[js.Function2[/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T], _]] = js.native
}
object AsyncOptions {
  
  @scala.inline
  def apply[T](): AsyncOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOptions[T]]
  }
  
  @scala.inline
  implicit class AsyncOptionsMutableBuilder[Self <: AsyncOptions[_], T] (val x: Self with AsyncOptions[T]) extends AnyVal {
    
    @scala.inline
    def setDebugLabel(value: String): Self = StObject.set(x, "debugLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugLabelUndefined: Self = StObject.set(x, "debugLabel", js.undefined)
    
    @scala.inline
    def setDeferFn(
      value: (/* args */ js.Array[js.Any], /* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]
    ): Self = StObject.set(x, "deferFn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDeferFnUndefined: Self = StObject.set(x, "deferFn", js.undefined)
    
    @scala.inline
    def setDispatcher(
      value: (/* action */ AsyncAction[T], /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], /* props */ AsyncProps[T]) => Unit
    ): Self = StObject.set(x, "dispatcher", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
    
    @scala.inline
    def setInitialValue(value: T): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    @scala.inline
    def setOnReject(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRejectUndefined: Self = StObject.set(x, "onReject", js.undefined)
    
    @scala.inline
    def setOnResolve(value: /* data */ T => Unit): Self = StObject.set(x, "onResolve", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResolveUndefined: Self = StObject.set(x, "onResolve", js.undefined)
    
    @scala.inline
    def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseFn(value: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]): Self = StObject.set(x, "promiseFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPromiseFnUndefined: Self = StObject.set(x, "promiseFn", js.undefined)
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    
    @scala.inline
    def setReducer(
      value: (/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], /* internalReducer */ js.Function2[/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], ReducerAsyncState[T]]) => AsyncState[T, AbstractState[T]]
    ): Self = StObject.set(x, "reducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReducerUndefined: Self = StObject.set(x, "reducer", js.undefined)
    
    @scala.inline
    def setWatch(value: js.Any): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchFn(value: (/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T]) => _): Self = StObject.set(x, "watchFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWatchFnUndefined: Self = StObject.set(x, "watchFn", js.undefined)
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}

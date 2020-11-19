package typingsSlinky.reduxFirstRouter.anon

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.redux.mod.MiddlewareAPI
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.redux.mod.Store
import typingsSlinky.redux.mod.StoreEnhancer
import typingsSlinky.redux.mod.StoreEnhancerStoreCreator
import typingsSlinky.reduxFirstRouter.mod.LocationState
import typingsSlinky.reduxFirstRouter.mod.Nullable
import typingsSlinky.reduxFirstRouter.mod.RouteThunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Enhancer[TKeys, TState] extends js.Object {
  
  def enhancer(next: StoreEnhancerStoreCreator[js.Object, js.Object]): StoreEnhancerStoreCreator[js.Object, js.Object] = js.native
  @JSName("enhancer")
  var enhancer_Original: StoreEnhancer[js.Object, js.Object] = js.native
  
  var initialDispatch: js.UndefOr[js.Function0[Unit]] = js.native
  
  def middleware(api: MiddlewareAPI[Dispatch[AnyAction], _]): js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ _, _]] = js.native
  @JSName("middleware")
  var middleware_Original: Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  def reducer(state: js.UndefOr[scala.Nothing], action: AnyAction): LocationState[TKeys, TState] = js.native
  def reducer(state: LocationState[TKeys, TState], action: AnyAction): LocationState[TKeys, TState] = js.native
  @JSName("reducer")
  var reducer_Original: Reducer[LocationState[TKeys, TState], AnyAction] = js.native
  
  def thunk(store: Store[TState, AnyAction]): js.Promise[Nullable[RouteThunk[TState]]] = js.native
}

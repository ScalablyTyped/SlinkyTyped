package typingsSlinky.reduxDoghouse

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redux.mod.ActionCreator
import typingsSlinky.redux.mod.ActionCreatorsMapObject
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.reduxDoghouse.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-doghouse", "ScopedActionFactory")
  @js.native
  class ScopedActionFactory[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */] protected () extends StObject {
    def this(actionCreator: A) = this()
    
    def scope(id: String): A = js.native
    def scope(id: Double): A = js.native
  }
  
  @JSImport("redux-doghouse", "bindActionCreatorsDeep")
  @js.native
  def bindActionCreatorsDeep[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = js.native
  @JSImport("redux-doghouse", "bindActionCreatorsDeep")
  @js.native
  def bindActionCreatorsDeep_A_ActionCreatorWildcardS_A[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S]): A = js.native
  @JSImport("redux-doghouse", "bindActionCreatorsDeep")
  @js.native
  def bindActionCreatorsDeep_A_UnionActionCreatorWildcardActionCreatorsMapObjectWildcardF_ScopedActionFactoryAS_F[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S]): F = js.native
  
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = js.native
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S], bindFn: FnCall): M = js.native
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories_A_ActionCreatorWildcardS_A[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S]): A = js.native
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories_A_ActionCreatorWildcardS_A[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S], bindFn: FnCall): A = js.native
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories_A_UnionActionCreatorWildcardActionCreatorsMapObjectWildcardF_ScopedActionFactoryAS_F[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S]): F = js.native
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories_A_UnionActionCreatorWildcardActionCreatorsMapObjectWildcardF_ScopedActionFactoryAS_F[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S], bindFn: FnCall): F = js.native
  
  @JSImport("redux-doghouse", "scopeActionCreators")
  @js.native
  def scopeActionCreators[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: String): A = js.native
  @JSImport("redux-doghouse", "scopeActionCreators")
  @js.native
  def scopeActionCreators[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: Double): A = js.native
  
  @JSImport("redux-doghouse", "scopeReducers")
  @js.native
  def scopeReducers(): Reducer[_, AnyAction] = js.native
  @JSImport("redux-doghouse", "scopeReducers")
  @js.native
  def scopeReducers(reducers: StringDictionary[Reducer[_, AnyAction]]): Reducer[_, AnyAction] = js.native
  
  @js.native
  trait ActionFactoriesMap extends /* key */ StringDictionary[ScopedActionFactory[_] | ActionCreator[_] | ActionFactoriesMap]
  object ActionFactoriesMap {
    
    @scala.inline
    def apply(): ActionFactoriesMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFactoriesMap]
    }
  }
}

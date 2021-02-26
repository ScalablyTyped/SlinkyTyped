package typingsSlinky.reduxFirstRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConfirmLeave = js.Function2[
    /* state */ js.Object, 
    /* action */ js.Object, 
    typingsSlinky.reduxFirstRouter.mod.Nullable[java.lang.String]
  ]
  
  type DisplayConfirmLeave = js.Function2[
    /* message */ java.lang.String, 
    /* callback */ js.Function1[/* unblock */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  
  type HistoryAction = java.lang.String
  
  type HistoryEntries = js.Array[typingsSlinky.reduxFirstRouter.anon.Pathname]
  
  type Listener = js.Function2[
    /* location */ typingsSlinky.reduxFirstRouter.mod.HistoryLocation, 
    /* action */ typingsSlinky.reduxFirstRouter.mod.HistoryAction, 
    scala.Unit
  ]
  
  @scala.inline
  def NOT_FOUND: typingsSlinky.reduxFirstRouter.reduxFirstRouterStrings.`@@redux-first-routerSlashNOT_FOUND` = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NOT_FOUND").asInstanceOf[typingsSlinky.reduxFirstRouter.reduxFirstRouterStrings.`@@redux-first-routerSlashNOT_FOUND`]
  
  type Navigators[TState] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reduxFirstRouter.mod.Navigator[TState]]
  
  type Nullable[T] = js.UndefOr[T | scala.Null]
  
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Query = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  
  type Route[TKeys, TState] = typingsSlinky.reduxFirstRouter.mod.RouteString | (typingsSlinky.reduxFirstRouter.mod.RouteObject[TKeys, TState])
  
  type RouteObject[TKeys, TState] = TKeys with typingsSlinky.reduxFirstRouter.anon.CapitalizedWords[TState]
  
  type RouteString = java.lang.String
  
  type RouteThunk[TState] = js.Function2[
    /* dispatch */ typingsSlinky.redux.mod.Dispatch[js.Any], 
    /* getState */ typingsSlinky.reduxFirstRouter.mod.StateGetter[TState], 
    js.Any | js.Promise[js.Any]
  ]
  
  type RoutesMap[TKeys, TState] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reduxFirstRouter.mod.Route[TKeys, TState]]
  
  type ScrollBehavior_ = js.Object
  
  type ScrollUpdater = js.Function1[/* performedByUser */ scala.Boolean, scala.Unit]
  
  type SelectLocationState_[TKeys, TState] = js.Function1[
    /* state */ TState, 
    typingsSlinky.reduxFirstRouter.mod.LocationState[TKeys, TState]
  ]
  
  type SelectTitleState[TState] = js.Function1[/* state */ TState, java.lang.String]
  
  type StateGetter[TState] = js.Function0[TState]
  
  @scala.inline
  def actionToPath[TKeys, TState](
    action: typingsSlinky.reduxFirstRouter.mod.ReceivedAction,
    routesMap: typingsSlinky.reduxFirstRouter.mod.RoutesMap[TKeys, TState]
  ): java.lang.String = (typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("actionToPath")(action.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def actionToPath[TKeys, TState](
    action: typingsSlinky.reduxFirstRouter.mod.ReceivedAction,
    routesMap: typingsSlinky.reduxFirstRouter.mod.RoutesMap[TKeys, TState],
    querySerializer: typingsSlinky.reduxFirstRouter.mod.QuerySerializer
  ): java.lang.String = (typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("actionToPath")(action.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any], querySerializer.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def back(): scala.Unit = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def canGo(n: scala.Double): scala.Boolean = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canGo")(n.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def canGoBack(): scala.Boolean = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canGoBack")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def canGoForward(): scala.Boolean = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canGoForward")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def connectRoutes[TKeys, TState](routesMap: typingsSlinky.reduxFirstRouter.mod.RoutesMap[TKeys, TState]): typingsSlinky.reduxFirstRouter.anon.Enhancer[TKeys, TState] = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectRoutes")(routesMap.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxFirstRouter.anon.Enhancer[TKeys, TState]]
  @scala.inline
  def connectRoutes[TKeys, TState](
    routesMap: typingsSlinky.reduxFirstRouter.mod.RoutesMap[TKeys, TState],
    options: typingsSlinky.reduxFirstRouter.mod.Options[TKeys, TState]
  ): typingsSlinky.reduxFirstRouter.anon.Enhancer[TKeys, TState] = (typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectRoutes")(routesMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reduxFirstRouter.anon.Enhancer[TKeys, TState]]
  
  @scala.inline
  def go(n: scala.Double): scala.Unit = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("go")(n.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def history(): typingsSlinky.history.mod.History[typingsSlinky.history.mod.LocationState] = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("history")().asInstanceOf[typingsSlinky.history.mod.History[typingsSlinky.history.mod.LocationState]]
  
  @scala.inline
  def isLocationAction(action: js.Any): scala.Boolean = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isLocationAction")(action.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def next(): scala.Unit = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def nextPath(): java.lang.String | scala.Unit = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nextPath")().asInstanceOf[java.lang.String | scala.Unit]
  
  @scala.inline
  def pathToAction[TKeys, TState](pathname: java.lang.String, routesMap: typingsSlinky.reduxFirstRouter.mod.RoutesMap[TKeys, TState]): typingsSlinky.reduxFirstRouter.mod.ReceivedAction = (typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathToAction")(pathname.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reduxFirstRouter.mod.ReceivedAction]
  @scala.inline
  def pathToAction[TKeys, TState](
    pathname: java.lang.String,
    routesMap: typingsSlinky.reduxFirstRouter.mod.RoutesMap[TKeys, TState],
    querySerializer: typingsSlinky.reduxFirstRouter.mod.QuerySerializer
  ): typingsSlinky.reduxFirstRouter.mod.ReceivedAction = (typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathToAction")(pathname.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any], querySerializer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reduxFirstRouter.mod.ReceivedAction]
  
  @scala.inline
  def prevPath(): java.lang.String | scala.Unit = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prevPath")().asInstanceOf[java.lang.String | scala.Unit]
  
  @scala.inline
  def push(pathname: java.lang.String): scala.Unit = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("push")(pathname.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def redirect(action: typingsSlinky.reduxFirstRouter.mod.Action): typingsSlinky.reduxFirstRouter.mod.Action = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(action.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxFirstRouter.mod.Action]
  
  @scala.inline
  def replace(pathname: java.lang.String): scala.Unit = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replace")(pathname.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def scrollBehavior(): typingsSlinky.reduxFirstRouter.mod.ScrollBehavior_ | scala.Unit = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("scrollBehavior")().asInstanceOf[typingsSlinky.reduxFirstRouter.mod.ScrollBehavior_ | scala.Unit]
  
  @scala.inline
  def selectLocationState[TState](state: TState): typingsSlinky.reduxFirstRouter.mod.LocationState[js.Object, _] = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("selectLocationState")(state.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reduxFirstRouter.mod.LocationState[js.Object, _]]
  
  @scala.inline
  def setKind(action: typingsSlinky.reduxFirstRouter.mod.Action, kind: java.lang.String): typingsSlinky.reduxFirstRouter.mod.Action = (typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setKind")(action.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reduxFirstRouter.mod.Action]
  
  @scala.inline
  def updateScroll(): scala.Unit = typingsSlinky.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateScroll")().asInstanceOf[scala.Unit]
}

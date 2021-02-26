package typingsSlinky.reactNavigationRouters

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNavigationRouters.anon.KeyName
import typingsSlinky.reactNavigationRouters.anon.KeyState
import typingsSlinky.reactNavigationRouters.anon.ParamsReadonly
import typingsSlinky.reactNavigationRouters.anon.Routes
import typingsSlinky.reactNavigationRouters.anon.State
import typingsSlinky.reactNavigationRouters.anon.`1`
import typingsSlinky.reactNavigationRouters.anon.`2`
import typingsSlinky.reactNavigationRouters.commonActionsMod.Action
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.key
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.routes
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.stale
import typingsSlinky.std.Extract
import typingsSlinky.std.Omit
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ActionCreators[Action /* <: NavigationAction */] = StringDictionary[js.Function1[/* args */ js.Any, Action]]
  
  type CommonNavigationAction = Action
  
  @js.native
  trait DefaultRouterOptions[RouteName /* <: String */] extends StObject {
    
    /**
      * Name of the route to focus by on initial render.
      * If not specified, usually the first route is used.
      */
    var initialRouteName: js.UndefOr[RouteName] = js.native
  }
  object DefaultRouterOptions {
    
    @scala.inline
    def apply[RouteName /* <: String */](): DefaultRouterOptions[RouteName] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRouterOptions[RouteName]]
    }
    
    @scala.inline
    implicit class DefaultRouterOptionsMutableBuilder[Self <: DefaultRouterOptions[_], RouteName /* <: String */] (val x: Self with DefaultRouterOptions[RouteName]) extends AnyVal {
      
      @scala.inline
      def setInitialRouteName(value: RouteName): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.Partial<std.Omit<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>, 'stale' | 'routes'>> & {  routes :std.Array<std.Omit<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.Route<string, object | undefined>, 'key'> & {  state :@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.InitialState | undefined}>}> */
  @js.native
  trait InitialState extends StObject {
    
    val history: js.UndefOr[js.Array[_]] = js.native
    
    val index: js.UndefOr[Double] = js.native
    
    val key: js.UndefOr[String] = js.native
    
    val routeNames: js.UndefOr[
        js.Array[
          Extract[
            /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
            String
          ]
        ]
      ] = js.native
    
    val routes: js.Array[
        (Omit[
          Route[String, js.UndefOr[js.Object]], 
          typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.key
        ]) with `1`
      ] = js.native
    
    val `type`: js.UndefOr[String] = js.native
  }
  object InitialState {
    
    @scala.inline
    def apply(routes: js.Array[(Omit[Route[String, js.UndefOr[js.Object]], key]) with `1`]): InitialState = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialState]
    }
    
    @scala.inline
    implicit class InitialStateMutableBuilder[Self <: InitialState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHistory(value: js.Array[_]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setRouteNames(
        value: js.Array[
              Extract[
                /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
                String
              ]
            ]
      ): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteNamesUndefined: Self = StObject.set(x, "routeNames", js.undefined)
      
      @scala.inline
      def setRouteNamesVarargs(
        value: (Extract[
              /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
              String
            ])*
      ): Self = StObject.set(x, "routeNames", js.Array(value :_*))
      
      @scala.inline
      def setRoutes(value: js.Array[(Omit[Route[String, js.UndefOr[js.Object]], key]) with `1`]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: ((Omit[Route[String, js.UndefOr[js.Object]], key]) with `1`)*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  type :string,   payload :object | undefined,   source :string | undefined,   target :string | undefined}> */
  @js.native
  trait NavigationAction extends StObject {
    
    val payload: js.UndefOr[js.Object] = js.native
    
    val source: js.UndefOr[String] = js.native
    
    val target: js.UndefOr[String] = js.native
    
    val `type`: String = js.native
  }
  object NavigationAction {
    
    @scala.inline
    def apply(`type`: String): NavigationAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationAction]
    }
    
    @scala.inline
    implicit class NavigationActionMutableBuilder[Self <: NavigationAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type NavigationRoute[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] = (Route[
    Extract[RouteName, String], 
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ]) with State
  
  /* Inlined std.Readonly<{  key :string,   index :number,   routeNames :std.Array<std.Extract<keyof ParamList, string>>,   history :std.Array<unknown> | undefined,   routes :std.Array<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationRoute<ParamList, keyof ParamList>>,   type :string,   stale :false}> */
  @js.native
  trait NavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    val history: js.UndefOr[js.Array[_]] = js.native
    
    val index: Double = js.native
    
    val key: String = js.native
    
    val routeNames: js.Array[Extract[/* keyof ParamList */ String, String]] = js.native
    
    val routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]] = js.native
    
    val stale: `false` = js.native
    
    val `type`: String = js.native
  }
  object NavigationState {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
      stale: `false`,
      `type`: String
    ): NavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationState[ParamList]]
    }
    
    @scala.inline
    implicit class NavigationStateMutableBuilder[Self <: NavigationState[_], ParamList /* <: ParamListBase */] (val x: Self with NavigationState[ParamList]) extends AnyVal {
      
      @scala.inline
      def setHistory(value: js.Array[_]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteNames(value: js.Array[Extract[/* keyof ParamList */ String, String]]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteNamesVarargs(value: (Extract[/* keyof ParamList */ String, String])*): Self = StObject.set(x, "routeNames", js.Array(value :_*))
      
      @scala.inline
      def setRoutes(value: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: (NavigationRoute[ParamList, /* keyof ParamList */ String])*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ParamListBase = Record[String, js.UndefOr[js.Object]]
  
  type PartialRoute[R /* <: Route[String, js.UndefOr[js.Object]] */] = (Omit[R, key]) with KeyState
  
  type PartialState[State /* <: NavigationState[ParamListBase] */] = (Partial[Omit[State, stale | routes]]) with Routes[State]
  
  type Route[RouteName /* <: String */, Params /* <: js.UndefOr[js.Object] */] = KeyName[RouteName] with (ParamsReadonly[Params] | `2`[Params])
  
  @js.native
  trait Router[State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */] extends StObject {
    
    /**
      * Action creators for the router.
      */
    var actionCreators: js.UndefOr[ActionCreators[Action]] = js.native
    
    /**
      * Initialize the navigation state.
      *
      * @param options.routeNames List of valid route names as defined in the screen components.
      * @param options.routeParamsList Object containing params for each route.
      */
    def getInitialState(options: RouterConfigOptions): State = js.native
    
    def getRehydratedState(partialState: State, options: RouterConfigOptions): State = js.native
    /**
      * Rehydrate the full navigation state from a given partial state.
      *
      * @param partialState Navigation state to rehydrate from.
      * @param options.routeNames List of valid route names as defined in the screen components.
      * @param options.routeParamsList Object containing params for each route.
      */
    def getRehydratedState(partialState: PartialState[State], options: RouterConfigOptions): State = js.native
    
    /**
      * Take the current state and action, and return a new state.
      * If the action cannot be handled, return `null`.
      *
      * @param state State object to apply the action on.
      * @param action Action object to apply.
      * @param options.routeNames List of valid route names as defined in the screen components.
      * @param options.routeParamsList Object containing params for each route.
      */
    def getStateForAction(state: State, action: Action, options: RouterConfigOptions): State | PartialState[State] | Null = js.native
    
    /**
      * Take the current state and key of a route, and return a new state with the route focused
      *
      * @param state State object to apply the action on.
      * @param key Key of the route to focus.
      */
    def getStateForRouteFocus(state: State, key: String): State = js.native
    
    /**
      * Take the current state and updated list of route names, and return a new state.
      *
      * @param state State object to update.
      * @param options.routeNames New list of route names.
      * @param options.routeParamsList Object containing params for each route.
      */
    def getStateForRouteNamesChange(state: State, options: RouterConfigOptions): State = js.native
    
    /**
      * Whether the action should also change focus in parent navigator
      *
      * @param action Action object to check.
      */
    def shouldActionChangeFocus(action: NavigationAction): Boolean = js.native
    
    /**
      * Type of the router. Should match the `type` property in state.
      * If the type doesn't match, the state will be discarded during rehydration.
      */
    var `type`: /* import warning: importer.ImportType#apply Failed type conversion: State['type'] */ js.Any = js.native
  }
  
  @js.native
  trait RouterConfigOptions extends StObject {
    
    var routeNames: js.Array[String] = js.native
    
    var routeParamList: ParamListBase = js.native
  }
  object RouterConfigOptions {
    
    @scala.inline
    def apply(routeNames: js.Array[String], routeParamList: ParamListBase): RouterConfigOptions = {
      val __obj = js.Dynamic.literal(routeNames = routeNames.asInstanceOf[js.Any], routeParamList = routeParamList.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterConfigOptions]
    }
    
    @scala.inline
    implicit class RouterConfigOptionsMutableBuilder[Self <: RouterConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRouteNames(value: js.Array[String]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteNamesVarargs(value: String*): Self = StObject.set(x, "routeNames", js.Array(value :_*))
      
      @scala.inline
      def setRouteParamList(value: ParamListBase): Self = StObject.set(x, "routeParamList", value.asInstanceOf[js.Any])
    }
  }
  
  type RouterFactory[State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */, RouterOptions /* <: DefaultRouterOptions[String] */] = js.Function1[/* options */ RouterOptions, Router[State, Action]]
}

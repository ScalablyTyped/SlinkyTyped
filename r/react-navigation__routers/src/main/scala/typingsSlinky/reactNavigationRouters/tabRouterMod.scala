package typingsSlinky.reactNavigationRouters

import typingsSlinky.reactNavigationRouters.anon.KeyType
import typingsSlinky.reactNavigationRouters.anon.NameParams
import typingsSlinky.reactNavigationRouters.anon.Payload
import typingsSlinky.reactNavigationRouters.anon.PayloadSourceTargetType
import typingsSlinky.reactNavigationRouters.anon.Source
import typingsSlinky.reactNavigationRouters.anon.Type
import typingsSlinky.reactNavigationRouters.drawerRouterMod.DrawerActionType
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.JUMP_TO
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.tab
import typingsSlinky.reactNavigationRouters.typesMod.NavigationRoute
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.reactNavigationRouters.typesMod.Router
import typingsSlinky.std.Extract
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabRouterMod {
  
  @JSImport("@react-navigation/routers/lib/typescript/src/TabRouter", JSImport.Default)
  @js.native
  def default(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | TabActionType
  ] = js.native
  
  object TabActions {
    
    @JSImport("@react-navigation/routers/lib/typescript/src/TabRouter", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("@react-navigation/routers/lib/typescript/src/TabRouter", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.initialRoute
    - typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.order
    - typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.history
    - typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.none
  */
  trait BackBehavior extends StObject
  object BackBehavior {
    
    @scala.inline
    def history: typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.history = "history".asInstanceOf[typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.history]
    
    @scala.inline
    def initialRoute: typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.initialRoute = "initialRoute".asInstanceOf[typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.initialRoute]
    
    @scala.inline
    def none: typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.none = "none".asInstanceOf[typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.none]
    
    @scala.inline
    def order: typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.order = "order".asInstanceOf[typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.order]
  }
  
  @js.native
  trait TabActionHelpers[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Jump to an existing tab.
      *
      * @param name Name of the route for the tab.
      * @param [params] Params object for the route.
      */
    def jumpTo[RouteName /* <: Extract[/* keyof ParamList */ String, String] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
          RouteName, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[RouteName]
    ): Unit = js.native
  }
  object TabActionHelpers {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      jumpTo: (js.Tuple2[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[js.Any] => Unit
    ): TabActionHelpers[ParamList] = {
      val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo))
      __obj.asInstanceOf[TabActionHelpers[ParamList]]
    }
    
    @scala.inline
    implicit class TabActionHelpersMutableBuilder[Self <: TabActionHelpers[_], ParamList /* <: ParamListBase */] (val x: Self with TabActionHelpers[ParamList]) extends AnyVal {
      
      @scala.inline
      def setJumpTo(
        value: (js.Tuple2[
              js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
            ]) | js.Array[js.Any] => Unit
      ): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TabActionType extends DrawerActionType {
    
    var payload: NameParams = js.native
    
    var source: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var `type`: JUMP_TO = js.native
  }
  object TabActionType {
    
    @scala.inline
    def apply(payload: NameParams, `type`: JUMP_TO): TabActionType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabActionType]
    }
    
    @scala.inline
    implicit class TabActionTypeMutableBuilder[Self <: TabActionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: NameParams): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: JUMP_TO): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<ParamList>, 'history'> & {  type :'tab',   history :std.Array<{  type :'route',   key :string}>} */
  @js.native
  trait TabNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * List of previously visited route keys.
      */
    var history: js.Array[KeyType] = js.native
    
    var index: Double = js.native
    
    var key: String = js.native
    
    var routeNames: js.Array[Extract[/* keyof ParamList */ String, String]] = js.native
    
    var routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]] = js.native
    
    var stale: `false` = js.native
    
    /**
      * Type of the router, in this case, it's tab.
      */
    var `type`: String with tab = js.native
  }
  object TabNavigationState {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      history: js.Array[KeyType],
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
      stale: `false`,
      `type`: String with tab
    ): TabNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabNavigationState[ParamList]]
    }
    
    @scala.inline
    implicit class TabNavigationStateMutableBuilder[Self <: TabNavigationState[_], ParamList /* <: ParamListBase */] (val x: Self with TabNavigationState[ParamList]) extends AnyVal {
      
      @scala.inline
      def setHistory(value: js.Array[KeyType]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryVarargs(value: KeyType*): Self = StObject.set(x, "history", js.Array(value :_*))
      
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
      def setType(value: String with tab): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.DefaultRouterOptions<string> & {  backBehavior :@react-navigation/routers.@react-navigation/routers/lib/typescript/src/TabRouter.BackBehavior | undefined} */
  @js.native
  trait TabRouterOptions extends StObject {
    
    var backBehavior: js.UndefOr[BackBehavior] = js.native
    
    /**
      * Name of the route to focus by on initial render.
      * If not specified, usually the first route is used.
      */
    var initialRouteName: js.UndefOr[String] = js.native
  }
  object TabRouterOptions {
    
    @scala.inline
    def apply(): TabRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabRouterOptions]
    }
    
    @scala.inline
    implicit class TabRouterOptionsMutableBuilder[Self <: TabRouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackBehavior(value: BackBehavior): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
      
      @scala.inline
      def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    }
  }
}

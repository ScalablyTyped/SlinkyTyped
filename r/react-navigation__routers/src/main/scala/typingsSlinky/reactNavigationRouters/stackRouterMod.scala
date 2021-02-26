package typingsSlinky.reactNavigationRouters

import typingsSlinky.reactNavigationRouters.anon.Count
import typingsSlinky.reactNavigationRouters.anon.Name
import typingsSlinky.reactNavigationRouters.anon.Payload
import typingsSlinky.reactNavigationRouters.anon.PayloadSource
import typingsSlinky.reactNavigationRouters.anon.PayloadSourceTarget
import typingsSlinky.reactNavigationRouters.anon.PayloadSourceTargetType
import typingsSlinky.reactNavigationRouters.anon.Source
import typingsSlinky.reactNavigationRouters.anon.SourceTargetType
import typingsSlinky.reactNavigationRouters.anon.TargetType
import typingsSlinky.reactNavigationRouters.anon.Type
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.POP
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.POP_TO_TOP
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.PUSH
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.REPLACE
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.stack
import typingsSlinky.reactNavigationRouters.typesMod.DefaultRouterOptions
import typingsSlinky.reactNavigationRouters.typesMod.NavigationRoute
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.reactNavigationRouters.typesMod.Router
import typingsSlinky.std.Extract
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackRouterMod {
  
  @JSImport("@react-navigation/routers/lib/typescript/src/StackRouter", JSImport.Default)
  @js.native
  def default(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | PayloadSource | TargetType | PayloadSourceTarget | SourceTargetType
  ] = js.native
  
  object StackActions {
    
    @JSImport("@react-navigation/routers/lib/typescript/src/StackRouter", "StackActions.pop")
    @js.native
    def pop(): StackActionType = js.native
    @JSImport("@react-navigation/routers/lib/typescript/src/StackRouter", "StackActions.pop")
    @js.native
    def pop(count: Double): StackActionType = js.native
    
    @JSImport("@react-navigation/routers/lib/typescript/src/StackRouter", "StackActions.popToTop")
    @js.native
    def popToTop(): StackActionType = js.native
    
    @JSImport("@react-navigation/routers/lib/typescript/src/StackRouter", "StackActions.push")
    @js.native
    def push(name: String): StackActionType = js.native
    @JSImport("@react-navigation/routers/lib/typescript/src/StackRouter", "StackActions.push")
    @js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    @JSImport("@react-navigation/routers/lib/typescript/src/StackRouter", "StackActions.replace")
    @js.native
    def replace(name: String): StackActionType = js.native
    @JSImport("@react-navigation/routers/lib/typescript/src/StackRouter", "StackActions.replace")
    @js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @js.native
  trait StackActionHelpers[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Pop a screen from the stack.
      */
    def pop(): Unit = js.native
    def pop(count: Double): Unit = js.native
    
    /**
      * Pop to the first route in the stack, dismissing all other screens.
      */
    def popToTop(): Unit = js.native
    
    /**
      * Push a new screen onto the stack.
      *
      * @param name Name of the route for the tab.
      * @param [params] Params object for the route.
      */
    def push[RouteName /* <: /* keyof ParamList */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
          RouteName, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[RouteName]
    ): Unit = js.native
    
    /**
      * Replace the current route with a new one.
      *
      * @param name Route name of the new route.
      * @param [params] Params object for the new route.
      */
    def replace[RouteName /* <: /* keyof ParamList */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
          RouteName, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[RouteName]
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNavigationRouters.anon.PayloadSource
    - typingsSlinky.reactNavigationRouters.anon.TargetType
    - typingsSlinky.reactNavigationRouters.anon.PayloadSourceTarget
    - typingsSlinky.reactNavigationRouters.anon.SourceTargetType
  */
  trait StackActionType extends StObject
  object StackActionType {
    
    @scala.inline
    def PayloadSource(payload: Name, `type`: REPLACE): typingsSlinky.reactNavigationRouters.anon.PayloadSource = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactNavigationRouters.anon.PayloadSource]
    }
    
    @scala.inline
    def PayloadSourceTarget(payload: Count, `type`: POP): typingsSlinky.reactNavigationRouters.anon.PayloadSourceTarget = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactNavigationRouters.anon.PayloadSourceTarget]
    }
    
    @scala.inline
    def SourceTargetType(`type`: POP_TO_TOP): typingsSlinky.reactNavigationRouters.anon.SourceTargetType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactNavigationRouters.anon.SourceTargetType]
    }
    
    @scala.inline
    def TargetType(payload: Name, `type`: PUSH): typingsSlinky.reactNavigationRouters.anon.TargetType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactNavigationRouters.anon.TargetType]
    }
  }
  
  /* Inlined @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<ParamList> & {  type :'stack'} */
  @js.native
  trait StackNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    val history: js.UndefOr[js.Array[_]] = js.native
    
    val index: Double = js.native
    
    val key: String = js.native
    
    val routeNames: js.Array[Extract[/* keyof ParamList */ String, String]] = js.native
    
    val routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]] = js.native
    
    val stale: `false` = js.native
    
    /**
      * Type of the router, in this case, it's stack.
      */
    val `type`: String with stack = js.native
  }
  object StackNavigationState {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
      stale: `false`,
      `type`: String with stack
    ): StackNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackNavigationState[ParamList]]
    }
    
    @scala.inline
    implicit class StackNavigationStateMutableBuilder[Self <: StackNavigationState[_], ParamList /* <: ParamListBase */] (val x: Self with StackNavigationState[ParamList]) extends AnyVal {
      
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
      def setType(value: String with stack): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type StackRouterOptions = DefaultRouterOptions[String]
}

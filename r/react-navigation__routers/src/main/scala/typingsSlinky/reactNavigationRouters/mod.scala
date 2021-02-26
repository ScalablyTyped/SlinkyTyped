package typingsSlinky.reactNavigationRouters

import typingsSlinky.reactNavigationRouters.anon.KeyParams
import typingsSlinky.reactNavigationRouters.anon.Name
import typingsSlinky.reactNavigationRouters.anon.Payload
import typingsSlinky.reactNavigationRouters.anon.PayloadSource
import typingsSlinky.reactNavigationRouters.anon.PayloadSourceTarget
import typingsSlinky.reactNavigationRouters.anon.PayloadSourceTargetType
import typingsSlinky.reactNavigationRouters.anon.Readonlykeystringindexnum
import typingsSlinky.reactNavigationRouters.anon.Source
import typingsSlinky.reactNavigationRouters.anon.SourceTargetType
import typingsSlinky.reactNavigationRouters.anon.TargetType
import typingsSlinky.reactNavigationRouters.anon.Type
import typingsSlinky.reactNavigationRouters.commonActionsMod.Action
import typingsSlinky.reactNavigationRouters.commonActionsMod.ResetState
import typingsSlinky.reactNavigationRouters.drawerRouterMod.DrawerActionType
import typingsSlinky.reactNavigationRouters.drawerRouterMod.DrawerNavigationState
import typingsSlinky.reactNavigationRouters.drawerRouterMod.DrawerRouterOptions
import typingsSlinky.reactNavigationRouters.stackRouterMod.StackActionType
import typingsSlinky.reactNavigationRouters.stackRouterMod.StackNavigationState
import typingsSlinky.reactNavigationRouters.stackRouterMod.StackRouterOptions
import typingsSlinky.reactNavigationRouters.tabRouterMod.TabActionType
import typingsSlinky.reactNavigationRouters.tabRouterMod.TabNavigationState
import typingsSlinky.reactNavigationRouters.tabRouterMod.TabRouterOptions
import typingsSlinky.reactNavigationRouters.typesMod.CommonNavigationAction
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.reactNavigationRouters.typesMod.PartialState
import typingsSlinky.reactNavigationRouters.typesMod.Router
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object BaseRouter {
    
    @JSImport("@react-navigation/routers", "BaseRouter.getStateForAction")
    @js.native
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = js.native
    
    @JSImport("@react-navigation/routers", "BaseRouter.shouldActionChangeFocus")
    @js.native
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = js.native
  }
  
  object CommonActions {
    
    @JSImport("@react-navigation/routers", "CommonActions.goBack")
    @js.native
    def goBack(): Action = js.native
    
    @JSImport("@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(name: String): Action = js.native
    @JSImport("@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(name: String, params: js.Object): Action = js.native
    @JSImport("@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(route: KeyParams): Action = js.native
    @JSImport("@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(route: Name): Action = js.native
    
    @JSImport("@react-navigation/routers", "CommonActions.reset")
    @js.native
    def reset(): Action = js.native
    @JSImport("@react-navigation/routers", "CommonActions.reset")
    @js.native
    def reset(state: ResetState): Action = js.native
    
    @JSImport("@react-navigation/routers", "CommonActions.setParams")
    @js.native
    def setParams(params: js.Object): Action = js.native
  }
  
  object DrawerActions {
    
    @JSImport("@react-navigation/routers", "DrawerActions.closeDrawer")
    @js.native
    def closeDrawer(): DrawerActionType = js.native
    
    @JSImport("@react-navigation/routers", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("@react-navigation/routers", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    @JSImport("@react-navigation/routers", "DrawerActions.openDrawer")
    @js.native
    def openDrawer(): DrawerActionType = js.native
    
    @JSImport("@react-navigation/routers", "DrawerActions.toggleDrawer")
    @js.native
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  @JSImport("@react-navigation/routers", "DrawerRouter")
  @js.native
  def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
  object StackActions {
    
    @JSImport("@react-navigation/routers", "StackActions.pop")
    @js.native
    def pop(): StackActionType = js.native
    @JSImport("@react-navigation/routers", "StackActions.pop")
    @js.native
    def pop(count: Double): StackActionType = js.native
    
    @JSImport("@react-navigation/routers", "StackActions.popToTop")
    @js.native
    def popToTop(): StackActionType = js.native
    
    @JSImport("@react-navigation/routers", "StackActions.push")
    @js.native
    def push(name: String): StackActionType = js.native
    @JSImport("@react-navigation/routers", "StackActions.push")
    @js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    @JSImport("@react-navigation/routers", "StackActions.replace")
    @js.native
    def replace(name: String): StackActionType = js.native
    @JSImport("@react-navigation/routers", "StackActions.replace")
    @js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @JSImport("@react-navigation/routers", "StackRouter")
  @js.native
  def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | PayloadSource | TargetType | PayloadSourceTarget | SourceTargetType
  ] = js.native
  
  object TabActions {
    
    @JSImport("@react-navigation/routers", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("@react-navigation/routers", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
  
  @JSImport("@react-navigation/routers", "TabRouter")
  @js.native
  def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | TabActionType
  ] = js.native
}

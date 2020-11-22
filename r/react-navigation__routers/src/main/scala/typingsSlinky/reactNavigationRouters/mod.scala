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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/routers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
  def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | PayloadSource | TargetType | PayloadSourceTarget | SourceTargetType
  ] = js.native
  
  def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | TabActionType
  ] = js.native
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  @js.native
  object BaseRouter extends js.Object {
    
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = js.native
    
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = js.native
  }
  
  @js.native
  object CommonActions extends js.Object {
    
    def goBack(): Action = js.native
    
    def navigate(name: String): Action = js.native
    def navigate(name: String, params: js.Object): Action = js.native
    def navigate(route: KeyParams): Action = js.native
    def navigate(route: Name): Action = js.native
    
    def reset(): Action = js.native
    def reset(state: ResetState): Action = js.native
    
    def setParams(params: js.Object): Action = js.native
  }
  
  @js.native
  object DrawerActions extends js.Object {
    
    def closeDrawer(): DrawerActionType = js.native
    
    def jumpTo(name: String): TabActionType = js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    def openDrawer(): DrawerActionType = js.native
    
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  @js.native
  object StackActions extends js.Object {
    
    def pop(): StackActionType = js.native
    def pop(count: Double): StackActionType = js.native
    
    def popToTop(): StackActionType = js.native
    
    def push(name: String): StackActionType = js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    def replace(name: String): StackActionType = js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @js.native
  object TabActions extends js.Object {
    
    def jumpTo(name: String): TabActionType = js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
}

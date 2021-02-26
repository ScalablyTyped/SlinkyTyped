package typingsSlinky.ionicReact

import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicReact.routeActionMod.RouteAction
import typingsSlinky.ionicReact.routeInfoMod.RouteInfo
import typingsSlinky.ionicReact.routerDirectionMod.RouterDirection
import typingsSlinky.ionicReact.routerOptionsMod.RouterOptions
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionRouterContextMod {
  
  @JSImport("@ionic/react/dist/types/components/IonRouterContext", "IonRouterContext")
  @js.native
  val IonRouterContext: Context[IonRouterContextState] = js.native
  
  @JSImport("@ionic/react/dist/types/components/IonRouterContext", "useIonRouter")
  @js.native
  def useIonRouter(): IonRouterContextState = js.native
  
  @js.native
  trait IonRouterContextState extends StObject {
    
    def back(): Unit = js.native
    def back(animationBuilder: AnimationBuilder): Unit = js.native
    
    def canGoBack(): Boolean = js.native
    
    def push(pathname: String): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: RouterOptions,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(pathname: String, routerDirection: js.UndefOr[scala.Nothing], routeAction: RouteAction): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: RouteAction,
      routerOptions: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: RouteAction,
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: RouteAction,
      routerOptions: RouterOptions,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(pathname: String, routerDirection: RouterDirection): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: RouterOptions,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(pathname: String, routerDirection: RouterDirection, routeAction: RouteAction): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: RouterOptions,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    
    var routeInfo: RouteInfo[_] = js.native
  }
}

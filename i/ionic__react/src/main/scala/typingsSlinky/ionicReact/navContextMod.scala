package typingsSlinky.ionicReact

import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import typingsSlinky.ionicReact.ionicReactStrings.none
import typingsSlinky.ionicReact.ionicReactStrings.pop
import typingsSlinky.ionicReact.ionicReactStrings.push
import typingsSlinky.ionicReact.ionicReactStrings.replace
import typingsSlinky.ionicReact.routeInfoMod.RouteInfo
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/contexts/NavContext", JSImport.Namespace)
@js.native
object navContextMod extends js.Object {
  
  val NavContext: Context[NavContextState] = js.native
  
  @js.native
  trait NavContextState extends js.Object {
    
    def changeTab(tab: String, path: String): Unit = js.native
    def changeTab(tab: String, path: String, routeOptions: js.Any): Unit = js.native
    
    def getIonRedirect(): js.Any = js.native
    
    def getIonRoute(): js.Any = js.native
    
    def getPageManager(): js.Any = js.native
    
    def getStackManager(): js.Any = js.native
    
    def goBack(): Unit = js.native
    def goBack(route: js.UndefOr[scala.Nothing], animationBuilder: AnimationBuilder): Unit = js.native
    def goBack(route: String): Unit = js.native
    def goBack(route: String, animationBuilder: AnimationBuilder): Unit = js.native
    def goBack(route: RouteInfo[_]): Unit = js.native
    def goBack(route: RouteInfo[_], animationBuilder: AnimationBuilder): Unit = js.native
    
    def hasIonicRouter(): Boolean = js.native
    
    def navigate(
      path: String,
      direction: js.UndefOr[RouterDirection | none],
      ionRouteAction: js.UndefOr[push | replace | pop],
      animationBuilder: js.UndefOr[AnimationBuilder],
      options: js.UndefOr[js.Any],
      tab: js.UndefOr[String]
    ): Unit = js.native
    
    def resetTab(tab: String, originalHref: String): Unit = js.native
    def resetTab(tab: String, originalHref: String, originalRouteOptions: js.Any): Unit = js.native
    
    var routeInfo: js.UndefOr[RouteInfo[_]] = js.native
    
    def setCurrentTab(tab: String, routeInfo: RouteInfo[_]): Unit = js.native
  }
}

package typingsSlinky.ionicReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.ionicReact.routeInfoMod.RouteInfo
import typingsSlinky.ionicReact.viewItemMod.ViewItem
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeManagerContextMod {
  
  @JSImport("@ionic/react/dist/types/routing/RouteManagerContext", "RouteManagerContext")
  @js.native
  val RouteManagerContext: Context[RouteManagerContextState] = js.native
  
  @js.native
  trait RouteManagerContextState extends StObject {
    
    def addViewItem(viewItem: ViewItem[_]): Unit = js.native
    
    def canGoBack(): Boolean = js.native
    
    def clearOutlet(outletId: String): Unit = js.native
    
    def createViewItem(outletId: String, reactElement: ReactElement, routeInfo: RouteInfo[_]): ViewItem[_] = js.native
    def createViewItem(outletId: String, reactElement: ReactElement, routeInfo: RouteInfo[_], page: HTMLElement): ViewItem[_] = js.native
    
    def findLeavingViewItemByRouteInfo(routeInfo: RouteInfo[_]): js.UndefOr[ViewItem[_]] = js.native
    def findLeavingViewItemByRouteInfo(routeInfo: RouteInfo[_], outletId: String): js.UndefOr[ViewItem[_]] = js.native
    
    def findViewItemByPathname(pathname: String): js.UndefOr[ViewItem[_]] = js.native
    def findViewItemByPathname(pathname: String, outletId: String): js.UndefOr[ViewItem[_]] = js.native
    
    def findViewItemByRouteInfo(routeInfo: RouteInfo[_]): js.UndefOr[ViewItem[_]] = js.native
    def findViewItemByRouteInfo(routeInfo: RouteInfo[_], outletId: String): js.UndefOr[ViewItem[_]] = js.native
    
    def getChildrenToRender(
      outletId: String,
      ionRouterOutlet: ReactElement,
      routeInfo: RouteInfo[_],
      reRender: js.Function0[Unit]
    ): js.Array[ReactElement] = js.native
    
    def goBack(): Unit = js.native
    
    def unMountViewItem(viewItem: ViewItem[_]): Unit = js.native
  }
}

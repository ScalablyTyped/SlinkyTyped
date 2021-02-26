package typingsSlinky.ionicReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.ionicReact.routeInfoMod.RouteInfo
import typingsSlinky.ionicReact.viewItemMod.ViewItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewStacksMod {
  
  @JSImport("@ionic/react/dist/types/routing/ViewStacks", "ViewStacks")
  @js.native
  abstract class ViewStacks () extends StObject {
    
    def add(viewItem: ViewItem[_]): Unit = js.native
    
    def clear(outletId: String): Unit = js.native
    
    def createViewItem(outletId: String, reactElement: ReactElement, routeInfo: RouteInfo[_]): ViewItem[_] = js.native
    def createViewItem(outletId: String, reactElement: ReactElement, routeInfo: RouteInfo[_], page: HTMLElement): ViewItem[_] = js.native
    
    def findLeavingViewItemByRouteInfo(routeInfo: RouteInfo[_]): js.UndefOr[ViewItem[_]] = js.native
    def findLeavingViewItemByRouteInfo(routeInfo: RouteInfo[_], outletId: String): js.UndefOr[ViewItem[_]] = js.native
    
    def findViewItemByPathname(pathname: String): js.UndefOr[ViewItem[_]] = js.native
    def findViewItemByPathname(pathname: String, outletId: String): js.UndefOr[ViewItem[_]] = js.native
    
    def findViewItemByRouteInfo(routeInfo: RouteInfo[_]): js.UndefOr[ViewItem[_]] = js.native
    def findViewItemByRouteInfo(routeInfo: RouteInfo[_], outletId: String): js.UndefOr[ViewItem[_]] = js.native
    
    /* protected */ def getAllViewItems(): js.Array[ViewItem[_]] = js.native
    
    def getChildrenToRender(
      outletId: String,
      ionRouterOutlet: ReactElement,
      routeInfo: RouteInfo[_],
      reRender: js.Function0[Unit],
      setInTransition: js.Function0[Unit]
    ): js.Array[ReactElement] = js.native
    
    /* protected */ def getStackIds(): js.Array[String] = js.native
    
    def getViewItemsForOutlet(outletId: String): js.Array[ViewItem[_]] = js.native
    
    def remove(viewItem: ViewItem[_]): Unit = js.native
    
    var viewStacks: js.Any = js.native
  }
}

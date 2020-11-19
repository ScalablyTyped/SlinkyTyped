package typingsSlinky.ionicReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicReact.locationHistoryMod.LocationHistory
import typingsSlinky.ionicReact.navManagerMod.NavManagerProps
import typingsSlinky.ionicReact.routeActionMod.RouteAction
import typingsSlinky.ionicReact.routeInfoMod.RouteInfo
import typingsSlinky.ionicReact.routerDirectionMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavManager {
  
  @JSImport("@ionic/react", "NavManager")
  @js.native
  object component extends js.Object
  
  def withProps(p: NavManagerProps): Default[tag.type, typingsSlinky.ionicReact.mod.NavManager] = new Default[tag.type, typingsSlinky.ionicReact.mod.NavManager](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    ionRedirect: js.Any,
    ionRoute: js.Any,
    locationHistory: LocationHistory,
    onChangeTab: (String, String, js.UndefOr[js.Any]) => Unit,
    onNavigate: (String, RouteAction, js.UndefOr[RouterDirection], js.UndefOr[AnimationBuilder], js.UndefOr[js.Any], js.UndefOr[String]) => Unit,
    onNavigateBack: (js.UndefOr[RouteInfo[_] | String], js.UndefOr[AnimationBuilder]) => Unit,
    onResetTab: (String, String, js.UndefOr[js.Any]) => Unit,
    onSetCurrentTab: (String, RouteInfo[_]) => Unit,
    routeInfo: RouteInfo[_],
    stackManager: js.Any
  ): Default[tag.type, typingsSlinky.ionicReact.mod.NavManager] = {
    val __props = js.Dynamic.literal(ionRedirect = ionRedirect.asInstanceOf[js.Any], ionRoute = ionRoute.asInstanceOf[js.Any], locationHistory = locationHistory.asInstanceOf[js.Any], onChangeTab = js.Any.fromFunction3(onChangeTab), onNavigate = js.Any.fromFunction6(onNavigate), onNavigateBack = js.Any.fromFunction2(onNavigateBack), onResetTab = js.Any.fromFunction3(onResetTab), onSetCurrentTab = js.Any.fromFunction2(onSetCurrentTab), routeInfo = routeInfo.asInstanceOf[js.Any], stackManager = stackManager.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.ionicReact.mod.NavManager](js.Array(this.component, __props.asInstanceOf[NavManagerProps]))
  }
}

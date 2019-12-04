package typingsSlinky.reactDashNavigationDashDrawer

import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationBackAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationCloseDrawerAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationCompleteTransitionAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationComponent
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationDrawerClosedAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationDrawerOpenedAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationInitAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationJumpToAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationNavigateAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationOpenDrawerAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationPopAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationPopToTopAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationPushAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationReplaceAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationResetAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenOptionsGetter
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationSetParamsAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationToggleDrawerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Action extends js.Object {
  var getScreenOptions: NavigationScreenOptionsGetter[_] = js.native
  def getActionCreators(route: NavigationRoute[NavigationParams], navStateKey: String): Anon_CloseDrawer = js.native
  def getActionForPathAndParams(path: String): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | Anon_CHILDACTION | Null = js.native
  def getActionForPathAndParams(path: String, params: NavigationParams): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | Anon_CHILDACTION | Null = js.native
  def getComponentForRouteName(routeName: String): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  def getComponentForState(state: js.Any): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  def getPathAndParamsForState(state: js.Any): Anon_Params = js.native
  def getStateForAction(action: NavigationAction): js.Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNavigationParamsNavigationState): js.Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNavigationParamsisDrawerOpenany): js.Any = js.native
}


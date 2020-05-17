package typingsSlinky.reactNavigationDrawer.anon

import typingsSlinky.reactNavigation.mod.NavigationAction
import typingsSlinky.reactNavigation.mod.NavigationBackAction
import typingsSlinky.reactNavigation.mod.NavigationCloseDrawerAction
import typingsSlinky.reactNavigation.mod.NavigationCompleteTransitionAction
import typingsSlinky.reactNavigation.mod.NavigationComponent
import typingsSlinky.reactNavigation.mod.NavigationDrawerClosedAction
import typingsSlinky.reactNavigation.mod.NavigationDrawerOpenedAction
import typingsSlinky.reactNavigation.mod.NavigationInitAction
import typingsSlinky.reactNavigation.mod.NavigationJumpToAction
import typingsSlinky.reactNavigation.mod.NavigationNavigateAction
import typingsSlinky.reactNavigation.mod.NavigationOpenDrawerAction
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationPopAction
import typingsSlinky.reactNavigation.mod.NavigationPopToTopAction
import typingsSlinky.reactNavigation.mod.NavigationPushAction
import typingsSlinky.reactNavigation.mod.NavigationReplaceAction
import typingsSlinky.reactNavigation.mod.NavigationResetAction
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenOptionsGetter
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import typingsSlinky.reactNavigation.mod.NavigationSetParamsAction
import typingsSlinky.reactNavigation.mod.NavigationToggleDrawerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetActionCreators extends js.Object {
  var getScreenOptions: NavigationScreenOptionsGetter[_] = js.native
  def getActionCreators(route: NavigationRoute[NavigationParams], navStateKey: String): CloseDrawer = js.native
  def getActionForPathAndParams(path: String): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | Key | Null = js.native
  def getActionForPathAndParams(path: String, params: NavigationParams): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | Key | Null = js.native
  def getComponentForRouteName(routeName: String): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  def getComponentForState(state: js.Any): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  def getPathAndParamsForState(state: js.Any): Params = js.native
  def getStateForAction(action: NavigationAction): js.Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNaviga): js.Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNavigaIndex): js.Any = js.native
}


package typingsSlinky.reduxFirstRouter.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorsConfig[TKeys, TState] extends StObject {
  
  def actionToNavigation(
    navigators: Navigators[TState],
    action: js.Object,
    // TODO check this
  navigationAction: Nullable[NavigationAction],
    route: Nullable[Route[TKeys, TState]]
  ): js.Object = js.native
  
  def navigationToAction(
    navigators: Navigators[TState],
    store: Store[TState, AnyAction],
    routesMap: RoutesMap[TKeys, TState],
    action: js.Object
  ): typingsSlinky.reduxFirstRouter.anon.Action = js.native
  
  var navigators: Navigators[TState] = js.native
  
  def patchNavigators(navigators: Navigators[TState]): Unit = js.native
}
object NavigatorsConfig {
  
  @scala.inline
  def apply[TKeys, TState](
    actionToNavigation: (Navigators[TState], js.Object, Nullable[NavigationAction], Nullable[Route[TKeys, TState]]) => js.Object,
    navigationToAction: (Navigators[TState], Store[TState, AnyAction], RoutesMap[TKeys, TState], js.Object) => typingsSlinky.reduxFirstRouter.anon.Action,
    navigators: Navigators[TState],
    patchNavigators: Navigators[TState] => Unit
  ): NavigatorsConfig[TKeys, TState] = {
    val __obj = js.Dynamic.literal(actionToNavigation = js.Any.fromFunction4(actionToNavigation), navigationToAction = js.Any.fromFunction4(navigationToAction), navigators = navigators.asInstanceOf[js.Any], patchNavigators = js.Any.fromFunction1(patchNavigators))
    __obj.asInstanceOf[NavigatorsConfig[TKeys, TState]]
  }
  
  @scala.inline
  implicit class NavigatorsConfigMutableBuilder[Self <: NavigatorsConfig[_, _], TKeys, TState] (val x: Self with (NavigatorsConfig[TKeys, TState])) extends AnyVal {
    
    @scala.inline
    def setActionToNavigation(
      value: (Navigators[TState], js.Object, Nullable[NavigationAction], Nullable[Route[TKeys, TState]]) => js.Object
    ): Self = StObject.set(x, "actionToNavigation", js.Any.fromFunction4(value))
    
    @scala.inline
    def setNavigationToAction(
      value: (Navigators[TState], Store[TState, AnyAction], RoutesMap[TKeys, TState], js.Object) => typingsSlinky.reduxFirstRouter.anon.Action
    ): Self = StObject.set(x, "navigationToAction", js.Any.fromFunction4(value))
    
    @scala.inline
    def setNavigators(value: Navigators[TState]): Self = StObject.set(x, "navigators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchNavigators(value: Navigators[TState] => Unit): Self = StObject.set(x, "patchNavigators", js.Any.fromFunction1(value))
  }
}

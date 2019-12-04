package typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod

import typingsSlinky.reactDashNavigation.Anon_ActionKey
import typingsSlinky.reactDashNavigation.Anon_ParamsP
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationDispatch
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationEventCallback
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationEventSubscription
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationNavigateAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRouter
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationState
import typingsSlinky.reactDashNavigationDashStack.Anon_Immediate
import typingsSlinky.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.refocus
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationScreenProp<State, Params> & {push (routeName : string, params ? : react-navigation.react-navigation.NavigationParams, action ? : react-navigation.react-navigation.NavigationNavigateAction): boolean, replace (routeName : string, params ? : react-navigation.react-navigation.NavigationParams, action ? : react-navigation.react-navigation.NavigationNavigateAction): boolean, reset (actions : std.Array<react-navigation.react-navigation.NavigationAction>, index : number): boolean, pop (n ? : number, params ? : {  immediate ? :boolean}): boolean, popToTop (params ? : {  immediate ? :boolean}): boolean, addListener (event : react-navigation-stack.react-navigation-stack/lib/typescript/types.NavigationStackEventName, callback : react-navigation.react-navigation.NavigationEventCallback): react-navigation.react-navigation.NavigationEventSubscription} */
@js.native
trait NavigationStackProp[State, Params] extends js.Object {
  var dispatch: NavigationDispatch = js.native
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  var state: State with Anon_ParamsP[Params] = js.native
  def addListener(eventName: String, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def addListener(event: NavigationStackEventName, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def closeDrawer(): js.Any = js.native
  def dangerouslyGetParent(): js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.native
  def dismiss(): Boolean = js.native
  @JSName("emit")
  def emit_refocus(eventName: refocus): Unit = js.native
  def getParam[T /* <: String */](param: T): /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any = js.native
  def getParam[T /* <: String */](
    param: T,
    fallback: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any
    ]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any
  ] = js.native
  def goBack(): Boolean = js.native
  def goBack(routeKey: String): Boolean = js.native
  def isFirstRouteInParent(): Boolean = js.native
  def isFocused(): Boolean = js.native
  def navigate(options: Anon_ActionKey): Boolean = js.native
  def navigate(routeNameOrOptions: String): Boolean = js.native
  def navigate(routeNameOrOptions: String, params: NavigationParams): Boolean = js.native
  def navigate(routeNameOrOptions: String, params: NavigationParams, action: NavigationAction): Boolean = js.native
  def openDrawer(): js.Any = js.native
  def pop(): Boolean = js.native
  def pop(n: Double): Boolean = js.native
  def pop(n: Double, params: Anon_Immediate): Boolean = js.native
  def popToTop(): Boolean = js.native
  def popToTop(params: Anon_Immediate): Boolean = js.native
  def push(routeName: String): Boolean = js.native
  def push(routeName: String, params: NavigationParams): Boolean = js.native
  def push(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  def replace(routeName: String): Boolean = js.native
  def replace(routeName: String, params: NavigationParams): Boolean = js.native
  def replace(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  def reset(actions: js.Array[NavigationAction], index: Double): Boolean = js.native
  def setParams(newParams: Partial[Params]): Boolean = js.native
  def toggleDrawer(): js.Any = js.native
}


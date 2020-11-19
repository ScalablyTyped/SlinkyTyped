package typingsSlinky.reactNavigationStack.vendorTypesMod

import typingsSlinky.reactNavigation.anon.Key
import typingsSlinky.reactNavigation.anon.`2`
import typingsSlinky.reactNavigation.mod.NavigationAction
import typingsSlinky.reactNavigation.mod.NavigationDispatch
import typingsSlinky.reactNavigation.mod.NavigationEventCallback
import typingsSlinky.reactNavigation.mod.NavigationEventSubscription
import typingsSlinky.reactNavigation.mod.NavigationNavigateAction
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRouter
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import typingsSlinky.reactNavigation.mod.NavigationState
import typingsSlinky.reactNavigationStack.anon.Immediate
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.refocus
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation.react-navigation.NavigationScreenProp<State, Params> & {push (routeName : string, params : react-navigation.react-navigation.NavigationParams | undefined, action : react-navigation.react-navigation.NavigationNavigateAction | undefined): boolean, replace (routeName : string, params : react-navigation.react-navigation.NavigationParams | undefined, action : react-navigation.react-navigation.NavigationNavigateAction | undefined): boolean, reset (actions : std.Array<react-navigation.react-navigation.NavigationAction>, index : number): boolean, pop (n : number | undefined, params : {  immediate :boolean | undefined} | undefined): boolean, popToTop (params : {  immediate :boolean | undefined} | undefined): boolean, addListener (event : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.NavigationStackEventName, callback : react-navigation.react-navigation.NavigationEventCallback): react-navigation.react-navigation.NavigationEventSubscription} */
@js.native
trait StackNavigationProp[State, Params] extends js.Object {
  
  def addListener(eventName: String, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def addListener(event: NavigationStackEventName, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  
  def dangerouslyGetParent(): js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.native
  
  def dismiss(): Boolean = js.native
  
  var dispatch: NavigationDispatch = js.native
  
  @JSName("emit")
  def emit_refocus(eventName: refocus): Unit = js.native
  
  def getParam[T /* <: /* keyof Params */ String */](param: T): /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any = js.native
  def getParam[T /* <: /* keyof Params */ String */](
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
  
  def navigate[T /* <: NavigationParams */](options: Key[T]): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T, action: NavigationAction): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: js.UndefOr[scala.Nothing], action: NavigationAction): Boolean = js.native
  
  def pop(): Boolean = js.native
  def pop(n: js.UndefOr[scala.Nothing], params: Immediate): Boolean = js.native
  def pop(n: Double): Boolean = js.native
  def pop(n: Double, params: Immediate): Boolean = js.native
  
  def popToTop(): Boolean = js.native
  def popToTop(params: Immediate): Boolean = js.native
  
  def push(routeName: String): Boolean = js.native
  def push(routeName: String, params: js.UndefOr[scala.Nothing], action: NavigationNavigateAction): Boolean = js.native
  def push(routeName: String, params: NavigationParams): Boolean = js.native
  def push(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  
  def replace(routeName: String): Boolean = js.native
  def replace(routeName: String, params: js.UndefOr[scala.Nothing], action: NavigationNavigateAction): Boolean = js.native
  def replace(routeName: String, params: NavigationParams): Boolean = js.native
  def replace(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  
  def reset(actions: js.Array[NavigationAction], index: Double): Boolean = js.native
  
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  
  def setParams(newParams: Partial[Params]): Boolean = js.native
  
  var state: State with `2`[Params] = js.native
}

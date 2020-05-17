package typingsSlinky.reactNavigationDrawer.typesMod

import typingsSlinky.reactNavigation.anon.Key
import typingsSlinky.reactNavigation.anon.ParamsP
import typingsSlinky.reactNavigation.mod.NavigationAction
import typingsSlinky.reactNavigation.mod.NavigationDispatch
import typingsSlinky.reactNavigation.mod.NavigationEventCallback
import typingsSlinky.reactNavigation.mod.NavigationEventSubscription
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRouter
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import typingsSlinky.reactNavigation.mod.NavigationState
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.refocus
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationScreenProp<State, Params> & {openDrawer (): void, closeDrawer (): void, toggleDrawer (): void, jumpTo (routeName : string, key ? : string): void} */
@js.native
trait NavigationDrawerProp[State, Params] extends js.Object {
  var dispatch: NavigationDispatch = js.native
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  var state: State with ParamsP[Params] = js.native
  def addListener(eventName: String, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def closeDrawer(): Unit = js.native
  def dangerouslyGetParent(): js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.native
  def dismiss(): Boolean = js.native
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
  def jumpTo(routeName: String): Unit = js.native
  def jumpTo(routeName: String, key: String): Unit = js.native
  def navigate[T /* <: NavigationParams */](options: Key[T]): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T, action: NavigationAction): Boolean = js.native
  def openDrawer(): Unit = js.native
  def setParams(newParams: Partial[Params]): Boolean = js.native
  def toggleDrawer(): Unit = js.native
}


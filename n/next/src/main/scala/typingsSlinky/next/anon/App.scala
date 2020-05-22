package typingsSlinky.next.anon

import slinky.core.ReactComponentClass
import typingsSlinky.next.routerMod.RouteInfo
import typingsSlinky.next.routerMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var App: ReactComponentClass[js.Object]
  var Component: ReactComponentClass[js.Object]
  var err: js.UndefOr[js.Error] = js.undefined
  var initialProps: js.Any
  var isFallback: Boolean
  var pageLoader: js.Any
  var subscription: Subscription
  def wrapApp(App: ReactComponentClass[js.Object]): js.Any
}

object App {
  @scala.inline
  def apply(
    App: ReactComponentClass[js.Object],
    Component: ReactComponentClass[js.Object],
    initialProps: js.Any,
    isFallback: Boolean,
    pageLoader: js.Any,
    subscription: (/* data */ RouteInfo, /* App */ js.UndefOr[ReactComponentClass[js.Object]]) => Unit,
    wrapApp: ReactComponentClass[js.Object] => js.Any,
    err: js.Error = null
  ): App = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], initialProps = initialProps.asInstanceOf[js.Any], isFallback = isFallback.asInstanceOf[js.Any], pageLoader = pageLoader.asInstanceOf[js.Any], subscription = js.Any.fromFunction2(subscription), wrapApp = js.Any.fromFunction1(wrapApp))
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}


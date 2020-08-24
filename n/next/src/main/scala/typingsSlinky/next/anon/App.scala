package typingsSlinky.next.anon

import slinky.core.ReactComponentClass
import typingsSlinky.next.routerMod.RouteInfo
import typingsSlinky.next.routerMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var App: ReactComponentClass[js.Object] = js.native
  var Component: ReactComponentClass[js.Object] = js.native
  var err: js.UndefOr[js.Error] = js.native
  var initialProps: js.Any = js.native
  var isFallback: Boolean = js.native
  var pageLoader: js.Any = js.native
  var subscription: Subscription = js.native
  def wrapApp(App: ReactComponentClass[js.Object]): js.Any = js.native
}

object App {
  @scala.inline
  def apply(
    App: ReactComponentClass[js.Object],
    Component: ReactComponentClass[js.Object],
    initialProps: js.Any,
    isFallback: Boolean,
    pageLoader: js.Any,
    subscription: (/* data */ RouteInfo, /* App */ js.UndefOr[ReactComponentClass[js.Object]]) => js.Promise[Unit],
    wrapApp: ReactComponentClass[js.Object] => js.Any
  ): App = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], initialProps = initialProps.asInstanceOf[js.Any], isFallback = isFallback.asInstanceOf[js.Any], pageLoader = pageLoader.asInstanceOf[js.Any], subscription = js.Any.fromFunction2(subscription), wrapApp = js.Any.fromFunction1(wrapApp))
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApp(value: ReactComponentClass[js.Object]): Self = this.set("App", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: ReactComponentClass[js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialProps(value: js.Any): Self = this.set("initialProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFallback(value: Boolean): Self = this.set("isFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageLoader(value: js.Any): Self = this.set("pageLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(
      value: (/* data */ RouteInfo, /* App */ js.UndefOr[ReactComponentClass[js.Object]]) => js.Promise[Unit]
    ): Self = this.set("subscription", js.Any.fromFunction2(value))
    @scala.inline
    def setWrapApp(value: ReactComponentClass[js.Object] => js.Any): Self = this.set("wrapApp", js.Any.fromFunction1(value))
    @scala.inline
    def setErr(value: js.Error): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
  }
  
}


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
    subscription: (/* data */ RouteInfo, /* App */ js.UndefOr[ReactComponentClass[js.Object]]) => Unit,
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
    def withApp(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("App")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageLoader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: (/* data */ RouteInfo, /* App */ js.UndefOr[ReactComponentClass[js.Object]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWrapApp(value: ReactComponentClass[js.Object] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapApp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErr(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(js.undefined)
        ret
    }
  }
  
}


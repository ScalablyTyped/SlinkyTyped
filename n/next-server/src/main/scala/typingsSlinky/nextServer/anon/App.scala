package typingsSlinky.nextServer.anon

import slinky.core.ReactComponentClass
import typingsSlinky.nextServer.routerMod.RouteInfo
import typingsSlinky.nextServer.routerMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends StObject {
  
  var App: ReactComponentClass[js.Object] = js.native
  
  var Component: ReactComponentClass[js.Object] = js.native
  
  var err: js.UndefOr[js.Error] = js.native
  
  var initialProps: js.Any = js.native
  
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
    pageLoader: js.Any,
    subscription: (/* data */ RouteInfo, /* App */ js.UndefOr[ReactComponentClass[js.Object]]) => Unit,
    wrapApp: ReactComponentClass[js.Object] => js.Any
  ): App = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], initialProps = initialProps.asInstanceOf[js.Any], pageLoader = pageLoader.asInstanceOf[js.Any], subscription = js.Any.fromFunction2(subscription), wrapApp = js.Any.fromFunction1(wrapApp))
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    @scala.inline
    def setInitialProps(value: js.Any): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLoader(value: js.Any): Self = StObject.set(x, "pageLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: (/* data */ RouteInfo, /* App */ js.UndefOr[ReactComponentClass[js.Object]]) => Unit): Self = StObject.set(x, "subscription", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapApp(value: ReactComponentClass[js.Object] => js.Any): Self = StObject.set(x, "wrapApp", js.Any.fromFunction1(value))
  }
}

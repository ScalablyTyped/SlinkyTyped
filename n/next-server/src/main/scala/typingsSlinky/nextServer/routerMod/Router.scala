package typingsSlinky.nextServer.routerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.PopStateEvent
import slinky.core.ReactComponentClass
import typingsSlinky.nextServer.libUtilsMod.NextPageContext
import typingsSlinky.nextServer.mittMod.MittEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router extends BaseRouter {
  
  var _bps: js.UndefOr[BeforePopStateCallback] = js.native
  
  def _wrapApp(App: ReactComponentClass[js.Object]): js.Any = js.native
  
  def abortComponentLoad(as: String): Unit = js.native
  
  /**
    * Go back in history
    */
  def back(): Unit = js.native
  
  /**
    * Callback to execute before replacing router state
    * @param cb callback to be executed
    */
  def beforePopState(cb: BeforePopStateCallback): Unit = js.native
  
  def change(method: String, _url: Url, _as: Url, options: js.Any): js.Promise[Boolean] = js.native
  
  def changeState(method: String, url: String, as: String): Unit = js.native
  def changeState(method: String, url: String, as: String, options: js.Object): Unit = js.native
  
  var clc: ComponentLoadCancel = js.native
  
  /**
    * Map of all components loaded in `Router`
    */
  var components: StringDictionary[RouteInfo] = js.native
  
  var events: MittEmitter = js.native
  
  def fetchComponent(route: String): js.Promise[ReactComponentClass[js.Object]] = js.native
  
  def getInitialProps(Component: ReactComponentClass[js.Object], ctx: NextPageContext): js.Promise[_] = js.native
  
  def getRouteInfo(route: String, pathname: String, query: js.Any, as: String): js.Promise[RouteInfo] = js.native
  def getRouteInfo(route: String, pathname: String, query: js.Any, as: String, shallow: Boolean): js.Promise[RouteInfo] = js.native
  
  def notify(data: RouteInfo): Unit = js.native
  
  def onPopState(e: PopStateEvent): Unit = js.native
  
  def onlyAHashChange(as: String): Boolean = js.native
  
  var pageLoader: js.Any = js.native
  
  /**
    * Prefetch `page` code, you may wait for the data during `page` rendering.
    * This feature only works in production!
    * @param url of prefetched `page`
    */
  def prefetch(url: String): js.Promise[Unit] = js.native
  
  /**
    * Performs a `pushState` with arguments
    * @param url of the route
    * @param as masks `url` for the browser
    * @param options object you can define `shallow` and other options
    */
  def push(url: Url): js.Promise[Boolean] = js.native
  def push(url: Url, as: js.UndefOr[Url], options: js.Object): js.Promise[Boolean] = js.native
  def push(url: Url, as: Url): js.Promise[Boolean] = js.native
  
  def reload(): Unit = js.native
  
  /**
    * Performs a `replaceState` with arguments
    * @param url of the route
    * @param as masks `url` for the browser
    * @param options object you can define `shallow` and other options
    */
  def replace(url: Url): js.Promise[Boolean] = js.native
  def replace(url: Url, as: js.UndefOr[Url], options: js.Object): js.Promise[Boolean] = js.native
  def replace(url: Url, as: Url): js.Promise[Boolean] = js.native
  
  def scrollToHash(as: String): Unit = js.native
  
  def set(route: String, pathname: String, query: js.Any, as: String, data: RouteInfo): Unit = js.native
  
  var sub: Subscription = js.native
  
  def update(route: String, Component: ReactComponentClass[js.Object]): Unit = js.native
  
  def urlIsNew(asPath: String): Boolean = js.native
}

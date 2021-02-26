package typingsSlinky.nextServer

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.PopStateEvent
import slinky.core.ReactComponentClass
import typingsSlinky.nextServer.anon.App
import typingsSlinky.nextServer.libUtilsMod.NextPageContext
import typingsSlinky.nextServer.mittMod.MittEmitter
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import typingsSlinky.node.urlMod.UrlObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("next-server/dist/lib/router/router", JSImport.Default)
  @js.native
  class default protected () extends Router {
    def this(
      pathname: String,
      query: ParsedUrlQuery,
      as: String,
      hasInitialPropsPageLoaderAppWrapAppComponentErrSubscription: App
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("next-server/dist/lib/router/router", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next-server/dist/lib/router/router", "default._rewriteUrlForNextExport")
    @js.native
    def _rewriteUrlForNextExport(url: String): String = js.native
    
    @JSImport("next-server/dist/lib/router/router", "default.events")
    @js.native
    def events: MittEmitter = js.native
    @scala.inline
    def events_=(x: MittEmitter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BaseRouter extends StObject {
    
    var asPath: String = js.native
    
    var pathname: String = js.native
    
    var query: ParsedUrlQuery = js.native
    
    var route: String = js.native
  }
  object BaseRouter {
    
    @scala.inline
    def apply(asPath: String, pathname: String, query: ParsedUrlQuery, route: String): BaseRouter = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseRouter]
    }
    
    @scala.inline
    implicit class BaseRouterMutableBuilder[Self <: BaseRouter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type BeforePopStateCallback = js.Function1[/* state */ js.Any, Boolean]
  
  type ComponentLoadCancel = js.Function0[Unit] | Null
  
  /* Inlined next-server.next-server/dist/lib/router/router.BaseRouter & std.Pick<next-server.next-server/dist/lib/router/router.Router, 'push' | 'replace' | 'reload' | 'back' | 'prefetch' | 'beforePopState' | 'events'> */
  @js.native
  trait NextRouter extends StObject {
    
    var asPath: String = js.native
    
    var back: js.Function0[Unit] = js.native
    
    var beforePopState: js.Function1[/* cb */ BeforePopStateCallback, Unit] = js.native
    
    var events: MittEmitter = js.native
    
    var pathname: String = js.native
    
    var prefetch: js.Function1[/* url */ String, js.Promise[Unit]] = js.native
    
    var push: js.Function3[
        /* url */ Url, 
        /* as */ js.UndefOr[Url], 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Boolean]
      ] = js.native
    
    var query: ParsedUrlQuery = js.native
    
    var reload: js.Function0[Unit] = js.native
    
    var replace: js.Function3[
        /* url */ Url, 
        /* as */ js.UndefOr[Url], 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Boolean]
      ] = js.native
    
    var route: String = js.native
  }
  object NextRouter {
    
    @scala.inline
    def apply(
      asPath: String,
      back: () => Unit,
      beforePopState: /* cb */ BeforePopStateCallback => Unit,
      events: MittEmitter,
      pathname: String,
      prefetch: /* url */ String => js.Promise[Unit],
      push: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean],
      query: ParsedUrlQuery,
      reload: () => Unit,
      replace: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean],
      route: String
    ): NextRouter = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], back = js.Any.fromFunction0(back), beforePopState = js.Any.fromFunction1(beforePopState), events = events.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], prefetch = js.Any.fromFunction1(prefetch), push = js.Any.fromFunction3(push), query = query.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), replace = js.Any.fromFunction3(replace), route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextRouter]
    }
    
    @scala.inline
    implicit class NextRouterMutableBuilder[Self <: NextRouter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBack(value: () => Unit): Self = StObject.set(x, "back", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforePopState(value: /* cb */ BeforePopStateCallback => Unit): Self = StObject.set(x, "beforePopState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEvents(value: MittEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefetch(value: /* url */ String => js.Promise[Unit]): Self = StObject.set(x, "prefetch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPush(
        value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean]
      ): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReplace(
        value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean]
      ): Self = StObject.set(x, "replace", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteInfo extends StObject {
    
    var Component: ReactComponentClass[js.Object] = js.native
    
    var err: js.UndefOr[js.Error] = js.native
    
    var error: js.UndefOr[js.Any] = js.native
    
    var props: js.UndefOr[js.Any] = js.native
  }
  object RouteInfo {
    
    @scala.inline
    def apply(Component: ReactComponentClass[js.Object]): RouteInfo = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteInfo]
    }
    
    @scala.inline
    implicit class RouteInfoMutableBuilder[Self <: RouteInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
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
  
  type Subscription = js.Function2[/* data */ RouteInfo, /* App */ js.UndefOr[ReactComponentClass[js.Object]], Unit]
  
  type Url = UrlObject | String
}

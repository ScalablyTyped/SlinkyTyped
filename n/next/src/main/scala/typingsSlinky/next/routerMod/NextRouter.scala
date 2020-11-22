package typingsSlinky.next.routerMod

import typingsSlinky.next.mittMod.MittEmitter
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next.next/dist/next-server/lib/router/router.BaseRouter & std.Pick<next.next/dist/next-server/lib/router/router.Router, 'push' | 'replace' | 'reload' | 'back' | 'prefetch' | 'beforePopState' | 'events' | 'isFallback'> */
@js.native
trait NextRouter extends js.Object {
  
  var asPath: String = js.native
  
  var back: js.Function0[Unit] = js.native
  
  var basePath: String = js.native
  
  var beforePopState: js.Function1[/* cb */ BeforePopStateCallback, Unit] = js.native
  
  var defaultLocale: js.UndefOr[String] = js.native
  
  var events: MittEmitter = js.native
  
  var isFallback: Boolean = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var locales: js.UndefOr[js.Array[String]] = js.native
  
  var pathname: String = js.native
  
  var prefetch: js.Function3[
    /* url */ String, 
    /* asPath */ js.UndefOr[String], 
    /* options */ js.UndefOr[PrefetchOptions], 
    js.Promise[Unit]
  ] = js.native
  
  var push: js.Function3[
    /* url */ Url, 
    /* as */ js.UndefOr[Url], 
    /* options */ js.UndefOr[TransitionOptions], 
    js.Promise[Boolean]
  ] = js.native
  
  var query: ParsedUrlQuery = js.native
  
  var reload: js.Function0[Unit] = js.native
  
  var replace: js.Function3[
    /* url */ Url, 
    /* as */ js.UndefOr[Url], 
    /* options */ js.UndefOr[TransitionOptions], 
    js.Promise[Boolean]
  ] = js.native
  
  var route: String = js.native
}
object NextRouter {
  
  @scala.inline
  def apply(
    asPath: String,
    back: () => Unit,
    basePath: String,
    beforePopState: /* cb */ BeforePopStateCallback => Unit,
    events: MittEmitter,
    isFallback: Boolean,
    pathname: String,
    prefetch: (/* url */ String, /* asPath */ js.UndefOr[String], /* options */ js.UndefOr[PrefetchOptions]) => js.Promise[Unit],
    push: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean],
    query: ParsedUrlQuery,
    reload: () => Unit,
    replace: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean],
    route: String
  ): NextRouter = {
    val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], back = js.Any.fromFunction0(back), basePath = basePath.asInstanceOf[js.Any], beforePopState = js.Any.fromFunction1(beforePopState), events = events.asInstanceOf[js.Any], isFallback = isFallback.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], prefetch = js.Any.fromFunction3(prefetch), push = js.Any.fromFunction3(push), query = query.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), replace = js.Any.fromFunction3(replace), route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextRouter]
  }
  
  @scala.inline
  implicit class NextRouterOps[Self <: NextRouter] (val x: Self) extends AnyVal {
    
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
    def setAsPath(value: String): Self = this.set("asPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBack(value: () => Unit): Self = this.set("back", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforePopState(value: /* cb */ BeforePopStateCallback => Unit): Self = this.set("beforePopState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvents(value: MittEmitter): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFallback(value: Boolean): Self = this.set("isFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefetch(
      value: (/* url */ String, /* asPath */ js.UndefOr[String], /* options */ js.UndefOr[PrefetchOptions]) => js.Promise[Unit]
    ): Self = this.set("prefetch", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPush(
      value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean]
    ): Self = this.set("push", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQuery(value: ParsedUrlQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReload(value: () => Unit): Self = this.set("reload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplace(
      value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean]
    ): Self = this.set("replace", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
  }
}

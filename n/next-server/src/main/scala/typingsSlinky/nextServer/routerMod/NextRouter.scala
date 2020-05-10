package typingsSlinky.nextServer.routerMod

import typingsSlinky.nextServer.mittMod.MittEmitter
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/router/router.BaseRouter & std.Pick<next-server.next-server/dist/lib/router/router.Router, 'push' | 'replace' | 'reload' | 'back' | 'prefetch' | 'beforePopState' | 'events'> */
@js.native
trait NextRouter extends js.Object {
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
  implicit class NextRouterOps[Self <: NextRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBack(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeforePopState(value: /* cb */ BeforePopStateCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePopState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvents(value: MittEmitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefetch(value: /* url */ String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPush(
      value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQuery(value: ParsedUrlQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReplace(
      value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRoute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


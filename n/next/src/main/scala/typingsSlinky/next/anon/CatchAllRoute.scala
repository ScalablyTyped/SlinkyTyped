package typingsSlinky.next.anon

import typingsSlinky.next.serverRouterMod.PageChecker
import typingsSlinky.next.serverRouterMod.Route_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatchAllRoute extends js.Object {
  var catchAllRoute: Route_ = js.native
  var dynamicRoutes: js.UndefOr[typingsSlinky.next.serverRouterMod.DynamicRoutes] = js.native
  var fsRoutes: js.Array[Route_] = js.native
  var headers: js.Array[Route_] = js.native
  var pageChecker: PageChecker = js.native
  var redirects: js.Array[Route_] = js.native
  var rewrites: js.Array[Route_] = js.native
  var useFileSystemPublicRoutes: Boolean = js.native
}

object CatchAllRoute {
  @scala.inline
  def apply(
    catchAllRoute: Route_,
    fsRoutes: js.Array[Route_],
    headers: js.Array[Route_],
    pageChecker: /* pathname */ String => js.Promise[Boolean],
    redirects: js.Array[Route_],
    rewrites: js.Array[Route_],
    useFileSystemPublicRoutes: Boolean
  ): CatchAllRoute = {
    val __obj = js.Dynamic.literal(catchAllRoute = catchAllRoute.asInstanceOf[js.Any], fsRoutes = fsRoutes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], pageChecker = js.Any.fromFunction1(pageChecker), redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any], useFileSystemPublicRoutes = useFileSystemPublicRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchAllRoute]
  }
  @scala.inline
  implicit class CatchAllRouteOps[Self <: CatchAllRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatchAllRoute(value: Route_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catchAllRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFsRoutes(value: js.Array[Route_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[Route_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageChecker(value: /* pathname */ String => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageChecker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRedirects(value: js.Array[Route_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRewrites(value: js.Array[Route_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseFileSystemPublicRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFileSystemPublicRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamicRoutes(value: typingsSlinky.next.serverRouterMod.DynamicRoutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRoutes")(js.undefined)
        ret
    }
  }
  
}


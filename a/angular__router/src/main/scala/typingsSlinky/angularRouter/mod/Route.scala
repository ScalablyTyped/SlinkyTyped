package typingsSlinky.angularRouter.mod

import typingsSlinky.angularCore.mod.NgModuleFactory
import typingsSlinky.angularCore.mod.Type
import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  /**
    * An array of dependency-injection tokens used to look up `CanActivate()`
    * handlers, in order to determine if the current user is allowed to
    * activate the component. By default, any user can activate.
    */
  var canActivate: js.UndefOr[js.Array[_]] = js.native
  /**
    * An array of DI tokens used to look up `CanActivateChild()` handlers,
    * in order to determine if the current user is allowed to activate
    * a child of the component. By default, any user can activate a child.
    */
  var canActivateChild: js.UndefOr[js.Array[_]] = js.native
  /**
    * An array of DI tokens used to look up `CanDeactivate()`
    * handlers, in order to determine if the current user is allowed to
    * deactivate the component. By default, any user can deactivate.
    *
    */
  var canDeactivate: js.UndefOr[js.Array[_]] = js.native
  /**
    * An array of DI tokens used to look up `CanLoad()`
    * handlers, in order to determine if the current user is allowed to
    * load the component. By default, any user can load.
    */
  var canLoad: js.UndefOr[js.Array[_]] = js.native
  /**
    * An array of child `Route` objects that specifies a nested route
    * configuration.
    */
  var children: js.UndefOr[Routes] = js.native
  /**
    * The component to instantiate when the path matches.
    * Can be empty if child routes specify components.
    */
  var component: js.UndefOr[Type[_]] = js.native
  /**
    * Additional developer-defined data provided to the component via
    * `ActivatedRoute`. By default, no additional data is passed.
    */
  var data: js.UndefOr[Data] = js.native
  /**
    * A `LoadChildren` object specifying lazy-loaded child routes.
    */
  var loadChildren: js.UndefOr[LoadChildren] = js.native
  /**
    * A custom URL-matching function. Cannot be used together with `path`.
    */
  var matcher: js.UndefOr[UrlMatcher] = js.native
  /**
    * Name of a `RouterOutlet` object where the component can be placed
    * when the path matches.
    */
  var outlet: js.UndefOr[String] = js.native
  /**
    * The path to match against. Cannot be used together with a custom `matcher` function.
    * A URL string that uses router matching notation.
    * Can be a wild card (`**`) that matches any URL (see Usage Notes below).
    * Default is "/" (the root path).
    *
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The path-matching strategy, one of 'prefix' or 'full'.
    * Default is 'prefix'.
    *
    * By default, the router checks URL elements from the left to see if the URL
    * matches a given  path, and stops when there is a match. For example,
    * '/team/11/user' matches 'team/:id'.
    *
    * The path-match strategy 'full' matches against the entire URL.
    * It is important to do this when redirecting empty-path routes.
    * Otherwise, because an empty path is a prefix of any URL,
    * the router would apply the redirect even when navigating
    * to the redirect destination, creating an endless loop.
    *
    */
  var pathMatch: js.UndefOr[String] = js.native
  /**
    * A URL to which to redirect when a the path matches.
    * Absolute if the URL begins with a slash (/), otherwise relative to the path URL.
    * When not present, router does not redirect.
    */
  var redirectTo: js.UndefOr[String] = js.native
  /**
    * A map of DI tokens used to look up data resolvers. See `Resolve`.
    */
  var resolve: js.UndefOr[ResolveData] = js.native
  /**
    * Defines when guards and resolvers will be run. One of
    * - `paramsOrQueryParamsChange` : Run when query parameters change.
    * - `always` : Run on every execution.
    * By default, guards and resolvers run only when the matrix
    * parameters of the route change.
    */
  var runGuardsAndResolvers: js.UndefOr[RunGuardsAndResolvers] = js.native
}

object Route {
  @scala.inline
  def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanActivate(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withCanActivateChild(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivateChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanActivateChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivateChild")(js.undefined)
        ret
    }
    @scala.inline
    def withCanDeactivate(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDeactivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDeactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withCanLoad(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: Routes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: Type[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadChildrenFunction0(
      value: () => Type[js.Any] | NgModuleFactory[js.Any] | Observable_[Type[js.Any]] | (js.Promise[NgModuleFactory[js.Any] | Type[js.Any] | js.Any])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadChildren")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadChildren(value: LoadChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withMatcher(
      value: (/* segments */ js.Array[UrlSegment], /* group */ UrlSegmentGroup, /* route */ Route) => UrlMatchResult
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlet")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPathMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: ResolveData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withRunGuardsAndResolversFunction2(value: (/* from */ ActivatedRouteSnapshot, /* to */ ActivatedRouteSnapshot) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runGuardsAndResolvers")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRunGuardsAndResolvers(value: RunGuardsAndResolvers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runGuardsAndResolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunGuardsAndResolvers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runGuardsAndResolvers")(js.undefined)
        ret
    }
  }
  
}


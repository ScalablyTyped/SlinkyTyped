package typingsSlinky.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationExtras extends js.Object {
  /**
    * Sets the hash fragment for the URL.
    *
    * ```
    * // Navigate to /results#top
    * this.router.navigate(['/results'], { fragment: 'top' });
    * ```
    */
  var fragment: js.UndefOr[String] = js.native
  /**
    * When true, preserves the URL fragment for the next navigation
    *
    * ```
    * // Preserve fragment from /results#top to /view#top
    * this.router.navigate(['/view'], { preserveFragment: true });
    * ```
    */
  var preserveFragment: js.UndefOr[Boolean] = js.native
  /**
    * **DEPRECATED**: Use `queryParamsHandling: "preserve"` instead to preserve
    * query parameters for the next navigation.
    *
    * @deprecated since v4
    */
  var preserveQueryParams: js.UndefOr[Boolean] = js.native
  /**
    * Sets query parameters to the URL.
    *
    * ```
    * // Navigate to /results?page=1
    * this.router.navigate(['/results'], { queryParams: { page: 1 } });
    * ```
    */
  var queryParams: js.UndefOr[Params | Null] = js.native
  /**
    * How to handle query parameters in the router link for the next navigation.
    * One of:
    * * `merge` : Merge new with current parameters.
    * * `preserve` : Preserve current parameters.
    *
    * ```
    * // from /results?page=1 to /view?page=1&page=2
    * this.router.navigate(['/view'], { queryParams: { page: 2 },  queryParamsHandling: "merge" });
    * ```
    */
  var queryParamsHandling: js.UndefOr[QueryParamsHandling | Null] = js.native
  /**
    * Specifies a root URI to use for relative navigation.
    *
    * For example, consider the following route configuration where the parent route
    * has two children.
    *
    * ```
    * [{
    *   path: 'parent',
    *   component: ParentComponent,
    *   children: [{
    *     path: 'list',
    *     component: ListComponent
    *   },{
    *     path: 'child',
    *     component: ChildComponent
    *   }]
    * }]
    * ```
    *
    * The following `go()` function navigates to the `list` route by
    * interpreting the destination URI as relative to the activated `child`  route
    *
    * ```
    *  @Component({...})
    *  class ChildComponent {
    *    constructor(private router: Router, private route: ActivatedRoute) {}
    *
    *    go() {
    *      this.router.navigate(['../list'], { relativeTo: this.route });
    *    }
    *  }
    * ```
    */
  var relativeTo: js.UndefOr[ActivatedRoute | Null] = js.native
  /**
    * When true, navigates while replacing the current state in history.
    *
    * ```
    * // Navigate to /view
    * this.router.navigate(['/view'], { replaceUrl: true });
    * ```
    */
  var replaceUrl: js.UndefOr[Boolean] = js.native
  /**
    * When true, navigates without pushing a new state into history.
    *
    * ```
    * // Navigate silently to /view
    * this.router.navigate(['/view'], { skipLocationChange: true });
    * ```
    */
  var skipLocationChange: js.UndefOr[Boolean] = js.native
  /**
    * Developer-defined state that can be passed to any navigation.
    * Access this value through the `Navigation.extras` object
    * returned from `router.getCurrentNavigation()` while a navigation is executing.
    *
    * After a navigation completes, the router writes an object containing this
    * value together with a `navigationId` to `history.state`.
    * The value is written when `location.go()` or `location.replaceState()`
    * is called before activating this route.
    *
    * Note that `history.state` does not pass an object equality test because
    * the router adds the `navigationId` on each navigation.
    */
  var state: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object NavigationExtras {
  @scala.inline
  def apply(): NavigationExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationExtras]
  }
  @scala.inline
  implicit class NavigationExtrasOps[Self <: NavigationExtras] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveFragment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveQueryParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveQueryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveQueryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParams(value: Params): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParamsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(null)
        ret
    }
    @scala.inline
    def withQueryParamsHandling(value: QueryParamsHandling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParamsHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParamsHandling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParamsHandling")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParamsHandlingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParamsHandling")(null)
        ret
    }
    @scala.inline
    def withRelativeTo(value: ActivatedRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeToNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTo")(null)
        ret
    }
    @scala.inline
    def withReplaceUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipLocationChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLocationChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLocationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLocationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}


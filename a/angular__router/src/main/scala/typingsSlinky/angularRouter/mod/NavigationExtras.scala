package typingsSlinky.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationExtras extends js.Object {
  /**
    * Sets the hash fragment for the URL.
    *
    * ```
    * // Navigate to /results#top
    * this.router.navigate(['/results'], { fragment: 'top' });
    * ```
    */
  var fragment: js.UndefOr[String] = js.undefined
  /**
    * When true, preserves the URL fragment for the next navigation
    *
    * ```
    * // Preserve fragment from /results#top to /view#top
    * this.router.navigate(['/view'], { preserveFragment: true });
    * ```
    */
  var preserveFragment: js.UndefOr[Boolean] = js.undefined
  /**
    * **DEPRECATED**: Use `queryParamsHandling: "preserve"` instead to preserve
    * query parameters for the next navigation.
    *
    * @deprecated since v4
    */
  var preserveQueryParams: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets query parameters to the URL.
    *
    * ```
    * // Navigate to /results?page=1
    * this.router.navigate(['/results'], { queryParams: { page: 1 } });
    * ```
    */
  var queryParams: js.UndefOr[Params | Null] = js.undefined
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
  var queryParamsHandling: js.UndefOr[QueryParamsHandling | Null] = js.undefined
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
  var relativeTo: js.UndefOr[ActivatedRoute | Null] = js.undefined
  /**
    * When true, navigates while replacing the current state in history.
    *
    * ```
    * // Navigate to /view
    * this.router.navigate(['/view'], { replaceUrl: true });
    * ```
    */
  var replaceUrl: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, navigates without pushing a new state into history.
    *
    * ```
    * // Navigate silently to /view
    * this.router.navigate(['/view'], { skipLocationChange: true });
    * ```
    */
  var skipLocationChange: js.UndefOr[Boolean] = js.undefined
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
  var state: js.UndefOr[StringDictionary[js.Any]] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragment: Self = this.set("fragment", js.undefined)
    @scala.inline
    def setPreserveFragment(value: Boolean): Self = this.set("preserveFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveFragment: Self = this.set("preserveFragment", js.undefined)
    @scala.inline
    def setPreserveQueryParams(value: Boolean): Self = this.set("preserveQueryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveQueryParams: Self = this.set("preserveQueryParams", js.undefined)
    @scala.inline
    def setQueryParams(value: Params): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    @scala.inline
    def setQueryParamsNull: Self = this.set("queryParams", null)
    @scala.inline
    def setQueryParamsHandling(value: QueryParamsHandling): Self = this.set("queryParamsHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParamsHandling: Self = this.set("queryParamsHandling", js.undefined)
    @scala.inline
    def setQueryParamsHandlingNull: Self = this.set("queryParamsHandling", null)
    @scala.inline
    def setRelativeTo(value: ActivatedRoute): Self = this.set("relativeTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeTo: Self = this.set("relativeTo", js.undefined)
    @scala.inline
    def setRelativeToNull: Self = this.set("relativeTo", null)
    @scala.inline
    def setReplaceUrl(value: Boolean): Self = this.set("replaceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceUrl: Self = this.set("replaceUrl", js.undefined)
    @scala.inline
    def setSkipLocationChange(value: Boolean): Self = this.set("skipLocationChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLocationChange: Self = this.set("skipLocationChange", js.undefined)
    @scala.inline
    def setState(value: StringDictionary[js.Any]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}


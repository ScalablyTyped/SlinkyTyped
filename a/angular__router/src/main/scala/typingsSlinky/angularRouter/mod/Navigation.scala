package typingsSlinky.angularRouter.mod

import typingsSlinky.angularRouter.angularRouterStrings.hashchange
import typingsSlinky.angularRouter.angularRouterStrings.imperative
import typingsSlinky.angularRouter.angularRouterStrings.popstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigation extends js.Object {
  /**
    * The initial target URL after being parsed with `UrlSerializer.extract()`.
    */
  var extractedUrl: UrlTree = js.native
  /**
    * Options that controlled the strategy used for this navigation.
    * See `NavigationExtras`.
    */
  var extras: NavigationExtras = js.native
  /**
    * The extracted URL after redirects have been applied.
    * This URL may not be available immediately, therefore this property can be `undefined`.
    * It is guaranteed to be set after the `RoutesRecognized` event fires.
    */
  var finalUrl: js.UndefOr[UrlTree] = js.native
  /**
    * The ID of the current navigation.
    */
  var id: Double = js.native
  /**
    * The target URL passed into the `Router#navigateByUrl()` call before navigation. This is
    * the value before the router has parsed or applied redirects to it.
    */
  var initialUrl: String | UrlTree = js.native
  /**
    * The previously successful `Navigation` object. Only one previous navigation
    * is available, therefore this previous `Navigation` object has a `null` value
    * for its own `previousNavigation`.
    */
  var previousNavigation: Navigation | Null = js.native
  /**
    * Identifies how this navigation was triggered.
    *
    * * 'imperative'--Triggered by `router.navigateByUrl` or `router.navigate`.
    * * 'popstate'--Triggered by a popstate event.
    * * 'hashchange'--Triggered by a hashchange event.
    */
  var trigger: imperative | popstate | hashchange = js.native
}

object Navigation {
  @scala.inline
  def apply(
    extractedUrl: UrlTree,
    extras: NavigationExtras,
    id: Double,
    initialUrl: String | UrlTree,
    trigger: imperative | popstate | hashchange
  ): Navigation = {
    val __obj = js.Dynamic.literal(extractedUrl = extractedUrl.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialUrl = initialUrl.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigation]
  }
  @scala.inline
  implicit class NavigationOps[Self <: Navigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtractedUrl(value: UrlTree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtras(value: NavigationExtras): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialUrl(value: String | UrlTree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: imperative | popstate | hashchange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalUrl(value: UrlTree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousNavigation(value: Navigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousNavigationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousNavigation")(null)
        ret
    }
  }
  
}


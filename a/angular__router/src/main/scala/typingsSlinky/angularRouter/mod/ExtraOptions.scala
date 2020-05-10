package typingsSlinky.angularRouter.mod

import typingsSlinky.angularRouter.angularRouterStrings.always
import typingsSlinky.angularRouter.angularRouterStrings.corrected
import typingsSlinky.angularRouter.angularRouterStrings.deferred
import typingsSlinky.angularRouter.angularRouterStrings.disabled
import typingsSlinky.angularRouter.angularRouterStrings.eager
import typingsSlinky.angularRouter.angularRouterStrings.emptyOnly
import typingsSlinky.angularRouter.angularRouterStrings.enabled
import typingsSlinky.angularRouter.angularRouterStrings.ignore
import typingsSlinky.angularRouter.angularRouterStrings.legacy
import typingsSlinky.angularRouter.angularRouterStrings.reload
import typingsSlinky.angularRouter.angularRouterStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraOptions extends js.Object {
  /**
    * When set to 'enabled', scrolls to the anchor element when the URL has a fragment.
    * Anchor scrolling is disabled by default.
    *
    * Anchor scrolling does not happen on 'popstate'. Instead, we restore the position
    * that we stored or scroll to the top.
    */
  var anchorScrolling: js.UndefOr[disabled | enabled] = js.native
  /**
    * When true, log all internal navigation events to the console.
    * Use for debugging.
    */
  var enableTracing: js.UndefOr[Boolean] = js.native
  /**
    * A custom error handler for failed navigations.
    */
  var errorHandler: js.UndefOr[ErrorHandler] = js.native
  /**
    * One of `enabled` or `disabled`.
    * When set to `enabled`, the initial navigation starts before the root component is created.
    * The bootstrap is blocked until the initial navigation is complete. This value is required for
    * [server-side rendering](guide/universal) to work.
    * When set to `disabled`, the initial navigation is not performed.
    * The location listener is set up before the root component gets created.
    * Use if there is a reason to have more control over when the router
    * starts its initial navigation due to some complex initialization logic.
    *
    * Legacy values are deprecated since v4 and should not be used for new applications:
    *
    * * `legacy_enabled` - Default for compatibility.
    * The initial navigation starts after the root component has been created,
    * but the bootstrap is not blocked until the initial navigation is complete.
    * * `legacy_disabled` - The initial navigation is not performed.
    * The location listener is set up after the root component gets created.
    * * `true` - same as `legacy_enabled`.
    * * `false` - same as `legacy_disabled`.
    */
  var initialNavigation: js.UndefOr[InitialNavigation] = js.native
  /**
    * A custom handler for malformed URI errors. The handler is invoked when `encodedURI` contains
    * invalid character sequences.
    * The default implementation is to redirect to the root URL, dropping
    * any path or parameter information. The function takes three parameters:
    *
    * - `'URIError'` - Error thrown when parsing a bad URL.
    * - `'UrlSerializer'` - UrlSerializer that’s configured with the router.
    * - `'url'` -  The malformed URL that caused the URIError
    * */
  var malformedUriErrorHandler: js.UndefOr[
    js.Function3[/* error */ js.URIError, /* urlSerializer */ UrlSerializer, /* url */ String, UrlTree]
  ] = js.native
  /**
    * Define what the router should do if it receives a navigation request to the current URL.
    * Default is `ignore`, which causes the router ignores the navigation.
    * This can disable features such as a "refresh" button.
    * Use this option to configure the behavior when navigating to the
    * current URL. Default is 'ignore'.
    */
  var onSameUrlNavigation: js.UndefOr[reload | ignore] = js.native
  /**
    * Defines how the router merges parameters, data, and resolved data from parent to child
    * routes. By default ('emptyOnly'), inherits parent parameters only for
    * path-less or component-less routes.
    * Set to 'always' to enable unconditional inheritance of parent parameters.
    */
  var paramsInheritanceStrategy: js.UndefOr[emptyOnly | always] = js.native
  /**
    * Configures a preloading strategy.
    * One of `PreloadAllModules` or `NoPreloading` (the default).
    */
  var preloadingStrategy: js.UndefOr[js.Any] = js.native
  /**
    * Enables a bug fix that corrects relative link resolution in components with empty paths.
    * Example:
    *
    * ```
    * const routes = [
    *   {
    *     path: '',
    *     component: ContainerComponent,
    *     children: [
    *       { path: 'a', component: AComponent },
    *       { path: 'b', component: BComponent },
    *     ]
    *   }
    * ];
    * ```
    *
    * From the `ContainerComponent`, this will not work:
    *
    * `<a [routerLink]="['./a']">Link to A</a>`
    *
    * However, this will work:
    *
    * `<a [routerLink]="['../a']">Link to A</a>`
    *
    * In other words, you're required to use `../` rather than `./`. This is currently the default
    * behavior. Setting this option to `corrected` enables the fix.
    */
  var relativeLinkResolution: js.UndefOr[legacy | corrected] = js.native
  /**
    * Configures the scroll offset the router will use when scrolling to an element.
    *
    * When given a tuple with x and y position value,
    * the router uses that offset each time it scrolls.
    * When given a function, the router invokes the function every time
    * it restores scroll position.
    */
  var scrollOffset: js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function0[js.Tuple2[Double, Double]])] = js.native
  /**
    * Configures if the scroll position needs to be restored when navigating back.
    *
    * * 'disabled'- (Default) Does nothing. Scroll position is maintained on navigation.
    * * 'top'- Sets the scroll position to x = 0, y = 0 on all navigation.
    * * 'enabled'- Restores the previous scroll position on backward navigation, else sets the
    * position to the anchor if one is provided, or sets the scroll position to [0, 0] (forward
    * navigation). This option will be the default in the future.
    *
    * You can implement custom scroll restoration behavior by adapting the enabled behavior as
    * in the following example.
    *
    * ```typescript
    * class AppModule {
    *   constructor(router: Router, viewportScroller: ViewportScroller) {
    *     router.events.pipe(
    *       filter((e: Event): e is Scroll => e instanceof Scroll)
    *     ).subscribe(e => {
    *       if (e.position) {
    *         // backward navigation
    *         viewportScroller.scrollToPosition(e.position);
    *       } else if (e.anchor) {
    *         // anchor navigation
    *         viewportScroller.scrollToAnchor(e.anchor);
    *       } else {
    *         // forward navigation
    *         viewportScroller.scrollToPosition([0, 0]);
    *       }
    *     });
    *   }
    * }
    * ```
    */
  var scrollPositionRestoration: js.UndefOr[disabled | enabled | top] = js.native
  /**
    * Defines when the router updates the browser URL. By default ('deferred'),
    * update after successful navigation.
    * Set to 'eager' if prefer to update the URL at the beginning of navigation.
    * Updating the URL early allows you to handle a failure of navigation by
    * showing an error message with the URL that failed.
    */
  var urlUpdateStrategy: js.UndefOr[deferred | eager] = js.native
  /**
    * When true, enable the location strategy that uses the URL fragment
    * instead of the history API.
    */
  var useHash: js.UndefOr[Boolean] = js.native
}

object ExtraOptions {
  @scala.inline
  def apply(): ExtraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraOptions]
  }
  @scala.inline
  implicit class ExtraOptionsOps[Self <: ExtraOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorScrolling(value: disabled | enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTracing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTracing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTracing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTracing")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHandler(value: /* error */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialNavigation(value: InitialNavigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withMalformedUriErrorHandler(value: (/* error */ js.URIError, /* urlSerializer */ UrlSerializer, /* url */ String) => UrlTree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("malformedUriErrorHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMalformedUriErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("malformedUriErrorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSameUrlNavigation(value: reload | ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSameUrlNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSameUrlNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSameUrlNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsInheritanceStrategy(value: emptyOnly | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsInheritanceStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamsInheritanceStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsInheritanceStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadingStrategy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadingStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadingStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadingStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeLinkResolution(value: legacy | corrected): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeLinkResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeLinkResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeLinkResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollOffsetFunction0(value: () => js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollOffset(value: (js.Tuple2[Double, Double]) | (js.Function0[js.Tuple2[Double, Double]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPositionRestoration(value: disabled | enabled | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPositionRestoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPositionRestoration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPositionRestoration")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlUpdateStrategy(value: deferred | eager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlUpdateStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlUpdateStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlUpdateStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHash")(js.undefined)
        ret
    }
  }
  
}


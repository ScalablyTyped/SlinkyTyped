package typingsSlinky.pulltorefreshjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * What class prefix for the elements?
    * (default: `ptr--`)
    */
  var classPrefix: js.UndefOr[String] = js.native
  /**
    * What property will be used to calculate the element's proportions?
    * (default: `min-height`)
    */
  var cssProp: js.UndefOr[String] = js.native
  /**
    * After which distance should we start pulling.
    * (Default: `0`)
    */
  var distIgnore: js.UndefOr[Double] = js.native
  /**
    * Maximum distance possible for the element.
    * (default: `80`)
    */
  var distMax: js.UndefOr[Double] = js.native
  /**
    * After the `distThreshold` is reached and released, the element will have this height.
    * (default: `50`)
    */
  var distReload: js.UndefOr[Double] = js.native
  /**
    * Minimum distance required to trigger the refresh.
    * (default: `60`)
    */
  var distThreshold: js.UndefOr[Double] = js.native
  /**
    * It returns the default HTML for the widget, __PREFIX__ is replaced.
    */
  var getMarkup: js.UndefOr[js.Function0[String]] = js.native
  /**
    * It returns the default CSS for the widget, __PREFIX__ is replaced.
    */
  var getStyles: js.UndefOr[js.Function0[String]] = js.native
  /**
    * The icon for both `instructionsPullToRefresh` and `instructionsReleaseToRefresh`
    * (default: `&#8675;`)
    */
  var iconArrow: js.UndefOr[String] = js.native
  /**
    * The icon when the refresh is in progress.
    * (default: `&hellip;`)
    */
  var iconRefreshing: js.UndefOr[String] = js.native
  /**
    * The initial instructions string.
    * (default: `Pull down to refresh`)
    */
  var instructionsPullToRefresh: js.UndefOr[String] = js.native
  /**
    * The refreshing text.
    * (default: `Refreshing`)
    */
  var instructionsRefreshing: js.UndefOr[String] = js.native
  /**
    * The instructions string when the `distThreshold` has been reached.
    * (default: `Release to refresh`)
    */
  var instructionsReleaseToRefresh: js.UndefOr[String] = js.native
  /**
    * Before which element the pull to refresh elements will be?
    * (default: `body`)
    */
  var mainElement: js.UndefOr[String] = js.native
  /**
    * The initialize function.
    */
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * What will the pull to refresh trigger? You can return a promise.
    *
    * Defaults to `window.location.reload()`
    */
  var onRefresh: js.UndefOr[js.Function0[js.Thenable[Unit] | Unit]] = js.native
  /**
    * What class will the main element have?
    * (default: `.ptr`)
    */
  var ptrElement: js.UndefOr[String] = js.native
  /**
    * The delay, in milliseconds before the `onRefresh` is triggered.
    * (default: `500`)
    */
  var refreshTimeout: js.UndefOr[Double] = js.native
  /**
    * The resistance function, accepts one parameter, must return a number, capping at 1.
    *
    * Defaults to `t => Math.min(1, t / 2.5)`
    */
  var resistanceFunction: js.UndefOr[js.Function1[/* input */ Double, Double]] = js.native
  /**
    * Which condition should be met for pullToRefresh to trigger?
    *
    * Defaults to `!window.scrollY`
    */
  var shouldPullToRefresh: js.UndefOr[js.Function0[Boolean]] = js.native
  /**
    * Which element should trigger the pull to refresh?
    * (default: `body`)
    */
  var triggerElement: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withCssProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProp")(js.undefined)
        ret
    }
    @scala.inline
    def withDistIgnore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distIgnore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distIgnore")(js.undefined)
        ret
    }
    @scala.inline
    def withDistMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distMax")(js.undefined)
        ret
    }
    @scala.inline
    def withDistReload(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distReload")(js.undefined)
        ret
    }
    @scala.inline
    def withDistThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMarkup(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStyles(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withIconArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withIconRefreshing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRefreshing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconRefreshing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRefreshing")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructionsPullToRefresh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionsPullToRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstructionsPullToRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionsPullToRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructionsRefreshing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionsRefreshing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstructionsRefreshing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionsRefreshing")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructionsReleaseToRefresh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionsReleaseToRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstructionsReleaseToRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructionsReleaseToRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withMainElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainElement")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRefresh(value: () => js.Thenable[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withPtrElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ptrElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPtrElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ptrElement")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withResistanceFunction(value: /* input */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resistanceFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResistanceFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resistanceFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldPullToRefresh(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPullToRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShouldPullToRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPullToRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerElement")(js.undefined)
        ret
    }
  }
  
}


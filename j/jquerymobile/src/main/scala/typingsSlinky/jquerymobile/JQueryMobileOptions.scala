package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryMobileOptions extends js.Object {
  var activeBtnClass: js.UndefOr[String] = js.native
  var activePageClass: js.UndefOr[String] = js.native
  var ajaxEnabled: js.UndefOr[Boolean] = js.native
  var allowCrossDomainPages: js.UndefOr[Boolean] = js.native
  var autoInitializePage: js.UndefOr[Boolean] = js.native
  var buttonMarkup: js.Any = js.native
  var defaultDialogTransition: js.UndefOr[String] = js.native
  var defaultPageTransition: js.UndefOr[String] = js.native
  var getMaxScrollForTransition: js.UndefOr[Double] = js.native
  var gradeA: js.UndefOr[js.Function] = js.native
  var hashListeningEnabled: js.UndefOr[Boolean] = js.native
  var ignoreContentEnabled: js.UndefOr[Boolean] = js.native
  var linkBindingEnabled: js.UndefOr[Boolean] = js.native
  var loadingMessageTextVisible: js.UndefOr[Boolean] = js.native
  var loadingMessageTheme: js.UndefOr[String] = js.native
  var maxTransitionWidth: js.UndefOr[Double] = js.native
  var minScrollBack: js.UndefOr[Double] = js.native
  var ns: js.UndefOr[Double] = js.native
  var pageLoadErrorMessage: js.UndefOr[String] = js.native
  var pageLoadErrorMessageTheme: js.UndefOr[String] = js.native
  var phonegapNavigationEnabled: js.UndefOr[Boolean] = js.native
  var pushStateEnabled: js.UndefOr[Boolean] = js.native
  var subPageUrlKey: js.UndefOr[String] = js.native
  var touchOverflowEnabled: js.UndefOr[Boolean] = js.native
  var transitionFallbacks: js.Any = js.native
}

object JQueryMobileOptions {
  @scala.inline
  def apply(buttonMarkup: js.Any, transitionFallbacks: js.Any): JQueryMobileOptions = {
    val __obj = js.Dynamic.literal(buttonMarkup = buttonMarkup.asInstanceOf[js.Any], transitionFallbacks = transitionFallbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryMobileOptions]
  }
  @scala.inline
  implicit class JQueryMobileOptionsOps[Self <: JQueryMobileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonMarkup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionFallbacks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionFallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveBtnClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBtnClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveBtnClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBtnClass")(js.undefined)
        ret
    }
    @scala.inline
    def withActivePageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivePageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCrossDomainPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCrossDomainPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCrossDomainPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCrossDomainPages")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoInitializePage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInitializePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoInitializePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInitializePage")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDialogTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDialogTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDialogTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDialogTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPageTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPageTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPageTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPageTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxScrollForTransition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxScrollForTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetMaxScrollForTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxScrollForTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withGradeA(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradeA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradeA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradeA")(js.undefined)
        ret
    }
    @scala.inline
    def withHashListeningEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashListeningEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashListeningEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashListeningEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreContentEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreContentEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreContentEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreContentEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkBindingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkBindingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkBindingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkBindingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingMessageTextVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMessageTextVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingMessageTextVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMessageTextVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingMessageTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMessageTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingMessageTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMessageTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTransitionWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTransitionWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTransitionWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTransitionWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScrollBack(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScrollBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScrollBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScrollBack")(js.undefined)
        ret
    }
    @scala.inline
    def withNs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLoadErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLoadErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLoadErrorMessageTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadErrorMessageTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLoadErrorMessageTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadErrorMessageTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withPhonegapNavigationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phonegapNavigationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhonegapNavigationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phonegapNavigationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPushStateEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushStateEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushStateEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushStateEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSubPageUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPageUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubPageUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPageUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchOverflowEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchOverflowEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchOverflowEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchOverflowEnabled")(js.undefined)
        ret
    }
  }
  
}


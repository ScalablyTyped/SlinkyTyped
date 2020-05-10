package typingsSlinky.jquerySteps.JQuerySteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * The action container tag which will be used to wrap the pagination navigation. Default value is div.
    */
  var actionContainerTag: js.UndefOr[String] = js.native
  //#endregion "Templates"
  //#region "Behavior"
  /**
    * Sets the focus to the first wizard instance in order to enable the key navigation from the begining if true. Default value is false.
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /**
    * The body tag is used to find the step content within the declared wizard area. Default value is div.
    */
  var bodyTag: js.UndefOr[String] = js.native
  /**
    * The content container tag which will be used to wrap all step contents. Default value is div.
    */
  var contentContainerTag: js.UndefOr[String] = js.native
  /**
    * The css class which will be added to the outer component wrapper. Default value is wizard.
    */
  var cssClass: js.UndefOr[String] = js.native
  /**
    * Enables all steps from the begining if true (all steps are clickable). Default value is false.
    */
  var enableAllSteps: js.UndefOr[Boolean] = js.native
  /**
    * Shows the cancel button if enabled. Default value is false.
    */
  var enableCancelButton: js.UndefOr[Boolean] = js.native
  /**
    * Enables cache for async loaded or iframe embedded content. Default value is true.
    */
  var enableContentCache: js.UndefOr[Boolean] = js.native
  /**
    * Shows the finish button if enabled. Default value is true.
    */
  var enableFinishButton: js.UndefOr[Boolean] = js.native
  /**
    * Enables keyboard navigation if true (arrow left and arrow right). Default value is true.
    */
  var enableKeyNavigation: js.UndefOr[Boolean] = js.native
  /**
    * Enables pagination (next, previous and finish button) if true. Default value is true.
    */
  var enablePagination: js.UndefOr[Boolean] = js.native
  /**
    * Prevents jumping to a previous step. Default value is false.
    */
  var forceMoveForward: js.UndefOr[Boolean] = js.native
  //#region "Appearance"
  /**
    * The header tag is used to find the step button text within the declared wizard area. Default value is h1.
    */
  var headerTag: js.UndefOr[String] = js.native
  //#endregion "Events"
  //#region "Labels"
  var labels: js.UndefOr[LabelSettings] = js.native
  /**
    * The loading template which will be used to create the loading animation. Default value is <span class="spinner"></span> #text#.
    */
  var loadingTemplate: js.UndefOr[String] = js.native
  /**
    * Fires after cancellation.
    */
  var onCanceled: js.UndefOr[FunctionOnCancelled] = js.native
  /**
    * Fires after async content is loaded.
    */
  var onContentLoaded: js.UndefOr[FunctionOnContentLoaded] = js.native
  /**
    * Fires after completion.
    */
  var onFinished: js.UndefOr[FunctionOnFinished] = js.native
  /**
    * Fires before finishing and can be used to prevent completion by returning false. Very useful for form validation.
    */
  var onFinishing: js.UndefOr[FunctionOnFinishing] = js.native
  /**
    * Fires when the wizard is initialized.
    */
  var onInit: js.UndefOr[FunctionOnInit] = js.native
  /**
    * Fires after the step has changed.
    */
  var onStepChanged: js.UndefOr[FunctionOnStepChanged] = js.native
  //#endregion "Transition Effects"
  //#region "Events"
  /**
    * Fires before the step changes and can be used to prevent step changing by returning false.
    */
  var onStepChanging: js.UndefOr[FunctionOnStepChanging] = js.native
  /**
    * Saves the current state (step position) to a cookie. By coming next time the last active step becomes activated. Default value is false.
    */
  var saveState: js.UndefOr[Boolean] = js.native
  /**
    * Shows the finish button always (on each step; right beside the next button) if true. Otherwise the next button will be replaced by the finish button if the last step becomes active. Default value is false.
    */
  var showFinishButtonAlways: js.UndefOr[Boolean] = js.native
  /**
    * The position to start on (zero-based). Default value is 0.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The steps container tag which will be used to wrap the steps navigation. Default value is div.
    */
  var stepsContainerTag: js.UndefOr[String] = js.native
  /**
    * Determines whether the steps are vertically or horizontally oriented. Default value is horizontal or 0.
    * This can be horizontal (0) or vertical (1).
    */
  var stepsOrientation: js.UndefOr[String | Double] = js.native
  /**
    * Suppresses pagination if a form field is focused. Default value is true.
    */
  var suppressPaginationOnFocus: js.UndefOr[Boolean] = js.native
  //#endregion "Appearance"
  //#region "Templates"
  /**
    * The title template which will be used to create a step button. Default value is span class="number">#index#.</span> #title#.
    */
  var titleTemplate: js.UndefOr[String] = js.native
  //#endregion "Behavior"
  //#region "Transition Effects"
  /**
    * The animation effect which will be used for step transitions. Default value is none or 0.
    * This can be none (0), fade (1), slide (2) or slideLeft (3).
    */
  var transitionEffect: js.UndefOr[String | Double] = js.native
  /**
    * Animation speed for step transitions (in milliseconds). Default value is 200.
    */
  var transitionEffectSpeed: js.UndefOr[Double] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionContainerTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionContainerTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionContainerTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionContainerTag")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyTag")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainerTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerTag")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAllSteps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAllSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAllSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAllSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCancelButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableContentCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContentCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableContentCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContentCache")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFinishButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFinishButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFinishButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFinishButton")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKeyNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeyNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePagination")(js.undefined)
        ret
    }
    @scala.inline
    def withForceMoveForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMoveForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceMoveForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMoveForward")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTag")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: LabelSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanceled(value: /* event */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanceled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanceled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanceled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentLoaded(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentLoaded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnContentLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinished(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinished")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFinished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinished")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinishing(value: (/* event */ String, /* currentIndex */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFinishing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStepChanged(value: (/* event */ String, /* currentIndex */ Double, /* priorIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStepChanged")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnStepChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStepChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStepChanging(value: (/* event */ String, /* currentIndex */ Double, /* newIndex */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStepChanging")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnStepChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStepChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveState")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFinishButtonAlways(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFinishButtonAlways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFinishButtonAlways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFinishButtonAlways")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStepsContainerTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepsContainerTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepsContainerTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepsContainerTag")(js.undefined)
        ret
    }
    @scala.inline
    def withStepsOrientation(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepsOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepsOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepsOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressPaginationOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPaginationOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressPaginationOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPaginationOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEffect(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEffectSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEffectSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionEffectSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEffectSpeed")(js.undefined)
        ret
    }
  }
  
}


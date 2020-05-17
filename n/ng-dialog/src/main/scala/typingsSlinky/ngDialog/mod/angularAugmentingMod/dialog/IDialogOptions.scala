package typingsSlinky.ngDialog.mod.angularAugmentingMod.dialog

import typingsSlinky.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogOptions extends js.Object {
  /**
  			 * Unlike the className property, which overrides any default classes specified through the setDefaults() method (see docs), appendClassName allows for the addition of a class on top of any defaults.
  			 */
  var appendClassName: js.UndefOr[String] = js.native
  /**
  			 * Specify your element where to append dialog instance, accepts selector string (e.g. #yourId, .yourClass).
  			 * If not specified appends dialog to body as default behavior.
  			 */
  var appendTo: js.UndefOr[String] = js.native
  /**
  			 * When true, automatically selects appropriate values for any unspecified accessibility attributes. Default value is true
  			 */
  var ariaAuto: js.UndefOr[Boolean] = js.native
  /**
  			 * Specifies the value for the aria-describedby attribute that should be applied to the dialog element. Default value is null (unspecified)
  			 *
  			 * If specified, the value is not validated against the DOM.
  			 */
  var ariaDescribedById: js.UndefOr[String] = js.native
  /**
  		 * Specifies the CSS selector for the element to be referenced by the aria-describedby attribute on the dialog element. Default value is null (unspecified)
  		 *
  		 * If specified, the first matching element is used.
  		 */
  var ariaDescribedBySelector: js.UndefOr[String] = js.native
  /**
  			 * Specifies the value for the aria-labelledby attribute that should be applied to the dialog element.
  			 * Default value is null (unspecified)
  			 *
  			 * If specified, the value is not validated against the DOM
  			 */
  var ariaLabelledById: js.UndefOr[String] = js.native
  /**
  			 * Specifies the CSS selector for the element to be referenced by the aria-labelledby attribute on the dialog element. Default value is null (unspecified)
  			 *
  			 * If specified, the first matching element is used.
  			 */
  var ariaLabelledBySelector: js.UndefOr[String] = js.native
  /**
  			 * Specifies the value for the role attribute that should be applied to the dialog element. Default value is null (unspecified)
  			 */
  var ariaRole: js.UndefOr[String] = js.native
  /**
  			 * Pass false to disable template caching. Useful for developing purposes, default is true.
  			 */
  var cache: js.UndefOr[Boolean] = js.native
  /**
  			 * This option allows you to control the dialog's look, you can use built-in themes or create your own styled modals.
  			 * It will be appended with the "ngdialog" class e.g. className is "default-theme flat-ui" it will be class="ngdialog default-theme flat-ui".
  			 */
  var className: js.UndefOr[String] = js.native
  /**
  			 * It allows to close modals by clicking on overlay background, default true. If @see Hammer.js is loaded, it will listen for tap instead of click.
  			 */
  var closeByDocument: js.UndefOr[Boolean] = js.native
  /**
  			 * It allows to close modals by clicking Esc button, default true.
  			 * This will close all open modals if there several of them open at the same time.
  			 */
  var closeByEscape: js.UndefOr[Boolean] = js.native
  /**
  			 * Listens for $locationChangeSuccess event and closes open dialogs if true (also handles the ui.router $stateChangeSuccess event if ui.router is used)
  			 * default : false
  			 */
  var closeByNavigation: js.UndefOr[Boolean] = js.native
  /**
  			 * If true then animation for the dialog will be disabled, default false.
  			 */
  var disableAnimation: js.UndefOr[Boolean] = js.native
  /**
  		 * Specifies the height of the dialog content element. Default value is null (unspecified)
  		 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  			 * Give a name for a dialog instance. It is useful for identifying specific dialog if there are multiple dialog boxes opened.
  			 */
  var name: js.UndefOr[String | Double] = js.native
  /**
  			 * If false it allows to hide overlay div behind the modals, default true.
  			 */
  var overlay: js.UndefOr[Boolean] = js.native
  /**
  			 * If true allows to use plain string as template, default false.
  			 */
  var plain: js.UndefOr[Boolean] = js.native
  /**
  			 * Provide either the name of a function or a function to be called before the dialog is closed.
  			 * If the callback function specified in the option returns false then the dialog will not be closed.
  			 * Alternatively, if the callback function returns a promise that gets resolved the dialog will be closed.
  			 *
  			 * more: https://github.com/likeastore/ngDialog#preclosecallback-string--function
  			 */
  var preCloseCallback: js.UndefOr[String | Function] = js.native
  /**
  			 * When true, closing the dialog restores focus to the element that launched it. Designed to improve keyboard
  			 * accessibility. Default value is true
  			 */
  var preserveFocus: js.UndefOr[Boolean] = js.native
  /**
  			 * If false it allows to hide close button on modals, default true.
  			 */
  var showClose: js.UndefOr[Boolean] = js.native
  /**
  			 * When true, ensures that the focused element remains within the dialog to conform to accessibility recommendations.
  			 * Default value is true
  			 */
  var trapFocus: js.UndefOr[Boolean] = js.native
  /**
  		 * Specifies the width of the dialog content element. Default value is null (unspecified)
  		 */
  var width: js.UndefOr[String | Double] = js.native
}

object IDialogOptions {
  @scala.inline
  def apply(): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogOptions]
  }
  @scala.inline
  implicit class IDialogOptionsOps[Self <: IDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaAuto")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaDescribedById(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescribedById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedById")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaDescribedBySelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBySelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescribedBySelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelledById(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledById")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelledBySelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBySelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledBySelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaRole")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseByDocument(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseByDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseByEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseByEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseByNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseByNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPlain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(js.undefined)
        ret
    }
    @scala.inline
    def withPreCloseCallback(value: String | Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preCloseCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreCloseCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preCloseCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClose")(js.undefined)
        ret
    }
    @scala.inline
    def withTrapFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrapFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}


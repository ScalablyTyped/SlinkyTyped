package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.mod.IAugmentedJQuery
import typingsSlinky.angular.mod.IScope
import typingsSlinky.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalSettings extends js.Object {
  /**
    * Set to false to disable animations on new modal/backdrop. Does not toggle animations for modals/backdrops that are already displayed.
    *
    * @default true
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Appends the modal to a specific element.
    *
    * @default 'body'
    */
  var appendTo: js.UndefOr[IAugmentedJQuery] = js.native
  /**
    * Sets the `aria-describedby` property on the modal.
    * The string should be an id (without the leading '#') pointing to the element that describes your modal.
    * @type {string}
    * @memberOf IModalSettings
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    * Sets the `aria-labelledby` property on the modal.
    * The string should be an id (without the leading '#') pointing to the element that labels your modal.
    * @type {string}
    * @memberOf IModalSettings
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * controls the presence of a backdrop
    * Allowed values:
    *   - true (default)
    *   - false (no backdrop)
    *   - 'static' backdrop is present but modal window is not closed when clicking outside of the modal window
    *
    * @default true
    */
  var backdrop: js.UndefOr[Boolean | String] = js.native
  /**
    * additional CSS class(es) to be added to a modal backdrop template
    */
  var backdropClass: js.UndefOr[String] = js.native
  /**
    * When used with controllerAs and set to true, it will bind the controller properties onto the $scope directly.
    *
    * @default false
    */
  var bindToController: js.UndefOr[Boolean] = js.native
  /**
    * A string reference to the component to be rendered that is registered with Angular's compiler. If using a directive, the directive must have `restrict: 'E'` and a template or templateUrl set.
    *
    * It supports these bindings:
    *   - `close` - A method that can be used to close a modal, passing a result. The result must be passed in this format: `{$value: myResult}`
    *   - `dismiss` - A method that can be used to dismiss a modal, passing a result. The result must be passed in this format: `{$value: myRejectedResult}`
    *   - `modalInstance` - The modal instance. This is the same `$uibModalInstance` injectable found when using `controller`.
    *   - `resolve` - An object of the modal resolve values. See [UI Router resolves] for details.
    */
  var component: js.UndefOr[String] = js.native
  /**
    * a controller for a modal instance - it can initialize scope used by modal.
    * A controller can be injected with `$modalInstance`
    * If value is an array, it must be in Inline Array Annotation format for injection (strings followed by factory method)
    */
  var controller: js.UndefOr[String | Function | (js.Array[String | Function])] = js.native
  /**
    *  an alternative to the controller-as syntax, matching the API of directive definitions.
    *  Requires the controller option to be provided as well
    */
  var controllerAs: js.UndefOr[String] = js.native
  /**
    * indicates whether the dialog should be closable by hitting the ESC key
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * The  class added to the body element when the modal is opened.
    *
    * @default 'model-open'
    */
  var openedClass: js.UndefOr[String] = js.native
  /**
    * members that will be resolved and passed to the controller as locals; it is equivalent of the `resolve` property for AngularJS routes
    * If property value is an array, it must be in Inline Array Annotation format for injection (strings followed by factory method)
    */
  var resolve: js.UndefOr[StringDictionary[String | Function | (js.Array[String | Function]) | js.Object]] = js.native
  /**
    * a scope instance to be used for the modal's content (actually the $modal service is going to create a child scope of a provided scope).
    * Defaults to `$rootScope`.
    */
  var scope: js.UndefOr[IScope | IModalScope] = js.native
  /**
    * Optional suffix of modal window class. The value used is appended to the `modal-` class, i.e. a value of `sm` gives `modal-sm`.
    */
  var size: js.UndefOr[String] = js.native
  /**
    * inline template representing the modal's content
    */
  var template: js.UndefOr[String | js.Function0[String]] = js.native
  /**
    * a path to a template representing modal's content
    */
  var templateUrl: js.UndefOr[String | js.Function0[String]] = js.native
  /**
    * additional CSS class(es) to be added to a modal window template
    */
  var windowClass: js.UndefOr[String] = js.native
  /**
    * a path to a template overriding modal's window template
    */
  var windowTemplateUrl: js.UndefOr[String] = js.native
  /**
    * CSS class(es) to be added to the top modal window.
    */
  var windowTopClass: js.UndefOr[String] = js.native
}

object IModalSettings {
  @scala.inline
  def apply(): IModalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModalSettings]
  }
  @scala.inline
  implicit class IModalSettingsOps[Self <: IModalSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendTo(value: IAugmentedJQuery): Self = {
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
    def withAriaDescribedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelledBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdrop(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBindToController(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindToController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindToController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindToController")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: String): Self = {
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
    def withController(value: String | Function | (js.Array[String | Function])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.undefined)
        ret
    }
    @scala.inline
    def withControllerAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllerAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerAs")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: StringDictionary[String | Function | (js.Array[String | Function]) | js.Object]): Self = {
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
    def withScope(value: IScope | IModalScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTemplate(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrlFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowClass")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTemplateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTemplateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowTopClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTopClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTopClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTopClass")(js.undefined)
        ret
    }
  }
  
}


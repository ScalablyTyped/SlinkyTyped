package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.angular.JQuery
import typingsSlinky.angular.mod.IController
import typingsSlinky.angular.mod.IControllerConstructor
import typingsSlinky.angular.mod.IPromise
import typingsSlinky.angular.mod.IScope
import typingsSlinky.angular.mod.Injectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogOptions extends js.Object {
  var autoWrap: js.UndefOr[Boolean] = js.native
  var bindToController: js.UndefOr[Boolean] = js.native
   // default: true
  var clickOutsideToClose: js.UndefOr[Boolean] = js.native
  var closeTo: js.UndefOr[js.Any] = js.native
  var contentElement: js.UndefOr[String | Element] = js.native
   // default: true
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.native
  var controllerAs: js.UndefOr[String] = js.native
   // default: false
  var disableParentScroll: js.UndefOr[Boolean] = js.native
   // default: false
  var escapeToClose: js.UndefOr[Boolean] = js.native
   // default: true
  var focusOnOpen: js.UndefOr[Boolean] = js.native
  var fullscreen: js.UndefOr[Boolean] = js.native
   // default: true
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onComplete: js.UndefOr[js.Function2[/* scope */ IScope, /* element */ JQuery, Unit]] = js.native
  var onRemoving: js.UndefOr[js.Function2[/* element */ JQuery, /* removePromise */ IPromise[_], Unit]] = js.native
   // default: root node
  var onShowing: js.UndefOr[js.Function2[/* scope */ IScope, /* element */ JQuery, Unit]] = js.native
  var openFrom: js.UndefOr[js.Any] = js.native
  var parent: js.UndefOr[String | Element | JQuery] = js.native
   // default: new child scope
  var preserveScope: js.UndefOr[Boolean] = js.native
   // default: false
  var resolve: js.UndefOr[ResolveObject] = js.native
  var scope: js.UndefOr[IScope] = js.native
  var skipHide: js.UndefOr[Boolean] = js.native
   // default: true
  var targetEvent: js.UndefOr[MouseEvent] = js.native
  var template: js.UndefOr[String] = js.native
  var templateUrl: js.UndefOr[String] = js.native
   // default: false
  var title: js.UndefOr[String] = js.native
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
    def withAutoWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrap")(js.undefined)
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
    def withClickOutsideToClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOutsideToClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickOutsideToClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOutsideToClose")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTo")(js.undefined)
        ret
    }
    @scala.inline
    def withContentElementElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentElement(value: String | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(js.undefined)
        ret
    }
    @scala.inline
    def withControllerFunction1(value: /* repeated */ js.Any => Unit | IController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withController(value: String | Injectable[IControllerConstructor]): Self = {
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
    def withDisableParentScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableParentScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableParentScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableParentScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeToClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeToClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeToClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeToClose")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withLocals(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: (/* scope */ IScope, /* element */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoving(value: (/* element */ JQuery, /* removePromise */ IPromise[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoving")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRemoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoving")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowing(value: (/* scope */ IScope, /* element */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenFrom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withParentElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveScope")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: ResolveObject): Self = {
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
    def withScope(value: IScope): Self = {
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
    def withSkipHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHide")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
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
    def withTemplateUrl(value: String): Self = {
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}


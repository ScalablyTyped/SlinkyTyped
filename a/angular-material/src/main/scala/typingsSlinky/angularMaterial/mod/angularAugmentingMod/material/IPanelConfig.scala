package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.angular.JQuery
import typingsSlinky.angular.mod.IController
import typingsSlinky.angular.mod.IControllerConstructor
import typingsSlinky.angular.mod.Injectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelConfig extends js.Object {
   // default: false
  var animation: js.UndefOr[IPanelAnimation] = js.native
  var attachTo: js.UndefOr[String | JQuery | Element] = js.native
  var bindToController: js.UndefOr[Boolean] = js.native
  var clickOutsideToClose: js.UndefOr[Boolean] = js.native
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.native
  var controllerAs: js.UndefOr[String] = js.native
   // default: false
  var disableParentScroll: js.UndefOr[Boolean] = js.native
   // default: false
  var escapeToClose: js.UndefOr[Boolean] = js.native
   // default: false
  var focusOnOpen: js.UndefOr[Boolean] = js.native
   // default: true
  var fullscreen: js.UndefOr[Boolean] = js.native
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
   // default: true
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.native
  var onCloseSuccess: js.UndefOr[js.Function2[/* panel */ IPanelRef, /* closeReason */ String, _]] = js.native
   // default: false
  var onDomAdded: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.native
  var onDomRemoved: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.native
  var onOpenComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.native
  var onRemoving: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.native
  var origin: js.UndefOr[String | JQuery | Element] = js.native
  var panelClass: js.UndefOr[String] = js.native
   // default: 80
  var position: js.UndefOr[IPanelPosition] = js.native
  var propagateContainerEvents: js.UndefOr[Boolean] = js.native
  var resolve: js.UndefOr[ResolveObject] = js.native
  var template: js.UndefOr[String] = js.native
  var templateUrl: js.UndefOr[String] = js.native
   // default: false
  var trapFocus: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object IPanelConfig {
  @scala.inline
  def apply(): IPanelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanelConfig]
  }
  @scala.inline
  implicit class IPanelConfigOps[Self <: IPanelConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: IPanelAnimation): Self = {
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
    def withAttachToElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachTo(value: String | JQuery | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(js.undefined)
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withOnCloseSuccess(value: (/* panel */ IPanelRef, /* closeReason */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseSuccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCloseSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDomAdded(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDomAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDomAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDomAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDomRemoved(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDomRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDomRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDomRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenComplete(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpenComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoving(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoving")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoving")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: String | JQuery | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: IPanelPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagateContainerEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateContainerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagateContainerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateContainerEvents")(js.undefined)
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
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}


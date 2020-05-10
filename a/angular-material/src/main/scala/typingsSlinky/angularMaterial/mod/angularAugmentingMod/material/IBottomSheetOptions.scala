package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.angular.JQuery
import typingsSlinky.angular.mod.IController
import typingsSlinky.angular.mod.IControllerConstructor
import typingsSlinky.angular.mod.IScope
import typingsSlinky.angular.mod.Injectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBottomSheetOptions extends js.Object {
  var bindToController: js.UndefOr[Boolean] = js.native
  var clickOutsideToClose: js.UndefOr[Boolean] = js.native
   // default: false
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.native
  var controllerAs: js.UndefOr[String] = js.native
   // default: false
  var disableBackdrop: js.UndefOr[Boolean] = js.native
   // default: root node
  var disableParentScroll: js.UndefOr[Boolean] = js.native
  var escapeToClose: js.UndefOr[Boolean] = js.native
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.native
  var parent: js.UndefOr[
    (js.Function2[/* scope */ IScope, /* element */ JQuery, Element | JQuery]) | String | Element | JQuery
  ] = js.native
   // default: new child scope
  var preserveScope: js.UndefOr[Boolean] = js.native
  var resolve: js.UndefOr[ResolveObject] = js.native
  var scope: js.UndefOr[IScope] = js.native
  var template: js.UndefOr[String] = js.native
  var templateUrl: js.UndefOr[String] = js.native
}

object IBottomSheetOptions {
  @scala.inline
  def apply(): IBottomSheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBottomSheetOptions]
  }
  @scala.inline
  implicit class IBottomSheetOptionsOps[Self <: IBottomSheetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDisableBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBackdrop")(js.undefined)
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
    def withParentFunction2(value: (/* scope */ IScope, /* element */ JQuery) => Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withParentElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(
      value: (js.Function2[/* scope */ IScope, /* element */ JQuery, Element | JQuery]) | String | Element | JQuery
    ): Self = {
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
  }
  
}


package typingsSlinky.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.JQLite
import typingsSlinky.angular.angularStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirective[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends js.Object {
  /**
    * Deprecation warning: although bindings for non-ES6 class controllers are currently bound to this before
    * the controller constructor is called, this use is now deprecated. Please place initialization code that
    * relies upon bindings inside a $onInit method on the controller, instead.
    */
  var bindToController: js.UndefOr[Boolean | StringDictionary[String]] = js.native
  var compile: js.UndefOr[IDirectiveCompileFn[TScope, TElement, TAttributes, TController]] = js.native
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.native
  var controllerAs: js.UndefOr[String] = js.native
  var link: js.UndefOr[
    (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
  ] = js.native
  var multiElement: js.UndefOr[Boolean] = js.native
  var priority: js.UndefOr[Double] = js.native
  /**
    * @deprecated
    */
  var replace: js.UndefOr[Boolean] = js.native
  var require: js.UndefOr[String | js.Array[String] | StringDictionary[String]] = js.native
  var restrict: js.UndefOr[String] = js.native
  var scope: js.UndefOr[Boolean | StringDictionary[String]] = js.native
  var template: js.UndefOr[
    String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])
  ] = js.native
  var templateNamespace: js.UndefOr[String] = js.native
  var templateUrl: js.UndefOr[
    String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])
  ] = js.native
  var terminal: js.UndefOr[Boolean] = js.native
  var transclude: js.UndefOr[Boolean | element | StringDictionary[String]] = js.native
}

object IDirective {
  @scala.inline
  def apply[TScope, TElement, TAttributes, TController](): IDirective[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirective[TScope, TElement, TAttributes, TController]]
  }
  @scala.inline
  implicit class IDirectiveOps[Self[tscope, telement, tattributes, tcontroller] <: IDirective[tscope, telement, tattributes, tcontroller], TScope, TElement, TAttributes, TController] (val x: Self[TScope, TElement, TAttributes, TController]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TScope, TElement, TAttributes, TController] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TScope, TElement, TAttributes, TController]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TScope, TElement, TAttributes, TController]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TScope, TElement, TAttributes, TController]) with Other]
    @scala.inline
    def withBindToController(value: Boolean | StringDictionary[String]): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindToController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindToController: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindToController")(js.undefined)
        ret
    }
    @scala.inline
    def withCompile(
      value: (TElement, TAttributes, /* transclude */ ITranscludeFunction) => Unit | (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
    ): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCompile: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.undefined)
        ret
    }
    @scala.inline
    def withControllerFunction1(value: /* repeated */ js.Any => Unit | IController): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withController(value: String | Injectable[IControllerConstructor]): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutController: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.undefined)
        ret
    }
    @scala.inline
    def withControllerAs(value: String): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllerAs: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerAs")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkFunction5(
      value: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withLink(
      value: (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
    ): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiElement(value: Boolean): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiElement: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiElement")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: Boolean): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire(value: String | js.Array[String] | StringDictionary[String]): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrict(value: String): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrict: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrict")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: Boolean | StringDictionary[String]): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFunction2(value: (/* tElement */ TElement, /* tAttrs */ TAttributes) => String): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTemplate(value: String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateNamespace(value: String): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateNamespace: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrlFunction2(value: (/* tElement */ TElement, /* tAttrs */ TAttributes) => String): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminal(value: Boolean): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminal: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminal")(js.undefined)
        ret
    }
    @scala.inline
    def withTransclude(value: Boolean | element | StringDictionary[String]): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransclude: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transclude")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.angularEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component interface
  * @see https://docs.angularjs.org/guide/component
  */
@js.native
trait iComponent extends js.Object {
  var bindings: js.UndefOr[js.Object] = js.native
  var controllerAs: js.UndefOr[String] = js.native
  var require: js.UndefOr[String] = js.native
  var selector: String = js.native
  var template: String = js.native
  var templateUrl: js.UndefOr[String] = js.native
  var transclude: js.UndefOr[String] = js.native
}

object iComponent {
  @scala.inline
  def apply(selector: String, template: String): iComponent = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[iComponent]
  }
  @scala.inline
  implicit class iComponentOps[Self <: iComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindings(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
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
    def withRequire(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.undefined)
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
    def withTransclude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transclude")(js.undefined)
        ret
    }
  }
  
}


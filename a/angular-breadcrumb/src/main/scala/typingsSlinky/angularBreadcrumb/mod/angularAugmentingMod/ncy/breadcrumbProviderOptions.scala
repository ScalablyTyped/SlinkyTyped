package typingsSlinky.angularBreadcrumb.mod.angularAugmentingMod.ncy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait breadcrumbProviderOptions extends js.Object {
  /**
    * If true, abstract states are included in the breadcrumb. This option has a lower priority than the state-specific option skip
    **/
  var includeAbstract: js.UndefOr[Boolean] = js.native
  /**
    * An existing state's name to be the state is the first step of the breadcrumb
    **/
  var prefixStateName: js.UndefOr[String] = js.native
  /**
    * Contains a predefined template's name; 'bootstrap3' (default), 'bootstrap2' or HTML for a custom template. This property is ignored if templateUrl is defined.
    **/
  var template: js.UndefOr[String] = js.native
  /**
    * Contains the path to a template file. This property takes precedence over the template property.
    **/
  var templateUrl: js.UndefOr[String] = js.native
}

object breadcrumbProviderOptions {
  @scala.inline
  def apply(): breadcrumbProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[breadcrumbProviderOptions]
  }
  @scala.inline
  implicit class breadcrumbProviderOptionsOps[Self <: breadcrumbProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeAbstract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAbstract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAbstract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAbstract")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixStateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixStateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixStateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixStateName")(js.undefined)
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


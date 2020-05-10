package typingsSlinky.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.JQLite
import typingsSlinky.angular.mod.IAttributes
import typingsSlinky.angular.mod.IController
import typingsSlinky.angular.mod.IDirectiveLinkFn
import typingsSlinky.angular.mod.IScope
import typingsSlinky.angular.mod.ITranscludeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 *
	 *
	 * see http://docs.angular-formly.com/docs/custom-templates#section-formlyconfig-settype-options
	 */
@js.native
trait ITypeOptions extends js.Object {
  var apiCheck: js.UndefOr[StringDictionary[js.Function]] = js.native
  var apiCheckFunction: js.UndefOr[String] = js.native
   //'throw' or 'warn
  var apiCheckInstance: js.UndefOr[js.Any] = js.native
  var apiCheckOptions: js.UndefOr[js.Object] = js.native
  var controller: js.UndefOr[js.Function | String | js.Array[_]] = js.native
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  var defaultOptions: js.UndefOr[IFieldConfigurationObject | js.Function] = js.native
  var `extends`: js.UndefOr[String] = js.native
  var link: js.UndefOr[IDirectiveLinkFn[IScope, JQLite, IAttributes, IController]] = js.native
  var name: String = js.native
  var overwriteOk: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[js.Function | String] = js.native
  var templateUrl: js.UndefOr[js.Function | String] = js.native
  var validateOptions: js.UndefOr[js.Function] = js.native
  var wrapper: js.UndefOr[String | js.Array[String]] = js.native
}

object ITypeOptions {
  @scala.inline
  def apply(name: String): ITypeOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeOptions]
  }
  @scala.inline
  implicit class ITypeOptionsOps[Self <: ITypeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiCheck(value: StringDictionary[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withApiCheckFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCheckFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiCheckFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCheckFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withApiCheckInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCheckInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiCheckInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCheckInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withApiCheckOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCheckOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiCheckOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCheckOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withController(value: js.Function | String | js.Array[_]): Self = {
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
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOptions(value: IFieldConfigurationObject | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtends(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(
      value: (IScope, JQLite, IAttributes, /* controller */ js.UndefOr[IController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwriteOk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteOk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwriteOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteOk")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: js.Function | String): Self = {
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
    def withTemplateUrl(value: js.Function | String): Self = {
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
    def withValidateOptions(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapper(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWrapperOptions extends js.Object {
  var apiCheck: js.UndefOr[StringDictionary[js.Function]] = js.native
  var apiCheckFunction: js.UndefOr[String] = js.native
   //'throw' or 'warn
  var apiCheckInstance: js.UndefOr[js.Any] = js.native
  var apiCheckOptions: js.UndefOr[js.Object] = js.native
  var name: js.UndefOr[String] = js.native
  var overwriteOk: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String] = js.native
  var templateUrl: js.UndefOr[String] = js.native
  var types: js.UndefOr[js.Array[String]] = js.native
  var validateOptions: js.UndefOr[js.Function] = js.native
}

object IWrapperOptions {
  @scala.inline
  def apply(): IWrapperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWrapperOptions]
  }
  @scala.inline
  implicit class IWrapperOptionsOps[Self <: IWrapperOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withName(value: String): Self = {
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
    def withTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
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
  }
  
}


package typingsSlinky.handlebars.Handlebars

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.handlebars.HandlebarsTemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeOptions extends js.Object {
  var allowCallsToHelperMissing: js.UndefOr[Boolean] = js.native
  var allowProtoMethodsByDefault: js.UndefOr[Boolean] = js.native
  var allowProtoPropertiesByDefault: js.UndefOr[Boolean] = js.native
  var allowedProtoMethods: js.UndefOr[StringDictionary[Boolean]] = js.native
  var allowedProtoProperties: js.UndefOr[StringDictionary[Boolean]] = js.native
  var blockParams: js.UndefOr[js.Array[_]] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var decorators: js.UndefOr[StringDictionary[js.Function]] = js.native
  var depths: js.UndefOr[js.Array[_]] = js.native
  var helpers: js.UndefOr[StringDictionary[js.Function]] = js.native
  var partial: js.UndefOr[Boolean] = js.native
  var partials: js.UndefOr[StringDictionary[HandlebarsTemplateDelegate[_]]] = js.native
}

object RuntimeOptions {
  @scala.inline
  def apply(): RuntimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeOptions]
  }
  @scala.inline
  implicit class RuntimeOptionsOps[Self <: RuntimeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCallsToHelperMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCallsToHelperMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCallsToHelperMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCallsToHelperMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowProtoMethodsByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowProtoMethodsByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowProtoMethodsByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowProtoMethodsByDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowProtoPropertiesByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowProtoPropertiesByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowProtoPropertiesByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowProtoPropertiesByDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedProtoMethods(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedProtoMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedProtoMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedProtoMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedProtoProperties(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedProtoProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedProtoProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedProtoProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockParams")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
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
    def withDecorators(value: StringDictionary[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(js.undefined)
        ret
    }
    @scala.inline
    def withDepths(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depths")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpers(value: StringDictionary[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(js.undefined)
        ret
    }
    @scala.inline
    def withPartial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(js.undefined)
        ret
    }
    @scala.inline
    def withPartials(value: StringDictionary[HandlebarsTemplateDelegate[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partials")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacroOpts extends js.Object {
  var attributes: js.UndefOr[js.Array[String]] = js.native
  var css: js.UndefOr[String | CssFn] = js.native
  var cssData: js.UndefOr[ValueMap] = js.native
  var cssId: js.UndefOr[String] = js.native
  var noCssTransform: js.UndefOr[Boolean] = js.native
  var partials: js.UndefOr[PartialMap] = js.native
  var template: js.UndefOr[Template] = js.native
}

object MacroOpts {
  @scala.inline
  def apply(): MacroOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacroOpts]
  }
  @scala.inline
  implicit class MacroOptsOps[Self <: MacroOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCssFunction1(value: /* data */ DataGetFn => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCss(value: String | CssFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withCssData(value: ValueMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssData")(js.undefined)
        ret
    }
    @scala.inline
    def withCssId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssId")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCssTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCssTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCssTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCssTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withPartials(value: PartialMap): Self = {
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
    @scala.inline
    def withTemplateFunction1(value: /* helper */ ParseHelper => String | (js.Array[js.Object | String]) | ParsedTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTemplate(value: Template): Self = {
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
  }
  
}


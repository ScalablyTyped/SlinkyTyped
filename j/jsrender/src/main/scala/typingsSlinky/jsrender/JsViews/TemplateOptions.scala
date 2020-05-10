package typingsSlinky.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateOptions extends js.Object {
  var converters: js.UndefOr[Hash[Converter]] = js.native
  var helpers: js.UndefOr[Hash[_]] = js.native
  var markup: js.Any = js.native
  /* Template options hash */
  var tags: js.UndefOr[Hash[TagSetter]] = js.native
  var templates: js.UndefOr[Hash[TemplateSetter]] = js.native
  var useViews: js.UndefOr[Boolean] = js.native
}

object TemplateOptions {
  @scala.inline
  def apply(markup: js.Any): TemplateOptions = {
    val __obj = js.Dynamic.literal(markup = markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateOptions]
  }
  @scala.inline
  implicit class TemplateOptionsOps[Self <: TemplateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConverters(value: Hash[Converter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converters")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpers(value: Hash[_]): Self = {
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
    def withTags(value: Hash[TagSetter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: Hash[TemplateSetter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
    @scala.inline
    def withUseViews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useViews")(js.undefined)
        ret
    }
  }
  
}


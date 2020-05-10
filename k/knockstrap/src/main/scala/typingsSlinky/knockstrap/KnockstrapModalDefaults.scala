package typingsSlinky.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapModalDefaults extends js.Object {
  var attributes: KnockstrapModalDefaultsAttributes = js.native
  var bodyTemplate: KnockstrapDefaultsTemplateBase = js.native
  var css: String = js.native
  var footerTemplate: KnockstrapModalDefaultsFooterTemplate = js.native
  var headerTemplate: KnockstrapDefaultsTemplateBase = js.native
}

object KnockstrapModalDefaults {
  @scala.inline
  def apply(
    attributes: KnockstrapModalDefaultsAttributes,
    bodyTemplate: KnockstrapDefaultsTemplateBase,
    css: String,
    footerTemplate: KnockstrapModalDefaultsFooterTemplate,
    headerTemplate: KnockstrapDefaultsTemplateBase
  ): KnockstrapModalDefaults = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], bodyTemplate = bodyTemplate.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], footerTemplate = footerTemplate.asInstanceOf[js.Any], headerTemplate = headerTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapModalDefaults]
  }
  @scala.inline
  implicit class KnockstrapModalDefaultsOps[Self <: KnockstrapModalDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: KnockstrapModalDefaultsAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyTemplate(value: KnockstrapDefaultsTemplateBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterTemplate(value: KnockstrapModalDefaultsFooterTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTemplate(value: KnockstrapDefaultsTemplateBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


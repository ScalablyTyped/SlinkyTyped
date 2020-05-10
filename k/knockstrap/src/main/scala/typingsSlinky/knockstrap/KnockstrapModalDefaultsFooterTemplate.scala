package typingsSlinky.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapModalDefaultsFooterTemplate extends KnockstrapDefaultsTemplateBase {
  var data: KnockstrapModalDefaultsFooterData = js.native
}

object KnockstrapModalDefaultsFooterTemplate {
  @scala.inline
  def apply(
    data: KnockstrapModalDefaultsFooterData,
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapModalDefaultsFooterTemplate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapModalDefaultsFooterTemplate]
  }
  @scala.inline
  implicit class KnockstrapModalDefaultsFooterTemplateOps[Self <: KnockstrapModalDefaultsFooterTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: KnockstrapModalDefaultsFooterData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


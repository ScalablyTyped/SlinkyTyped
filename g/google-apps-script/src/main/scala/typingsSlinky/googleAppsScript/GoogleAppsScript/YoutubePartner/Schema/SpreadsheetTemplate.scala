package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetTemplate extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var templateContent: js.UndefOr[String] = js.native
  var templateName: js.UndefOr[String] = js.native
  var templateType: js.UndefOr[String] = js.native
}

object SpreadsheetTemplate {
  @scala.inline
  def apply(): SpreadsheetTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetTemplate]
  }
  @scala.inline
  implicit class SpreadsheetTemplateOps[Self <: SpreadsheetTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateType")(js.undefined)
        ret
    }
  }
  
}


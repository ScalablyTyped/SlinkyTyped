package typingsSlinky.googleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTemplate extends js.Object {
  var template: js.UndefOr[Sheet] = js.native
}

object AnonTemplate {
  @scala.inline
  def apply(): AnonTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTemplate]
  }
  @scala.inline
  implicit class AnonTemplateOps[Self <: AnonTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate(value: Sheet): Self = {
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


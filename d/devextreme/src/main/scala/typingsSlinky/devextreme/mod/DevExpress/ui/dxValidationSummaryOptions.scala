package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxValidationSummaryOptions extends CollectionWidgetOptions[dxValidationSummary] {
  /** Specifies the validation group for which summary should be generated. */
  var validationGroup: js.UndefOr[String] = js.native
}

object dxValidationSummaryOptions {
  @scala.inline
  def apply(): dxValidationSummaryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidationSummaryOptions]
  }
  @scala.inline
  implicit class dxValidationSummaryOptionsOps[Self <: dxValidationSummaryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidationGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationGroup")(js.undefined)
        ret
    }
  }
  
}


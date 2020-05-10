package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearGaugeExportSVGOptions extends js.Object {
  var raw: js.UndefOr[Boolean] = js.native
}

object LinearGaugeExportSVGOptions {
  @scala.inline
  def apply(): LinearGaugeExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGaugeExportSVGOptions]
  }
  @scala.inline
  implicit class LinearGaugeExportSVGOptionsOps[Self <: LinearGaugeExportSVGOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
  }
  
}


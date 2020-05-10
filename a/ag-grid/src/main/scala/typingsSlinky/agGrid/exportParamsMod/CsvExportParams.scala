package typingsSlinky.agGrid.exportParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvExportParams extends ExportParams[String] {
  var columnSeparator: js.UndefOr[String] = js.native
}

object CsvExportParams {
  @scala.inline
  def apply(): CsvExportParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvExportParams]
  }
  @scala.inline
  implicit class CsvExportParamsOps[Self <: CsvExportParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSeparator")(js.undefined)
        ret
    }
  }
  
}


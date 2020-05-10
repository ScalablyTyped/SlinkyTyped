package typingsSlinky.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.CsvWriteOptions> */
@js.native
trait PartialCsvWriteOptions extends js.Object {
  var dateFormat: js.UndefOr[String] = js.native
  var dateUTC: js.UndefOr[Boolean] = js.native
}

object PartialCsvWriteOptions {
  @scala.inline
  def apply(): PartialCsvWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCsvWriteOptions]
  }
  @scala.inline
  implicit class PartialCsvWriteOptionsOps[Self <: PartialCsvWriteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDateUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateUTC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUTC")(js.undefined)
        ret
    }
  }
  
}


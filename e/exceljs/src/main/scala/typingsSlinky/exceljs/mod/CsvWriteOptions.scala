package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvWriteOptions extends js.Object {
  var dateFormat: String = js.native
  var dateUTC: Boolean = js.native
}

object CsvWriteOptions {
  @scala.inline
  def apply(dateFormat: String, dateUTC: Boolean): CsvWriteOptions = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dateUTC = dateUTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsvWriteOptions]
  }
  @scala.inline
  implicit class CsvWriteOptionsOps[Self <: CsvWriteOptions] (val x: Self) extends AnyVal {
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
    def withDateUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUTC")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


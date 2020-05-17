package typingsSlinky.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.CsvReadOptions> */
@js.native
trait PartialCsvReadOptions extends js.Object {
  var dateFormats: js.UndefOr[js.Array[String]] = js.native
  var map: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ Double, _]] = js.native
}

object PartialCsvReadOptions {
  @scala.inline
  def apply(): PartialCsvReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCsvReadOptions]
  }
  @scala.inline
  implicit class PartialCsvReadOptionsOps[Self <: PartialCsvReadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: (/* value */ js.Any, /* index */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
  }
  
}


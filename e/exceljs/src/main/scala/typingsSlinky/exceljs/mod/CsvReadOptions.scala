package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvReadOptions extends js.Object {
  var dateFormats: js.Array[String] = js.native
  def map(value: js.Any, index: Double): js.Any = js.native
}

object CsvReadOptions {
  @scala.inline
  def apply(dateFormats: js.Array[String], map: (js.Any, Double) => js.Any): CsvReadOptions = {
    val __obj = js.Dynamic.literal(dateFormats = dateFormats.asInstanceOf[js.Any], map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[CsvReadOptions]
  }
  @scala.inline
  implicit class CsvReadOptionsOps[Self <: CsvReadOptions] (val x: Self) extends AnyVal {
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
    def withMap(value: (js.Any, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


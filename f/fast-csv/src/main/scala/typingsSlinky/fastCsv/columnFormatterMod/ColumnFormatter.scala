package typingsSlinky.fastCsv.columnFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnFormatter extends js.Object {
  def format(col: String): String = js.native
}

object ColumnFormatter {
  @scala.inline
  def apply(format: String => String): ColumnFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
    __obj.asInstanceOf[ColumnFormatter]
  }
  @scala.inline
  implicit class ColumnFormatterOps[Self <: ColumnFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


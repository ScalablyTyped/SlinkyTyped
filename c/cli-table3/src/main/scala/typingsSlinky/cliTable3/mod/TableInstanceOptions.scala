package typingsSlinky.cliTable3.mod

import typingsSlinky.cliTable3.AnonBorder
import typingsSlinky.cliTable3.RecordCharNamestring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableInstanceOptions extends TableOptions {
  var chars: RecordCharNamestring = js.native
  var style: AnonBorder = js.native
}

object TableInstanceOptions {
  @scala.inline
  def apply(
    chars: RecordCharNamestring,
    colAligns: js.Array[HorizontalAlignment],
    colWidths: js.Array[Double | Null],
    head: js.Array[String],
    rowAligns: js.Array[VerticalAlignment],
    rowHeights: js.Array[Double | Null],
    style: AnonBorder,
    truncate: String,
    wordWrap: Boolean
  ): TableInstanceOptions = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableInstanceOptions]
  }
  @scala.inline
  implicit class TableInstanceOptionsOps[Self <: TableInstanceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChars(value: RecordCharNamestring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: AnonBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


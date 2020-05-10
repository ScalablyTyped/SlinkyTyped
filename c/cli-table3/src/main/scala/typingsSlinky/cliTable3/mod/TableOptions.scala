package typingsSlinky.cliTable3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOptions extends js.Object {
  var colAligns: js.Array[HorizontalAlignment] = js.native
  var colWidths: js.Array[Double | Null] = js.native
  var head: js.Array[String] = js.native
  var rowAligns: js.Array[VerticalAlignment] = js.native
  var rowHeights: js.Array[Double | Null] = js.native
  var truncate: String = js.native
  var wordWrap: Boolean = js.native
}

object TableOptions {
  @scala.inline
  def apply(
    colAligns: js.Array[HorizontalAlignment],
    colWidths: js.Array[Double | Null],
    head: js.Array[String],
    rowAligns: js.Array[VerticalAlignment],
    rowHeights: js.Array[Double | Null],
    truncate: String,
    wordWrap: Boolean
  ): TableOptions = {
    val __obj = js.Dynamic.literal(colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColAligns(value: js.Array[HorizontalAlignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colAligns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColWidths(value: js.Array[Double | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowAligns(value: js.Array[VerticalAlignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAligns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeights(value: js.Array[Double | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruncate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


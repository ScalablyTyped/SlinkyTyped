package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssClassNames extends js.Object {
  var headerCell: js.UndefOr[String] = js.native
  var headerRow: js.UndefOr[String] = js.native
  var hoverTableRow: js.UndefOr[String] = js.native
  var oddTableRow: js.UndefOr[String] = js.native
  var rowNumberCell: js.UndefOr[String] = js.native
  var selectedTableRow: js.UndefOr[String] = js.native
  var tableCell: js.UndefOr[String] = js.native
  var tableRow: js.UndefOr[String] = js.native
}

object CssClassNames {
  @scala.inline
  def apply(): CssClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssClassNames]
  }
  @scala.inline
  implicit class CssClassNamesOps[Self <: CssClassNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCell")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverTableRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverTableRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverTableRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverTableRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOddTableRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oddTableRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOddTableRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oddTableRow")(js.undefined)
        ret
    }
    @scala.inline
    def withRowNumberCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNumberCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNumberCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNumberCell")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedTableRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTableRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedTableRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTableRow")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCell")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRow")(js.undefined)
        ret
    }
  }
  
}


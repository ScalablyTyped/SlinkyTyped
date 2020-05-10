package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryRow extends js.Object {
  /** Gets or sets a value that indicates whether to show the summary value within the group caption area for the corresponding summary column while grouping the column
    * @Default {false}
    */
  var showCaptionSummary: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to show the group summary value for the corresponding summary column while grouping a column
    * @Default {false}
    */
  var showGroupSummary: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to show the total summary value the for the corresponding summary column. The summary row is added after the grid content.
    * @Default {true}
    */
  var showTotalSummary: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to add summary columns into the summary rows.
    * @Default {[]}
    */
  var summaryColumns: js.UndefOr[js.Array[SummaryRowsSummaryColumn]] = js.native
  /** This specifies the grid to show the title for the summary rows.
    */
  var title: js.UndefOr[String] = js.native
  /** This specifies the grid to show the title of summary row in the specified column.
    * @Default {null}
    */
  var titleColumn: js.UndefOr[String] = js.native
}

object SummaryRow {
  @scala.inline
  def apply(): SummaryRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryRow]
  }
  @scala.inline
  implicit class SummaryRowOps[Self <: SummaryRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowCaptionSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCaptionSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCaptionSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCaptionSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGroupSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGroupSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTotalSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotalSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTotalSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotalSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryColumns(value: js.Array[SummaryRowsSummaryColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColumn")(js.undefined)
        ret
    }
  }
  
}


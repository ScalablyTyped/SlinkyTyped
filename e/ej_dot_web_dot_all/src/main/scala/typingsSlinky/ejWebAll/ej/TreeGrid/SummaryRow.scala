package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryRow extends js.Object {
  /** Specifies the summary columns in the summary rows.
    */
  var summaryColumns: js.UndefOr[js.Array[SummaryRowsSummaryColumn]] = js.native
  /** Specifies the title for summary row collection in TreeGrid
    */
  var title: js.UndefOr[String] = js.native
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
  }
  
}


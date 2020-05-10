package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryRowsSummaryColumn extends js.Object {
  /** Specifies the custom summary calculate function or text.
    */
  var customSummaryValue: js.UndefOr[String] = js.native
  /** Specifies summary column used to perform the summary calculation.
    */
  var dataMember: js.UndefOr[String] = js.native
  /** Specifies the required column to display the summary.
    */
  var displayColumn: js.UndefOr[String] = js.native
  /** Specifies the format to be applied on the summary column value.
    */
  var format: js.UndefOr[String] = js.native
  /** Specifies the text to be displayed before the summary column value.
    */
  var prefix: js.UndefOr[String] = js.native
  /** Specifies the text to be displayed after the summary column value.
    */
  var suffix: js.UndefOr[String] = js.native
  /** Specifies the summary type to perform calculations in a corresponding summary column. See summaryType.
    */
  var summaryType: js.UndefOr[SummaryType | String] = js.native
}

object SummaryRowsSummaryColumn {
  @scala.inline
  def apply(): SummaryRowsSummaryColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryRowsSummaryColumn]
  }
  @scala.inline
  implicit class SummaryRowsSummaryColumnOps[Self <: SummaryRowsSummaryColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomSummaryValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSummaryValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSummaryValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSummaryValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMember(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMember")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryType(value: SummaryType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryType")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryRowsSummaryColumn extends js.Object {
  /** Gets or sets a value that indicates the text displayed in the summary column as a value
    * @Default {null}
    */
  var customSummaryValue: js.UndefOr[String] = js.native
  /** This specifies summary column used to perform the summary calculation
    * @Default {null}
    */
  var dataMember: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define the target column at which to display the summary.
    * @Default {null}
    */
  var displayColumn: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the format for the text applied on the column
    * @Default {null}
    */
  var format: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the text displayed before the summary column value
    * @Default {null}
    */
  var prefix: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the text displayed after the summary column value
    * @Default {null}
    */
  var suffix: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the type of calculations to be performed for the corresponding summary column. See summaryType.
    * @Default {[]}
    */
  var summaryType: js.UndefOr[SummaryType | String] = js.native
  /** Gets or sets a value that indicates to add the template for the summary value of dataMember given.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
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
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}


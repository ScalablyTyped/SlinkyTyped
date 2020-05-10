package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition of how a value in a pivot table should be calculated.
  */
@js.native
trait SchemaPivotValue extends js.Object {
  /**
    * If specified, indicates that pivot values should be displayed as the
    * result of a calculation with another pivot value. For example, if
    * calculated_display_type is specified as PERCENT_OF_GRAND_TOTAL, all the
    * pivot values are displayed as the percentage of the grand total. In the
    * Sheets UI, this is referred to as &quot;Show As&quot; in the value
    * section of a pivot table.
    */
  var calculatedDisplayType: js.UndefOr[String] = js.native
  /**
    * A custom formula to calculate the value.  The formula must start with an
    * `=` character.
    */
  var formula: js.UndefOr[String] = js.native
  /**
    * A name to use for the value.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The column offset of the source range that this value reads from.  For
    * example, if the source was `C10:E15`, a `sourceColumnOffset` of `0` means
    * this value refers to column `C`, whereas the offset `1` would refer to
    * column `D`.
    */
  var sourceColumnOffset: js.UndefOr[Double] = js.native
  /**
    * A function to summarize the value. If formula is set, the only supported
    * values are SUM and CUSTOM. If sourceColumnOffset is set, then `CUSTOM` is
    * not supported.
    */
  var summarizeFunction: js.UndefOr[String] = js.native
}

object SchemaPivotValue {
  @scala.inline
  def apply(): SchemaPivotValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotValue]
  }
  @scala.inline
  implicit class SchemaPivotValueOps[Self <: SchemaPivotValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculatedDisplayType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedDisplayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculatedDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedDisplayType")(js.undefined)
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceColumnOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumnOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceColumnOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumnOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSummarizeFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summarizeFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummarizeFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summarizeFunction")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.`var`
import typingsSlinky.exceljs.exceljsStrings.average
import typingsSlinky.exceljs.exceljsStrings.count
import typingsSlinky.exceljs.exceljsStrings.countNums
import typingsSlinky.exceljs.exceljsStrings.custom
import typingsSlinky.exceljs.exceljsStrings.max
import typingsSlinky.exceljs.exceljsStrings.min
import typingsSlinky.exceljs.exceljsStrings.none_
import typingsSlinky.exceljs.exceljsStrings.stdDev
import typingsSlinky.exceljs.exceljsStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableColumnProperties extends js.Object {
  /**
  	  * Switches the filter control in the header
  	  * @default false
  	  */
  var filterButton: js.UndefOr[Boolean] = js.native
  /**
  	  * The name of the column, also used in the header
  	  */
  var name: String = js.native
  /**
  	  * Optional formula for custom functions
  	  */
  var totalsRowFormula: js.UndefOr[String] = js.native
  /**
  	  * Name of the totals function
  	  * @default 'none'
  	  */
  var totalsRowFunction: js.UndefOr[none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom] = js.native
  /**
  	  * Label to describe the totals row (first column)
  	  * @default 'Total'
  	  */
  var totalsRowLabel: js.UndefOr[String] = js.native
}

object TableColumnProperties {
  @scala.inline
  def apply(name: String): TableColumnProperties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnProperties]
  }
  @scala.inline
  implicit class TableColumnPropertiesOps[Self <: TableColumnProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalsRowFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRowFormula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalsRowFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRowFormula")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalsRowFunction(value: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRowFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalsRowFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRowFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalsRowLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRowLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalsRowLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRowLabel")(js.undefined)
        ret
    }
  }
  
}


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

/* Inlined std.Required<exceljs.exceljs.TableColumnProperties> */
@js.native
trait TableColumn extends js.Object {
  var filterButton: Boolean = js.native
  var name: String = js.native
  var totalsRowFormula: String = js.native
  var totalsRowFunction: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom = js.native
  var totalsRowLabel: String = js.native
}

object TableColumn {
  @scala.inline
  def apply(
    filterButton: Boolean,
    name: String,
    totalsRowFormula: String,
    totalsRowFunction: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom,
    totalsRowLabel: String
  ): TableColumn = {
    val __obj = js.Dynamic.literal(filterButton = filterButton.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], totalsRowFormula = totalsRowFormula.asInstanceOf[js.Any], totalsRowFunction = totalsRowFunction.asInstanceOf[js.Any], totalsRowLabel = totalsRowLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumn]
  }
  @scala.inline
  implicit class TableColumnOps[Self <: TableColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalsRowFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRowFormula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalsRowFunction(value: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRowFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalsRowLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRowLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


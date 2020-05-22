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
trait TableColumn extends js.Object {
  var filterButton: Boolean
  var name: String
  var totalsRowFormula: String
  var totalsRowFunction: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom
  var totalsRowLabel: String
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
}


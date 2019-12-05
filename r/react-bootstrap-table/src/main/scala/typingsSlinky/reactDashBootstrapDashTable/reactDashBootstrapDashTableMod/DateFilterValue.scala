package typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilterValue extends _FilterValueData {
  var comparator: FilterComparator
  var date: js.Date | String
}

object DateFilterValue {
  @scala.inline
  def apply(comparator: FilterComparator, date: js.Date | String): DateFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateFilterValue]
  }
}


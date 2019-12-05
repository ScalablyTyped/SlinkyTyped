package typingsSlinky.reactDashBootstrapDashTable

import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.FilterComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparatorDate extends js.Object {
  /**
  		 * Comparator value.
  		 */
  var comparator: FilterComparator
  /**
  		 * Date value. String values will be automatically converted to dates.
  		 */
  var date: js.Date | String
}

object Anon_ComparatorDate {
  @scala.inline
  def apply(comparator: FilterComparator, date: js.Date | String): Anon_ComparatorDate = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ComparatorDate]
  }
}


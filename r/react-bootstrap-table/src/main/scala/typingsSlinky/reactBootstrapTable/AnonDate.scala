package typingsSlinky.reactBootstrapTable

import typingsSlinky.reactBootstrapTable.mod.FilterComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  /**
  		 * Comparator value.
  		 */
  var comparator: FilterComparator
  /**
  		 * Date value. String values will be automatically converted to dates.
  		 */
  var date: js.Date | String
}

object AnonDate {
  @scala.inline
  def apply(comparator: FilterComparator, date: js.Date | String): AnonDate = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDate]
  }
}


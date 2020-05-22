package typingsSlinky.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateItem extends Item {
  /**
    * The date of the month.
    */
  var date: Double
  /**
    * The day of the week with zero-as-index.
    */
  var day: Double
  /**
    * The month with zero-as-index.
    */
  var month: Double
  /**
    * The underlying JavaScript Date object.
    */
  var obj: js.Date
  /**
    * The full year.
    */
  var year: Double
}

object DateItem {
  @scala.inline
  def apply(date: Double, day: Double, month: Double, obj: js.Date, pick: Double, year: Double): DateItem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], pick = pick.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateItem]
  }
}


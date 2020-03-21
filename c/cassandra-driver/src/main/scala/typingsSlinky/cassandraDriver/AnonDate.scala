package typingsSlinky.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: js.Date
  var ticks: Double
}

object AnonDate {
  @scala.inline
  def apply(date: js.Date, ticks: Double): AnonDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDate]
  }
}


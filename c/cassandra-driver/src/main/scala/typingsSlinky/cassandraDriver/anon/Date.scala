package typingsSlinky.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var date: js.Date
  var ticks: Double
}

object Date {
  @scala.inline
  def apply(date: js.Date, ticks: Double): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}


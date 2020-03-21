package typingsSlinky.amcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: Double
  var endDate: js.Date
  var predefinedPeriod: String
  var startDate: js.Date
  var `type`: String
}

object AnonCount {
  @scala.inline
  def apply(count: Double, endDate: js.Date, predefinedPeriod: String, startDate: js.Date, `type`: String): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], predefinedPeriod = predefinedPeriod.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}


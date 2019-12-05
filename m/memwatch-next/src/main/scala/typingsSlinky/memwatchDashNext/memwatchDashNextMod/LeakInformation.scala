package typingsSlinky.memwatchDashNext.memwatchDashNextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeakInformation extends js.Object {
  /**
    * End date.
    * @type {Date}
    */
  var end: js.Date
  /**
    * Growth.
    * @type {number}
    */
  var growth: Double
  /**
    * Reason leak.
    * @type {string}
    */
  var reason: String
  /**
    * Start date.
    * @type {Date}
    */
  var start: js.Date
}

object LeakInformation {
  @scala.inline
  def apply(end: js.Date, growth: Double, reason: String, start: js.Date): LeakInformation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], growth = growth.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LeakInformation]
  }
}


package typingsSlinky.jsJoda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToDate extends js.Object {
  def toDate(): js.Date
  def toEpochMilli(): Double
}

object AnonToDate {
  @scala.inline
  def apply(toDate: () => js.Date, toEpochMilli: () => Double): AnonToDate = {
    val __obj = js.Dynamic.literal(toDate = js.Any.fromFunction0(toDate), toEpochMilli = js.Any.fromFunction0(toEpochMilli))
  
    __obj.asInstanceOf[AnonToDate]
  }
}


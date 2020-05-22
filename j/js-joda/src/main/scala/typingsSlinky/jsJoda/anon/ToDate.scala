package typingsSlinky.jsJoda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToDate extends js.Object {
  def toDate(): js.Date
  def toEpochMilli(): Double
}

object ToDate {
  @scala.inline
  def apply(toDate: () => js.Date, toEpochMilli: () => Double): ToDate = {
    val __obj = js.Dynamic.literal(toDate = js.Any.fromFunction0(toDate), toEpochMilli = js.Any.fromFunction0(toEpochMilli))
    __obj.asInstanceOf[ToDate]
  }
}


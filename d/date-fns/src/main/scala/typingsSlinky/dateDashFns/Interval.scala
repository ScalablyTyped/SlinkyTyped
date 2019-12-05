package typingsSlinky.dateDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type Aliases
trait Interval extends js.Object {
  var end: js.Date | Double
  var start: js.Date | Double
}

object Interval {
  @scala.inline
  def apply(end: js.Date | Double, start: js.Date | Double): Interval = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Interval]
  }
}


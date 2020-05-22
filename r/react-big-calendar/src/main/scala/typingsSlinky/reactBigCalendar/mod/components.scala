package typingsSlinky.reactBigCalendar.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait components extends js.Object {
  var dateCellWrapper: ReactComponentClass[js.Object]
  var eventWrapper: ReactComponentClass[Event]
}

object components {
  @scala.inline
  def apply(dateCellWrapper: ReactComponentClass[js.Object], eventWrapper: ReactComponentClass[Event]): components = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[components]
  }
}


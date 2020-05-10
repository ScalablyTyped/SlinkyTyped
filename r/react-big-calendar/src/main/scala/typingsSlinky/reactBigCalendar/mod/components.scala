package typingsSlinky.reactBigCalendar.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait components extends js.Object {
  var dateCellWrapper: ReactComponentClass[js.Object] = js.native
  var eventWrapper: ReactComponentClass[Event] = js.native
}

object components {
  @scala.inline
  def apply(dateCellWrapper: ReactComponentClass[js.Object], eventWrapper: ReactComponentClass[Event]): components = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[components]
  }
  @scala.inline
  implicit class componentsOps[Self <: components] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateCellWrapper(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventWrapper(value: ReactComponentClass[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventWrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


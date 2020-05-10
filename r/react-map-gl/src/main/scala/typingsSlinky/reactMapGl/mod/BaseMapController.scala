package typingsSlinky.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMapController extends js.Object {
  var events: js.Array[String] = js.native
  def handleEvent(event: MapControlEvent): Unit = js.native
}

object BaseMapController {
  @scala.inline
  def apply(events: js.Array[String], handleEvent: MapControlEvent => Unit): BaseMapController = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[BaseMapController]
  }
  @scala.inline
  implicit class BaseMapControllerOps[Self <: BaseMapController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleEvent(value: MapControlEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


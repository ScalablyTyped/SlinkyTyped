package typingsSlinky.activexInfopath

import typingsSlinky.activexInfopath.InfoPath.DataDOMEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPDataDOMEvent extends js.Object {
  val pDataDOMEvent: DataDOMEventObject = js.native
}

object AnonPDataDOMEvent {
  @scala.inline
  def apply(pDataDOMEvent: DataDOMEventObject): AnonPDataDOMEvent = {
    val __obj = js.Dynamic.literal(pDataDOMEvent = pDataDOMEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPDataDOMEvent]
  }
  @scala.inline
  implicit class AnonPDataDOMEventOps[Self <: AnonPDataDOMEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPDataDOMEvent(value: DataDOMEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pDataDOMEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


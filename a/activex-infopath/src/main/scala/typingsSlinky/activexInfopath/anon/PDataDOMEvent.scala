package typingsSlinky.activexInfopath.anon

import typingsSlinky.activexInfopath.InfoPath.DataDOMEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDataDOMEvent extends js.Object {
  val pDataDOMEvent: DataDOMEventObject = js.native
}

object PDataDOMEvent {
  @scala.inline
  def apply(pDataDOMEvent: DataDOMEventObject): PDataDOMEvent = {
    val __obj = js.Dynamic.literal(pDataDOMEvent = pDataDOMEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDataDOMEvent]
  }
  @scala.inline
  implicit class PDataDOMEventOps[Self <: PDataDOMEvent] (val x: Self) extends AnyVal {
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


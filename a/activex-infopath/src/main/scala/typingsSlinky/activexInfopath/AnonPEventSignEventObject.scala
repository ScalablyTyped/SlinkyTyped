package typingsSlinky.activexInfopath

import typingsSlinky.activexInfopath.InfoPath.SignEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPEventSignEventObject extends js.Object {
  val pEvent: SignEventObject = js.native
}

object AnonPEventSignEventObject {
  @scala.inline
  def apply(pEvent: SignEventObject): AnonPEventSignEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPEventSignEventObject]
  }
  @scala.inline
  implicit class AnonPEventSignEventObjectOps[Self <: AnonPEventSignEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPEvent(value: SignEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


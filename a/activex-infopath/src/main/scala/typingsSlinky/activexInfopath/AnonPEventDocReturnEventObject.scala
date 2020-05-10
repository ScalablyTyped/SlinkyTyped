package typingsSlinky.activexInfopath

import typingsSlinky.activexInfopath.InfoPath.DocReturnEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPEventDocReturnEventObject extends js.Object {
  val pEvent: DocReturnEventObject = js.native
}

object AnonPEventDocReturnEventObject {
  @scala.inline
  def apply(pEvent: DocReturnEventObject): AnonPEventDocReturnEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPEventDocReturnEventObject]
  }
  @scala.inline
  implicit class AnonPEventDocReturnEventObjectOps[Self <: AnonPEventDocReturnEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPEvent(value: DocReturnEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


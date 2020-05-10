package typingsSlinky.activexInfopath

import typingsSlinky.activexInfopath.InfoPath.DocContextChangeEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPEventDocContextChangeEventObject extends js.Object {
  val pEvent: DocContextChangeEventObject = js.native
}

object AnonPEventDocContextChangeEventObject {
  @scala.inline
  def apply(pEvent: DocContextChangeEventObject): AnonPEventDocContextChangeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPEventDocContextChangeEventObject]
  }
  @scala.inline
  implicit class AnonPEventDocContextChangeEventObjectOps[Self <: AnonPEventDocContextChangeEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPEvent(value: DocContextChangeEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


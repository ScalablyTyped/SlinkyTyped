package typingsSlinky.activexInfopath.anon

import typingsSlinky.activexInfopath.InfoPath.DocEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PEventDocEventObject extends js.Object {
  val pEvent: DocEventObject = js.native
}

object PEventDocEventObject {
  @scala.inline
  def apply(pEvent: DocEventObject): PEventDocEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocEventObject]
  }
  @scala.inline
  implicit class PEventDocEventObjectOps[Self <: PEventDocEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPEvent(value: DocEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


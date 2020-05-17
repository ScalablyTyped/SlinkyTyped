package typingsSlinky.activexInfopath.anon

import typingsSlinky.activexInfopath.InfoPath.DocReturnEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PEventDocReturnEventObject extends js.Object {
  val pEvent: DocReturnEventObject = js.native
}

object PEventDocReturnEventObject {
  @scala.inline
  def apply(pEvent: DocReturnEventObject): PEventDocReturnEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocReturnEventObject]
  }
  @scala.inline
  implicit class PEventDocReturnEventObjectOps[Self <: PEventDocReturnEventObject] (val x: Self) extends AnyVal {
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


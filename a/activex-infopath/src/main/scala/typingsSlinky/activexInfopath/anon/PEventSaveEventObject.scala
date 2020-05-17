package typingsSlinky.activexInfopath.anon

import typingsSlinky.activexInfopath.InfoPath.SaveEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PEventSaveEventObject extends js.Object {
  val pEvent: SaveEventObject = js.native
}

object PEventSaveEventObject {
  @scala.inline
  def apply(pEvent: SaveEventObject): PEventSaveEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventSaveEventObject]
  }
  @scala.inline
  implicit class PEventSaveEventObjectOps[Self <: PEventSaveEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPEvent(value: SaveEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


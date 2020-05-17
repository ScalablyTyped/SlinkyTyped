package typingsSlinky.activexInfopath.anon

import typingsSlinky.activexInfopath.InfoPath.MergeEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PEventMergeEventObject extends js.Object {
  val pEvent: MergeEventObject = js.native
}

object PEventMergeEventObject {
  @scala.inline
  def apply(pEvent: MergeEventObject): PEventMergeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventMergeEventObject]
  }
  @scala.inline
  implicit class PEventMergeEventObjectOps[Self <: PEventMergeEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPEvent(value: MergeEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


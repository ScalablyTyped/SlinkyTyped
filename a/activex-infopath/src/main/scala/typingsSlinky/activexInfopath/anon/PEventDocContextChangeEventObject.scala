package typingsSlinky.activexInfopath.anon

import typingsSlinky.activexInfopath.InfoPath.DocContextChangeEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PEventDocContextChangeEventObject extends js.Object {
  val pEvent: DocContextChangeEventObject = js.native
}

object PEventDocContextChangeEventObject {
  @scala.inline
  def apply(pEvent: DocContextChangeEventObject): PEventDocContextChangeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocContextChangeEventObject]
  }
  @scala.inline
  implicit class PEventDocContextChangeEventObjectOps[Self <: PEventDocContextChangeEventObject] (val x: Self) extends AnyVal {
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


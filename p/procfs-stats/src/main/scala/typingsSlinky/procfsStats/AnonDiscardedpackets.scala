package typingsSlinky.procfsStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDiscardedpackets extends js.Object {
  var `Discarded packets`: String = js.native
}

object AnonDiscardedpackets {
  @scala.inline
  def apply(`Discarded packets`: String): AnonDiscardedpackets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Discarded packets")((`Discarded packets`).asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiscardedpackets]
  }
  @scala.inline
  implicit class AnonDiscardedpacketsOps[Self <: AnonDiscardedpackets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withDiscarded packets`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Discarded packets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


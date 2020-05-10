package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.G
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonZK extends js.Object {
  var ZK: G = js.native
}

object AnonZK {
  @scala.inline
  def apply(ZK: G): AnonZK = {
    val __obj = js.Dynamic.literal(ZK = ZK.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonZK]
  }
  @scala.inline
  implicit class AnonZKOps[Self <: AnonZK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZK(value: G): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZK")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.ZH
import typingsSlinky.screeps.screepsStrings.ZK
import typingsSlinky.screeps.screepsStrings.ZO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonK extends js.Object {
  var H: ZH = js.native
  var K: ZK = js.native
  var O: ZO = js.native
}

object AnonK {
  @scala.inline
  def apply(H: ZH, K: ZK, O: ZO): AnonK = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], K = K.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonK]
  }
  @scala.inline
  implicit class AnonKOps[Self <: AnonK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: ZH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withK(value: ZK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("K")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: ZO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("O")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


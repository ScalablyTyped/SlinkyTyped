package typingsSlinky.escpos

import typingsSlinky.escpos.escposNumbers.`48`
import typingsSlinky.escpos.escposNumbers.`49`
import typingsSlinky.escpos.escposNumbers.`50`
import typingsSlinky.escpos.escposNumbers.`51`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonH extends js.Object {
  var H: `51` = js.native
  var L: `48` = js.native
  var M: `49` = js.native
  var Q: `50` = js.native
}

object AnonH {
  @scala.inline
  def apply(H: `51`, L: `48`, M: `49`, Q: `50`): AnonH = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonH]
  }
  @scala.inline
  implicit class AnonHOps[Self <: AnonH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: `51`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: `48`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM(value: `49`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ(value: `50`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Q")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


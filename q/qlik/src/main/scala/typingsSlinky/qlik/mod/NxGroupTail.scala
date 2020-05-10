package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxGroupTail extends js.Object {
  var qDown: Double = js.native
  var qUp: Double = js.native
}

object NxGroupTail {
  @scala.inline
  def apply(qDown: Double, qUp: Double): NxGroupTail = {
    val __obj = js.Dynamic.literal(qDown = qDown.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxGroupTail]
  }
  @scala.inline
  implicit class NxGroupTailOps[Self <: NxGroupTail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


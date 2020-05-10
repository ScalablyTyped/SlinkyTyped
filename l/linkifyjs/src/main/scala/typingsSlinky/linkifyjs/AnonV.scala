package typingsSlinky.linkifyjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonV extends js.Object {
  var v: String = js.native
}

object AnonV {
  @scala.inline
  def apply(v: String): AnonV = {
    val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonV]
  }
  @scala.inline
  implicit class AnonVOps[Self <: AnonV] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withV(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


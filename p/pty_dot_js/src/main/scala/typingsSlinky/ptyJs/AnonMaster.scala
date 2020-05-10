package typingsSlinky.ptyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaster extends js.Object {
  var master: Double = js.native
  var pty: String = js.native
  var slave: Double = js.native
}

object AnonMaster {
  @scala.inline
  def apply(master: Double, pty: String, slave: Double): AnonMaster = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaster]
  }
  @scala.inline
  implicit class AnonMasterOps[Self <: AnonMaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaster(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlave(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slave")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


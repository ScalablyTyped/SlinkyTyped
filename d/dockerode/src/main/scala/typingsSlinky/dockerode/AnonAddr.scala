package typingsSlinky.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddr extends js.Object {
  var Addr: String = js.native
  var Cpus: Double = js.native
  var ID: String = js.native
  var IP: String = js.native
  var Labels: js.Any = js.native
  var Memory: Double = js.native
  var Name: String = js.native
}

object AnonAddr {
  @scala.inline
  def apply(Addr: String, Cpus: Double, ID: String, IP: String, Labels: js.Any, Memory: Double, Name: String): AnonAddr = {
    val __obj = js.Dynamic.literal(Addr = Addr.asInstanceOf[js.Any], Cpus = Cpus.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IP = IP.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Memory = Memory.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddr]
  }
  @scala.inline
  implicit class AnonAddrOps[Self <: AnonAddr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Addr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


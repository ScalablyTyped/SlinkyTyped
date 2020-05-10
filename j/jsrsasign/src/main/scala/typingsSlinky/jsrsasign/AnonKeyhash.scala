package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyhash extends js.Object {
  var alg: String = js.native
  var keyhash: String = js.native
  var namehash: String = js.native
  var serial: String = js.native
}

object AnonKeyhash {
  @scala.inline
  def apply(alg: String, keyhash: String, namehash: String, serial: String): AnonKeyhash = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], keyhash = keyhash.asInstanceOf[js.Any], namehash = namehash.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyhash]
  }
  @scala.inline
  implicit class AnonKeyhashOps[Self <: AnonKeyhash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyhash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyhash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamehash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namehash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


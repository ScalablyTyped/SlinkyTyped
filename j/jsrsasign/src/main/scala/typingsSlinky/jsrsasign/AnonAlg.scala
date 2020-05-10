package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlg extends js.Object {
  var alg: String = js.native
  var hash: String = js.native
}

object AnonAlg {
  @scala.inline
  def apply(alg: String, hash: String): AnonAlg = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlg]
  }
  @scala.inline
  implicit class AnonAlgOps[Self <: AnonAlg] (val x: Self) extends AnyVal {
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
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHashValue extends js.Object {
  var hashAlg: String = js.native
  var hashValue: String = js.native
}

object AnonHashValue {
  @scala.inline
  def apply(hashAlg: String, hashValue: String): AnonHashValue = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], hashValue = hashValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHashValue]
  }
  @scala.inline
  implicit class AnonHashValueOps[Self <: AnonHashValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


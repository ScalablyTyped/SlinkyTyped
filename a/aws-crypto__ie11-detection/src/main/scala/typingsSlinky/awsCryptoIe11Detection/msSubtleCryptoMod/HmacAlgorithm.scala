package typingsSlinky.awsCryptoIe11Detection.msSubtleCryptoMod

import typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.HMAC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HmacAlgorithm extends js.Object {
  var hash: HashAlgorithm = js.native
  var name: HMAC = js.native
}

object HmacAlgorithm {
  @scala.inline
  def apply(hash: HashAlgorithm, name: HMAC): HmacAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacAlgorithm]
  }
  @scala.inline
  implicit class HmacAlgorithmOps[Self <: HmacAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: HashAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: HMAC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


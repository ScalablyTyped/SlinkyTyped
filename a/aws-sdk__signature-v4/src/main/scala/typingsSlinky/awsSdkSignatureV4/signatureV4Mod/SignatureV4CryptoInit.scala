package typingsSlinky.awsSdkSignatureV4.signatureV4Mod

import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureV4CryptoInit extends js.Object {
  var sha256: HashConstructor = js.native
}

object SignatureV4CryptoInit {
  @scala.inline
  def apply(sha256: HashConstructor): SignatureV4CryptoInit = {
    val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureV4CryptoInit]
  }
  @scala.inline
  implicit class SignatureV4CryptoInitOps[Self <: SignatureV4CryptoInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha256(value: HashConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


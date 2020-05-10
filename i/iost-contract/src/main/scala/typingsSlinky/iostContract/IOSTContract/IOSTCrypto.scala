package typingsSlinky.iostContract.IOSTContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOSTCrypto extends js.Object {
  def sha3(data: String): String = js.native
  def verify(algo: String, message: String, signature: String, pubkey: String): Double = js.native
}

object IOSTCrypto {
  @scala.inline
  def apply(sha3: String => String, verify: (String, String, String, String) => Double): IOSTCrypto = {
    val __obj = js.Dynamic.literal(sha3 = js.Any.fromFunction1(sha3), verify = js.Any.fromFunction4(verify))
    __obj.asInstanceOf[IOSTCrypto]
  }
  @scala.inline
  implicit class IOSTCryptoOps[Self <: IOSTCrypto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha3(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha3")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerify(value: (String, String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}


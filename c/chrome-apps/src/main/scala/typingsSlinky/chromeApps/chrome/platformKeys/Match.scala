package typingsSlinky.chromeApps.chrome.platformKeys

import org.scalajs.dom.crypto.KeyAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match extends js.Object {
  /** The DER encoding of a X.509 certificate. */
  var certificate: js.typedarray.ArrayBuffer = js.native
  /**
    * @see[KeyAlgorithm]{@link http://www.w3.org/TR/WebCryptoAPI/#key-algorithm-interface}
    * @description
    * The KeyAlgorithm of the certified key. This contains algorithm
    * parameters that are inherent to the key of the certificate (e.g. the key
    * length). Other parameters like the hash function used by the sign
    * function are not included. */
  var keyAlgorithm: KeyAlgorithm = js.native
}

object Match {
  @scala.inline
  def apply(certificate: js.typedarray.ArrayBuffer, keyAlgorithm: KeyAlgorithm): Match = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], keyAlgorithm = keyAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
  @scala.inline
  implicit class MatchOps[Self <: Match] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyAlgorithm(value: KeyAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


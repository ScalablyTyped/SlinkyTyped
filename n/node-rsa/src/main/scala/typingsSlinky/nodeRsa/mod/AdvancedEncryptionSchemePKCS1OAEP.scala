package typingsSlinky.nodeRsa.mod

import typingsSlinky.node.Buffer
import typingsSlinky.nodeRsa.nodeRsaStrings.pkcs1_oaep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedEncryptionSchemePKCS1OAEP extends AdvancedEncryptionScheme {
  var hash: HashingAlgorithm = js.native
  /**
    * Mask generation function.
    */
  var mgf: js.UndefOr[
    js.Function3[/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm, Buffer]
  ] = js.native
  var scheme: pkcs1_oaep = js.native
}

object AdvancedEncryptionSchemePKCS1OAEP {
  @scala.inline
  def apply(hash: HashingAlgorithm, scheme: pkcs1_oaep): AdvancedEncryptionSchemePKCS1OAEP = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedEncryptionSchemePKCS1OAEP]
  }
  @scala.inline
  implicit class AdvancedEncryptionSchemePKCS1OAEPOps[Self <: AdvancedEncryptionSchemePKCS1OAEP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: HashingAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: pkcs1_oaep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMgf(value: (/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm) => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mgf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMgf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mgf")(js.undefined)
        ret
    }
  }
  
}


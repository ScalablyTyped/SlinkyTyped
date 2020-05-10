package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The public key for a given CryptoKeyVersion. Obtained via GetPublicKey.
  */
@js.native
trait SchemaPublicKey extends js.Object {
  /**
    * The Algorithm associated with this key.
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * The public key, encoded in PEM format. For more information, see the [RFC
    * 7468](https://tools.ietf.org/html/rfc7468) sections for [General
    * Considerations](https://tools.ietf.org/html/rfc7468#section-2) and
    * [Textual Encoding of Subject Public Key Info]
    * (https://tools.ietf.org/html/rfc7468#section-13).
    */
  var pem: js.UndefOr[String] = js.native
}

object SchemaPublicKey {
  @scala.inline
  def apply(): SchemaPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKey]
  }
  @scala.inline
  implicit class SchemaPublicKeyOps[Self <: SchemaPublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withPem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pem")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.node.cryptoMod

import typingsSlinky.node.AnonFormat
import typingsSlinky.node.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Key size in bits
    */
  var modulusLength: Double = js.native
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with AnonType = js.native
  /**
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.native
  var publicKeyEncoding: AnonFormat[PubF] = js.native
}

object RSAKeyPairOptions {
  @scala.inline
  def apply[PubF, PrivF](
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with AnonType,
    publicKeyEncoding: AnonFormat[PubF]
  ): RSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAKeyPairOptions[PubF, PrivF]]
  }
  @scala.inline
  implicit class RSAKeyPairOptionsOps[Self[pubf, privf] <: RSAKeyPairOptions[pubf, privf], PubF, PrivF] (val x: Self[PubF, PrivF]) extends AnyVal {
    @scala.inline
    def duplicate: Self[PubF, PrivF] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[PubF, PrivF]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[PubF, PrivF]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[PubF, PrivF]) with Other]
    @scala.inline
    def withModulusLength(value: Double): Self[PubF, PrivF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulusLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with AnonType): Self[PubF, PrivF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyEncoding(value: AnonFormat[PubF]): Self[PubF, PrivF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicExponent(value: Double): Self[PubF, PrivF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicExponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicExponent: Self[PubF, PrivF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicExponent")(js.undefined)
        ret
    }
  }
  
}


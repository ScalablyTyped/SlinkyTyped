package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Anon0
import typingsSlinky.node.AnonFormatType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Size of q in bits
    */
  var divisorLength: Double = js.native
  /**
    * Key size in bits
    */
  var modulusLength: Double = js.native
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon0 = js.native
  var publicKeyEncoding: AnonFormatType[PubF] = js.native
}

object DSAKeyPairOptions {
  @scala.inline
  def apply[PubF, PrivF](
    divisorLength: Double,
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon0,
    publicKeyEncoding: AnonFormatType[PubF]
  ): DSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSAKeyPairOptions[PubF, PrivF]]
  }
  @scala.inline
  implicit class DSAKeyPairOptionsOps[Self[pubf, privf] <: DSAKeyPairOptions[pubf, privf], PubF, PrivF] (val x: Self[PubF, PrivF]) extends AnyVal {
    @scala.inline
    def duplicate: Self[PubF, PrivF] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[PubF, PrivF]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[PubF, PrivF]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[PubF, PrivF]) with Other]
    @scala.inline
    def withDivisorLength(value: Double): Self[PubF, PrivF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisorLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModulusLength(value: Double): Self[PubF, PrivF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulusLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with Anon0): Self[PubF, PrivF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyEncoding(value: AnonFormatType[PubF]): Self[PubF, PrivF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


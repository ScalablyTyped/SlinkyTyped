package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Anon1
import typingsSlinky.node.AnonFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Name of the curve to use.
    */
  var namedCurve: String = js.native
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon1 = js.native
  var publicKeyEncoding: AnonFormat[PubF] = js.native
}

object ECKeyPairOptions {
  @scala.inline
  def apply[PubF, PrivF](
    namedCurve: String,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon1,
    publicKeyEncoding: AnonFormat[PubF]
  ): ECKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECKeyPairOptions[PubF, PrivF]]
  }
  @scala.inline
  implicit class ECKeyPairOptionsOps[Self[pubf, privf] <: ECKeyPairOptions[pubf, privf], PubF, PrivF] (val x: Self[PubF, PrivF]) extends AnyVal {
    @scala.inline
    def duplicate: Self[PubF, PrivF] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[PubF, PrivF]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[PubF, PrivF]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[PubF, PrivF]) with Other]
    @scala.inline
    def withNamedCurve(value: String): Self[PubF, PrivF] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with Anon1): Self[PubF, PrivF] = {
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
  }
  
}


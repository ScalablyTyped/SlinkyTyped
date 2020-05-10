package typingsSlinky.createXpub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The chain code.
    */
  var chainCode: String = js.native
  /**
    * The child number.
    */
  var childNumber: Double = js.native
  /**
    * The depth of the derived key.
    */
  var depth: Double = js.native
  /**
    * Network version bytes.
    * @default 0x0488B21E
    */
  var networkVersion: js.UndefOr[Double] = js.native
  /**
    * The public key in compressed or uncompressed form.
    */
  var publicKey: String = js.native
}

object Options {
  @scala.inline
  def apply(chainCode: String, childNumber: Double, depth: Double, publicKey: String): Options = {
    val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], childNumber = childNumber.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChainCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkVersion")(js.undefined)
        ret
    }
  }
  
}


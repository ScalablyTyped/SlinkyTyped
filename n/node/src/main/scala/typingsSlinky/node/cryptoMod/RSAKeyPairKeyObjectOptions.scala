package typingsSlinky.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSAKeyPairKeyObjectOptions extends js.Object {
  /**
    * Key size in bits
    */
  var modulusLength: Double = js.native
  /**
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.native
}

object RSAKeyPairKeyObjectOptions {
  @scala.inline
  def apply(modulusLength: Double): RSAKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAKeyPairKeyObjectOptions]
  }
  @scala.inline
  implicit class RSAKeyPairKeyObjectOptionsOps[Self <: RSAKeyPairKeyObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModulusLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulusLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicExponent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicExponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicExponent")(js.undefined)
        ret
    }
  }
  
}


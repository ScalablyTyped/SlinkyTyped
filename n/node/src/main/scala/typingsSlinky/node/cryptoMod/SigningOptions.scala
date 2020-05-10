package typingsSlinky.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningOptions extends js.Object {
  /**
    * @See crypto.constants.RSA_PKCS1_PADDING
    */
  var padding: js.UndefOr[Double] = js.native
  var saltLength: js.UndefOr[Double] = js.native
}

object SigningOptions {
  @scala.inline
  def apply(): SigningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningOptions]
  }
  @scala.inline
  implicit class SigningOptionsOps[Self <: SigningOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withSaltLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaltLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltLength")(js.undefined)
        ret
    }
  }
  
}


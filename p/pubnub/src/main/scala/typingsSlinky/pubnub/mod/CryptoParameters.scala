package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// encrypt & decrypt
@js.native
trait CryptoParameters extends js.Object {
  var encryptKey: js.UndefOr[Boolean] = js.native
  var keyEncoding: js.UndefOr[String] = js.native
  var keyLength: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
}

object CryptoParameters {
  @scala.inline
  def apply(): CryptoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoParameters]
  }
  @scala.inline
  implicit class CryptoParametersOps[Self <: CryptoParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptKey")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}


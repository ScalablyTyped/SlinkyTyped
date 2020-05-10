package typingsSlinky.cryptojs.CryptoJS.lib

import typingsSlinky.cryptojs.CryptoJS.format.IFormatter
import typingsSlinky.cryptojs.CryptoJS.mode.IBlockCipherModeImpl
import typingsSlinky.cryptojs.CryptoJS.pad.IPaddingImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherParamsData extends js.Object {
  var algorithm: js.UndefOr[Cipher] = js.native
  var blockSize: js.UndefOr[Double] = js.native
  var ciphertext: js.UndefOr[WordArray] = js.native
  var formatter: js.UndefOr[IFormatter] = js.native
  var iv: js.UndefOr[WordArray] = js.native
  var key: js.UndefOr[WordArray] = js.native
  var mode: js.UndefOr[IBlockCipherModeImpl] = js.native
  var padding: js.UndefOr[IPaddingImpl] = js.native
  var salt: js.UndefOr[WordArray] = js.native
}

object CipherParamsData {
  @scala.inline
  def apply(): CipherParamsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CipherParamsData]
  }
  @scala.inline
  implicit class CipherParamsDataOps[Self <: CipherParamsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: Cipher): Self = {
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
    def withBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCiphertext(value: WordArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphertext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphertext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphertext")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: IFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withIv(value: WordArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: WordArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: IBlockCipherModeImpl): Self = {
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
    @scala.inline
    def withPadding(value: IPaddingImpl): Self = {
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
    def withSalt(value: WordArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(js.undefined)
        ret
    }
  }
  
}


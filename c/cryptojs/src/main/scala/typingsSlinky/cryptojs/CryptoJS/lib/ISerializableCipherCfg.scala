package typingsSlinky.cryptojs.CryptoJS.lib

import typingsSlinky.cryptojs.CryptoJS.format.IFormatter
import typingsSlinky.cryptojs.CryptoJS.mode.IBlockCipherModeImpl
import typingsSlinky.cryptojs.CryptoJS.pad.IPaddingImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISerializableCipherCfg extends js.Object {
  var format: js.UndefOr[IFormatter] = js.native
  //default OpenSSLFormatter
  var iv: js.UndefOr[WordArray] = js.native
  var mode: js.UndefOr[IBlockCipherModeImpl] = js.native
  var padding: js.UndefOr[IPaddingImpl] = js.native
}

object ISerializableCipherCfg {
  @scala.inline
  def apply(): ISerializableCipherCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISerializableCipherCfg]
  }
  @scala.inline
  implicit class ISerializableCipherCfgOps[Self <: ISerializableCipherCfg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: IFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
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
  }
  
}


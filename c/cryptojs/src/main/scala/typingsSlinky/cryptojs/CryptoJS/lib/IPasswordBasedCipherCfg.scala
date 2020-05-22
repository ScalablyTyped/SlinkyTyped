package typingsSlinky.cryptojs.CryptoJS.lib

import typingsSlinky.cryptojs.CryptoJS.format.IFormatter
import typingsSlinky.cryptojs.CryptoJS.kdf.IKdfImpl
import typingsSlinky.cryptojs.CryptoJS.mode.IBlockCipherModeImpl
import typingsSlinky.cryptojs.CryptoJS.pad.IPaddingImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPasswordBasedCipherCfg extends ISerializableCipherCfg {
  var kdf: js.UndefOr[IKdfImpl] = js.undefined
}

object IPasswordBasedCipherCfg {
  @scala.inline
  def apply(
    format: IFormatter = null,
    iv: WordArray = null,
    kdf: IKdfImpl = null,
    mode: IBlockCipherModeImpl = null,
    padding: IPaddingImpl = null
  ): IPasswordBasedCipherCfg = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (kdf != null) __obj.updateDynamic("kdf")(kdf.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPasswordBasedCipherCfg]
  }
}


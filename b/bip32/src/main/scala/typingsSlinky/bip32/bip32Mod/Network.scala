package typingsSlinky.bip32.bip32Mod

import typingsSlinky.bip32.AnonPrivate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  var bech32: js.UndefOr[String] = js.native
  var bip32: AnonPrivate = js.native
  var messagePrefix: js.UndefOr[String] = js.native
  var pubKeyHash: js.UndefOr[Double] = js.native
  var scriptHash: js.UndefOr[Double] = js.native
  var wif: Double = js.native
}

object Network {
  @scala.inline
  def apply(bip32: AnonPrivate, wif: Double): Network = {
    val __obj = js.Dynamic.literal(bip32 = bip32.asInstanceOf[js.Any], wif = wif.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
  @scala.inline
  implicit class NetworkOps[Self <: Network] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBip32(value: AnonPrivate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bip32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWif(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBech32(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bech32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBech32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bech32")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPubKeyHash(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubKeyHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubKeyHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubKeyHash")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptHash(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptHash")(js.undefined)
        ret
    }
  }
  
}


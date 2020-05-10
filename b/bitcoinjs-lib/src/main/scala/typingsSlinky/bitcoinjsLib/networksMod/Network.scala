package typingsSlinky.bitcoinjsLib.networksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  var bech32: String = js.native
  var bip32: Bip32 = js.native
  var messagePrefix: String = js.native
  var pubKeyHash: Double = js.native
  var scriptHash: Double = js.native
  var wif: Double = js.native
}

object Network {
  @scala.inline
  def apply(
    bech32: String,
    bip32: Bip32,
    messagePrefix: String,
    pubKeyHash: Double,
    scriptHash: Double,
    wif: Double
  ): Network = {
    val __obj = js.Dynamic.literal(bech32 = bech32.asInstanceOf[js.Any], bip32 = bip32.asInstanceOf[js.Any], messagePrefix = messagePrefix.asInstanceOf[js.Any], pubKeyHash = pubKeyHash.asInstanceOf[js.Any], scriptHash = scriptHash.asInstanceOf[js.Any], wif = wif.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
  @scala.inline
  implicit class NetworkOps[Self <: Network] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBech32(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bech32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBip32(value: Bip32): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bip32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessagePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubKeyHash(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubKeyHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptHash(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWif(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wif")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


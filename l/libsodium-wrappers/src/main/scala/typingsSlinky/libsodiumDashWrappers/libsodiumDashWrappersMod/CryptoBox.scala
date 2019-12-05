package typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoBox extends js.Object {
  var ciphertext: scala.scalajs.js.typedarray.Uint8Array
  var mac: scala.scalajs.js.typedarray.Uint8Array
}

object CryptoBox {
  @scala.inline
  def apply(ciphertext: scala.scalajs.js.typedarray.Uint8Array, mac: scala.scalajs.js.typedarray.Uint8Array): CryptoBox = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CryptoBox]
  }
}


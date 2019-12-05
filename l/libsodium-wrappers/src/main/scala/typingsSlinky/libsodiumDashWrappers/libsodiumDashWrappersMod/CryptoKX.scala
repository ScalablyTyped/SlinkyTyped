package typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKX extends js.Object {
  var sharedRx: scala.scalajs.js.typedarray.Uint8Array
  var sharedTx: scala.scalajs.js.typedarray.Uint8Array
}

object CryptoKX {
  @scala.inline
  def apply(sharedRx: scala.scalajs.js.typedarray.Uint8Array, sharedTx: scala.scalajs.js.typedarray.Uint8Array): CryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx.asInstanceOf[js.Any], sharedTx = sharedTx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CryptoKX]
  }
}


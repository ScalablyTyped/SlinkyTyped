package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKX extends js.Object {
  var sharedRx: js.typedarray.Uint8Array
  var sharedTx: js.typedarray.Uint8Array
}

object CryptoKX {
  @scala.inline
  def apply(sharedRx: js.typedarray.Uint8Array, sharedTx: js.typedarray.Uint8Array): CryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx.asInstanceOf[js.Any], sharedTx = sharedTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKX]
  }
}


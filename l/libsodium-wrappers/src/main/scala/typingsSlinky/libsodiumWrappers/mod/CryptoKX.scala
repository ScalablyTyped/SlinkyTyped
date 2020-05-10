package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKX extends js.Object {
  var sharedRx: js.typedarray.Uint8Array = js.native
  var sharedTx: js.typedarray.Uint8Array = js.native
}

object CryptoKX {
  @scala.inline
  def apply(sharedRx: js.typedarray.Uint8Array, sharedTx: js.typedarray.Uint8Array): CryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx.asInstanceOf[js.Any], sharedTx = sharedTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKX]
  }
  @scala.inline
  implicit class CryptoKXOps[Self <: CryptoKX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSharedRx(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedRx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedTx(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedTx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


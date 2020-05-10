package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringCryptoKX extends js.Object {
  var sharedRx: String = js.native
  var sharedTx: String = js.native
}

object StringCryptoKX {
  @scala.inline
  def apply(sharedRx: String, sharedTx: String): StringCryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx.asInstanceOf[js.Any], sharedTx = sharedTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringCryptoKX]
  }
  @scala.inline
  implicit class StringCryptoKXOps[Self <: StringCryptoKX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSharedRx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedRx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedTx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedTx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


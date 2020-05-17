package typingsSlinky.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bin extends js.Object {
  var bin: String = js.native
  var nonce: String = js.native
}

object Bin {
  @scala.inline
  def apply(bin: String, nonce: String): Bin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
  @scala.inline
  implicit class BinOps[Self <: Bin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


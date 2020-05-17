package typingsSlinky.ethers.anon

import typingsSlinky.ethers.typesMod.Arrayish
import typingsSlinky.ethers.typesMod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From extends js.Object {
  var from: String = js.native
  var nonce: Arrayish | BigNumber | Double = js.native
}

object From {
  @scala.inline
  def apply(from: String, nonce: Arrayish | BigNumber | Double): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  @scala.inline
  implicit class FromOps[Self <: From] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: Arrayish | BigNumber | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


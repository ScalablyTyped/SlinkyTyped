package typingsSlinky.node.cryptoMod

import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherCCMOptions extends TransformOptions {
  var authTagLength: Double = js.native
}

object CipherCCMOptions {
  @scala.inline
  def apply(authTagLength: Double): CipherCCMOptions = {
    val __obj = js.Dynamic.literal(authTagLength = authTagLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherCCMOptions]
  }
  @scala.inline
  implicit class CipherCCMOptionsOps[Self <: CipherCCMOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthTagLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authTagLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


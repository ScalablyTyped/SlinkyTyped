package typingsSlinky.nodeForge.anon

import typingsSlinky.nodeForge.mod.pki.ed25519.ToNativeBufferParameters
import typingsSlinky.nodeForge.nodeForgeStrings.binary
import typingsSlinky.nodeForge.nodeForgeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoding extends ToNativeBufferParameters {
  var encoding: binary | utf8 = js.native
  var message: String = js.native
}

object Encoding {
  @scala.inline
  def apply(encoding: binary | utf8, message: String): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: binary | utf8): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.radius.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusdecodeargs} for more info.
  **/
@js.native
trait DecodeArgsWithSecret extends DecodeArgs {
  var secret: String = js.native
}

object DecodeArgsWithSecret {
  @scala.inline
  def apply(packet: Buffer, secret: String): DecodeArgsWithSecret = {
    val __obj = js.Dynamic.literal(packet = packet.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeArgsWithSecret]
  }
  @scala.inline
  implicit class DecodeArgsWithSecretOps[Self <: DecodeArgsWithSecret] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


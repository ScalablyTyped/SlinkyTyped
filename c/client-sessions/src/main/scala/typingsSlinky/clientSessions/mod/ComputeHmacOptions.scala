package typingsSlinky.clientSessions.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeHmacOptions extends js.Object {
  var signatureAlgorithm: String = js.native
  var signatureKey: Buffer = js.native
}

object ComputeHmacOptions {
  @scala.inline
  def apply(signatureAlgorithm: String, signatureKey: Buffer): ComputeHmacOptions = {
    val __obj = js.Dynamic.literal(signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureKey = signatureKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeHmacOptions]
  }
  @scala.inline
  implicit class ComputeHmacOptionsOps[Self <: ComputeHmacOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignatureAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureKey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


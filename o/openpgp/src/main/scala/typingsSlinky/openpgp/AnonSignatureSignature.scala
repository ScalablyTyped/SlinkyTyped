package typingsSlinky.openpgp

import typingsSlinky.openpgp.mod.signature.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSignatureSignature extends js.Object {
  var signature: Signature = js.native
}

object AnonSignatureSignature {
  @scala.inline
  def apply(signature: Signature): AnonSignatureSignature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSignatureSignature]
  }
  @scala.inline
  implicit class AnonSignatureSignatureOps[Self <: AnonSignatureSignature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignature(value: Signature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


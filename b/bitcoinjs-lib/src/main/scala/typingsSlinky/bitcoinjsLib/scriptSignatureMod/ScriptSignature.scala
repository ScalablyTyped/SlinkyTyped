package typingsSlinky.bitcoinjsLib.scriptSignatureMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptSignature extends js.Object {
  var hashType: Double = js.native
  var signature: Buffer = js.native
}

object ScriptSignature {
  @scala.inline
  def apply(hashType: Double, signature: Buffer): ScriptSignature = {
    val __obj = js.Dynamic.literal(hashType = hashType.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptSignature]
  }
  @scala.inline
  implicit class ScriptSignatureOps[Self <: ScriptSignature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


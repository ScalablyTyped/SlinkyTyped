package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeSigningSignature extends js.Object {
  /**
    * A base64 encoded binary representation of the code signing signature.
    */
  var inlineDocument: js.UndefOr[Signature] = js.native
}

object CodeSigningSignature {
  @scala.inline
  def apply(): CodeSigningSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigningSignature]
  }
  @scala.inline
  implicit class CodeSigningSignatureOps[Self <: CodeSigningSignature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInlineDocumentUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineDocument(value: Signature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineDocument")(js.undefined)
        ret
    }
  }
  
}


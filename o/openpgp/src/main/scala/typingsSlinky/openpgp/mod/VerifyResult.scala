package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.anon.Valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyResult extends js.Object {
  var data: String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array = js.native
  var signatures: js.Array[Valid] = js.native
}

object VerifyResult {
  @scala.inline
  def apply(
    data: String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array,
    signatures: js.Array[Valid]
  ): VerifyResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResult]
  }
  @scala.inline
  implicit class VerifyResultOps[Self <: VerifyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(
      value: String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatures(value: js.Array[Valid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatures")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


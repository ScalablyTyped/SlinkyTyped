package typingsSlinky.openpgp.openpgpMod

import typingsSlinky.openpgp.Anon_KeyidValid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResult extends js.Object {
  var data: String | (ReadableStream[String | scala.scalajs.js.typedarray.Uint8Array]) | NodeStream | scala.scalajs.js.typedarray.Uint8Array
  var signatures: js.Array[Anon_KeyidValid]
}

object VerifyResult {
  @scala.inline
  def apply(
    data: String | (ReadableStream[String | scala.scalajs.js.typedarray.Uint8Array]) | NodeStream | scala.scalajs.js.typedarray.Uint8Array,
    signatures: js.Array[Anon_KeyidValid]
  ): VerifyResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyResult]
  }
}


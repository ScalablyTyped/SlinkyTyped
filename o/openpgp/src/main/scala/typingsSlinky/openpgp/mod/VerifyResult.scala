package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.AnonValid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResult extends js.Object {
  var data: String | (ReadableStream[String | scala.scalajs.js.typedarray.Uint8Array]) | NodeStream | scala.scalajs.js.typedarray.Uint8Array
  var signatures: js.Array[AnonValid]
}

object VerifyResult {
  @scala.inline
  def apply(
    data: String | (ReadableStream[String | scala.scalajs.js.typedarray.Uint8Array]) | NodeStream | scala.scalajs.js.typedarray.Uint8Array,
    signatures: js.Array[AnonValid]
  ): VerifyResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyResult]
  }
}


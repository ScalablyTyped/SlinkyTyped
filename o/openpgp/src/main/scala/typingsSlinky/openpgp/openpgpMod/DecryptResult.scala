package typingsSlinky.openpgp.openpgpMod

import typingsSlinky.openpgp.Anon_KeyidValid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptResult extends js.Object {
  var data: String | (ReadableStream[String | scala.scalajs.js.typedarray.Uint8Array]) | NodeStream | scala.scalajs.js.typedarray.Uint8Array
  var filename: String
  var signatures: js.Array[Anon_KeyidValid]
}

object DecryptResult {
  @scala.inline
  def apply(
    data: String | (ReadableStream[String | scala.scalajs.js.typedarray.Uint8Array]) | NodeStream | scala.scalajs.js.typedarray.Uint8Array,
    filename: String,
    signatures: js.Array[Anon_KeyidValid]
  ): DecryptResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecryptResult]
  }
}


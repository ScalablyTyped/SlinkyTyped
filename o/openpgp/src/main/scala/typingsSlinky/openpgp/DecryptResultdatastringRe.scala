package typingsSlinky.openpgp

import typingsSlinky.openpgp.mod.NodeStream
import typingsSlinky.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.DecryptResult & {  data  :string | openpgp.openpgp.ReadableStream<std.String> | openpgp.openpgp.NodeStream} */
trait DecryptResultdatastringRe extends js.Object {
  var data: (String | (ReadableStream[String | scala.scalajs.js.typedarray.Uint8Array]) | NodeStream | scala.scalajs.js.typedarray.Uint8Array) with (String | ReadableStream[String] | NodeStream)
  var filename: String
  var signatures: js.Array[AnonValid]
}

object DecryptResultdatastringRe {
  @scala.inline
  def apply(
    data: (String | (ReadableStream[String | scala.scalajs.js.typedarray.Uint8Array]) | NodeStream | scala.scalajs.js.typedarray.Uint8Array) with (String | ReadableStream[String] | NodeStream),
    filename: String,
    signatures: js.Array[AnonValid]
  ): DecryptResultdatastringRe = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecryptResultdatastringRe]
  }
}


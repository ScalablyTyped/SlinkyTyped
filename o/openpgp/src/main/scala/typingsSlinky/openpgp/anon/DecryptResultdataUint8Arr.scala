package typingsSlinky.openpgp.anon

import typingsSlinky.openpgp.mod.NodeStream
import typingsSlinky.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.DecryptResult & {  data  :std.Uint8Array | openpgp.openpgp.ReadableStream<std.Uint8Array> | openpgp.openpgp.NodeStream} */
trait DecryptResultdataUint8Arr extends js.Object {
  var data: (String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array) with (js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] | NodeStream)
  var filename: String
  var signatures: js.Array[Valid]
}

object DecryptResultdataUint8Arr {
  @scala.inline
  def apply(
    data: (String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array) with (js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] | NodeStream),
    filename: String,
    signatures: js.Array[Valid]
  ): DecryptResultdataUint8Arr = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResultdataUint8Arr]
  }
}


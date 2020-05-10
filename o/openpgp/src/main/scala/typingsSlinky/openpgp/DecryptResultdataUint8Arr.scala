package typingsSlinky.openpgp

import typingsSlinky.openpgp.mod.NodeStream
import typingsSlinky.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.DecryptResult & {  data  :std.Uint8Array | openpgp.openpgp.ReadableStream<std.Uint8Array> | openpgp.openpgp.NodeStream} */
@js.native
trait DecryptResultdataUint8Arr extends js.Object {
  var data: (String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array) with (js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] | NodeStream) = js.native
  var filename: String = js.native
  var signatures: js.Array[AnonValid] = js.native
}

object DecryptResultdataUint8Arr {
  @scala.inline
  def apply(
    data: (String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array) with (js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] | NodeStream),
    filename: String,
    signatures: js.Array[AnonValid]
  ): DecryptResultdataUint8Arr = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResultdataUint8Arr]
  }
  @scala.inline
  implicit class DecryptResultdataUint8ArrOps[Self <: DecryptResultdataUint8Arr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(
      value: (String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array) with (js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] | NodeStream)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatures(value: js.Array[AnonValid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatures")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


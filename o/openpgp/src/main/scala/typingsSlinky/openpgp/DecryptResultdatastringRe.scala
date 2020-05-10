package typingsSlinky.openpgp

import typingsSlinky.openpgp.mod.NodeStream
import typingsSlinky.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.DecryptResult & {  data  :string | openpgp.openpgp.ReadableStream<std.String> | openpgp.openpgp.NodeStream} */
@js.native
trait DecryptResultdatastringRe extends js.Object {
  var data: (String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array) with (String | ReadableStream[String] | NodeStream) = js.native
  var filename: String = js.native
  var signatures: js.Array[AnonValid] = js.native
}

object DecryptResultdatastringRe {
  @scala.inline
  def apply(
    data: (String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array) with (String | ReadableStream[String] | NodeStream),
    filename: String,
    signatures: js.Array[AnonValid]
  ): DecryptResultdatastringRe = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResultdatastringRe]
  }
  @scala.inline
  implicit class DecryptResultdatastringReOps[Self <: DecryptResultdatastringRe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(
      value: (String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array) with (String | ReadableStream[String] | NodeStream)
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


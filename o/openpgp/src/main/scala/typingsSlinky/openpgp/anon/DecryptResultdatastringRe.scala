package typingsSlinky.openpgp.anon

import typingsSlinky.openpgp.mod.NodeStream
import typingsSlinky.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.DecryptResult & {  data :string | openpgp.openpgp.ReadableStream<std.String> | openpgp.openpgp.NodeStream} */
@js.native
trait DecryptResultdatastringRe extends js.Object {
  
  var data: (String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array) with (String | ReadableStream[String] | NodeStream) = js.native
  
  var filename: String = js.native
  
  var signatures: js.Array[Valid] = js.native
}
object DecryptResultdatastringRe {
  
  @scala.inline
  def apply(
    data: (String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array) with (String | ReadableStream[String] | NodeStream),
    filename: String,
    signatures: js.Array[Valid]
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(
      value: (String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array) with (String | ReadableStream[String] | NodeStream)
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: Valid*): Self = this.set("signatures", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[Valid]): Self = this.set("signatures", value.asInstanceOf[js.Any])
  }
}

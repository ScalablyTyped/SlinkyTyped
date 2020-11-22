package typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.raw.Blob
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileInput extends js.Object {
  
  var content: js.UndefOr[
    String | Blob | AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | js.Iterable[js.typedarray.Uint8Array] | ReadableStream[js.typedarray.Uint8Array]
  ] = js.native
  
  var mode: js.UndefOr[String | Double] = js.native
  
  var mtime: js.UndefOr[
    typingsSlinky.ipfsCoreUtils.formatMtimeMod.MTime | js.Date | (js.Tuple2[Double, Double])
  ] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object FileInput {
  
  @scala.inline
  def apply(): FileInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileInput]
  }
  
  @scala.inline
  implicit class FileInputOps[Self <: FileInput] (val x: Self) extends AnyVal {
    
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
    def setContentIterable(value: js.Iterable[js.typedarray.Uint8Array]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentReadableStream(value: ReadableStream[js.typedarray.Uint8Array]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentBlob(value: Blob): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentArrayBufferView(value: js.typedarray.ArrayBufferView): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(
      value: String | Blob | AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | js.Iterable[js.typedarray.Uint8Array] | ReadableStream[js.typedarray.Uint8Array]
    ): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setMode(value: String | Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMtimeDate(value: js.Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtime(value: typingsSlinky.ipfsCoreUtils.formatMtimeMod.MTime | js.Date | (js.Tuple2[Double, Double])): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}

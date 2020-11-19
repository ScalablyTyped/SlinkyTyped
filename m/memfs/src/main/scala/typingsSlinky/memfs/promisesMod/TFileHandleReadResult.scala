package typingsSlinky.memfs.promisesMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TFileHandleReadResult extends js.Object {
  
  var buffer: Buffer | js.typedarray.Uint8Array = js.native
  
  var bytesRead: Double = js.native
}
object TFileHandleReadResult {
  
  @scala.inline
  def apply(buffer: Buffer | js.typedarray.Uint8Array, bytesRead: Double): TFileHandleReadResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[TFileHandleReadResult]
  }
  
  @scala.inline
  implicit class TFileHandleReadResultOps[Self <: TFileHandleReadResult] (val x: Self) extends AnyVal {
    
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
    def setBufferUint8Array(value: js.typedarray.Uint8Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: Buffer | js.typedarray.Uint8Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesRead(value: Double): Self = this.set("bytesRead", value.asInstanceOf[js.Any])
  }
}

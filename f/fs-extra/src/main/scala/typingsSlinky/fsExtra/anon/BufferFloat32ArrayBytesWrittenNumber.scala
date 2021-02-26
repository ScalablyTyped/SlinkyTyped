package typingsSlinky.fsExtra.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferFloat32ArrayBytesWrittenNumber extends StObject {
  
  var buffer: js.typedarray.Float32Array = js.native
  
  var bytesWritten: Double = js.native
}
object BufferFloat32ArrayBytesWrittenNumber {
  
  @scala.inline
  def apply(buffer: js.typedarray.Float32Array, bytesWritten: Double): BufferFloat32ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat32ArrayBytesWrittenNumber]
  }
  
  @scala.inline
  implicit class BufferFloat32ArrayBytesWrittenNumberMutableBuilder[Self <: BufferFloat32ArrayBytesWrittenNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: js.typedarray.Float32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}

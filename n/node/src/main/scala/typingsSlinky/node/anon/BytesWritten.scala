package typingsSlinky.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BytesWritten[TBuffer /* <: js.typedarray.Uint8Array */] extends StObject {
  
  var buffer: TBuffer = js.native
  
  var bytesWritten: Double = js.native
}
object BytesWritten {
  
  @scala.inline
  def apply[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, bytesWritten: Double): BytesWritten[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesWritten[TBuffer]]
  }
  
  @scala.inline
  implicit class BytesWrittenMutableBuilder[Self <: BytesWritten[_], TBuffer /* <: js.typedarray.Uint8Array */] (val x: Self with BytesWritten[TBuffer]) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: TBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}

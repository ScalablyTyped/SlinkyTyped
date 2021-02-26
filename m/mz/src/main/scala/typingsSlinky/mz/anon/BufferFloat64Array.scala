package typingsSlinky.mz.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferFloat64Array extends StObject {
  
  var buffer: js.typedarray.Float64Array = js.native
  
  var bytesRead: Double = js.native
}
object BufferFloat64Array {
  
  @scala.inline
  def apply(buffer: js.typedarray.Float64Array, bytesRead: Double): BufferFloat64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat64Array]
  }
  
  @scala.inline
  implicit class BufferFloat64ArrayMutableBuilder[Self <: BufferFloat64Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: js.typedarray.Float64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}

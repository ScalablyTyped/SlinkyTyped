package typingsSlinky.promiseFs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferInt16Array extends StObject {
  
  var buffer: js.typedarray.Int16Array = js.native
  
  var bytesRead: Double = js.native
}
object BufferInt16Array {
  
  @scala.inline
  def apply(buffer: js.typedarray.Int16Array, bytesRead: Double): BufferInt16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt16Array]
  }
  
  @scala.inline
  implicit class BufferInt16ArrayMutableBuilder[Self <: BufferInt16Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: js.typedarray.Int16Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}

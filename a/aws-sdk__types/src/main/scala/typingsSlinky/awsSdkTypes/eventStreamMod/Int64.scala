package typingsSlinky.awsSdkTypes.eventStreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Int64 extends StObject {
  
  val bytes: js.typedarray.Uint8Array = js.native
}
object Int64 {
  
  @scala.inline
  def apply(bytes: js.typedarray.Uint8Array): Int64 = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Int64]
  }
  
  @scala.inline
  implicit class Int64MutableBuilder[Self <: Int64] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.gm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetterOptions extends StObject {
  
  var bufferStream: js.UndefOr[Boolean] = js.native
}
object GetterOptions {
  
  @scala.inline
  def apply(): GetterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetterOptions]
  }
  
  @scala.inline
  implicit class GetterOptionsMutableBuilder[Self <: GetterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferStream(value: Boolean): Self = StObject.set(x, "bufferStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferStreamUndefined: Self = StObject.set(x, "bufferStream", js.undefined)
  }
}

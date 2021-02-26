package typingsSlinky.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecoderResult extends StObject {
  
  var error: js.Error = js.native
  
  var value: js.Object = js.native
}
object DecoderResult {
  
  @scala.inline
  def apply(error: js.Error, value: js.Object): DecoderResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoderResult]
  }
  
  @scala.inline
  implicit class DecoderResultMutableBuilder[Self <: DecoderResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

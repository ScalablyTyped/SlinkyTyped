package typingsSlinky.natsHemera.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncoderResult extends StObject {
  
  var error: js.Error = js.native
  
  var value: String | Buffer = js.native
}
object EncoderResult {
  
  @scala.inline
  def apply(error: js.Error, value: String | Buffer): EncoderResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncoderResult]
  }
  
  @scala.inline
  implicit class EncoderResultMutableBuilder[Self <: EncoderResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

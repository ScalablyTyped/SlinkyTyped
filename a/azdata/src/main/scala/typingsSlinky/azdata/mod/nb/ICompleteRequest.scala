package typingsSlinky.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompleteRequest extends StObject {
  
  var code: String = js.native
  
  var cursor_pos: Double = js.native
}
object ICompleteRequest {
  
  @scala.inline
  def apply(code: String, cursor_pos: Double): ICompleteRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cursor_pos = cursor_pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteRequest]
  }
  
  @scala.inline
  implicit class ICompleteRequestMutableBuilder[Self <: ICompleteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor_pos(value: Double): Self = StObject.set(x, "cursor_pos", value.asInstanceOf[js.Any])
  }
}

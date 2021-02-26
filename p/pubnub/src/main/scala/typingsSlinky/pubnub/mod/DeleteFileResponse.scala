package typingsSlinky.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFileResponse extends StObject {
  
  var status: String = js.native
}
object DeleteFileResponse {
  
  @scala.inline
  def apply(status: String): DeleteFileResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileResponse]
  }
  
  @scala.inline
  implicit class DeleteFileResponseMutableBuilder[Self <: DeleteFileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

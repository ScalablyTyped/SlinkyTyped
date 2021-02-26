package typingsSlinky.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveDialogResponse extends DialogResponse {
  
  var id: String = js.native
  
  var secure_stream_url: String = js.native
  
  var status: String = js.native
  
  var stream_url: String = js.native
}
object LiveDialogResponse {
  
  @scala.inline
  def apply(id: String, secure_stream_url: String, status: String, stream_url: String): LiveDialogResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secure_stream_url = secure_stream_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stream_url = stream_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveDialogResponse]
  }
  
  @scala.inline
  implicit class LiveDialogResponseMutableBuilder[Self <: LiveDialogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure_stream_url(value: String): Self = StObject.set(x, "secure_stream_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream_url(value: String): Self = StObject.set(x, "stream_url", value.asInstanceOf[js.Any])
  }
}

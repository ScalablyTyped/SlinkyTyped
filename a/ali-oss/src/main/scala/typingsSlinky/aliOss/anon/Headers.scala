package typingsSlinky.aliOss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Headers extends StObject {
  
  var headers: js.Object = js.native
  
  var rt: Double = js.native
  
  var size: Double = js.native
  
  var status: Double = js.native
}
object Headers {
  
  @scala.inline
  def apply(headers: js.Object, rt: Double, size: Double, status: Double): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  @scala.inline
  implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRt(value: Double): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

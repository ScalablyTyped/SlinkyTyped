package typingsSlinky.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppendObjectResult extends StObject {
  
  var name: String = js.native
  
  var nextAppendPosition: String = js.native
  
  // the url of oss
  var res: NormalSuccessResponse = js.native
  
  var url: String = js.native
}
object AppendObjectResult {
  
  @scala.inline
  def apply(name: String, nextAppendPosition: String, res: NormalSuccessResponse, url: String): AppendObjectResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nextAppendPosition = nextAppendPosition.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendObjectResult]
  }
  
  @scala.inline
  implicit class AppendObjectResultMutableBuilder[Self <: AppendObjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextAppendPosition(value: String): Self = StObject.set(x, "nextAppendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

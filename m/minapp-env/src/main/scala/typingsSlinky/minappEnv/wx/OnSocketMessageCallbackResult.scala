package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnSocketMessageCallbackResult extends StObject {
  
  /** 服务器返回的消息 */
  var data: String | ArrayBuffer = js.native
}
object OnSocketMessageCallbackResult {
  
  @scala.inline
  def apply(data: String | ArrayBuffer): OnSocketMessageCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSocketMessageCallbackResult]
  }
  
  @scala.inline
  implicit class OnSocketMessageCallbackResultMutableBuilder[Self <: OnSocketMessageCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}

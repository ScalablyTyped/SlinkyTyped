package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectIdentifyResponse extends StObject {
  
  var log_id: Double = js.native
  
  //     唯一的log id，用于问题定位。
  var result: Height = js.native
}
object DetectIdentifyResponse {
  
  @scala.inline
  def apply(log_id: Double, result: Height): DetectIdentifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectIdentifyResponse]
  }
  
  @scala.inline
  implicit class DetectIdentifyResponseMutableBuilder[Self <: DetectIdentifyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog_id(value: Double): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Height): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}

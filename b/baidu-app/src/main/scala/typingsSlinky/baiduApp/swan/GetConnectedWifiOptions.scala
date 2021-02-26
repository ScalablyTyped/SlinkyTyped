package typingsSlinky.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectedWifiOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetConnectedWifiOptions(wifi: WiFi): Unit = js.native
}
object GetConnectedWifiOptions {
  
  @scala.inline
  def apply(success: WiFi => Unit): GetConnectedWifiOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetConnectedWifiOptions]
  }
  
  @scala.inline
  implicit class GetConnectedWifiOptionsMutableBuilder[Self <: GetConnectedWifiOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: WiFi => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}

package typingsSlinky.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopBluetoothDevicesDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MStopBluetoothDevicesDiscoveryOptions(res: ErrMsgResponse): Unit = js.native
}
object StopBluetoothDevicesDiscoveryOptions {
  
  @scala.inline
  def apply(success: ErrMsgResponse => Unit): StopBluetoothDevicesDiscoveryOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[StopBluetoothDevicesDiscoveryOptions]
  }
  
  @scala.inline
  implicit class StopBluetoothDevicesDiscoveryOptionsMutableBuilder[Self <: StopBluetoothDevicesDiscoveryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: ErrMsgResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}

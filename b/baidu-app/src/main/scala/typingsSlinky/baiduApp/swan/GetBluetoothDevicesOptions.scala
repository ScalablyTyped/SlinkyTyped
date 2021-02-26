package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.devicesArrayBluetoothDevi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetBluetoothDevicesOptions(res: devicesArrayBluetoothDevi): Unit = js.native
}
object GetBluetoothDevicesOptions {
  
  @scala.inline
  def apply(success: devicesArrayBluetoothDevi => Unit): GetBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBluetoothDevicesOptions]
  }
  
  @scala.inline
  implicit class GetBluetoothDevicesOptionsMutableBuilder[Self <: GetBluetoothDevicesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: devicesArrayBluetoothDevi => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}

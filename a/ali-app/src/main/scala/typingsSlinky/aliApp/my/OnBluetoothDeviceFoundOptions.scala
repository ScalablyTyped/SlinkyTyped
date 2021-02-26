package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.Devices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBluetoothDeviceFoundOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_OnBluetoothDeviceFoundOptions: js.UndefOr[js.Function1[/* res */ Devices, Unit]] = js.native
}
object OnBluetoothDeviceFoundOptions {
  
  @scala.inline
  def apply(): OnBluetoothDeviceFoundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothDeviceFoundOptions]
  }
  
  @scala.inline
  implicit class OnBluetoothDeviceFoundOptionsMutableBuilder[Self <: OnBluetoothDeviceFoundOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ Devices => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}

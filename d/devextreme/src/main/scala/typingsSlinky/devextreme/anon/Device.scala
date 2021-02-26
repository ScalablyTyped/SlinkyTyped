package typingsSlinky.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends StObject {
  
  var device: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.Device | js.Array[typingsSlinky.devextreme.mod.DevExpress.Device] | js.Function
  ] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
}
object Device {
  
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(
      value: typingsSlinky.devextreme.mod.DevExpress.Device | js.Array[typingsSlinky.devextreme.mod.DevExpress.Device] | js.Function
    ): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setDeviceVarargs(value: typingsSlinky.devextreme.mod.DevExpress.Device*): Self = StObject.set(x, "device", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}

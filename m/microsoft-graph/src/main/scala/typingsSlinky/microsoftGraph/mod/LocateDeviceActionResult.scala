package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocateDeviceActionResult extends DeviceActionResult {
  
  // device location
  var deviceLocation: js.UndefOr[NullableOption[DeviceGeoLocation]] = js.native
}
object LocateDeviceActionResult {
  
  @scala.inline
  def apply(): LocateDeviceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateDeviceActionResult]
  }
  
  @scala.inline
  implicit class LocateDeviceActionResultMutableBuilder[Self <: LocateDeviceActionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceLocation(value: NullableOption[DeviceGeoLocation]): Self = StObject.set(x, "deviceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceLocationNull: Self = StObject.set(x, "deviceLocation", null)
    
    @scala.inline
    def setDeviceLocationUndefined: Self = StObject.set(x, "deviceLocation", js.undefined)
  }
}

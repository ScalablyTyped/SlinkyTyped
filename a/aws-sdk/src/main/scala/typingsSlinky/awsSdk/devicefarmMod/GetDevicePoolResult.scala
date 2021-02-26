package typingsSlinky.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDevicePoolResult extends StObject {
  
  /**
    * An object that contains information about the requested device pool.
    */
  var devicePool: js.UndefOr[DevicePool] = js.native
}
object GetDevicePoolResult {
  
  @scala.inline
  def apply(): GetDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevicePoolResult]
  }
  
  @scala.inline
  implicit class GetDevicePoolResultMutableBuilder[Self <: GetDevicePoolResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicePool(value: DevicePool): Self = StObject.set(x, "devicePool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePoolUndefined: Self = StObject.set(x, "devicePool", js.undefined)
  }
}

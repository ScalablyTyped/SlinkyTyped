package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBeaconsSuccessCallbackResult extends StObject {
  
  /** iBeacon 设备列表 */
  var beacons: Array[IBeaconInfo] = js.native
}
object GetBeaconsSuccessCallbackResult {
  
  @scala.inline
  def apply(beacons: Array[IBeaconInfo]): GetBeaconsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBeaconsSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBeaconsSuccessCallbackResultMutableBuilder[Self <: GetBeaconsSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeacons(value: Array[IBeaconInfo]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
  }
}

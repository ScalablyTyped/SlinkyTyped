package typingsSlinky.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseLocationSuccessCallbackResult extends StObject {
  
  /** 详细地址 */
  var address: String = js.native
  
  /** 纬度，浮点数，范围为-90~90，负数表示南纬。使用 gcj02 国测局坐标系 */
  var latitude: String = js.native
  
  /** 经度，浮点数，范围为-180~180，负数表示西经。使用 gcj02 国测局坐标系 */
  var longitude: String = js.native
  
  /** 位置名称 */
  var name: String = js.native
}
object ChooseLocationSuccessCallbackResult {
  
  @scala.inline
  def apply(address: String, latitude: String, longitude: String, name: String): ChooseLocationSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseLocationSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ChooseLocationSuccessCallbackResultMutableBuilder[Self <: ChooseLocationSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

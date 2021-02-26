package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.characteristicsArraychara
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceCharacteristicsOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String = js.native
  
  /**
    * 蓝牙服务 uuid
    */
  var serviceId: String = js.native
  
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  @JSName("success")
  def success_MGetBLEDeviceCharacteristicsOptions(res: characteristicsArraychara): Unit = js.native
}
object GetBLEDeviceCharacteristicsOptions {
  
  @scala.inline
  def apply(deviceId: String, serviceId: String, success: characteristicsArraychara => Unit): GetBLEDeviceCharacteristicsOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsOptions]
  }
  
  @scala.inline
  implicit class GetBLEDeviceCharacteristicsOptionsMutableBuilder[Self <: GetBLEDeviceCharacteristicsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: characteristicsArraychara => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}

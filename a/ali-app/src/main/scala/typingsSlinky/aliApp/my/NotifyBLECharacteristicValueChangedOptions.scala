package typingsSlinky.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyBLECharacteristicValueChangedOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: String = js.native
  
  /**
    * notify 的 descriptor 的 uuid （只有android 会用到，非必填，默认值00002902-0000-10008000-00805f9b34fb）
    */
  var descriptorId: js.UndefOr[String] = js.native
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String = js.native
  
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: String = js.native
  
  /**
    * true: 启用 notify; false: 停用 notify
    */
  var state: Boolean = js.native
  
  @JSName("success")
  def success_MNotifyBLECharacteristicValueChangedOptions(res: ErrMsgResponse): Unit = js.native
}
object NotifyBLECharacteristicValueChangedOptions {
  
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    state: Boolean,
    success: ErrMsgResponse => Unit
  ): NotifyBLECharacteristicValueChangedOptions = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangedOptions]
  }
  
  @scala.inline
  implicit class NotifyBLECharacteristicValueChangedOptionsMutableBuilder[Self <: NotifyBLECharacteristicValueChangedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorId(value: String): Self = StObject.set(x, "descriptorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorIdUndefined: Self = StObject.set(x, "descriptorId", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: ErrMsgResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}

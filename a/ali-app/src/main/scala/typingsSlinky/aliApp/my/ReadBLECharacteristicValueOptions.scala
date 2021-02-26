package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.characteristiccharacteris
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadBLECharacteristicValueOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: String = js.native
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String = js.native
  
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: String = js.native
  
  @JSName("success")
  def success_MReadBLECharacteristicValueOptions(res: characteristiccharacteris): Unit = js.native
}
object ReadBLECharacteristicValueOptions {
  
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    success: characteristiccharacteris => Unit
  ): ReadBLECharacteristicValueOptions = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ReadBLECharacteristicValueOptions]
  }
  
  @scala.inline
  implicit class ReadBLECharacteristicValueOptionsMutableBuilder[Self <: ReadBLECharacteristicValueOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: characteristiccharacteris => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}

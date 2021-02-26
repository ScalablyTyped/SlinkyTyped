package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 新搜索到的设备列表 */
@js.native
trait CallbackResultBlueToothDevice extends StObject {
  
  /** 当前蓝牙设备的信号强度 */
  var RSSI: Double = js.native
  
  /** 当前蓝牙设备的广播数据段中的 ManufacturerData 数据段。 */
  var advertisData: ArrayBuffer = js.native
  
  /** 当前蓝牙设备的广播数据段中的 ServiceUUIDs 数据段 */
  var advertisServiceUUIDs: Array[String] = js.native
  
  /** 用于区分设备的 id */
  var deviceId: String = js.native
  
  /** 当前蓝牙设备的广播数据段中的 LocalName 数据段 */
  var localName: String = js.native
  
  /** 蓝牙设备名称，某些设备可能没有 */
  var name: String = js.native
  
  /** 当前蓝牙设备的广播数据段中的 ServiceData 数据段 */
  var serviceData: js.Object = js.native
}
object CallbackResultBlueToothDevice {
  
  @scala.inline
  def apply(
    RSSI: Double,
    advertisData: ArrayBuffer,
    advertisServiceUUIDs: Array[String],
    deviceId: String,
    localName: String,
    name: String,
    serviceData: js.Object
  ): CallbackResultBlueToothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], advertisServiceUUIDs = advertisServiceUUIDs.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackResultBlueToothDevice]
  }
  
  @scala.inline
  implicit class CallbackResultBlueToothDeviceMutableBuilder[Self <: CallbackResultBlueToothDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisData(value: ArrayBuffer): Self = StObject.set(x, "advertisData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisServiceUUIDs(value: Array[String]): Self = StObject.set(x, "advertisServiceUUIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRSSI(value: Double): Self = StObject.set(x, "RSSI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceData(value: js.Object): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBLEDeviceCharacteristicsSuccessCallbackResult extends js.Object {
  /** 设备服务列表 */
  var characteristics: BLECharacteristic = js.native
}

object GetBLEDeviceCharacteristicsSuccessCallbackResult {
  @scala.inline
  def apply(characteristics: BLECharacteristic): GetBLEDeviceCharacteristicsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetBLEDeviceCharacteristicsSuccessCallbackResultOps[Self <: GetBLEDeviceCharacteristicsSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacteristics(value: BLECharacteristic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.aliAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  characteristic  :{  characteristicId  :string,   serviceId  :string,   value  :std.ArrayBuffer}} & ali-app.my.ErrMsgResponse */
@js.native
trait characteristiccharacteris extends js.Object {
  var characteristic: CharacteristicId = js.native
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
}

object characteristiccharacteris {
  @scala.inline
  def apply(characteristic: CharacteristicId, errMsg: ok | String): characteristiccharacteris = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristiccharacteris]
  }
  @scala.inline
  implicit class characteristiccharacterisOps[Self <: characteristiccharacteris] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacteristic(value: CharacteristicId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrMsg(value: ok | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


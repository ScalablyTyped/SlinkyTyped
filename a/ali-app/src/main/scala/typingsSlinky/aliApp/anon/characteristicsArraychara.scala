package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.aliAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  characteristics :std.Array<{  characteristicId :string,   serviceId :string,   value :std.ArrayBuffer,   properties :std.Array<{  read :boolean,   write :boolean,   notify :boolean,   indicate :boolean}>}>} & ali-app.my.ErrMsgResponse */
@js.native
trait characteristicsArraychara extends js.Object {
  
  var characteristics: js.Array[Properties] = js.native
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
}
object characteristicsArraychara {
  
  @scala.inline
  def apply(characteristics: js.Array[Properties], errMsg: ok | String): characteristicsArraychara = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristicsArraychara]
  }
  
  @scala.inline
  implicit class characteristicsArraycharaOps[Self <: characteristicsArraychara] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCharacteristicsVarargs(value: Properties*): Self = this.set("characteristics", js.Array(value :_*))
    
    @scala.inline
    def setCharacteristics(value: js.Array[Properties]): Self = this.set("characteristics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: ok | String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
}

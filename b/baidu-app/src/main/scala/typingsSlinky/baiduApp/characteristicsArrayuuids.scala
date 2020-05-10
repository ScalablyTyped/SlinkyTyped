package typingsSlinky.baiduApp

import typingsSlinky.baiduApp.baiduAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  characteristics  :std.Array<{  uuid  :string,   properties  :std.Array<{  read  :boolean,   write  :boolean,   notify  :boolean,   indicate  :boolean}>}>} & baidu-app.swan.ErrMsgResponse */
@js.native
trait characteristicsArrayuuids extends js.Object {
  var characteristics: js.Array[AnonProperties] = js.native
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
}

object characteristicsArrayuuids {
  @scala.inline
  def apply(characteristics: js.Array[AnonProperties], errMsg: ok | String): characteristicsArrayuuids = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristicsArrayuuids]
  }
  @scala.inline
  implicit class characteristicsArrayuuidsOps[Self <: characteristicsArrayuuids] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacteristics(value: js.Array[AnonProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristics")(value.asInstanceOf[js.Any])
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


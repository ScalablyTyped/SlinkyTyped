package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.AnonBankcardnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ocrBankCardResponse extends js.Object {
  var log_id: String = js.native
   // 请求标识码，随机数，唯一。
  var result: AnonBankcardnumber = js.native
}

object ocrBankCardResponse {
  @scala.inline
  def apply(log_id: String, result: AnonBankcardnumber): ocrBankCardResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrBankCardResponse]
  }
  @scala.inline
  implicit class ocrBankCardResponseOps[Self <: ocrBankCardResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: AnonBankcardnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


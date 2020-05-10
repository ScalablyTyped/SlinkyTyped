package typingsSlinky.aliApp

import typingsSlinky.aliApp.aliAppStrings.`4000`
import typingsSlinky.aliApp.aliAppStrings.`6001`
import typingsSlinky.aliApp.aliAppStrings.`6002`
import typingsSlinky.aliApp.aliAppStrings.`9000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResultStatus extends js.Object {
  var result: AnonAdmitstate = js.native
  /**
  			 * 6001	用户取消了业务流程
  			 * 6002	网络异常
  			 * 9000	成功
  			 * 4000	系统异常
  			 */
  var resultStatus: `6001` | `6002` | `9000` | `4000` | String = js.native
}

object AnonResultStatus {
  @scala.inline
  def apply(result: AnonAdmitstate, resultStatus: `6001` | `6002` | `9000` | `4000` | String): AnonResultStatus = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], resultStatus = resultStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResultStatus]
  }
  @scala.inline
  implicit class AnonResultStatusOps[Self <: AnonResultStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: AnonAdmitstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultStatus(value: `6001` | `6002` | `9000` | `4000` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


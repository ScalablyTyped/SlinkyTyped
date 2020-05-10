package typingsSlinky.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartyUserResult extends js.Object {
    // The name of the 3PE protocol
  var fields: js.Object = js.native
    // The Matrix user ID for the virtual representing this 3PU
  var protocol: String = js.native
  var userid: String = js.native
}

object ThirdPartyUserResult {
  @scala.inline
  def apply(fields: js.Object, protocol: String, userid: String): ThirdPartyUserResult = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyUserResult]
  }
  @scala.inline
  implicit class ThirdPartyUserResultOps[Self <: ThirdPartyUserResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


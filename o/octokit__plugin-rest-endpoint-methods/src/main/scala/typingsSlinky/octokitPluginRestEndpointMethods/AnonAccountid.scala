package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccountid extends js.Object {
  var account_id: AnonRequired = js.native
}

object AnonAccountid {
  @scala.inline
  def apply(account_id: AnonRequired): AnonAccountid = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccountid]
  }
  @scala.inline
  implicit class AnonAccountidOps[Self <: AnonAccountid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.openpgp

import typingsSlinky.openpgp.mod.`type`.keyid.Keyid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUserid extends js.Object {
  var keyid: Keyid = js.native
  var userid: String = js.native
  var valid: Boolean = js.native
}

object AnonUserid {
  @scala.inline
  def apply(keyid: Keyid, userid: String, valid: Boolean): AnonUserid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUserid]
  }
  @scala.inline
  implicit class AnonUseridOps[Self <: AnonUserid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyid(value: Keyid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


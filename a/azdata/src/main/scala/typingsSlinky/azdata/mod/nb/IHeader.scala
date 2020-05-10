package typingsSlinky.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeader extends js.Object {
  var msg_id: String = js.native
  var msg_type: String = js.native
  var session: String = js.native
  var username: String = js.native
  var version: String = js.native
}

object IHeader {
  @scala.inline
  def apply(msg_id: String, msg_type: String, session: String, username: String, version: String): IHeader = {
    val __obj = js.Dynamic.literal(msg_id = msg_id.asInstanceOf[js.Any], msg_type = msg_type.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeader]
  }
  @scala.inline
  implicit class IHeaderOps[Self <: IHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsg_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsg_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


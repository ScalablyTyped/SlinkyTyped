package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session
@js.native
trait DatabaseSessionResponse extends js.Object {
  // Server authentication configuration
  var info: js.Any = js.native
  // Operation status
  var ok: Boolean = js.native
  // User context for the current user
  var userCtx: js.Any = js.native
}

object DatabaseSessionResponse {
  @scala.inline
  def apply(info: js.Any, ok: Boolean, userCtx: js.Any): DatabaseSessionResponse = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], userCtx = userCtx.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSessionResponse]
  }
  @scala.inline
  implicit class DatabaseSessionResponseOps[Self <: DatabaseSessionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserCtx(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCtx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


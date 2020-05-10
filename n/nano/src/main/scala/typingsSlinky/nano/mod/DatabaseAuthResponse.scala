package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
@js.native
trait DatabaseAuthResponse extends js.Object {
  // Username
  var name: String = js.native
  // Operation status
  var ok: Boolean = js.native
  // List of user roles
  var roles: js.Array[String] = js.native
}

object DatabaseAuthResponse {
  @scala.inline
  def apply(name: String, ok: Boolean, roles: js.Array[String]): DatabaseAuthResponse = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseAuthResponse]
  }
  @scala.inline
  implicit class DatabaseAuthResponseOps[Self <: DatabaseAuthResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.dropboxjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RememberUser extends js.Object {
  var rememberUser: Boolean = js.native
  var scope: String = js.native
}

object RememberUser {
  @scala.inline
  def apply(rememberUser: Boolean, scope: String): RememberUser = {
    val __obj = js.Dynamic.literal(rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RememberUser]
  }
  @scala.inline
  implicit class RememberUserOps[Self <: RememberUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRememberUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.megajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageOptions extends js.Object {
  var autoload: js.UndefOr[Boolean] = js.native
  var autologin: js.UndefOr[Boolean] = js.native
  var email: String = js.native
  var keepalive: js.UndefOr[Boolean] = js.native
  var password: String = js.native
}

object StorageOptions {
  @scala.inline
  def apply(email: String, password: String): StorageOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageOptions]
  }
  @scala.inline
  implicit class StorageOptionsOps[Self <: StorageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoload")(js.undefined)
        ret
    }
    @scala.inline
    def withAutologin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autologin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutologin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autologin")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepalive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepalive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalive")(js.undefined)
        ret
    }
  }
  
}


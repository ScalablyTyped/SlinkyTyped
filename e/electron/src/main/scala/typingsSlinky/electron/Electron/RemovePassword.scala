package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.basic
import typingsSlinky.electron.electronStrings.digest
import typingsSlinky.electron.electronStrings.negotiate
import typingsSlinky.electron.electronStrings.ntlm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePassword extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/remove-password
  /**
    * When provided, the authentication info related to the origin will only be
    * removed otherwise the entire cache will be cleared.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * Credentials of the authentication. Must be provided if removing by origin.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Realm of the authentication. Must be provided if removing by origin.
    */
  var realm: js.UndefOr[String] = js.native
  /**
    * Scheme of the authentication. Can be basic, digest, ntlm, negotiate. Must be
    * provided if removing by origin.
    */
  var scheme: js.UndefOr[basic | digest | ntlm | negotiate] = js.native
  /**
    * password.
    */
  var `type`: String = js.native
  /**
    * Credentials of the authentication. Must be provided if removing by origin.
    */
  var username: js.UndefOr[String] = js.native
}

object RemovePassword {
  @scala.inline
  def apply(`type`: String): RemovePassword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePassword]
  }
  @scala.inline
  implicit class RemovePasswordOps[Self <: RemovePassword] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(js.undefined)
        ret
    }
    @scala.inline
    def withScheme(value: basic | digest | ntlm | negotiate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}


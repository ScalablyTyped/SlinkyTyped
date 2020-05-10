package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizedKeysView extends js.Object {
  /** [Output Only] The list of authorized public keys in SSH format. */
  var keys: js.UndefOr[js.Array[String]] = js.native
  /** [Output Only] Whether the user has the ability to elevate on the instance that requested the authorized keys. */
  var sudoer: js.UndefOr[Boolean] = js.native
}

object AuthorizedKeysView {
  @scala.inline
  def apply(): AuthorizedKeysView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizedKeysView]
  }
  @scala.inline
  implicit class AuthorizedKeysViewOps[Self <: AuthorizedKeysView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withSudoer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudoer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSudoer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudoer")(js.undefined)
        ret
    }
  }
  
}


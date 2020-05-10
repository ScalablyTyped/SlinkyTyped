package typingsSlinky.googleapis.osloginV1betaMod.osloginV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The POSIX account information associated with a Google account.
  */
@js.native
trait SchemaPosixAccount extends js.Object {
  /**
    * Output only. A POSIX account identifier.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The GECOS (user information) entry for this account.
    */
  var gecos: js.UndefOr[String] = js.native
  /**
    * The default group ID.
    */
  var gid: js.UndefOr[String] = js.native
  /**
    * The path to the home directory for this account.
    */
  var homeDirectory: js.UndefOr[String] = js.native
  /**
    * The operating system type where this account applies.
    */
  var operatingSystemType: js.UndefOr[String] = js.native
  /**
    * Only one POSIX account can be marked as primary.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * The path to the logic shell for this account.
    */
  var shell: js.UndefOr[String] = js.native
  /**
    * System identifier for which account the username or uid applies to. By
    * default, the empty value is used.
    */
  var systemId: js.UndefOr[String] = js.native
  /**
    * The user ID.
    */
  var uid: js.UndefOr[String] = js.native
  /**
    * The username of the POSIX account.
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaPosixAccount {
  @scala.inline
  def apply(): SchemaPosixAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosixAccount]
  }
  @scala.inline
  implicit class SchemaPosixAccountOps[Self <: SchemaPosixAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withGecos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gecos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGecos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gecos")(js.undefined)
        ret
    }
    @scala.inline
    def withGid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystemType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemType")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withShell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemId")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
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


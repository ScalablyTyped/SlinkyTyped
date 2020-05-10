package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleOptions extends js.Object {
  var admin: js.UndefOr[String | js.Array[String]] = js.native
  var bypassrls: js.UndefOr[Boolean] = js.native
  var createdb: js.UndefOr[Boolean] = js.native
  var createrole: js.UndefOr[Boolean] = js.native
  var encrypted: js.UndefOr[Boolean] = js.native
  var inRole: js.UndefOr[String | js.Array[String]] = js.native
  var inherit: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[Double] = js.native
  var login: js.UndefOr[Boolean] = js.native
  var password: js.UndefOr[Value] = js.native
  var replication: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String | js.Array[String]] = js.native
  var superuser: js.UndefOr[Boolean] = js.native
  var valid: js.UndefOr[Value] = js.native
}

object RoleOptions {
  @scala.inline
  def apply(): RoleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleOptions]
  }
  @scala.inline
  implicit class RoleOptionsOps[Self <: RoleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmin(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin")(js.undefined)
        ret
    }
    @scala.inline
    def withBypassrls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassrls")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdb")(js.undefined)
        ret
    }
    @scala.inline
    def withCreaterole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createrole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreaterole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createrole")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withInRole(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRole")(js.undefined)
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: Value): Self = {
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
    def withPasswordNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(null)
        ret
    }
    @scala.inline
    def withReplication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replication")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperuser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superuser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperuser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superuser")(js.undefined)
        ret
    }
    @scala.inline
    def withValid(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
    @scala.inline
    def withValidNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(null)
        ret
    }
  }
  
}


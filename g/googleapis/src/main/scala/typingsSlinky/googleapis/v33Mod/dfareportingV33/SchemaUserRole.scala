package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of auser role, which is used to manage user access.
  */
@js.native
trait SchemaUserRole extends js.Object {
  /**
    * Account ID of this user role. This is a read-only field that can be left
    * blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether this is a default user role. Default user roles are created by
    * the system for the account/subaccount and cannot be modified or deleted.
    * Each default user role comes with a basic set of preassigned permissions.
    */
  var defaultUserRole: js.UndefOr[Boolean] = js.native
  /**
    * ID of this user role. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRole&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this user role. This is a required field. Must be less than 256
    * characters long. If this user role is under a subaccount, the name must
    * be unique among sites of the same subaccount. Otherwise, this user role
    * is a top-level user role, and the name must be unique among top-level
    * user roles of the same account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * ID of the user role that this user role is based on or copied from. This
    * is a required field.
    */
  var parentUserRoleId: js.UndefOr[String] = js.native
  /**
    * List of permissions associated with this user role.
    */
  var permissions: js.UndefOr[js.Array[SchemaUserRolePermission]] = js.native
  /**
    * Subaccount ID of this user role. This is a read-only field that can be
    * left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object SchemaUserRole {
  @scala.inline
  def apply(): SchemaUserRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRole]
  }
  @scala.inline
  implicit class SchemaUserRoleOps[Self <: SchemaUserRole] (val x: Self) extends AnyVal {
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
    def withDefaultUserRole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUserRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultUserRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUserRole")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParentUserRoleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentUserRoleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentUserRoleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentUserRoleId")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[SchemaUserRolePermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withSubaccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubaccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(js.undefined)
        ret
    }
  }
  
}


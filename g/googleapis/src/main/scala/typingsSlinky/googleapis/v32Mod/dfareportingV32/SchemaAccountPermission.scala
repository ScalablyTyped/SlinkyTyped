package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AccountPermissions contains information about a particular account
  * permission. Some features of Campaign Manager require an account permission
  * to be present in the account.
  */
@js.native
trait SchemaAccountPermission extends js.Object {
  /**
    * Account profiles associated with this account permission.  Possible
    * values are: - &quot;ACCOUNT_PROFILE_BASIC&quot; -
    * &quot;ACCOUNT_PROFILE_STANDARD&quot;
    */
  var accountProfiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of this account permission.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermission&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Administrative level required to enable this account permission.
    */
  var level: js.UndefOr[String] = js.native
  /**
    * Name of this account permission.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Permission group of this account permission.
    */
  var permissionGroupId: js.UndefOr[String] = js.native
}

object SchemaAccountPermission {
  @scala.inline
  def apply(): SchemaAccountPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountPermission]
  }
  @scala.inline
  implicit class SchemaAccountPermissionOps[Self <: SchemaAccountPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountProfiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountProfiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountProfiles")(js.undefined)
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
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
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
    def withPermissionGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionGroupId")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a user&#39;s permissions to an account and its container.
  */
@js.native
trait SchemaUserAccess extends js.Object {
  /**
    * GTM Account access permissions.
    */
  var accountAccess: js.UndefOr[SchemaAccountAccess] = js.native
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container access permissions.
    */
  var containerAccess: js.UndefOr[js.Array[SchemaContainerAccess]] = js.native
  /**
    * User&#39;s email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Account Permission ID.
    */
  var permissionId: js.UndefOr[String] = js.native
}

object SchemaUserAccess {
  @scala.inline
  def apply(): SchemaUserAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAccess]
  }
  @scala.inline
  implicit class SchemaUserAccessOps[Self <: SchemaUserAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountAccess(value: SchemaAccountAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountAccess")(js.undefined)
        ret
    }
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
    def withContainerAccess(value: js.Array[SchemaContainerAccess]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionId")(js.undefined)
        ret
    }
  }
  
}


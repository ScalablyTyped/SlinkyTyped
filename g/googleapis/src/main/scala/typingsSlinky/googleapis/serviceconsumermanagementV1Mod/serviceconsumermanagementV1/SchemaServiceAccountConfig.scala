package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the service account configuration for the tenant project.
  */
@js.native
trait SchemaServiceAccountConfig extends js.Object {
  /**
    * ID of the IAM service account to be created in tenant project. The email
    * format of the service account is
    * &quot;&lt;account-id&gt;@&lt;tenant-project-id&gt;.iam.gserviceaccount.com&quot;.
    * This account ID must be unique within tenant project and service
    * producers have to guarantee it. The ID must be 6-30 characters long, and
    * match the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])`.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Roles for the associated service account for the tenant project.
    */
  var tenantProjectRoles: js.UndefOr[js.Array[String]] = js.native
}

object SchemaServiceAccountConfig {
  @scala.inline
  def apply(): SchemaServiceAccountConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountConfig]
  }
  @scala.inline
  implicit class SchemaServiceAccountConfigOps[Self <: SchemaServiceAccountConfig] (val x: Self) extends AnyVal {
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
    def withTenantProjectRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantProjectRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantProjectRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantProjectRoles")(js.undefined)
        ret
    }
  }
  
}


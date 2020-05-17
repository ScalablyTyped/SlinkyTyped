package typingsSlinky.firebaseAdmin.admin.auth

import typingsSlinky.firebaseAdmin.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a tenant configuration.
  *
  * Multi-tenancy support requires Google Cloud's Identity Platform
  * (GCIP). To learn more about GCIP, including pricing and features,
  * see the [GCIP documentation](https://cloud.google.com/identity-platform)
  *
  * Before multi-tenancy can be used on a Google Cloud Identity Platform project,
  * tenants must be allowed on that project via the Cloud Console UI.
  *
  * A tenant configuration provides information such as the display name, tenant
  * identifier and email authentication configuration.
  * For OIDC/SAML provider configuration management, `TenantAwareAuth` instances should
  * be used instead of a `Tenant` to retrieve the list of configured IdPs on a tenant.
  * When configuring these providers, note that tenants will inherit
  * whitelisted domains and authenticated redirect URIs of their parent project.
  *
  * All other settings of a tenant will also be inherited. These will need to be managed
  * from the Cloud Console UI.
  */
@js.native
trait Tenant extends js.Object {
  /**
    * The tenant display name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email sign in provider configuration.
    */
  var emailSignInConfig: js.UndefOr[Enabled] = js.native
  /**
    * The tenant identifier.
    */
  var tenantId: String = js.native
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
}

object Tenant {
  @scala.inline
  def apply(tenantId: String, toJSON: () => js.Object): Tenant = {
    val __obj = js.Dynamic.literal(tenantId = tenantId.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Tenant]
  }
  @scala.inline
  implicit class TenantOps[Self <: Tenant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailSignInConfig(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailSignInConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailSignInConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailSignInConfig")(js.undefined)
        ret
    }
  }
  
}


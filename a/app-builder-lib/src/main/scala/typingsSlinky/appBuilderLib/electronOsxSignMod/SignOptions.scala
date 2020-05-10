package typingsSlinky.appBuilderLib.electronOsxSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignOptions extends BaseSignOptions {
  var binaries: js.UndefOr[js.Array[String]] = js.native
  var entitlements: js.UndefOr[String] = js.native
  var `entitlements-inherit`: js.UndefOr[String] = js.native
  var `gatekeeper-assess`: js.UndefOr[Boolean] = js.native
  var `identity-validation`: js.UndefOr[Boolean] = js.native
  var ignore: js.UndefOr[String] = js.native
  var `pre-auto-entitlements`: js.UndefOr[Boolean] = js.native
  var `pre-embed-provisioning-profile`: js.UndefOr[Boolean] = js.native
  var `provisioning-profile`: js.UndefOr[String] = js.native
  var requirements: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object SignOptions {
  @scala.inline
  def apply(app: String): SignOptions = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptions]
  }
  @scala.inline
  implicit class SignOptionsOps[Self <: SignOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaries")(js.undefined)
        ret
    }
    @scala.inline
    def withEntitlements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlements")(js.undefined)
        ret
    }
    @scala.inline
    def `withEntitlements-inherit`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlements-inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutEntitlements-inherit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlements-inherit")(js.undefined)
        ret
    }
    @scala.inline
    def `withGatekeeper-assess`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatekeeper-assess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGatekeeper-assess`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatekeeper-assess")(js.undefined)
        ret
    }
    @scala.inline
    def `withIdentity-validation`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity-validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIdentity-validation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity-validation")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def `withPre-auto-entitlements`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre-auto-entitlements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPre-auto-entitlements`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre-auto-entitlements")(js.undefined)
        ret
    }
    @scala.inline
    def `withPre-embed-provisioning-profile`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre-embed-provisioning-profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPre-embed-provisioning-profile`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre-embed-provisioning-profile")(js.undefined)
        ret
    }
    @scala.inline
    def `withProvisioning-profile`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioning-profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProvisioning-profile`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioning-profile")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}


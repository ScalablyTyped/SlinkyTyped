package typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A restriction on the OS type and version of devices making requests.
  */
@js.native
trait SchemaOsConstraint extends js.Object {
  /**
    * The minimum allowed OS version. If not set, any version of this OS
    * satisfies the constraint. Format: `&quot;major.minor.patch&quot;`.
    * Examples: `&quot;10.5.301&quot;`, `&quot;9.2.1&quot;`.
    */
  var minimumVersion: js.UndefOr[String] = js.native
  /**
    * Required. The allowed OS type.
    */
  var osType: js.UndefOr[String] = js.native
  /**
    * Only allows requests from devices with a verified Chrome OS.
    * Verifications includes requirements that the device is
    * enterprise-managed, conformant to Dasher domain policies, and the caller
    * has permission to call the API targeted by the request.
    */
  var requireVerifiedChromeOs: js.UndefOr[Boolean] = js.native
}

object SchemaOsConstraint {
  @scala.inline
  def apply(): SchemaOsConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOsConstraint]
  }
  @scala.inline
  implicit class SchemaOsConstraintOps[Self <: SchemaOsConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimumVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOsType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osType")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireVerifiedChromeOs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireVerifiedChromeOs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireVerifiedChromeOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireVerifiedChromeOs")(js.undefined)
        ret
    }
  }
  
}


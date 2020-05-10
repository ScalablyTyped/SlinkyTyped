package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Devices resource represents a mobile device managed by the EMM and
  * belonging to a specific enterprise user.
  */
@js.native
trait SchemaDevice extends js.Object {
  /**
    * The Google Play Services Android ID for the device encoded as a lowercase
    * hex string. For example, &quot;123456789abcdef0&quot;.
    */
  var androidId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#device&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Identifies the extent to which the device is controlled by a managed
    * Google Play EMM in various deployment configurations.  Possible values
    * include:  - &quot;managedDevice&quot;, a device that has the EMM&#39;s
    * device policy controller (DPC) as the device owner.  -
    * &quot;managedProfile&quot;, a device that has a profile managed by the
    * DPC (DPC is profile owner) in addition to a separate, personal profile
    * that is unavailable to the DPC.  - &quot;containerApp&quot;, no longer
    * used (deprecated).  - &quot;unmanagedProfile&quot;, a device that has
    * been allowed (by the domain&#39;s admin, using the Admin Console to
    * enable the privilege) to use managed Google Play, but the profile is
    * itself not owned by a DPC.
    */
  var managementType: js.UndefOr[String] = js.native
  /**
    * The policy enforced on the device.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.native
}

object SchemaDevice {
  @scala.inline
  def apply(): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevice]
  }
  @scala.inline
  implicit class SchemaDeviceOps[Self <: SchemaDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidId")(js.undefined)
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
    def withManagementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementType")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: SchemaPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `DevicePolicy` specifies device specific restrictions necessary to acquire
  * a given access level. A `DevicePolicy` specifies requirements for requests
  * from devices to be granted access levels, it does not do any enforcement on
  * the device. `DevicePolicy` acts as an AND over all specified fields, and
  * each repeated field is an OR over its elements. Any unset fields are
  * ignored. For example, if the proto is { os_type : DESKTOP_WINDOWS, os_type
  * : DESKTOP_LINUX, encryption_status: ENCRYPTED}, then the DevicePolicy will
  * be true for requests originating from encrypted Linux desktops and
  * encrypted Windows desktops.
  */
@js.native
trait SchemaDevicePolicy extends js.Object {
  /**
    * Allowed device management levels, an empty list allows all management
    * levels.
    */
  var allowedDeviceManagementLevels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allowed encryptions statuses, an empty list allows all statuses.
    */
  var allowedEncryptionStatuses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allowed OS versions, an empty list allows all types and all versions.
    */
  var osConstraints: js.UndefOr[js.Array[SchemaOsConstraint]] = js.native
  /**
    * Whether the device needs to be approved by the customer admin.
    */
  var requireAdminApproval: js.UndefOr[Boolean] = js.native
  /**
    * Whether the device needs to be corp owned.
    */
  var requireCorpOwned: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not screenlock is required for the DevicePolicy to be true.
    * Defaults to `false`.
    */
  var requireScreenlock: js.UndefOr[Boolean] = js.native
}

object SchemaDevicePolicy {
  @scala.inline
  def apply(): SchemaDevicePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevicePolicy]
  }
  @scala.inline
  implicit class SchemaDevicePolicyOps[Self <: SchemaDevicePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedDeviceManagementLevels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedDeviceManagementLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedDeviceManagementLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedDeviceManagementLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedEncryptionStatuses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedEncryptionStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedEncryptionStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedEncryptionStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withOsConstraints(value: js.Array[SchemaOsConstraint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireAdminApproval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireAdminApproval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireAdminApproval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireAdminApproval")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireCorpOwned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireCorpOwned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireCorpOwned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireCorpOwned")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireScreenlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireScreenlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireScreenlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireScreenlock")(js.undefined)
        ret
    }
  }
  
}


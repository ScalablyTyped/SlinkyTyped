package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a new device is ready to be managed.
  */
@js.native
trait SchemaNewDeviceEvent extends js.Object {
  /**
    * The Android ID of the device. This field will always be present.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Policy app on the device.
    */
  var dpcPackageName: js.UndefOr[String] = js.native
  /**
    * Identifies the extent to which the device is controlled by an Android EMM
    * in various deployment configurations.  Possible values include:  -
    * &quot;managedDevice&quot;, a device where the DPC is set as device owner,
    * - &quot;managedProfile&quot;, a device where the DPC is set as profile
    * owner.
    */
  var managementType: js.UndefOr[String] = js.native
  /**
    * The ID of the user. This field will always be present.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaNewDeviceEvent {
  @scala.inline
  def apply(): SchemaNewDeviceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNewDeviceEvent]
  }
  @scala.inline
  implicit class SchemaNewDeviceEventOps[Self <: SchemaNewDeviceEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDpcPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpcPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpcPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpcPackageName")(js.undefined)
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
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}


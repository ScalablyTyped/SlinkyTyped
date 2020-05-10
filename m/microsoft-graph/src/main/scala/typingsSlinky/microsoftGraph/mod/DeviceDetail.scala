package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceDetail extends js.Object {
  // Indicates the browser information of the used for signing in.
  var browser: js.UndefOr[String] = js.native
  // Refers to the UniqueID of the device used for signing in.
  var deviceId: js.UndefOr[String] = js.native
  // Refers to the name of the device used for signing in.
  var displayName: js.UndefOr[String] = js.native
  // Indicates whether the device is compliant.
  var isCompliant: js.UndefOr[Boolean] = js.native
  // Indicates whether the device is managed.
  var isManaged: js.UndefOr[Boolean] = js.native
  // Indicates the operating system name and version used for signing in.
  var operatingSystem: js.UndefOr[String] = js.native
  // Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
  var trustType: js.UndefOr[String] = js.native
}

object DeviceDetail {
  @scala.inline
  def apply(): DeviceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDetail]
  }
  @scala.inline
  implicit class DeviceDetailOps[Self <: DeviceDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(js.undefined)
        ret
    }
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
    def withIsCompliant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompliant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompliant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompliant")(js.undefined)
        ret
    }
    @scala.inline
    def withIsManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsManaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isManaged")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustType")(js.undefined)
        ret
    }
  }
  
}


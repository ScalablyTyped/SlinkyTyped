package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedConfigurationsForDeviceListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#managedConfigurationsForDeviceListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** A managed configuration for an app on a specific device. */
  var managedConfigurationForDevice: js.UndefOr[js.Array[ManagedConfiguration]] = js.native
}

object ManagedConfigurationsForDeviceListResponse {
  @scala.inline
  def apply(): ManagedConfigurationsForDeviceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationsForDeviceListResponse]
  }
  @scala.inline
  implicit class ManagedConfigurationsForDeviceListResponseOps[Self <: ManagedConfigurationsForDeviceListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withManagedConfigurationForDevice(value: js.Array[ManagedConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfigurationForDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedConfigurationForDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfigurationForDevice")(js.undefined)
        ret
    }
  }
  
}


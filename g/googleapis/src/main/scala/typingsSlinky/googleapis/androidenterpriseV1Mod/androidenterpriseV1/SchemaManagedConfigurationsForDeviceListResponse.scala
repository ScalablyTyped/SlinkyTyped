package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The managed configuration resources for the device.
  */
@js.native
trait SchemaManagedConfigurationsForDeviceListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsForDeviceListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A managed configuration for an app on a specific device.
    */
  var managedConfigurationForDevice: js.UndefOr[js.Array[SchemaManagedConfiguration]] = js.native
}

object SchemaManagedConfigurationsForDeviceListResponse {
  @scala.inline
  def apply(): SchemaManagedConfigurationsForDeviceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsForDeviceListResponse]
  }
  @scala.inline
  implicit class SchemaManagedConfigurationsForDeviceListResponseOps[Self <: SchemaManagedConfigurationsForDeviceListResponse] (val x: Self) extends AnyVal {
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
    def withManagedConfigurationForDevice(value: js.Array[SchemaManagedConfiguration]): Self = {
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


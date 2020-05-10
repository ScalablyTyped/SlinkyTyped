package typingsSlinky.eurekaJsClient.mod.EurekaClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EurekaInstanceConfig extends js.Object {
  var actionType: js.UndefOr[ActionType] = js.native
  var app: String = js.native
  var appGroupName: js.UndefOr[String] = js.native
  var countryId: js.UndefOr[Double] = js.native
  var dataCenterInfo: DataCenterInfo = js.native
  var healthCheckUrl: js.UndefOr[String] = js.native
  var homePageUrl: js.UndefOr[String] = js.native
  var hostName: String = js.native
  var instanceId: js.UndefOr[String] = js.native
  var ipAddr: String = js.native
  var isCoordinatingDiscoveryServer: js.UndefOr[Boolean] = js.native
  var lastDirtyTimestamp: js.UndefOr[Double] = js.native
  var lastUpdatedTimestamp: js.UndefOr[Double] = js.native
  var leaseInfo: js.UndefOr[LeaseInfo] = js.native
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  var overriddenstatus: js.UndefOr[InstanceStatus] = js.native
  var port: js.UndefOr[Double | PortWrapper | LegacyPortWrapper] = js.native
  var secureHealthCheckUrl: js.UndefOr[String] = js.native
  var securePort: js.UndefOr[Double | PortWrapper | LegacyPortWrapper] = js.native
  var secureVipAddress: js.UndefOr[String] = js.native
  var sid: js.UndefOr[String] = js.native
  var status: js.UndefOr[InstanceStatus] = js.native
  var statusPageUrl: js.UndefOr[String] = js.native
  var vipAddress: String = js.native
}

object EurekaInstanceConfig {
  @scala.inline
  def apply(app: String, dataCenterInfo: DataCenterInfo, hostName: String, ipAddr: String, vipAddress: String): EurekaInstanceConfig = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], dataCenterInfo = dataCenterInfo.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], ipAddr = ipAddr.asInstanceOf[js.Any], vipAddress = vipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EurekaInstanceConfig]
  }
  @scala.inline
  implicit class EurekaInstanceConfigOps[Self <: EurekaInstanceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCenterInfo(value: DataCenterInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCenterInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAddr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVipAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionType(value: ActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(js.undefined)
        ret
    }
    @scala.inline
    def withAppGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryId")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHomePageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homePageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomePageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homePageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCoordinatingDiscoveryServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCoordinatingDiscoveryServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCoordinatingDiscoveryServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCoordinatingDiscoveryServer")(js.undefined)
        ret
    }
    @scala.inline
    def withLastDirtyTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDirtyTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDirtyTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDirtyTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaseInfo(value: LeaseInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaseInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOverriddenstatus(value: InstanceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overriddenstatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverriddenstatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overriddenstatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double | PortWrapper | LegacyPortWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureHealthCheckUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureHealthCheckUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureHealthCheckUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureHealthCheckUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurePort(value: Double | PortWrapper | LegacyPortWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securePort")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureVipAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureVipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureVipAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureVipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: InstanceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusPageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusPageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusPageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusPageUrl")(js.undefined)
        ret
    }
  }
  
}


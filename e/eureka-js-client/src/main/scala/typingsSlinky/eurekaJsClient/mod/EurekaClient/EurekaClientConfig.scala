package typingsSlinky.eurekaJsClient.mod.EurekaClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EurekaClientConfig extends js.Object {
  var clusterRefreshInterval: js.UndefOr[Boolean] = js.native
  var fetchMetadata: js.UndefOr[Boolean] = js.native
  var fetchRegistry: js.UndefOr[Boolean] = js.native
  var filterUpInstances: js.UndefOr[Boolean] = js.native
  var heartbeatInterval: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  var preferIpAddress: js.UndefOr[Boolean] = js.native
  var preferSameZone: js.UndefOr[Boolean] = js.native
  var registerWithEureka: js.UndefOr[Boolean] = js.native
  var registryFetchInterval: js.UndefOr[Double] = js.native
  var requestRetryDelay: js.UndefOr[Double] = js.native
  var servicePath: js.UndefOr[String] = js.native
  var serviceUrls: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  var ssl: js.UndefOr[Boolean] = js.native
  var useDns: js.UndefOr[Boolean] = js.native
  var useLocalMetadata: js.UndefOr[Boolean] = js.native
}

object EurekaClientConfig {
  @scala.inline
  def apply(): EurekaClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EurekaClientConfig]
  }
  @scala.inline
  implicit class EurekaClientConfigOps[Self <: EurekaClientConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterRefreshInterval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRefreshInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterRefreshInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRefreshInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchRegistry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRegistry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchRegistry")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterUpInstances(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterUpInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterUpInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterUpInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
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
    def withPreferIpAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferSameZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferSameZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferSameZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferSameZone")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterWithEureka(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerWithEureka")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisterWithEureka: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerWithEureka")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistryFetchInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryFetchInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryFetchInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryFetchInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestRetryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestRetryDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withServicePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePath")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUrls(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDns")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLocalMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLocalMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLocalMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLocalMetadata")(js.undefined)
        ret
    }
  }
  
}


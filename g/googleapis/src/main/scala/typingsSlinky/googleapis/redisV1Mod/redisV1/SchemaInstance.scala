package typingsSlinky.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Cloud Redis instance.
  */
@js.native
trait SchemaInstance extends js.Object {
  /**
    * Optional. Only applicable to STANDARD_HA tier which protects the instance
    * against zonal failures by provisioning it across two zones. If provided,
    * it must be a different zone from the one provided in [location_id].
    */
  var alternativeLocationId: js.UndefOr[String] = js.native
  /**
    * Optional. The full name of the Google Compute Engine
    * [network](/compute/docs/networks-and-firewalls#networks) to which the
    * instance is connected. If left unspecified, the `default` network will be
    * used.
    */
  var authorizedNetwork: js.UndefOr[String] = js.native
  /**
    * Output only. The time the instance was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The current zone where the Redis endpoint is placed. For
    * Basic Tier instances, this will always be the same as the [location_id]
    * provided by the user at creation time. For Standard Tier instances, this
    * can be either [location_id] or [alternative_location_id] and can change
    * after a failover event.
    */
  var currentLocationId: js.UndefOr[String] = js.native
  /**
    * An arbitrary and optional user-provided name for the instance.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Output only. Hostname or IP address of the exposed Redis endpoint used by
    * clients to connect to the service.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Resource labels to represent user provided metadata
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Optional. The zone where the instance will be provisioned. If not
    * provided, the service will choose a zone for the instance. For
    * STANDARD_HA tier, instances will be created across two zones for
    * protection against zonal failures. If [alternative_location_id] is also
    * provided, it must be different from [location_id].
    */
  var locationId: js.UndefOr[String] = js.native
  /**
    * Required. Redis memory size in GiB.
    */
  var memorySizeGb: js.UndefOr[Double] = js.native
  /**
    * Required. Unique name of the resource in this scope including project and
    * location using the form:
    * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
    * Note: Redis instances are managed and addressed at regional level so
    * location_id here refers to a GCP region; however, users may choose which
    * specific zone (or collection of zones for cross-zone instances) an
    * instance should be provisioned in. Refer to [location_id] and
    * [alternative_location_id] fields for more details.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The port number of the exposed Redis endpoint.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Optional. Redis configuration parameters, according to
    * http://redis.io/topics/config. Currently, the only supported parameters
    * are:   *   maxmemory-policy  *   notify-keyspace-events
    */
  var redisConfigs: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Optional. The version of Redis software. If not provided, latest
    * supported version will be used. Updating the version will perform an
    * upgrade/downgrade to the new version. Currently, the supported values are
    * `REDIS_3_2` for Redis 3.2.
    */
  var redisVersion: js.UndefOr[String] = js.native
  /**
    * Optional. The CIDR range of internal addresses that are reserved for this
    * instance. If not provided, the service will choose an unused /29 block,
    * for example, 10.0.0.0/29 or 192.168.0.0/29. Ranges must be unique and
    * non-overlapping with existing subnets in an authorized network.
    */
  var reservedIpRange: js.UndefOr[String] = js.native
  /**
    * Output only. The current state of this instance.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. Additional information about the current status of this
    * instance, if available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * Required. The service tier of the instance.
    */
  var tier: js.UndefOr[String] = js.native
}

object SchemaInstance {
  @scala.inline
  def apply(): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstance]
  }
  @scala.inline
  implicit class SchemaInstanceOps[Self <: SchemaInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternativeLocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativeLocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternativeLocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativeLocationId")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizedNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizedNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentLocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentLocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLocationId")(js.undefined)
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
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(js.undefined)
        ret
    }
    @scala.inline
    def withMemorySizeGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memorySizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemorySizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memorySizeGb")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withRedisConfigs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redisConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedisConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redisConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withRedisVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redisVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedisVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redisVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedIpRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedIpRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedIpRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedIpRange")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(js.undefined)
        ret
    }
  }
  
}


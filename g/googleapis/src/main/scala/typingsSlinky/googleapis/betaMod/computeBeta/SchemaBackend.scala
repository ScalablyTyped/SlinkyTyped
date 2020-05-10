package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing information of one individual backend.
  */
@js.native
trait SchemaBackend extends js.Object {
  /**
    * Specifies the balancing mode for this backend. For global HTTP(S) or
    * TCP/SSL load balancing, the default is UTILIZATION. Valid values are
    * UTILIZATION, RATE (for HTTP(S)) and CONNECTION (for TCP/SSL).  For
    * Internal Load Balancing, the default and only supported mode is
    * CONNECTION.
    */
  var balancingMode: js.UndefOr[String] = js.native
  /**
    * A multiplier applied to the group&#39;s maximum servicing capacity (based
    * on UTILIZATION, RATE or CONNECTION). Default value is 1, which means the
    * group will serve up to 100% of its configured capacity (depending on
    * balancingMode). A setting of 0 means the group is completely drained,
    * offering 0% of its available Capacity. Valid range is [0.0,1.0].  This
    * cannot be used for internal load balancing.
    */
  var capacityScaler: js.UndefOr[Double] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * This field designates whether this is a failover backend. More than one
    * failover backend can be configured for a given BackendService.
    */
  var failover: js.UndefOr[Boolean] = js.native
  /**
    * The fully-qualified URL of an Instance Group or Network Endpoint Group
    * resource. In case of instance group this defines the list of instances
    * that serve traffic. Member virtual machine instances from each instance
    * group must live in the same zone as the instance group itself. No two
    * backends in a backend service are allowed to use same Instance Group
    * resource.  For Network Endpoint Groups this defines list of endpoints.
    * All endpoints of Network Endpoint Group must be hosted on instances
    * located in the same zone as the Network Endpoint Group.  Backend service
    * can not contain mix of Instance Group and Network Endpoint Group
    * backends.  Note that you must specify an Instance Group or Network
    * Endpoint Group resource using the fully-qualified URL, rather than a
    * partial URL.  When the BackendService has load balancing scheme INTERNAL,
    * the instance group must be within the same region as the BackendService.
    * Network Endpoint Groups are not supported for INTERNAL load balancing
    * scheme.
    */
  var group: js.UndefOr[String] = js.native
  /**
    * The max number of simultaneous connections for the group. Can be used
    * with either CONNECTION or UTILIZATION balancing modes. For CONNECTION
    * mode, either maxConnections or maxConnectionsPerInstance must be set.
    * This cannot be used for internal load balancing.
    */
  var maxConnections: js.UndefOr[Double] = js.native
  /**
    * The max number of simultaneous connections that a single backend network
    * endpoint can handle. This is used to calculate the capacity of the group.
    * Can be used in either CONNECTION or UTILIZATION balancing modes. For
    * CONNECTION mode, either maxConnections or maxConnectionsPerEndpoint must
    * be set.  This cannot be used for internal load balancing.
    */
  var maxConnectionsPerEndpoint: js.UndefOr[Double] = js.native
  /**
    * The max number of simultaneous connections that a single backend instance
    * can handle. This is used to calculate the capacity of the group. Can be
    * used in either CONNECTION or UTILIZATION balancing modes. For CONNECTION
    * mode, either maxConnections or maxConnectionsPerInstance must be set.
    * This cannot be used for internal load balancing.
    */
  var maxConnectionsPerInstance: js.UndefOr[Double] = js.native
  /**
    * The max requests per second (RPS) of the group. Can be used with either
    * RATE or UTILIZATION balancing modes, but required if RATE mode. For RATE
    * mode, either maxRate or maxRatePerInstance must be set.  This cannot be
    * used for internal load balancing.
    */
  var maxRate: js.UndefOr[Double] = js.native
  /**
    * The max requests per second (RPS) that a single backend network endpoint
    * can handle. This is used to calculate the capacity of the group. Can be
    * used in either balancing mode. For RATE mode, either maxRate or
    * maxRatePerEndpoint must be set.  This cannot be used for internal load
    * balancing.
    */
  var maxRatePerEndpoint: js.UndefOr[Double] = js.native
  /**
    * The max requests per second (RPS) that a single backend instance can
    * handle. This is used to calculate the capacity of the group. Can be used
    * in either balancing mode. For RATE mode, either maxRate or
    * maxRatePerInstance must be set.  This cannot be used for internal load
    * balancing.
    */
  var maxRatePerInstance: js.UndefOr[Double] = js.native
  /**
    * Used when balancingMode is UTILIZATION. This ratio defines the CPU
    * utilization target for the group. The default is 0.8. Valid range is
    * [0.0, 1.0].  This cannot be used for internal load balancing.
    */
  var maxUtilization: js.UndefOr[Double] = js.native
}

object SchemaBackend {
  @scala.inline
  def apply(): SchemaBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackend]
  }
  @scala.inline
  implicit class SchemaBackendOps[Self <: SchemaBackend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBalancingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balancingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalancingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balancingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacityScaler(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityScaler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityScaler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityScaler")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFailover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failover")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConnectionsPerEndpoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnectionsPerEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnectionsPerEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnectionsPerEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConnectionsPerInstance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnectionsPerInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnectionsPerInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnectionsPerInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRatePerEndpoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRatePerEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRatePerEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRatePerEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRatePerInstance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRatePerInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRatePerInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRatePerInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxUtilization(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUtilization")(js.undefined)
        ret
    }
  }
  
}


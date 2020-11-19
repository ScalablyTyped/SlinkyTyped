package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backend extends js.Object {
  
  /**
    * Specifies the balancing mode for this backend. For global HTTP(S) or TCP/SSL load balancing, the default is UTILIZATION. Valid values are UTILIZATION,
    * RATE (for HTTP(S)) and CONNECTION (for TCP/SSL).
    *
    * For Internal Load Balancing, the default and only supported mode is CONNECTION.
    */
  var balancingMode: js.UndefOr[String] = js.native
  
  /**
    * A multiplier applied to the group's maximum servicing capacity (based on UTILIZATION, RATE or CONNECTION). Default value is 1, which means the group
    * will serve up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its
    * available Capacity. Valid range is [0.0,1.0].
    *
    * This cannot be used for internal load balancing.
    */
  var capacityScaler: js.UndefOr[Double] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The fully-qualified URL of a Instance Group resource. This instance group defines the list of instances that serve traffic. Member virtual machine
    * instances from each instance group must live in the same zone as the instance group itself. No two backends in a backend service are allowed to use
    * same Instance Group resource.
    *
    * Note that you must specify an Instance Group resource using the fully-qualified URL, rather than a partial URL.
    *
    * When the BackendService has load balancing scheme INTERNAL, the instance group must be within the same region as the BackendService.
    */
  var group: js.UndefOr[String] = js.native
  
  /**
    * The max number of simultaneous connections for the group. Can be used with either CONNECTION or UTILIZATION balancing modes. For CONNECTION mode,
    * either maxConnections or maxConnectionsPerInstance must be set.
    *
    * This cannot be used for internal load balancing.
    */
  var maxConnections: js.UndefOr[Double] = js.native
  
  /**
    * The max number of simultaneous connections that a single backend instance can handle. This is used to calculate the capacity of the group. Can be used
    * in either CONNECTION or UTILIZATION balancing modes. For CONNECTION mode, either maxConnections or maxConnectionsPerInstance must be set.
    *
    * This cannot be used for internal load balancing.
    */
  var maxConnectionsPerInstance: js.UndefOr[Double] = js.native
  
  /**
    * The max requests per second (RPS) of the group. Can be used with either RATE or UTILIZATION balancing modes, but required if RATE mode. For RATE mode,
    * either maxRate or maxRatePerInstance must be set.
    *
    * This cannot be used for internal load balancing.
    */
  var maxRate: js.UndefOr[Double] = js.native
  
  /**
    * The max requests per second (RPS) that a single backend instance can handle. This is used to calculate the capacity of the group. Can be used in either
    * balancing mode. For RATE mode, either maxRate or maxRatePerInstance must be set.
    *
    * This cannot be used for internal load balancing.
    */
  var maxRatePerInstance: js.UndefOr[Double] = js.native
  
  /**
    * Used when balancingMode is UTILIZATION. This ratio defines the CPU utilization target for the group. The default is 0.8. Valid range is [0.0, 1.0].
    *
    * This cannot be used for internal load balancing.
    */
  var maxUtilization: js.UndefOr[Double] = js.native
}
object Backend {
  
  @scala.inline
  def apply(): Backend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backend]
  }
  
  @scala.inline
  implicit class BackendOps[Self <: Backend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBalancingMode(value: String): Self = this.set("balancingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBalancingMode: Self = this.set("balancingMode", js.undefined)
    
    @scala.inline
    def setCapacityScaler(value: Double): Self = this.set("capacityScaler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityScaler: Self = this.set("capacityScaler", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    
    @scala.inline
    def setMaxConnectionsPerInstance(value: Double): Self = this.set("maxConnectionsPerInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConnectionsPerInstance: Self = this.set("maxConnectionsPerInstance", js.undefined)
    
    @scala.inline
    def setMaxRate(value: Double): Self = this.set("maxRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRate: Self = this.set("maxRate", js.undefined)
    
    @scala.inline
    def setMaxRatePerInstance(value: Double): Self = this.set("maxRatePerInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRatePerInstance: Self = this.set("maxRatePerInstance", js.undefined)
    
    @scala.inline
    def setMaxUtilization(value: Double): Self = this.set("maxUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUtilization: Self = this.set("maxUtilization", js.undefined)
  }
}

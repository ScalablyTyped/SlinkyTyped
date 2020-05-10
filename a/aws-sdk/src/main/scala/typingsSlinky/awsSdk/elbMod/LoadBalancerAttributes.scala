package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerAttributes extends js.Object {
  /**
    * If enabled, the load balancer captures detailed information of all requests and delivers the information to the Amazon S3 bucket that you specify. For more information, see Enable Access Logs in the Classic Load Balancers Guide.
    */
  var AccessLog: js.UndefOr[typingsSlinky.awsSdk.elbMod.AccessLog] = js.native
  /**
    * This parameter is reserved.
    */
  var AdditionalAttributes: js.UndefOr[typingsSlinky.awsSdk.elbMod.AdditionalAttributes] = js.native
  /**
    * If enabled, the load balancer allows existing requests to complete before the load balancer shifts traffic away from a deregistered or unhealthy instance. For more information, see Configure Connection Draining in the Classic Load Balancers Guide.
    */
  var ConnectionDraining: js.UndefOr[typingsSlinky.awsSdk.elbMod.ConnectionDraining] = js.native
  /**
    * If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection) for the specified duration. By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and back-end connections of your load balancer. For more information, see Configure Idle Connection Timeout in the Classic Load Balancers Guide.
    */
  var ConnectionSettings: js.UndefOr[typingsSlinky.awsSdk.elbMod.ConnectionSettings] = js.native
  /**
    * If enabled, the load balancer routes the request traffic evenly across all instances regardless of the Availability Zones. For more information, see Configure Cross-Zone Load Balancing in the Classic Load Balancers Guide.
    */
  var CrossZoneLoadBalancing: js.UndefOr[typingsSlinky.awsSdk.elbMod.CrossZoneLoadBalancing] = js.native
}

object LoadBalancerAttributes {
  @scala.inline
  def apply(): LoadBalancerAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerAttributes]
  }
  @scala.inline
  implicit class LoadBalancerAttributesOps[Self <: LoadBalancerAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessLog(value: AccessLog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessLog")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalAttributes(value: AdditionalAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionDraining(value: ConnectionDraining): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionDraining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionDraining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionDraining")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionSettings(value: ConnectionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossZoneLoadBalancing(value: CrossZoneLoadBalancing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossZoneLoadBalancing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossZoneLoadBalancing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossZoneLoadBalancing")(js.undefined)
        ret
    }
  }
  
}


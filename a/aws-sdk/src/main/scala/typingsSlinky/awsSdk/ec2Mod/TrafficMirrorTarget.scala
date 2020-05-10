package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorTarget extends js.Object {
  /**
    * Information about the Traffic Mirror target.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The network interface ID that is attached to the target.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Network Load Balancer.
    */
  var NetworkLoadBalancerArn: js.UndefOr[String] = js.native
  /**
    * The ID of the account that owns the Traffic Mirror target.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The tags assigned to the Traffic Mirror target.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.native
  /**
    * The type of Traffic Mirror target.
    */
  var Type: js.UndefOr[TrafficMirrorTargetType] = js.native
}

object TrafficMirrorTarget {
  @scala.inline
  def apply(): TrafficMirrorTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorTarget]
  }
  @scala.inline
  implicit class TrafficMirrorTargetOps[Self <: TrafficMirrorTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkLoadBalancerArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkLoadBalancerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkLoadBalancerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkLoadBalancerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficMirrorTargetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficMirrorTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorTargetId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TrafficMirrorTargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}


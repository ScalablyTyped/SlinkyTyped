package typingsSlinky.pulumiAws.trafficMirrorTargetMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorTargetArgs extends js.Object {
  /**
    * A description of the traffic mirror session.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The network interface ID that is associated with the target.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
    */
  val networkLoadBalancerArn: js.UndefOr[Input[String]] = js.native
}

object TrafficMirrorTargetArgs {
  @scala.inline
  def apply(): TrafficMirrorTargetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorTargetArgs]
  }
  @scala.inline
  implicit class TrafficMirrorTargetArgsOps[Self <: TrafficMirrorTargetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Input[String]): Self = {
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
    def withNetworkInterfaceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkLoadBalancerArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkLoadBalancerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkLoadBalancerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkLoadBalancerArn")(js.undefined)
        ret
    }
  }
  
}


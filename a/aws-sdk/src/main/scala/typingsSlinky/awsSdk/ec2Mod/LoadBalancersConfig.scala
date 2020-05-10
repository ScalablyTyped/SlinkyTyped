package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancersConfig extends js.Object {
  /**
    * The Classic Load Balancers.
    */
  var ClassicLoadBalancersConfig: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ClassicLoadBalancersConfig] = js.native
  /**
    * The target groups.
    */
  var TargetGroupsConfig: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TargetGroupsConfig] = js.native
}

object LoadBalancersConfig {
  @scala.inline
  def apply(): LoadBalancersConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancersConfig]
  }
  @scala.inline
  implicit class LoadBalancersConfigOps[Self <: LoadBalancersConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassicLoadBalancersConfig(value: ClassicLoadBalancersConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassicLoadBalancersConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassicLoadBalancersConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassicLoadBalancersConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupsConfig(value: TargetGroupsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupsConfig")(js.undefined)
        ret
    }
  }
  
}


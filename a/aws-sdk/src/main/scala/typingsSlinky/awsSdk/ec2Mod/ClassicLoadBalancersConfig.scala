package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassicLoadBalancersConfig extends js.Object {
  /**
    * One or more Classic Load Balancers.
    */
  var ClassicLoadBalancers: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ClassicLoadBalancers] = js.native
}

object ClassicLoadBalancersConfig {
  @scala.inline
  def apply(): ClassicLoadBalancersConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassicLoadBalancersConfig]
  }
  @scala.inline
  implicit class ClassicLoadBalancersConfigOps[Self <: ClassicLoadBalancersConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassicLoadBalancers(value: ClassicLoadBalancers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassicLoadBalancers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassicLoadBalancers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassicLoadBalancers")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.grpcGrpcJs.loadBalancingConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancingConfig extends js.Object {
  var grpclb: js.UndefOr[GrpcLbConfig] = js.native
  var round_robin: js.UndefOr[RoundRobinConfig] = js.native
  var xds: js.UndefOr[XdsConfig] = js.native
}

object LoadBalancingConfig {
  @scala.inline
  def apply(): LoadBalancingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancingConfig]
  }
  @scala.inline
  implicit class LoadBalancingConfigOps[Self <: LoadBalancingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrpclb(value: GrpcLbConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpclb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpclb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpclb")(js.undefined)
        ret
    }
    @scala.inline
    def withRound_robin(value: RoundRobinConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round_robin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound_robin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round_robin")(js.undefined)
        ret
    }
    @scala.inline
    def withXds(value: XdsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xds")(js.undefined)
        ret
    }
  }
  
}


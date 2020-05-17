package typingsSlinky.grpcGrpcJs.loadBalancingConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcLbConfig extends js.Object {
  var childPolicy: js.Array[LoadBalancingConfig] = js.native
}

object GrpcLbConfig {
  @scala.inline
  def apply(childPolicy: js.Array[LoadBalancingConfig]): GrpcLbConfig = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcLbConfig]
  }
  @scala.inline
  implicit class GrpcLbConfigOps[Self <: GrpcLbConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildPolicy(value: js.Array[LoadBalancingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childPolicy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.pulumiAws.egressOnlyInternetGatewayMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EgressOnlyInternetGatewayArgs extends js.Object {
  /**
    * The VPC ID to create in.
    */
  val vpcId: Input[String] = js.native
}

object EgressOnlyInternetGatewayArgs {
  @scala.inline
  def apply(vpcId: Input[String]): EgressOnlyInternetGatewayArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EgressOnlyInternetGatewayArgs]
  }
  @scala.inline
  implicit class EgressOnlyInternetGatewayArgsOps[Self <: EgressOnlyInternetGatewayArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


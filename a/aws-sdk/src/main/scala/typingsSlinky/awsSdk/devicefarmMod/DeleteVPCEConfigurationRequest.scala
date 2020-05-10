package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVPCEConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to delete.
    */
  var arn: AmazonResourceName = js.native
}

object DeleteVPCEConfigurationRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVPCEConfigurationRequest]
  }
  @scala.inline
  implicit class DeleteVPCEConfigurationRequestOps[Self <: DeleteVPCEConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


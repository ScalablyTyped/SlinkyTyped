package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInfrastructureConfigurationRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration to delete. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
}

object DeleteInfrastructureConfigurationRequest {
  @scala.inline
  def apply(infrastructureConfigurationArn: InfrastructureConfigurationArn): DeleteInfrastructureConfigurationRequest = {
    val __obj = js.Dynamic.literal(infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInfrastructureConfigurationRequest]
  }
  @scala.inline
  implicit class DeleteInfrastructureConfigurationRequestOps[Self <: DeleteInfrastructureConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


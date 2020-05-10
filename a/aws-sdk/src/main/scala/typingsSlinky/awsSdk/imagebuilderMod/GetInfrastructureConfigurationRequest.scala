package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInfrastructureConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration that you want to retrieve. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
}

object GetInfrastructureConfigurationRequest {
  @scala.inline
  def apply(infrastructureConfigurationArn: InfrastructureConfigurationArn): GetInfrastructureConfigurationRequest = {
    val __obj = js.Dynamic.literal(infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInfrastructureConfigurationRequest]
  }
  @scala.inline
  implicit class GetInfrastructureConfigurationRequestOps[Self <: GetInfrastructureConfigurationRequest] (val x: Self) extends AnyVal {
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


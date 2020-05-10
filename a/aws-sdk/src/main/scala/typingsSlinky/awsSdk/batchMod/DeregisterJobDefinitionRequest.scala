package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterJobDefinitionRequest extends js.Object {
  /**
    * The name and revision (name:revision) or full Amazon Resource Name (ARN) of the job definition to deregister.
    */
  var jobDefinition: String = js.native
}

object DeregisterJobDefinitionRequest {
  @scala.inline
  def apply(jobDefinition: String): DeregisterJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterJobDefinitionRequest]
  }
  @scala.inline
  implicit class DeregisterJobDefinitionRequestOps[Self <: DeregisterJobDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDefinition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


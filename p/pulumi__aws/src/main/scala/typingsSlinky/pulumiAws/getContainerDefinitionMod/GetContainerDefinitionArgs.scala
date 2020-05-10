package typingsSlinky.pulumiAws.getContainerDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContainerDefinitionArgs extends js.Object {
  /**
    * The name of the container definition
    */
  val containerName: String = js.native
  /**
    * The ARN of the task definition which contains the container
    */
  val taskDefinition: String = js.native
}

object GetContainerDefinitionArgs {
  @scala.inline
  def apply(containerName: String, taskDefinition: String): GetContainerDefinitionArgs = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerDefinitionArgs]
  }
  @scala.inline
  implicit class GetContainerDefinitionArgsOps[Self <: GetContainerDefinitionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefinition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


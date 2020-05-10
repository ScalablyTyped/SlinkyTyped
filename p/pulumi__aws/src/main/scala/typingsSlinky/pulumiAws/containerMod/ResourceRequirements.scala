package typingsSlinky.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceRequirements extends js.Object {
  /**
    * The type of resource to assign to a container. The only supported value is GPU.
    */
  var `type`: String = js.native
  /**
    * The number of physical GPUs the Amazon ECS container agent will reserve for the container.
    * The number of GPUs reserved for all containers in a task should not exceed the number of
    * available GPUs on the container instance the task is launched on.
    */
  var value: String = js.native
}

object ResourceRequirements {
  @scala.inline
  def apply(`type`: String, value: String): ResourceRequirements = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequirements]
  }
  @scala.inline
  implicit class ResourceRequirementsOps[Self <: ResourceRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


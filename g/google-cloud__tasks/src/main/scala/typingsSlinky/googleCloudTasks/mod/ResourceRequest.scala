package typingsSlinky.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceRequest extends js.Object {
  /**
    * The resource for which the policy is being requested. resource is usually specified as a path. For example, a Project resource is specified as projects/{project}.
    */
  var resource: String = js.native
}

object ResourceRequest {
  @scala.inline
  def apply(resource: String): ResourceRequest = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequest]
  }
  @scala.inline
  implicit class ResourceRequestOps[Self <: ResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.googleCloudTasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/tasks.@google-cloud/tasks.CreateNamedRequest<'queue', std.Partial<@google-cloud/tasks.@google-cloud/tasks.Queue>> */
@js.native
trait CreateNamedRequestqueuePa extends js.Object {
  /**
    * The location name. For example: projects/PROJECT_ID/locations/LOCATION_ID
    */
  var parent: String = js.native
  var queue: PartialQueue = js.native
}

object CreateNamedRequestqueuePa {
  @scala.inline
  def apply(parent: String, queue: PartialQueue): CreateNamedRequestqueuePa = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNamedRequestqueuePa]
  }
  @scala.inline
  implicit class CreateNamedRequestqueuePaOps[Self <: CreateNamedRequestqueuePa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: PartialQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


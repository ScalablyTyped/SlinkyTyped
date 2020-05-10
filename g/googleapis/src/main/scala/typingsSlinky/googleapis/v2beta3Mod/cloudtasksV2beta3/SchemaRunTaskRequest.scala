package typingsSlinky.googleapis.v2beta3Mod.cloudtasksV2beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for forcing a task to run now using RunTask.
  */
@js.native
trait SchemaRunTaskRequest extends js.Object {
  /**
    * The response_view specifies which subset of the Task will be returned. By
    * default response_view is BASIC; not all information is retrieved by
    * default because some data, such as payloads, might be desirable to return
    * only when needed because of its large size or because of the sensitivity
    * of data that it contains.  Authorization for FULL requires
    * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    * permission on the Task resource.
    */
  var responseView: js.UndefOr[String] = js.native
}

object SchemaRunTaskRequest {
  @scala.inline
  def apply(): SchemaRunTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunTaskRequest]
  }
  @scala.inline
  implicit class SchemaRunTaskRequestOps[Self <: SchemaRunTaskRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseView")(js.undefined)
        ret
    }
  }
  
}


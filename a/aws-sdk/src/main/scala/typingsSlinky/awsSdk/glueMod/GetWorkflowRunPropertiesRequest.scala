package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowRunPropertiesRequest extends js.Object {
  /**
    * Name of the workflow which was run.
    */
  var Name: NameString = js.native
  /**
    * The ID of the workflow run whose run properties should be returned.
    */
  var RunId: IdString = js.native
}

object GetWorkflowRunPropertiesRequest {
  @scala.inline
  def apply(Name: NameString, RunId: IdString): GetWorkflowRunPropertiesRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRunPropertiesRequest]
  }
  @scala.inline
  implicit class GetWorkflowRunPropertiesRequestOps[Self <: GetWorkflowRunPropertiesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunId(value: IdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


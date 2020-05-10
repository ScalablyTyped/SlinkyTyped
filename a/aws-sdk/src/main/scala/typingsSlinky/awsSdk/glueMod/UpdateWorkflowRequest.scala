package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkflowRequest extends js.Object {
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.native
  /**
    * The description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.native
  /**
    * Name of the workflow to be updated.
    */
  var Name: NameString = js.native
}

object UpdateWorkflowRequest {
  @scala.inline
  def apply(Name: NameString): UpdateWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkflowRequest]
  }
  @scala.inline
  implicit class UpdateWorkflowRequestOps[Self <: UpdateWorkflowRequest] (val x: Self) extends AnyVal {
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
    def withDefaultRunProperties(value: WorkflowRunProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRunProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRunProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRunProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}


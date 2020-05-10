package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTypeInfo extends js.Object {
  /**
    * The date when this type was registered.
    */
  var creationDate: js.Date = js.native
  /**
    * If the type is in deprecated state, then it is set to the date when the type was deprecated.
    */
  var deprecationDate: js.UndefOr[js.Date] = js.native
  /**
    * The description of the type registered through RegisterWorkflowType.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The current status of the workflow type.
    */
  var status: RegistrationStatus = js.native
  /**
    * The workflow type this information is about.
    */
  var workflowType: WorkflowType = js.native
}

object WorkflowTypeInfo {
  @scala.inline
  def apply(creationDate: js.Date, status: RegistrationStatus, workflowType: WorkflowType): WorkflowTypeInfo = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTypeInfo]
  }
  @scala.inline
  implicit class WorkflowTypeInfoOps[Self <: WorkflowTypeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: RegistrationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowType(value: WorkflowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}


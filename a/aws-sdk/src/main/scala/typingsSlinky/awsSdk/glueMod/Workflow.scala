package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workflow extends js.Object {
  /**
    * The date and time when the workflow was created.
    */
  var CreatedOn: js.UndefOr[js.Date] = js.native
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.native
  /**
    * A description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.native
  /**
    * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections between them as edges.
    */
  var Graph: js.UndefOr[WorkflowGraph] = js.native
  /**
    * The date and time when the workflow was last modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.native
  /**
    * The information about the last execution of the workflow.
    */
  var LastRun: js.UndefOr[WorkflowRun] = js.native
  /**
    * The name of the workflow representing the flow.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object Workflow {
  @scala.inline
  def apply(): Workflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workflow]
  }
  @scala.inline
  implicit class WorkflowOps[Self <: Workflow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedOn")(js.undefined)
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
    @scala.inline
    def withGraph(value: WorkflowGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Graph")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRun(value: WorkflowRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRun")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}


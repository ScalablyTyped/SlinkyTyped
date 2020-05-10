package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowRun extends js.Object {
  /**
    * The date and time when the workflow run completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.native
  /**
    * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections between them as edges.
    */
  var Graph: js.UndefOr[WorkflowGraph] = js.native
  /**
    * Name of the workflow which was executed.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * The date and time when the workflow run was started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.native
  /**
    * The statistics of the run.
    */
  var Statistics: js.UndefOr[WorkflowRunStatistics] = js.native
  /**
    * The status of the workflow run.
    */
  var Status: js.UndefOr[WorkflowRunStatus] = js.native
  /**
    * The ID of this workflow run.
    */
  var WorkflowRunId: js.UndefOr[IdString] = js.native
  /**
    * The workflow run properties which were set during the run.
    */
  var WorkflowRunProperties: js.UndefOr[typingsSlinky.awsSdk.glueMod.WorkflowRunProperties] = js.native
}

object WorkflowRun {
  @scala.inline
  def apply(): WorkflowRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowRun]
  }
  @scala.inline
  implicit class WorkflowRunOps[Self <: WorkflowRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedOn")(js.undefined)
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
    @scala.inline
    def withStartedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: WorkflowRunStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statistics")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: WorkflowRunStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowRunId(value: IdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowRunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowRunId")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowRunProperties(value: WorkflowRunProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowRunProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowRunProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowRunProperties")(js.undefined)
        ret
    }
  }
  
}


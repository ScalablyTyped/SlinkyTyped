package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The workflow node.
  */
@js.native
trait SchemaWorkflowNode extends js.Object {
  /**
    * Output only. The error detail.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Output only. The job id; populated after the node enters RUNNING state.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * Output only. Node&#39;s prerequisite nodes.
    */
  var prerequisiteStepIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The node state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the node.
    */
  var stepId: js.UndefOr[String] = js.native
}

object SchemaWorkflowNode {
  @scala.inline
  def apply(): SchemaWorkflowNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowNode]
  }
  @scala.inline
  implicit class SchemaWorkflowNodeOps[Self <: SchemaWorkflowNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrerequisiteStepIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerequisiteStepIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrerequisiteStepIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerequisiteStepIds")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStepId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepId")(js.undefined)
        ret
    }
  }
  
}


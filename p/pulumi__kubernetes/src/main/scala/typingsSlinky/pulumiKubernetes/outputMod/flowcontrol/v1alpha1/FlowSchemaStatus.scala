package typingsSlinky.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlowSchemaStatus represents the current state of a FlowSchema.
  */
@js.native
trait FlowSchemaStatus extends js.Object {
  /**
    * `conditions` is a list of the current states of FlowSchema.
    */
  val conditions: js.Array[FlowSchemaCondition] = js.native
}

object FlowSchemaStatus {
  @scala.inline
  def apply(conditions: js.Array[FlowSchemaCondition]): FlowSchemaStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaStatus]
  }
  @scala.inline
  implicit class FlowSchemaStatusOps[Self <: FlowSchemaStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[FlowSchemaCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


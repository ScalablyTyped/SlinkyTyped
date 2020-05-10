package typingsSlinky.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityLevelConfigurationStatus represents the current state of a "request-priority".
  */
@js.native
trait PriorityLevelConfigurationStatus extends js.Object {
  /**
    * `conditions` is the current state of "request-priority".
    */
  val conditions: js.Array[PriorityLevelConfigurationCondition] = js.native
}

object PriorityLevelConfigurationStatus {
  @scala.inline
  def apply(conditions: js.Array[PriorityLevelConfigurationCondition]): PriorityLevelConfigurationStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationStatus]
  }
  @scala.inline
  implicit class PriorityLevelConfigurationStatusOps[Self <: PriorityLevelConfigurationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[PriorityLevelConfigurationCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


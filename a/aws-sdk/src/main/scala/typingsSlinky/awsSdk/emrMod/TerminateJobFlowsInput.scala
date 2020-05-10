package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateJobFlowsInput extends js.Object {
  /**
    * A list of job flows to be shutdown.
    */
  var JobFlowIds: XmlStringList = js.native
}

object TerminateJobFlowsInput {
  @scala.inline
  def apply(JobFlowIds: XmlStringList): TerminateJobFlowsInput = {
    val __obj = js.Dynamic.literal(JobFlowIds = JobFlowIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateJobFlowsInput]
  }
  @scala.inline
  implicit class TerminateJobFlowsInputOps[Self <: TerminateJobFlowsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobFlowIds(value: XmlStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFlowIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


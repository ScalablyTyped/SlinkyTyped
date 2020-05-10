package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceExecutionSummary extends js.Object {
  /**
    * An ID created by the system when PutComplianceItems was called. For example, CommandID is a valid execution ID. You can use this ID in subsequent calls.
    */
  var ExecutionId: js.UndefOr[ComplianceExecutionId] = js.native
  /**
    * The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
    */
  var ExecutionTime: js.Date = js.native
  /**
    * The type of execution. For example, Command is a valid execution type.
    */
  var ExecutionType: js.UndefOr[ComplianceExecutionType] = js.native
}

object ComplianceExecutionSummary {
  @scala.inline
  def apply(ExecutionTime: js.Date): ComplianceExecutionSummary = {
    val __obj = js.Dynamic.literal(ExecutionTime = ExecutionTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceExecutionSummary]
  }
  @scala.inline
  implicit class ComplianceExecutionSummaryOps[Self <: ComplianceExecutionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionId(value: ComplianceExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionType(value: ComplianceExecutionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionType")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobFlowsInput extends js.Object {
  /**
    * Return only job flows created after this date and time.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.native
  /**
    * Return only job flows created before this date and time.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.native
  /**
    * Return only job flows whose job flow ID is contained in this list.
    */
  var JobFlowIds: js.UndefOr[XmlStringList] = js.native
  /**
    * Return only job flows whose state is contained in this list.
    */
  var JobFlowStates: js.UndefOr[JobFlowExecutionStateList] = js.native
}

object DescribeJobFlowsInput {
  @scala.inline
  def apply(): DescribeJobFlowsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobFlowsInput]
  }
  @scala.inline
  implicit class DescribeJobFlowsInputOps[Self <: DescribeJobFlowsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withJobFlowIds(value: XmlStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFlowIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobFlowIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFlowIds")(js.undefined)
        ret
    }
    @scala.inline
    def withJobFlowStates(value: JobFlowExecutionStateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFlowStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobFlowStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFlowStates")(js.undefined)
        ret
    }
  }
  
}


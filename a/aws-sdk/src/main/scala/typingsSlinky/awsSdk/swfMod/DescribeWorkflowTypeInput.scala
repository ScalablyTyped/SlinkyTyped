package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkflowTypeInput extends js.Object {
  /**
    * The name of the domain in which this workflow type is registered.
    */
  var domain: DomainName = js.native
  /**
    * The workflow type to describe.
    */
  var workflowType: WorkflowType = js.native
}

object DescribeWorkflowTypeInput {
  @scala.inline
  def apply(domain: DomainName, workflowType: WorkflowType): DescribeWorkflowTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkflowTypeInput]
  }
  @scala.inline
  implicit class DescribeWorkflowTypeInputOps[Self <: DescribeWorkflowTypeInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowType(value: WorkflowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


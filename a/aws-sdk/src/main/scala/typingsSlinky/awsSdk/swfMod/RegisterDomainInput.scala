package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDomainInput extends js.Object {
  /**
    * A text description of the domain.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * Name of the domain to register. The name must be unique in the region that the domain is registered in. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var name: DomainName = js.native
  /**
    * Tags to be added when registering a domain. Tags may only contain unicode letters, digits, whitespace, or these symbols: _ . : / = + - @.
    */
  var tags: js.UndefOr[ResourceTagList] = js.native
  /**
    * The duration (in days) that records and histories of workflow executions on the domain should be kept by the service. After the retention period, the workflow execution isn't available in the results of visibility calls. If you pass the value NONE or 0 (zero), then the workflow execution history isn't retained. As soon as the workflow execution completes, the execution record and its history are deleted. The maximum workflow execution retention period is 90 days. For more information about Amazon SWF service limits, see: Amazon SWF Service Limits in the Amazon SWF Developer Guide.
    */
  var workflowExecutionRetentionPeriodInDays: DurationInDays = js.native
}

object RegisterDomainInput {
  @scala.inline
  def apply(name: DomainName, workflowExecutionRetentionPeriodInDays: DurationInDays): RegisterDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDomainInput]
  }
  @scala.inline
  implicit class RegisterDomainInputOps[Self <: RegisterDomainInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowExecutionRetentionPeriodInDays(value: DurationInDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionRetentionPeriodInDays")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTags(value: ResourceTagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}


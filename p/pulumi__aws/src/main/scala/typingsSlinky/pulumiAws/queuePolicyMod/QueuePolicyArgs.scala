package typingsSlinky.pulumiAws.queuePolicyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueuePolicyArgs extends js.Object {
  val policy: Input[String] = js.native
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: Input[String] = js.native
}

object QueuePolicyArgs {
  @scala.inline
  def apply(policy: Input[String], queueUrl: Input[String]): QueuePolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], queueUrl = queueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueuePolicyArgs]
  }
  @scala.inline
  implicit class QueuePolicyArgsOps[Self <: QueuePolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueUrl(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


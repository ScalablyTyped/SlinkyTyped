package typingsSlinky.pulumiAws.queuePolicyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueuePolicyState extends js.Object {
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: js.UndefOr[Input[String]] = js.native
}

object QueuePolicyState {
  @scala.inline
  def apply(): QueuePolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueuePolicyState]
  }
  @scala.inline
  implicit class QueuePolicyStateOps[Self <: QueuePolicyState] (val x: Self) extends AnyVal {
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
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueUrl(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUrl")(js.undefined)
        ret
    }
  }
  
}


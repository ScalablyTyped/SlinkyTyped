package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobQueueResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: String = js.native
  /**
    * The name of the job queue.
    */
  var jobQueueName: String = js.native
}

object CreateJobQueueResponse {
  @scala.inline
  def apply(jobQueueArn: String, jobQueueName: String): CreateJobQueueResponse = {
    val __obj = js.Dynamic.literal(jobQueueArn = jobQueueArn.asInstanceOf[js.Any], jobQueueName = jobQueueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobQueueResponse]
  }
  @scala.inline
  implicit class CreateJobQueueResponseOps[Self <: CreateJobQueueResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobQueueArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobQueueArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobQueueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobQueueName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqsAction extends js.Object {
  /**
    * The URL of the SQS queue where the data is written.
    */
  var queueUrl: QueueUrl = js.native
  /**
    * Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue.
    */
  var useBase64: js.UndefOr[UseBase64] = js.native
}

object SqsAction {
  @scala.inline
  def apply(queueUrl: QueueUrl): SqsAction = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqsAction]
  }
  @scala.inline
  implicit class SqsActionOps[Self <: SqsAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueueUrl(value: QueueUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseBase64(value: UseBase64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBase64")(js.undefined)
        ret
    }
  }
  
}


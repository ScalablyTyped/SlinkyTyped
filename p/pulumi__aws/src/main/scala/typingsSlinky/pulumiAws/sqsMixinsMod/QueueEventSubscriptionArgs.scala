package typingsSlinky.pulumiAws.sqsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueEventSubscriptionArgs extends js.Object {
  /**
    * The largest number of records that AWS Lambda will retrieve. The maximum batch size supported
    * by Amazon Simple Queue Service is up to 10 queue messages per batch. The default setting is
    * 10.
    *
    * See https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html for more details.
    */
  var batchSize: js.UndefOr[Double] = js.native
}

object QueueEventSubscriptionArgs {
  @scala.inline
  def apply(): QueueEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueEventSubscriptionArgs]
  }
  @scala.inline
  implicit class QueueEventSubscriptionArgsOps[Self <: QueueEventSubscriptionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
  }
  
}


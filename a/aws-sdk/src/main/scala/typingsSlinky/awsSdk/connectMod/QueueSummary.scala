package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the queue.
    */
  var Id: js.UndefOr[QueueId] = js.native
  /**
    * The name of the queue.
    */
  var Name: js.UndefOr[QueueName] = js.native
  /**
    * The type of queue.
    */
  var QueueType: js.UndefOr[typingsSlinky.awsSdk.connectMod.QueueType] = js.native
}

object QueueSummary {
  @scala.inline
  def apply(): QueueSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueSummary]
  }
  @scala.inline
  implicit class QueueSummaryOps[Self <: QueueSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: QueueId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: QueueName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueType(value: QueueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueType")(js.undefined)
        ret
    }
  }
  
}


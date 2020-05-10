package typingsSlinky.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationSnsDestination extends js.Object {
  /**
    * The ARN of the SNS topic
    */
  var topicArn: String = js.native
}

object EventDestinationSnsDestination {
  @scala.inline
  def apply(topicArn: String): EventDestinationSnsDestination = {
    val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationSnsDestination]
  }
  @scala.inline
  implicit class EventDestinationSnsDestinationOps[Self <: EventDestinationSnsDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopicArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


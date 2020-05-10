package typingsSlinky.pulumiAws.inputMod.ses

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationKinesisDestination extends js.Object {
  /**
    * The ARN of the role that has permissions to access the Kinesis Stream
    */
  var roleArn: Input[String] = js.native
  /**
    * The ARN of the Kinesis Stream
    */
  var streamArn: Input[String] = js.native
}

object EventDestinationKinesisDestination {
  @scala.inline
  def apply(roleArn: Input[String], streamArn: Input[String]): EventDestinationKinesisDestination = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationKinesisDestination]
  }
  @scala.inline
  implicit class EventDestinationKinesisDestinationOps[Self <: EventDestinationKinesisDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


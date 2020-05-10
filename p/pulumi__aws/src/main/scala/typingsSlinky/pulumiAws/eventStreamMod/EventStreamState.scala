package typingsSlinky.pulumiAws.eventStreamMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventStreamState extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    */
  val destinationStreamArn: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}

object EventStreamState {
  @scala.inline
  def apply(): EventStreamState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventStreamState]
  }
  @scala.inline
  implicit class EventStreamStateOps[Self <: EventStreamState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationStreamArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationStreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationStreamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationStreamArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
  }
  
}


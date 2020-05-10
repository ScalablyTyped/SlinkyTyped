package typingsSlinky.awsSdkClientPinpointBrowser.typesWriteEventStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteEventStream extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    *  Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
    *  Kinesis ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
    */
  var DestinationStreamArn: js.UndefOr[String] = js.native
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  var RoleArn: js.UndefOr[String] = js.native
}

object WriteEventStream {
  @scala.inline
  def apply(): WriteEventStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteEventStream]
  }
  @scala.inline
  implicit class WriteEventStreamOps[Self <: WriteEventStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationStreamArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationStreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationStreamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationStreamArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
  }
  
}


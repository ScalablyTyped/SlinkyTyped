package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerDescription extends js.Object {
  /**
    * When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call SubscribeToShard. If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that reference consumer ARNs.
    */
  var ConsumerARN: typingsSlinky.awsSdk.kinesisMod.ConsumerARN = js.native
  /**
    * 
    */
  var ConsumerCreationTimestamp: js.Date = js.native
  /**
    * The name of the consumer is something you choose when you register the consumer.
    */
  var ConsumerName: typingsSlinky.awsSdk.kinesisMod.ConsumerName = js.native
  /**
    * A consumer can't read data while in the CREATING or DELETING states.
    */
  var ConsumerStatus: typingsSlinky.awsSdk.kinesisMod.ConsumerStatus = js.native
  /**
    * The ARN of the stream with which you registered the consumer.
    */
  var StreamARN: typingsSlinky.awsSdk.kinesisMod.StreamARN = js.native
}

object ConsumerDescription {
  @scala.inline
  def apply(
    ConsumerARN: ConsumerARN,
    ConsumerCreationTimestamp: js.Date,
    ConsumerName: ConsumerName,
    ConsumerStatus: ConsumerStatus,
    StreamARN: StreamARN
  ): ConsumerDescription = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerDescription]
  }
  @scala.inline
  implicit class ConsumerDescriptionOps[Self <: ConsumerDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerARN(value: ConsumerARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumerCreationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerCreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumerName(value: ConsumerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumerStatus(value: ConsumerStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamARN(value: StreamARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


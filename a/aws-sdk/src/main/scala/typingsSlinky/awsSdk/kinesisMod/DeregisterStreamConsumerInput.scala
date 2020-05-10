package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterStreamConsumerInput extends js.Object {
  /**
    * The ARN returned by Kinesis Data Streams when you registered the consumer. If you don't know the ARN of the consumer that you want to deregister, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. The description of a consumer contains its ARN.
    */
  var ConsumerARN: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.ConsumerARN] = js.native
  /**
    * The name that you gave to the consumer.
    */
  var ConsumerName: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.ConsumerName] = js.native
  /**
    * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var StreamARN: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.StreamARN] = js.native
}

object DeregisterStreamConsumerInput {
  @scala.inline
  def apply(): DeregisterStreamConsumerInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterStreamConsumerInput]
  }
  @scala.inline
  implicit class DeregisterStreamConsumerInputOps[Self <: DeregisterStreamConsumerInput] (val x: Self) extends AnyVal {
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
    def withoutConsumerARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerARN")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumerName(value: ConsumerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerName")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamARN(value: StreamARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(js.undefined)
        ret
    }
  }
  
}


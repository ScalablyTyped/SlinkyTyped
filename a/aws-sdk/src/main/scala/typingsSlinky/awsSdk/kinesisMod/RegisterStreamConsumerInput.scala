package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterStreamConsumerInput extends js.Object {
  /**
    * For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't have to be unique across data streams.
    */
  var ConsumerName: typingsSlinky.awsSdk.kinesisMod.ConsumerName = js.native
  /**
    * The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var StreamARN: typingsSlinky.awsSdk.kinesisMod.StreamARN = js.native
}

object RegisterStreamConsumerInput {
  @scala.inline
  def apply(ConsumerName: ConsumerName, StreamARN: StreamARN): RegisterStreamConsumerInput = {
    val __obj = js.Dynamic.literal(ConsumerName = ConsumerName.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterStreamConsumerInput]
  }
  @scala.inline
  implicit class RegisterStreamConsumerInputOps[Self <: RegisterStreamConsumerInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerName(value: ConsumerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerName")(value.asInstanceOf[js.Any])
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


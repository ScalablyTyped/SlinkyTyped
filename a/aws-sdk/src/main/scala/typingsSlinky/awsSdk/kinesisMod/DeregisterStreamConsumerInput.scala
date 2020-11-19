package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConsumerARN(value: ConsumerARN): Self = this.set("ConsumerARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerARN: Self = this.set("ConsumerARN", js.undefined)
    
    @scala.inline
    def setConsumerName(value: ConsumerName): Self = this.set("ConsumerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerName: Self = this.set("ConsumerName", js.undefined)
    
    @scala.inline
    def setStreamARN(value: StreamARN): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamARN: Self = this.set("StreamARN", js.undefined)
  }
}

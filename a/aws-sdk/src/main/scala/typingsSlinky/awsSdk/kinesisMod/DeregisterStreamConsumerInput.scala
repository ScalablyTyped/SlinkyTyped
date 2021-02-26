package typingsSlinky.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterStreamConsumerInput extends StObject {
  
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
  implicit class DeregisterStreamConsumerInputMutableBuilder[Self <: DeregisterStreamConsumerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerARN(value: ConsumerARN): Self = StObject.set(x, "ConsumerARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerARNUndefined: Self = StObject.set(x, "ConsumerARN", js.undefined)
    
    @scala.inline
    def setConsumerName(value: ConsumerName): Self = StObject.set(x, "ConsumerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerNameUndefined: Self = StObject.set(x, "ConsumerName", js.undefined)
    
    @scala.inline
    def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
  }
}

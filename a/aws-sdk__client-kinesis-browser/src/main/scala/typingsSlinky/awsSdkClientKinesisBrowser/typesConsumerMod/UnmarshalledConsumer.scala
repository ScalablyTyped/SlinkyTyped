package typingsSlinky.awsSdkClientKinesisBrowser.typesConsumerMod

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledConsumer extends Consumer {
  /**
    * <p/>
    */
  @JSName("ConsumerCreationTimestamp")
  var ConsumerCreationTimestamp_UnmarshalledConsumer: js.Date
}

object UnmarshalledConsumer {
  @scala.inline
  def apply(
    ConsumerARN: String,
    ConsumerCreationTimestamp: js.Date,
    ConsumerName: String,
    ConsumerStatus: CREATING | DELETING | ACTIVE | String
  ): UnmarshalledConsumer = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnmarshalledConsumer]
  }
}


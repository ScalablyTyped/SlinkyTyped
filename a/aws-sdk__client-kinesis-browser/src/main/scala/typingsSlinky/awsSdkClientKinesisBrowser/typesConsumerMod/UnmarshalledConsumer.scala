package typingsSlinky.awsSdkClientKinesisBrowser.typesConsumerMod

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledConsumer extends Consumer {
  /**
    * <p/>
    */
  @JSName("ConsumerCreationTimestamp")
  var ConsumerCreationTimestamp_UnmarshalledConsumer: js.Date = js.native
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
  @scala.inline
  implicit class UnmarshalledConsumerOps[Self <: UnmarshalledConsumer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerCreationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumerCreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


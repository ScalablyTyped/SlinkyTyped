package typingsSlinky.awsSdkClientKinesisBrowser.typesConsumerDescriptionMod

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledConsumerDescription extends ConsumerDescription {
  /**
    * <p/>
    */
  @JSName("ConsumerCreationTimestamp")
  var ConsumerCreationTimestamp_UnmarshalledConsumerDescription: js.Date = js.native
}

object UnmarshalledConsumerDescription {
  @scala.inline
  def apply(
    ConsumerARN: String,
    ConsumerCreationTimestamp: js.Date,
    ConsumerName: String,
    ConsumerStatus: CREATING | DELETING | ACTIVE | String,
    StreamARN: String
  ): UnmarshalledConsumerDescription = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledConsumerDescription]
  }
  @scala.inline
  implicit class UnmarshalledConsumerDescriptionOps[Self <: UnmarshalledConsumerDescription] (val x: Self) extends AnyVal {
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


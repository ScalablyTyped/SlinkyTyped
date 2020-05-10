package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagDeliveryStreamInput extends js.Object {
  /**
    * The name of the delivery stream to which you want to add the tags.
    */
  var DeliveryStreamName: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * A set of key-value pairs to use to create the tags.
    */
  var Tags: TagDeliveryStreamInputTagList = js.native
}

object TagDeliveryStreamInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, Tags: TagDeliveryStreamInputTagList): TagDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagDeliveryStreamInput]
  }
  @scala.inline
  implicit class TagDeliveryStreamInputOps[Self <: TagDeliveryStreamInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryStreamName(value: DeliveryStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagDeliveryStreamInputTagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


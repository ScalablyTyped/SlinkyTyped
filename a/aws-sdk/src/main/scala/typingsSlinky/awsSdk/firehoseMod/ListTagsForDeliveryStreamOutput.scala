package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForDeliveryStreamOutput extends js.Object {
  /**
    * If this is true in the response, more tags are available. To list the remaining tags, set ExclusiveStartTagKey to the key of the last tag returned and call ListTagsForDeliveryStream again.
    */
  var HasMoreTags: BooleanObject = js.native
  /**
    * A list of tags associated with DeliveryStreamName, starting with the first tag after ExclusiveStartTagKey and up to the specified Limit.
    */
  var Tags: ListTagsForDeliveryStreamOutputTagList = js.native
}

object ListTagsForDeliveryStreamOutput {
  @scala.inline
  def apply(HasMoreTags: BooleanObject, Tags: ListTagsForDeliveryStreamOutputTagList): ListTagsForDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal(HasMoreTags = HasMoreTags.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForDeliveryStreamOutput]
  }
  @scala.inline
  implicit class ListTagsForDeliveryStreamOutputOps[Self <: ListTagsForDeliveryStreamOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasMoreTags(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasMoreTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: ListTagsForDeliveryStreamOutputTagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


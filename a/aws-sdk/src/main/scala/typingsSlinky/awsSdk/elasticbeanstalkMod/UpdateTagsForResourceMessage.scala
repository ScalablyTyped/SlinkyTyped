package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTagsForResourceMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resouce to be updated. Must be the ARN of an Elastic Beanstalk environment.
    */
  var ResourceArn: typingsSlinky.awsSdk.elasticbeanstalkMod.ResourceArn = js.native
  /**
    * A list of tags to add or update. If a key of an existing tag is added, the tag's value is updated.
    */
  var TagsToAdd: js.UndefOr[TagList] = js.native
  /**
    * A list of tag keys to remove. If a tag key doesn't exist, it is silently ignored.
    */
  var TagsToRemove: js.UndefOr[TagKeyList] = js.native
}

object UpdateTagsForResourceMessage {
  @scala.inline
  def apply(ResourceArn: ResourceArn): UpdateTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagsForResourceMessage]
  }
  @scala.inline
  implicit class UpdateTagsForResourceMessageOps[Self <: UpdateTagsForResourceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagsToAdd(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsToAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsToRemove(value: TagKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsToRemove")(js.undefined)
        ret
    }
  }
  
}


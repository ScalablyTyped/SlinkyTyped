package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTagsDescriptionMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resouce for which a tag list was requested.
    */
  var ResourceArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ResourceArn] = js.native
  /**
    * A list of tag key-value pairs.
    */
  var ResourceTags: js.UndefOr[TagList] = js.native
}

object ResourceTagsDescriptionMessage {
  @scala.inline
  def apply(): ResourceTagsDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTagsDescriptionMessage]
  }
  @scala.inline
  implicit class ResourceTagsDescriptionMessageOps[Self <: ResourceTagsDescriptionMessage] (val x: Self) extends AnyVal {
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
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTags")(js.undefined)
        ret
    }
  }
  
}


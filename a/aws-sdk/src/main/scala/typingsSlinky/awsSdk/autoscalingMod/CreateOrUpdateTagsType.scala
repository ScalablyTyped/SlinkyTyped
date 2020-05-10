package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOrUpdateTagsType extends js.Object {
  /**
    * One or more tags.
    */
  var Tags: typingsSlinky.awsSdk.autoscalingMod.Tags = js.native
}

object CreateOrUpdateTagsType {
  @scala.inline
  def apply(Tags: Tags): CreateOrUpdateTagsType = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrUpdateTagsType]
  }
  @scala.inline
  implicit class CreateOrUpdateTagsTypeOps[Self <: CreateOrUpdateTagsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

